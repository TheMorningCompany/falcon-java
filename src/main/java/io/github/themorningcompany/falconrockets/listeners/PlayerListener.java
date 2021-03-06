package io.github.themorningcompany.falconrockets.listeners;

import io.github.themorningcompany.falconrockets.entitites.supers.EntityRocket;
import io.github.themorningcompany.falconrockets.entitites.rockets.FalconLandedRocket;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class PlayerListener {
    @SubscribeEvent
    public static void onRocketHurt(LivingHurtEvent event) {
        if (!(event.getSource().getTrueSource() instanceof PlayerEntity)) return;
        if (event.getEntity() instanceof EntityRocket) {
            event.setCanceled(true);
            if (!(event.getEntity() instanceof FalconLandedRocket)) {
                ((EntityRocket) event.getEntity()).setLaunched(true);
            }
        }
    }

    @SubscribeEvent
    public static void onKey(InputEvent.KeyInputEvent event) {
        PlayerEntity player = Minecraft.getInstance().player;
        if (player == null) return;
        Entity ridingEntity = player.getRidingEntity();

        if (ridingEntity == null) return;
        if (ridingEntity instanceof EntityRocket) {
            switch (event.getKey()) {
                case 32:
                    EntityRocket rocket = (EntityRocket) ridingEntity;
                    player.stopRiding();
                    rocket.setLaunched(true);
                    player.startRiding(rocket);
                    break;
            }
        }
    }
}
