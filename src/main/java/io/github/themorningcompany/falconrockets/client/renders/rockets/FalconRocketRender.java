package io.github.themorningcompany.falconrockets.client.renders.rockets;

import io.github.themorningcompany.falconrockets.FalconRocketsRegistries;
import io.github.themorningcompany.falconrockets.client.models.rockets.FalconRocketModel;
import io.github.themorningcompany.falconrockets.entitites.rockets.FalconRocket;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.LivingRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.registry.IRenderFactory;

@OnlyIn(Dist.CLIENT)
public class FalconRocketRender extends LivingRenderer<FalconRocket, FalconRocketModel> {
    public FalconRocketRender(EntityRendererManager rendererManager) {
        super(rendererManager, new FalconRocketModel(), 0f);
    }

    @Override
    public ResourceLocation getEntityTexture(FalconRocket entity) {
        return FalconRocketsRegistries.location("textures/entity/falcon.png");
    }

    public static class RenderFactory implements IRenderFactory<FalconRocket> {
        @Override
        public EntityRenderer<? super FalconRocket> createRenderFor(EntityRendererManager manager) {
            return new FalconRocketRender(manager);
        }
    }
}
