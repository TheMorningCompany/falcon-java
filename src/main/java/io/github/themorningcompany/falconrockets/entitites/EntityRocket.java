package io.github.themorningcompany.falconrockets.entitites;

import io.github.themorningcompany.falconrockets.network.Networking;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.player.ClientPlayerEntity;
import net.minecraft.entity.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.IPacket;
import net.minecraft.network.play.server.SEntityPacket;
import net.minecraft.network.play.server.SEntityVelocityPacket;
import net.minecraft.network.play.server.SSpawnGlobalEntityPacket;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.FMLPlayMessages;
import net.minecraftforge.fml.network.NetworkDirection;
import net.minecraftforge.fml.network.NetworkHooks;
import net.minecraftforge.fml.network.PacketDistributor;

import javax.annotation.Nullable;

public class EntityRocket extends FlyingEntity {
    public static final int MAX_SPEED = 10;

    private boolean isLaunched = false;
    private int ticksSinceLaunch = 0;
    private double height = 48;
    private double width = 3;

    public EntityRocket(EntityType<? extends FlyingEntity> type, World worldIn) {
        super(type, worldIn);
    }

    @Nullable
    @Override
    public ILivingEntityData onInitialSpawn(IWorld worldIn, DifficultyInstance difficultyIn, SpawnReason reason, @Nullable ILivingEntityData spawnDataIn, @Nullable CompoundNBT dataTag) {
        this.setHealth(Integer.MAX_VALUE);
        this.setBoundingBox(new AxisAlignedBB(prevPosX - (width / 2), prevPosY, prevPosZ - (width / 2), prevPosX + (width / 2), prevPosY + height, prevPosZ + (width / 2)));
        this.height = this.getBoundingBox().getYSize();
        this.width = this.getBoundingBox().getXSize();
        this.setCustomNameVisible(false);

        return super.onInitialSpawn(worldIn, difficultyIn, reason, spawnDataIn, dataTag);
    }

    @Override
    protected boolean processInteract(PlayerEntity player, Hand hand) {
        player.startRiding(this);
        player.rotationPitch = 270;
//        setLaunched(true);
        return true;
    }

    @Override
    public void positionRider(Entity entity, IMoveCallback callback) {
        super.positionRider(entity, callback);
    }

    @Override
    public void tick() {

        if (isLaunched()) {
            if (!this.hasNoGravity()) {
                this.setNoGravity(true);
            }
            ticksSinceLaunch++;
            double velocity = MathHelper.clamp(Math.pow(ticksSinceLaunch, 1.01), 0, MAX_SPEED);
            move(MoverType.SELF, new Vec3d(0, velocity, 0));
//            this.setMoveVertical((float) velocity);
            this.setPacketCoordinates(this.prevPosX, this.prevPosY, this.prevPosZ);
            double thrusterDistance = 1;
            for (int angle = 0; angle <= 360; angle += 45) {
                double x = prevPosX + Math.cos(angle) * thrusterDistance;
                double z = prevPosZ + Math.sin(angle) * thrusterDistance;
                this.getEntityWorld().addParticle(ParticleTypes.FLAME, x, prevPosY, z, 0, velocity - 5, 0);
            }
        } else {
            if (this.hasNoGravity()) {
                this.setNoGravity(false);
            }
        }

        super.tick();
    }

    @Override
    public void setMoveVertical(float amount) {
        super.setMoveVertical(amount);
    }

    @Override
    public double getMountedYOffset() {
        return -10;
    }

    @Nullable
    @Override
    protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
        return SoundEvents.BLOCK_ANVIL_HIT;
    }

    @Override
    public IPacket<?> createSpawnPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }

    public boolean isLaunched() {
        return isLaunched;
    }

    public void setLaunched(boolean launched) {
        isLaunched = launched;
    }
}
