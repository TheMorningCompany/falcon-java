package io.github.themorningcompany.falconrockets.client.renders.rockets;

import io.github.themorningcompany.falconrockets.FalconRocketsRegistries;
import io.github.themorningcompany.falconrockets.client.models.rockets.CrewDragonRocketModel;
import io.github.themorningcompany.falconrockets.client.models.rockets.FalconRocketModel;
import io.github.themorningcompany.falconrockets.entitites.rockets.CrewDragonRocket;
import io.github.themorningcompany.falconrockets.entitites.rockets.FalconRocket;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.LivingRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.registry.IRenderFactory;

@OnlyIn(Dist.CLIENT)
public class CrewDragonRocketRender extends LivingRenderer<CrewDragonRocket, CrewDragonRocketModel> {
    public CrewDragonRocketRender(EntityRendererManager rendererManager) {
        super(rendererManager, new CrewDragonRocketModel(), 0f);
    }

    @Override
    public ResourceLocation getEntityTexture(CrewDragonRocket entity) {
        return FalconRocketsRegistries.location("textures/entity/dragon.png");
    }

    public static class RenderFactory implements IRenderFactory<CrewDragonRocket> {
        @Override
        public EntityRenderer<? super CrewDragonRocket> createRenderFor(EntityRendererManager manager) {
            return new CrewDragonRocketRender(manager);
        }
    }
}
