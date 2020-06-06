package io.github.themorningcompany.falconrockets;

import io.github.themorningcompany.falconrockets.entitites.RocketEntities;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

import static io.github.themorningcompany.falconrockets.FalconRockets.LOGGER;
import static io.github.themorningcompany.falconrockets.FalconRockets.MODID;

@ObjectHolder(MODID)
@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class FalconRocketsRegistries {

    @SubscribeEvent
    public static void onBlocksRegistry(final RegistryEvent.Register<Block> blockRegistryEvent) {
        // register a new block here
//        blockRegistryEvent.getRegistry().registerAll(
//                BlockList.launch_pad_block = new BlockLaunchPad(Block.Properties.create(Material.IRON)
//                        .hardnessAndResistance(0.5f, 15.0f)
//                        .sound(SoundType.ANVIL)).setRegistryName(MODID, "launch_pad")
//        );
        LOGGER.info("Registered Blocks");
    }

    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> event) {
        RocketEntities.registerEntitySpawnEggs(event);
//        event.getRegistry().registerAll(
//                new BlockItem(BlockList.launch_pad_block, new Item.Properties().group(FalconRockets.rockets)).setRegistryName(MODID, "launch_pad")
//        );
        LOGGER.info("Items registered.");
    }

    @SubscribeEvent
    public static void registerEntities(final RegistryEvent.Register<EntityType<?>> event) {
        event.getRegistry().registerAll(
                RocketEntities.FALCON_ENTITY,
                RocketEntities.CREW_DRAGON_ENTITY,
                RocketEntities.FALCON_HEAVY_ENTITY,
                RocketEntities.FALCON_LANDED_ENTITY,
                RocketEntities.DRONE_SHIP_ENTITY
        );
    }

    public static ResourceLocation location(String name) {
        return new ResourceLocation(MODID, name);
    }
}
