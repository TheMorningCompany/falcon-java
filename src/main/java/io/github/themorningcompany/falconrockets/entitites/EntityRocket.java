package io.github.themorningcompany.falconrockets.entitites;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.FlyingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.Hand;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class EntityRocket extends FlyingEntity {
    public static final int MAX_SPEED = 5000;

    private boolean isLaunched = false;
    private int ticksSinceLaunch = 0;

    public EntityRocket(EntityType<? extends FlyingEntity> type, World worldIn) {
        super(type, worldIn);
        this.setHealth(Integer.MAX_VALUE);
    }

    @Override
    protected boolean processInteract(PlayerEntity player, Hand hand) {
        player.startRiding(this);
        setLaunched(true);
        return true;
    }

    @Override
    public void tick() {
        if (isLaunched()) {
            if (!this.hasNoGravity()) {
                this.setNoGravity(true);
            }
            ticksSinceLaunch++;
            double velocity = MathHelper.clamp(Math.pow(ticksSinceLaunch, 2), 0, MAX_SPEED);
            travel(new Vec3d(0, velocity, 0));
            double thrusterDistance = 1;
            for (int angle = 0; angle < 360; angle += 45) {
                double x = prevPosX + Math.cos(angle) * thrusterDistance;
                double z = prevPosZ + Math.sin(angle) * thrusterDistance;
                this.getEntityWorld().addParticle(ParticleTypes.FLAME, x, prevPosY, z, 0, velocity - 10, 0);
            }
        } else {
            if (this.hasNoGravity()) {
                this.setNoGravity(false);
            }
        }

        super.tick();
    }

    @Override
    public double getMountedYOffset() {
        return -5;
    }

    public boolean isLaunched() {
        return isLaunched;
    }

    public void setLaunched(boolean launched) {
        isLaunched = launched;
    }
}
