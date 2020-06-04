package io.github.themorningcompany.falconrockets.listeners;

import io.github.themorningcompany.falconrockets.entitites.EntityRocket;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.FORGE)
public class RenderListener {
    @SubscribeEvent
    public static void onPlayerRender(RenderWorldLastEvent event) {
        PlayerEntity player = Minecraft.getInstance().player;
        assert player != null;

        if (player.getRidingEntity() instanceof EntityRocket) {
            player.rotationPitch = -90;
        }
    }
}
