package io.github.themorningcompany.falconrockets;

import io.github.themorningcompany.falconrockets.client.renders.RocketsRenderRegistry;
import io.github.themorningcompany.falconrockets.entitites.rockets.FalconRocket;
import io.github.themorningcompany.falconrockets.lists.ItemList;
import io.github.themorningcompany.falconrockets.lists.ModTileEntityTypes;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScreenManager;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.Collectors;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(FalconRockets.MODID)
public class FalconRockets
{
    public static final String MODID = "falconrockets";
    public static final String VERSION = "1.0";
    // Directly reference a log4j logger.
    public static final Logger LOGGER = LogManager.getLogger();
    public static FalconRockets INSTANCE;

    public static final ItemGroup rockets = new RocketsItemGroup();
    public FalconRockets() {

        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        // Register the doClientStuff method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientRegistries);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

//        ModTileEntityTypes.TILE_ENTITY_TYPES.register(modEventBus);

        INSTANCE = this;
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        RocketsRenderRegistry.registerEntityRenders();
    }

    private void clientRegistries(final FMLClientSetupEvent event) {

    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
        // do something when the server starts
        LOGGER.info("HELLO from server starting");
    }
}
