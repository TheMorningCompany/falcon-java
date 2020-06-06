package io.github.themorningcompany.falconrockets.client.models.vehicles;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import io.github.themorningcompany.falconrockets.entitites.vehicles.DroneShip;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class DroneShipModel extends EntityModel<DroneShip> {
	private final ModelRenderer main;

	public DroneShipModel() {
		textureWidth = 2048;
		textureHeight = 2048;

		main = new ModelRenderer(this);
		main.setRotationPoint(0.0F, 24.0F, 0.0F);
		main.setTextureOffset(0, 0).addBox(-512.0F, -1.0F, 0.0F, 512.0F, 1.0F, 256.0F, 0.0F, false);
		main.setTextureOffset(0, 257).addBox(-510.0F, 0.0F, 0.0F, 508.0F, 1.0F, 256.0F, 0.0F, false);
		main.setTextureOffset(0, 514).addBox(-508.0F, 1.0F, 0.0F, 504.0F, 1.0F, 256.0F, 0.0F, false);
		main.setTextureOffset(1028, 771).addBox(-384.0F, -1.0F, 256.0F, 256.0F, 1.0F, 64.0F, 0.0F, false);
		main.setTextureOffset(1028, 901).addBox(-384.0F, 0.0F, 256.0F, 256.0F, 1.0F, 62.0F, 0.0F, false);
		main.setTextureOffset(1028, 836).addBox(-384.0F, -1.0F, -64.0F, 256.0F, 1.0F, 64.0F, 0.0F, false);
		main.setTextureOffset(1028, 964).addBox(-384.0F, 0.0F, -62.0F, 256.0F, 1.0F, 62.0F, 0.0F, false);
		main.setTextureOffset(1028, 1028).addBox(-508.0F, -17.0F, 4.0F, 6.0F, 16.0F, 248.0F, 0.0F, false);
		main.setTextureOffset(192, 74).addBox(-502.0F, -17.0F, 4.0F, 16.0F, 16.0F, 6.0F, 0.0F, false);
		main.setTextureOffset(44, 186).addBox(-502.0F, -17.0F, 246.0F, 16.0F, 16.0F, 6.0F, 0.0F, false);
		main.setTextureOffset(768, 787).addBox(-11.0F, -17.0F, 4.0F, 6.0F, 16.0F, 248.0F, 0.0F, false);
		main.setTextureOffset(0, 186).addBox(-27.0F, -17.0F, 246.0F, 16.0F, 16.0F, 6.0F, 0.0F, false);
		main.setTextureOffset(148, 74).addBox(-27.0F, -17.0F, 4.0F, 16.0F, 16.0F, 6.0F, 0.0F, false);
		main.setTextureOffset(508, 771).addBox(-123.0F, -17.0F, 4.0F, 6.0F, 16.0F, 248.0F, 0.0F, false);
		main.setTextureOffset(0, 771).addBox(-394.0F, -17.0F, 4.0F, 6.0F, 16.0F, 248.0F, 0.0F, false);
		main.setTextureOffset(0, 257).addBox(-420.0F, -17.0F, 156.0F, 26.0F, 16.0F, 96.0F, 0.0F, false);
		main.setTextureOffset(100, 680).addBox(-420.0F, -17.0F, 84.0F, 4.0F, 4.0F, 72.0F, 0.0F, false);
		main.setTextureOffset(0, 600).addBox(-420.0F, -5.0F, 84.0F, 25.0F, 4.0F, 72.0F, 0.0F, false);
		main.setTextureOffset(0, 369).addBox(-420.0F, -17.0F, 4.0F, 26.0F, 16.0F, 80.0F, 0.0F, false);
		main.setTextureOffset(420, 771).addBox(-51.0F, -17.0F, 190.0F, 32.0F, 16.0F, 48.0F, 0.0F, false);
		main.setTextureOffset(148, 36).addBox(-50.0F, -23.0F, 221.0F, 30.0F, 22.0F, 16.0F, 0.0F, false);
		main.setTextureOffset(148, 0).addBox(-50.0F, -17.0F, 166.0F, 30.0F, 16.0F, 20.0F, 0.0F, false);
		main.setTextureOffset(0, 514).addBox(-50.0F, -23.0F, 98.0F, 30.0F, 22.0F, 64.0F, 0.0F, false);
		main.setTextureOffset(68, 224).addBox(-39.0F, -31.0F, 99.0F, 8.0F, 22.0F, 8.0F, 0.0F, false);
		main.setTextureOffset(148, 148).addBox(-50.0F, -17.0F, 74.0F, 30.0F, 16.0F, 20.0F, 0.0F, false);
		main.setTextureOffset(260, 771).addBox(-51.0F, -17.0F, 22.0F, 32.0F, 16.0F, 48.0F, 0.0F, false);
		main.setTextureOffset(0, 112).addBox(-50.0F, -23.0F, 23.0F, 30.0F, 22.0F, 16.0F, 0.0F, false);
		main.setTextureOffset(0, 0).addBox(-450.0F, -17.0F, 4.0F, 26.0F, 16.0F, 96.0F, 0.0F, false);
		main.setTextureOffset(0, 112).addBox(-450.0F, -17.0F, 156.0F, 26.0F, 16.0F, 96.0F, 0.0F, false);
		main.setTextureOffset(0, 771).addBox(-498.0F, -17.0F, 183.0F, 26.0F, 16.0F, 60.0F, 0.0F, false);
		main.setTextureOffset(0, 45).addBox(-497.0F, -23.0F, 218.0F, 24.0F, 22.0F, 23.0F, 0.0F, false);
		main.setTextureOffset(0, 150).addBox(-498.0F, -17.0F, 150.0F, 26.0F, 16.0F, 20.0F, 0.0F, false);
		main.setTextureOffset(0, 224).addBox(-498.0F, -17.0F, 130.0F, 26.0F, 16.0F, 8.0F, 0.0F, false);
		main.setTextureOffset(148, 184).addBox(-498.0F, -17.0F, 118.0F, 26.0F, 16.0F, 8.0F, 0.0F, false);
		main.setTextureOffset(148, 112).addBox(-498.0F, -17.0F, 86.0F, 26.0F, 16.0F, 20.0F, 0.0F, false);
		main.setTextureOffset(0, 676).addBox(-498.0F, -17.0F, 14.0F, 26.0F, 16.0F, 60.0F, 0.0F, false);
		main.setTextureOffset(0, 0).addBox(-497.0F, -23.0F, 15.0F, 24.0F, 22.0F, 23.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(DroneShip entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		main.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}