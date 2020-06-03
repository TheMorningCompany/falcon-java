package io.github.themorningcompany.falconrockets.entitites.rockets;

import net.minecraft.entity.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.DamageSource;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class FalconRocket extends CreatureEntity {
    public FalconRocket(EntityType<? extends CreatureEntity> type, World worldIn) {
        super(type, worldIn);
        this.setInvulnerable(true);
    }

    @Override
    public boolean canBeRiddenInWater() {
        return true;
    }

    @Override
    protected boolean canBeRidden(Entity entityIn) {
        return entityIn instanceof PlayerEntity;
    }



    @Override
    public boolean canBeRiddenInWater(Entity rider) {
        return true;
    }

    @Override
    public boolean canDespawn(double distanceToClosestPlayer) {
        return false;
    }
}
