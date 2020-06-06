package io.github.themorningcompany.falconrockets.entitites.rockets;

import io.github.themorningcompany.falconrockets.entitites.supers.EntityRocket;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.FlyingEntity;
import net.minecraft.world.World;

public class FalconRocket extends EntityRocket {
    public FalconRocket(EntityType<? extends FlyingEntity> type, World worldIn) {
        super(type, worldIn);
    }
}
