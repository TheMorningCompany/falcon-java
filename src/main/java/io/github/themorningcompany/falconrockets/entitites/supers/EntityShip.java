package io.github.themorningcompany.falconrockets.entitites.supers;

import net.minecraft.entity.*;
import net.minecraft.entity.item.BoatEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.IPacket;
import net.minecraft.util.HandSide;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkHooks;

public class EntityShip extends Entity {
    public EntityShip(EntityType<? extends EntityShip> entityType, World world) {
        super(entityType, world);
    }

    @Override
    public void baseTick() {
        if (this.noClip) {
            this.noClip = false;
        }
        if (this.isEntityInsideOpaqueBlock()) {
            this.move(MoverType.SELF, new Vec3d(0, 1, 0));
        }
        super.baseTick();
    }

    @Override
    protected void registerData() {

    }

    @Override
    protected void readAdditional(CompoundNBT compound) {

    }

    @Override
    protected void writeAdditional(CompoundNBT compound) {

    }

    @Override
    public IPacket<?> createSpawnPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }
}
