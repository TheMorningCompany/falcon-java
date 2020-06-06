package io.github.themorningcompany.falconrockets.entitites.rockets;

import io.github.themorningcompany.falconrockets.entitites.supers.EntityRocket;
import net.minecraft.entity.EntityType;
import net.minecraft.world.World;

public class FalconLandedRocket extends EntityRocket {
    public FalconLandedRocket(EntityType<? extends EntityRocket> type, World worldIn) {
        super(type, worldIn);
    }
}
