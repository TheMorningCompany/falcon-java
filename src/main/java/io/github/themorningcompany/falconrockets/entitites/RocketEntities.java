package io.github.themorningcompany.falconrockets.entitites;

import io.github.themorningcompany.falconrockets.FalconRockets;
import io.github.themorningcompany.falconrockets.FalconRocketsRegistries;
import io.github.themorningcompany.falconrockets.entitites.rockets.CrewDragonRocket;
import io.github.themorningcompany.falconrockets.entitites.rockets.FalconHeavyRocket;
import io.github.themorningcompany.falconrockets.entitites.rockets.FalconLandedRocket;
import io.github.themorningcompany.falconrockets.entitites.rockets.FalconRocket;
import io.github.themorningcompany.falconrockets.lists.ItemList;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraftforge.event.RegistryEvent;

import static io.github.themorningcompany.falconrockets.FalconRockets.MODID;

public class RocketEntities {
    public static EntityType<FalconRocket> FALCON_ENTITY = EntityType.Builder.create(FalconRocket::new, EntityClassification.MISC).build(MODID + ":falcon_rocket");
    public static EntityType<CrewDragonRocket> CREW_DRAGON_ENTITY = EntityType.Builder.create(CrewDragonRocket::new, EntityClassification.MISC).build(MODID + ":crew_dragon_rocket");
    public static EntityType<FalconHeavyRocket> FALCON_HEAVY_ENTITY = EntityType.Builder.create(FalconHeavyRocket::new, EntityClassification.MISC).build(MODID + ":falcon_heavy_rocket");
    public static EntityType<FalconLandedRocket> FALCON_LANDED_ENTITY = EntityType.Builder.create(FalconLandedRocket::new, EntityClassification.MISC).build(MODID + ":falcon_landed_rocket");

    static {
        FALCON_ENTITY.setRegistryName(FalconRocketsRegistries.location("falcon_rocket"));
        CREW_DRAGON_ENTITY.setRegistryName(FalconRocketsRegistries.location("crew_dragon_rocket"));
        FALCON_HEAVY_ENTITY.setRegistryName(FalconRocketsRegistries.location("falcon_heavy_rocket"));
        FALCON_LANDED_ENTITY.setRegistryName(FalconRocketsRegistries.location("falcon_landed_rocket"));
    }

    public static void registerEntitySpawnEggs(final RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(
                ItemList.falcon_spawn_egg = registerEntitySpawnEgg(FALCON_ENTITY, 0x000000, 0xffffff, "falcon_spawn_egg"),
                ItemList.crew_dragon_spawn_egg = registerEntitySpawnEgg(CREW_DRAGON_ENTITY, 0x000000, 0xffffff, "crew_dragon_spawn_egg"),
                ItemList.falcon_heavy_spawn_egg = registerEntitySpawnEgg(FALCON_HEAVY_ENTITY, 0x000000, 0xffffff, "falcon_heavy_spawn_egg"),
                ItemList.falcon_landed_spawn_egg = registerEntitySpawnEgg(FALCON_LANDED_ENTITY, 0x000000, 0xffffff, "falcon_landed_spawn_egg")
        );
    }

    public static Item registerEntitySpawnEgg(EntityType<?> type, int color1, int color2, String name) {
        SpawnEggItem item = new SpawnEggItem(type, color1, color2, new Item.Properties().group(FalconRockets.rockets));
        item.setRegistryName(FalconRocketsRegistries.location(name));

        return item;
    }
}
