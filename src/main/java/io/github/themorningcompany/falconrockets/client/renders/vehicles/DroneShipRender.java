package io.github.themorningcompany.falconrockets.client.renders.vehicles;

import io.github.themorningcompany.falconrockets.FalconRocketsRegistries;
import io.github.themorningcompany.falconrockets.client.models.rockets.FalconRocketModel;
import io.github.themorningcompany.falconrockets.client.models.vehicles.DroneShipModel;
import io.github.themorningcompany.falconrockets.entitites.rockets.FalconRocket;
import io.github.themorningcompany.falconrockets.entitites.vehicles.DroneShip;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.LivingRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.registry.IRenderFactory;

@OnlyIn(Dist.CLIENT)
public class DroneShipRender extends LivingRenderer<DroneShip, DroneShipModel> {
    public DroneShipRender(EntityRendererManager rendererManager) {
        super(rendererManager, new DroneShipModel(), 0f);
    }

    @Override
    public ResourceLocation getEntityTexture(DroneShip entity) {
        return FalconRocketsRegistries.location("textures/entity/drone_ship.png");
    }

    public static class RenderFactory implements IRenderFactory<DroneShip> {
        @Override
        public EntityRenderer<? super DroneShip> createRenderFor(EntityRendererManager manager) {
            return new DroneShipRender(manager);
        }
    }
}
