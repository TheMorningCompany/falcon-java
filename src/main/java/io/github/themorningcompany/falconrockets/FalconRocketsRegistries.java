package io.github.themorningcompany.falconrockets;

import io.github.themorningcompany.falconrockets.entitites.RocketEntities;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import static io.github.themorningcompany.falconrockets.FalconRockets.LOGGER;
import static io.github.themorningcompany.falconrockets.FalconRockets.MODID;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class FalconRocketsRegistries {
    @SubscribeEvent
    public static void onBlocksRegistry(final RegistryEvent.Register<Block> blockRegistryEvent) {
        // register a new block here
        LOGGER.info("HELLO from Register Block");
    }

    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> event) {
        RocketEntities.registerEntitySpawnEggs(event);
        LOGGER.info("Items registered.");
    }

    @SubscribeEvent
    public static void registerEntities(final RegistryEvent.Register<EntityType<?>> event) {
        event.getRegistry().registerAll(
                RocketEntities.FALCON_ENTITY,
                RocketEntities.CREW_DRAGON_ENTITY,
                RocketEntities.FALCON_HEAVY_ENTITY,
                RocketEntities.FALCON_LANDED_ENTITY
        );
    }

    public static ResourceLocation location(String name) {
        return new ResourceLocation(MODID, name);
    }
}
