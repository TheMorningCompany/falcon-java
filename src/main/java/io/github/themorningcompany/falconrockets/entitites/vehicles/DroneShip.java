package io.github.themorningcompany.falconrockets.entitites.vehicles;

import io.github.themorningcompany.falconrockets.entitites.supers.EntityRocket;
import io.github.themorningcompany.falconrockets.entitites.supers.EntityShip;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.FlyingEntity;
import net.minecraft.world.World;

public class DroneShip extends EntityShip {
    public DroneShip(EntityType<? extends EntityShip> type, World worldIn) {
        super(type, worldIn);
    }
}
