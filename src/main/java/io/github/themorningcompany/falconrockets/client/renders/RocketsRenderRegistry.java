package io.github.themorningcompany.falconrockets.client.renders;

import io.github.themorningcompany.falconrockets.client.renders.rockets.CrewDragonRocketRender;
import io.github.themorningcompany.falconrockets.client.renders.rockets.FalconHeavyRocketRender;
import io.github.themorningcompany.falconrockets.client.renders.rockets.FalconLandedRocketRender;
import io.github.themorningcompany.falconrockets.client.renders.rockets.FalconRocketRender;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

import static io.github.themorningcompany.falconrockets.entitites.RocketEntities.*;

@OnlyIn(Dist.CLIENT)
public class RocketsRenderRegistry {
    public static void registerEntityRenders() {
        RenderingRegistry.registerEntityRenderingHandler(FALCON_ENTITY, new FalconRocketRender.RenderFactory());
        RenderingRegistry.registerEntityRenderingHandler(CREW_DRAGON_ENTITY, new CrewDragonRocketRender.RenderFactory());
        RenderingRegistry.registerEntityRenderingHandler(FALCON_HEAVY_ENTITY, new FalconHeavyRocketRender.RenderFactory());
        RenderingRegistry.registerEntityRenderingHandler(FALCON_LANDED_ENTITY, new FalconLandedRocketRender.RenderFactory());
    }
}
