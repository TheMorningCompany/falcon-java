package io.github.themorningcompany.falconrockets.client.renders.rockets;

import io.github.themorningcompany.falconrockets.FalconRocketsRegistries;
import io.github.themorningcompany.falconrockets.client.models.rockets.FalconLandedRocketModel;
import io.github.themorningcompany.falconrockets.client.models.rockets.FalconRocketModel;
import io.github.themorningcompany.falconrockets.entitites.rockets.FalconLandedRocket;
import io.github.themorningcompany.falconrockets.entitites.rockets.FalconRocket;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.LivingRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.registry.IRenderFactory;

@OnlyIn(Dist.CLIENT)
public class FalconLandedRocketRender extends LivingRenderer<FalconLandedRocket, FalconLandedRocketModel> {
    public FalconLandedRocketRender(EntityRendererManager rendererManager) {
        super(rendererManager, new FalconLandedRocketModel(), 0f);
    }

    @Override
    public ResourceLocation getEntityTexture(FalconLandedRocket entity) {
        return FalconRocketsRegistries.location("textures/entity/falcon_landed.png");
    }

    public static class RenderFactory implements IRenderFactory<FalconLandedRocket> {
        @Override
        public EntityRenderer<? super FalconLandedRocket> createRenderFor(EntityRendererManager manager) {
            return new FalconLandedRocketRender(manager);
        }
    }
}
