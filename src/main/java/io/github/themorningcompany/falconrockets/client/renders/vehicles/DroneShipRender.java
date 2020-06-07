package io.github.themorningcompany.falconrockets.client.renders.vehicles;

import com.google.common.collect.Lists;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import io.github.themorningcompany.falconrockets.FalconRocketsRegistries;
import io.github.themorningcompany.falconrockets.client.models.rockets.FalconRocketModel;
import io.github.themorningcompany.falconrockets.client.models.vehicles.DroneShipModel;
import io.github.themorningcompany.falconrockets.entitites.rockets.FalconRocket;
import io.github.themorningcompany.falconrockets.entitites.vehicles.DroneShip;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.Quaternion;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.Vector3f;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.LivingRenderer;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Pose;
import net.minecraft.util.Direction;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.registry.IRenderFactory;

import java.util.List;

import static net.minecraft.client.renderer.entity.LivingRenderer.getPackedOverlay;

@OnlyIn(Dist.CLIENT)
public class DroneShipRender extends EntityRenderer<DroneShip> {

    protected DroneShipModel model = new DroneShipModel();

    public DroneShipRender(EntityRendererManager rendererManager) {
        super(rendererManager);
    }

    @Override
    public ResourceLocation getEntityTexture(DroneShip entity) {
        return FalconRocketsRegistries.location("textures/entity/drone_ship.png");
    }

    @Override
    public void render(DroneShip entityIn, float entityYaw, float partialTicks, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn) {
        matrixStackIn.push();
        matrixStackIn.translate(0, 2.0f, 0);
        matrixStackIn.rotate(Vector3f.XP.rotationDegrees(180.0F));

        IVertexBuilder ivertexbuilder = bufferIn.getBuffer(this.model.getRenderType(this.getEntityTexture(entityIn)));
        model.render(matrixStackIn, ivertexbuilder, packedLightIn, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);

        matrixStackIn.pop();
        super.render(entityIn, entityYaw, partialTicks, matrixStackIn, bufferIn, packedLightIn);
    }

    public static class RenderFactory implements IRenderFactory<DroneShip> {
        @Override
        public EntityRenderer<? super DroneShip> createRenderFor(EntityRendererManager manager) {
            return new DroneShipRender(manager);
        }
    }
}
