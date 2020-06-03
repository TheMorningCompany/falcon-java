package io.github.themorningcompany.falconrockets.client.renders.rockets;

import io.github.themorningcompany.falconrockets.FalconRocketsRegistries;
import io.github.themorningcompany.falconrockets.client.models.rockets.FalconHeavyRocketModel;
import io.github.themorningcompany.falconrockets.client.models.rockets.FalconRocketModel;
import io.github.themorningcompany.falconrockets.entitites.rockets.FalconHeavyRocket;
import io.github.themorningcompany.falconrockets.entitites.rockets.FalconRocket;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.LivingRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.registry.IRenderFactory;

@OnlyIn(Dist.CLIENT)
public class FalconHeavyRocketRender extends LivingRenderer<FalconHeavyRocket, FalconHeavyRocketModel> {
    public FalconHeavyRocketRender(EntityRendererManager rendererManager) {
        super(rendererManager, new FalconHeavyRocketModel(), 0f);
    }

    @Override
    public ResourceLocation getEntityTexture(FalconHeavyRocket entity) {
        return FalconRocketsRegistries.location("textures/entity/falconheavy.png");
    }

    public static class RenderFactory implements IRenderFactory<FalconHeavyRocket> {
        @Override
        public EntityRenderer<? super FalconHeavyRocket> createRenderFor(EntityRendererManager manager) {
            return new FalconHeavyRocketRender(manager);
        }
    }
}
