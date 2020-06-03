package io.github.themorningcompany.falconrockets.entitites.rockets;

import io.github.themorningcompany.falconrockets.entitites.EntityRocket;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.FlyingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.network.IPacket;
import net.minecraft.network.play.server.SSpawnObjectPacket;
import net.minecraft.particles.BlockParticleData;
import net.minecraft.particles.IParticleData;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.Hand;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class FalconRocket extends EntityRocket {
    public FalconRocket(EntityType<? extends FlyingEntity> type, World worldIn) {
        super(type, worldIn);
    }
}
