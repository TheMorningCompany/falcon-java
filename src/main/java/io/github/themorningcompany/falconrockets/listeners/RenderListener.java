package io.github.themorningcompany.falconrockets.listeners;

import io.github.themorningcompany.falconrockets.entitites.EntityRocket;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ActiveRenderInfo;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.client.event.EntityViewRenderEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.lwjgl.system.CallbackI;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
public class RenderListener {

    @SubscribeEvent
    public static void cameraSetup(EntityViewRenderEvent.CameraSetup event) {

        final ActiveRenderInfo info = event.getInfo();

        PlayerEntity playerEntity = Minecraft.getInstance().player;

        if (playerEntity.getRidingEntity() instanceof EntityRocket) {
//            double x = MathHelper.lerp(event.getRenderPartialTicks(), info.getRenderViewEntity().prevPosX, info.getRenderViewEntity().getPosX());
//            double y = MathHelper.lerp(event.getRenderPartialTicks(), info.getRenderViewEntity().prevPosY, info.getRenderViewEntity().getPosY()) + MathHelper.lerp(event.getRenderPartialTicks(), info.previousHeight, info.height);
//            double z = MathHelper.lerp(event.getRenderPartialTicks(), info.getRenderViewEntity().prevPosZ, info.getRenderViewEntity().getPosZ());

            info.update(playerEntity.getEntityWorld(), playerEntity, true, true, (float) event.getRenderPartialTicks());
        }
    }
}
