package io.github.themorningcompany.falconrockets.entitites.rockets;

import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.world.World;

public class FalconLandedRocket extends CreatureEntity {
    public FalconLandedRocket(EntityType<? extends CreatureEntity> type, World worldIn) {
        super(type, worldIn);
    }
}
