package io.github.themorningcompany.falconrockets.client.models.rockets;


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import io.github.themorningcompany.falconrockets.entitites.rockets.CrewDragonRocket;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class CrewDragonRocketModel extends EntityModel<CrewDragonRocket> {
	private final ModelRenderer falcon9;
	private final ModelRenderer rocket;
	private final ModelRenderer bone50;
	private final ModelRenderer bone51;
	private final ModelRenderer bone52;
	private final ModelRenderer bone53;
	private final ModelRenderer bone54;
	private final ModelRenderer bone55;
	private final ModelRenderer bone56;
	private final ModelRenderer bone43;
	private final ModelRenderer bone44;
	private final ModelRenderer bone45;
	private final ModelRenderer bone46;
	private final ModelRenderer bone47;
	private final ModelRenderer bone48;
	private final ModelRenderer bone49;
	private final ModelRenderer bone36;
	private final ModelRenderer bone37;
	private final ModelRenderer bone38;
	private final ModelRenderer bone39;
	private final ModelRenderer bone40;
	private final ModelRenderer bone41;
	private final ModelRenderer bone42;
	private final ModelRenderer bone29;
	private final ModelRenderer bone30;
	private final ModelRenderer bone31;
	private final ModelRenderer bone32;
	private final ModelRenderer bone33;
	private final ModelRenderer bone34;
	private final ModelRenderer bone35;
	private final ModelRenderer bone22;
	private final ModelRenderer bone23;
	private final ModelRenderer bone24;
	private final ModelRenderer bone25;
	private final ModelRenderer bone26;
	private final ModelRenderer bone27;
	private final ModelRenderer bone28;
	private final ModelRenderer bone15;
	private final ModelRenderer bone16;
	private final ModelRenderer bone17;
	private final ModelRenderer bone18;
	private final ModelRenderer bone19;
	private final ModelRenderer bone20;
	private final ModelRenderer bone21;
	private final ModelRenderer bone8;
	private final ModelRenderer bone9;
	private final ModelRenderer bone10;
	private final ModelRenderer bone11;
	private final ModelRenderer bone12;
	private final ModelRenderer bone13;
	private final ModelRenderer bone14;
	private final ModelRenderer bone7;
	private final ModelRenderer bone;
	private final ModelRenderer bone2;
	private final ModelRenderer bone3;
	private final ModelRenderer bone4;
	private final ModelRenderer bone5;
	private final ModelRenderer bone6;
	private final ModelRenderer bone57;
	private final ModelRenderer bone92;
	private final ModelRenderer boosters;
	private final ModelRenderer merlin;
	private final ModelRenderer bone58;
	private final ModelRenderer bone59;
	private final ModelRenderer bone60;
	private final ModelRenderer bone61;
	private final ModelRenderer merlin2;
	private final ModelRenderer bone62;
	private final ModelRenderer bone63;
	private final ModelRenderer bone64;
	private final ModelRenderer bone65;
	private final ModelRenderer merlin3;
	private final ModelRenderer bone66;
	private final ModelRenderer bone67;
	private final ModelRenderer bone68;
	private final ModelRenderer bone69;
	private final ModelRenderer merlin4;
	private final ModelRenderer bone70;
	private final ModelRenderer bone71;
	private final ModelRenderer bone72;
	private final ModelRenderer bone73;
	private final ModelRenderer merlin5;
	private final ModelRenderer bone74;
	private final ModelRenderer bone75;
	private final ModelRenderer bone114;
	private final ModelRenderer bone115;
	private final ModelRenderer merlin6;
	private final ModelRenderer bone116;
	private final ModelRenderer bone117;
	private final ModelRenderer bone118;
	private final ModelRenderer bone119;
	private final ModelRenderer merlin7;
	private final ModelRenderer bone120;
	private final ModelRenderer bone121;
	private final ModelRenderer bone122;
	private final ModelRenderer bone123;
	private final ModelRenderer merlin8;
	private final ModelRenderer bone124;
	private final ModelRenderer bone125;
	private final ModelRenderer bone126;
	private final ModelRenderer bone127;
	private final ModelRenderer merlin9;
	private final ModelRenderer bone129;
	private final ModelRenderer bone130;
	private final ModelRenderer bone131;
	private final ModelRenderer bone132;
	private final ModelRenderer legs_main;
	private final ModelRenderer leg;
	private final ModelRenderer bone76;
	private final ModelRenderer bone77;
	private final ModelRenderer bone78;
	private final ModelRenderer bone79;
	private final ModelRenderer leg2;
	private final ModelRenderer bone80;
	private final ModelRenderer bone81;
	private final ModelRenderer bone82;
	private final ModelRenderer bone83;
	private final ModelRenderer leg3;
	private final ModelRenderer bone84;
	private final ModelRenderer bone85;
	private final ModelRenderer bone86;
	private final ModelRenderer bone87;
	private final ModelRenderer leg4;
	private final ModelRenderer bone88;
	private final ModelRenderer bone89;
	private final ModelRenderer bone90;
	private final ModelRenderer bone91;
	private final ModelRenderer fins_main;
	private final ModelRenderer fins1_2;
	private final ModelRenderer fin;
	private final ModelRenderer fin2;
	private final ModelRenderer fins3_4;
	private final ModelRenderer fin3;
	private final ModelRenderer fin4;
	private final ModelRenderer stage2;
	private final ModelRenderer bone94;
	private final ModelRenderer bone95;
	private final ModelRenderer bone96;
	private final ModelRenderer bone97;
	private final ModelRenderer bone98;
	private final ModelRenderer bone99;
	private final ModelRenderer bone100;
	private final ModelRenderer fairing;
	private final ModelRenderer dragon;
	private final ModelRenderer bone143;
	private final ModelRenderer bone144;
	private final ModelRenderer bone136;
	private final ModelRenderer bone137;
	private final ModelRenderer bone138;
	private final ModelRenderer bone139;
	private final ModelRenderer bone140;
	private final ModelRenderer bone141;
	private final ModelRenderer bone142;
	private final ModelRenderer bone128;
	private final ModelRenderer bone93;
	private final ModelRenderer bone101;
	private final ModelRenderer bone102;
	private final ModelRenderer bone103;
	private final ModelRenderer bone134;
	private final ModelRenderer bone104;
	private final ModelRenderer bone105;
	private final ModelRenderer bone109;
	private final ModelRenderer bone106;
	private final ModelRenderer bone107;
	private final ModelRenderer bone108;
	private final ModelRenderer bone110;
	private final ModelRenderer bone111;
	private final ModelRenderer bone112;
	private final ModelRenderer bone113;

	public CrewDragonRocketModel() {
		textureWidth = 256;
		textureHeight = 256;

		falcon9 = new ModelRenderer(this);
		falcon9.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		rocket = new ModelRenderer(this);
		rocket.setRotationPoint(0.0F, -76.0F, 0.0F);
		falcon9.addChild(rocket);
		

		bone50 = new ModelRenderer(this);
		bone50.setRotationPoint(0.0F, 0.0F, 0.0F);
		rocket.addChild(bone50);
		

		bone51 = new ModelRenderer(this);
		bone51.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone50.addChild(bone51);
		bone51.setTextureOffset(0, 160).addBox(-19.0F, -455.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone51.setTextureOffset(0, 160).addBox(18.0F, -455.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone52 = new ModelRenderer(this);
		bone52.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone50.addChild(bone52);
		setRotationAngle(bone52, 0.0F, -0.5236F, 0.0F);
		bone52.setTextureOffset(0, 160).addBox(-19.0F, -455.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone52.setTextureOffset(0, 160).addBox(18.0F, -455.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone53 = new ModelRenderer(this);
		bone53.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone50.addChild(bone53);
		setRotationAngle(bone53, 0.0F, -1.0472F, 0.0F);
		bone53.setTextureOffset(0, 160).addBox(-19.0F, -455.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone53.setTextureOffset(0, 160).addBox(18.0F, -455.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone54 = new ModelRenderer(this);
		bone54.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone50.addChild(bone54);
		setRotationAngle(bone54, 0.0F, -1.5708F, 0.0F);
		bone54.setTextureOffset(23, 160).addBox(-19.0F, -455.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone54.setTextureOffset(0, 160).addBox(18.0F, -455.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone55 = new ModelRenderer(this);
		bone55.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone50.addChild(bone55);
		setRotationAngle(bone55, 0.0F, -2.0944F, 0.0F);
		bone55.setTextureOffset(0, 160).addBox(-19.0F, -455.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone55.setTextureOffset(0, 160).addBox(18.0F, -455.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone56 = new ModelRenderer(this);
		bone56.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone50.addChild(bone56);
		setRotationAngle(bone56, 0.0F, -2.618F, 0.0F);
		bone56.setTextureOffset(0, 160).addBox(-19.0F, -455.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone56.setTextureOffset(0, 160).addBox(18.0F, -455.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone43 = new ModelRenderer(this);
		bone43.setRotationPoint(0.0F, 0.0F, 0.0F);
		rocket.addChild(bone43);
		

		bone44 = new ModelRenderer(this);
		bone44.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone43.addChild(bone44);
		bone44.setTextureOffset(0, 0).addBox(-19.0F, -385.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone44.setTextureOffset(0, 0).addBox(18.0F, -385.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone45 = new ModelRenderer(this);
		bone45.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone43.addChild(bone45);
		setRotationAngle(bone45, 0.0F, -0.5236F, 0.0F);
		bone45.setTextureOffset(0, 0).addBox(-19.0F, -385.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone45.setTextureOffset(0, 0).addBox(18.0F, -385.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone46 = new ModelRenderer(this);
		bone46.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone43.addChild(bone46);
		setRotationAngle(bone46, 0.0F, -1.0472F, 0.0F);
		bone46.setTextureOffset(0, 0).addBox(-19.0F, -385.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone46.setTextureOffset(0, 0).addBox(18.0F, -385.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone47 = new ModelRenderer(this);
		bone47.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone43.addChild(bone47);
		setRotationAngle(bone47, 0.0F, -1.5708F, 0.0F);
		bone47.setTextureOffset(46, 160).addBox(-19.0F, -385.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone47.setTextureOffset(0, 0).addBox(18.0F, -385.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone48 = new ModelRenderer(this);
		bone48.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone43.addChild(bone48);
		setRotationAngle(bone48, 0.0F, -2.0944F, 0.0F);
		bone48.setTextureOffset(0, 0).addBox(-19.0F, -385.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone48.setTextureOffset(0, 0).addBox(18.0F, -385.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone49 = new ModelRenderer(this);
		bone49.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone43.addChild(bone49);
		setRotationAngle(bone49, 0.0F, -2.618F, 0.0F);
		bone49.setTextureOffset(0, 0).addBox(-19.0F, -385.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone49.setTextureOffset(0, 0).addBox(18.0F, -385.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone36 = new ModelRenderer(this);
		bone36.setRotationPoint(0.0F, 0.0F, 0.0F);
		rocket.addChild(bone36);
		

		bone37 = new ModelRenderer(this);
		bone37.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone36.addChild(bone37);
		bone37.setTextureOffset(0, 0).addBox(-19.0F, -315.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone37.setTextureOffset(0, 0).addBox(18.0F, -315.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone38 = new ModelRenderer(this);
		bone38.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone36.addChild(bone38);
		setRotationAngle(bone38, 0.0F, -0.5236F, 0.0F);
		bone38.setTextureOffset(0, 0).addBox(-19.0F, -315.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone38.setTextureOffset(0, 0).addBox(18.0F, -315.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone39 = new ModelRenderer(this);
		bone39.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone36.addChild(bone39);
		setRotationAngle(bone39, 0.0F, -1.0472F, 0.0F);
		bone39.setTextureOffset(0, 0).addBox(-19.0F, -315.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone39.setTextureOffset(0, 0).addBox(18.0F, -315.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone40 = new ModelRenderer(this);
		bone40.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone36.addChild(bone40);
		setRotationAngle(bone40, 0.0F, -1.5708F, 0.0F);
		bone40.setTextureOffset(0, 0).addBox(-19.0F, -315.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone40.setTextureOffset(0, 0).addBox(18.0F, -315.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone41 = new ModelRenderer(this);
		bone41.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone36.addChild(bone41);
		setRotationAngle(bone41, 0.0F, -2.0944F, 0.0F);
		bone41.setTextureOffset(0, 0).addBox(-19.0F, -315.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone41.setTextureOffset(0, 0).addBox(18.0F, -315.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone42 = new ModelRenderer(this);
		bone42.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone36.addChild(bone42);
		setRotationAngle(bone42, 0.0F, -2.618F, 0.0F);
		bone42.setTextureOffset(0, 0).addBox(-19.0F, -315.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone42.setTextureOffset(0, 0).addBox(18.0F, -315.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone29 = new ModelRenderer(this);
		bone29.setRotationPoint(0.0F, 0.0F, 0.0F);
		rocket.addChild(bone29);
		

		bone30 = new ModelRenderer(this);
		bone30.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone29.addChild(bone30);
		bone30.setTextureOffset(0, 0).addBox(-19.0F, -245.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone30.setTextureOffset(0, 0).addBox(18.0F, -245.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone31 = new ModelRenderer(this);
		bone31.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone29.addChild(bone31);
		setRotationAngle(bone31, 0.0F, -0.5236F, 0.0F);
		bone31.setTextureOffset(0, 0).addBox(-19.0F, -245.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone31.setTextureOffset(0, 0).addBox(18.0F, -245.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone32 = new ModelRenderer(this);
		bone32.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone29.addChild(bone32);
		setRotationAngle(bone32, 0.0F, -1.0472F, 0.0F);
		bone32.setTextureOffset(0, 0).addBox(-19.0F, -245.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone32.setTextureOffset(0, 0).addBox(18.0F, -245.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone33 = new ModelRenderer(this);
		bone33.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone29.addChild(bone33);
		setRotationAngle(bone33, 0.0F, -1.5708F, 0.0F);
		bone33.setTextureOffset(23, 80).addBox(-19.0F, -245.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone33.setTextureOffset(0, 0).addBox(18.0F, -245.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone34 = new ModelRenderer(this);
		bone34.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone29.addChild(bone34);
		setRotationAngle(bone34, 0.0F, -2.0944F, 0.0F);
		bone34.setTextureOffset(0, 0).addBox(-19.0F, -245.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone34.setTextureOffset(0, 0).addBox(18.0F, -245.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone35 = new ModelRenderer(this);
		bone35.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone29.addChild(bone35);
		setRotationAngle(bone35, 0.0F, -2.618F, 0.0F);
		bone35.setTextureOffset(0, 0).addBox(-19.0F, -245.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone35.setTextureOffset(0, 0).addBox(18.0F, -245.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone22 = new ModelRenderer(this);
		bone22.setRotationPoint(0.0F, 0.0F, 0.0F);
		rocket.addChild(bone22);
		

		bone23 = new ModelRenderer(this);
		bone23.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone22.addChild(bone23);
		bone23.setTextureOffset(0, 0).addBox(-19.0F, -175.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone23.setTextureOffset(0, 0).addBox(18.0F, -175.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone24 = new ModelRenderer(this);
		bone24.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone22.addChild(bone24);
		setRotationAngle(bone24, 0.0F, -0.5236F, 0.0F);
		bone24.setTextureOffset(0, 0).addBox(-19.0F, -175.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone24.setTextureOffset(0, 0).addBox(18.0F, -175.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone25 = new ModelRenderer(this);
		bone25.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone22.addChild(bone25);
		setRotationAngle(bone25, 0.0F, -1.0472F, 0.0F);
		bone25.setTextureOffset(0, 0).addBox(-19.0F, -175.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone25.setTextureOffset(0, 0).addBox(18.0F, -175.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone26 = new ModelRenderer(this);
		bone26.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone22.addChild(bone26);
		setRotationAngle(bone26, 0.0F, -1.5708F, 0.0F);
		bone26.setTextureOffset(0, 0).addBox(-19.0F, -175.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone26.setTextureOffset(0, 0).addBox(18.0F, -175.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone27 = new ModelRenderer(this);
		bone27.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone22.addChild(bone27);
		setRotationAngle(bone27, 0.0F, -2.0944F, 0.0F);
		bone27.setTextureOffset(0, 0).addBox(-19.0F, -175.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone27.setTextureOffset(0, 0).addBox(18.0F, -175.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone28 = new ModelRenderer(this);
		bone28.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone22.addChild(bone28);
		setRotationAngle(bone28, 0.0F, -2.618F, 0.0F);
		bone28.setTextureOffset(0, 0).addBox(-19.0F, -175.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone28.setTextureOffset(0, 0).addBox(18.0F, -175.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone15 = new ModelRenderer(this);
		bone15.setRotationPoint(0.0F, 0.0F, 0.0F);
		rocket.addChild(bone15);
		

		bone16 = new ModelRenderer(this);
		bone16.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone15.addChild(bone16);
		bone16.setTextureOffset(0, 0).addBox(-19.0F, -105.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone16.setTextureOffset(0, 0).addBox(18.0F, -105.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone17 = new ModelRenderer(this);
		bone17.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone15.addChild(bone17);
		setRotationAngle(bone17, 0.0F, -0.5236F, 0.0F);
		bone17.setTextureOffset(0, 0).addBox(-19.0F, -105.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone17.setTextureOffset(0, 0).addBox(18.0F, -105.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone18 = new ModelRenderer(this);
		bone18.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone15.addChild(bone18);
		setRotationAngle(bone18, 0.0F, -1.0472F, 0.0F);
		bone18.setTextureOffset(0, 0).addBox(-19.0F, -105.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone18.setTextureOffset(0, 0).addBox(18.0F, -105.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone19 = new ModelRenderer(this);
		bone19.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone15.addChild(bone19);
		setRotationAngle(bone19, 0.0F, -1.5708F, 0.0F);
		bone19.setTextureOffset(0, 0).addBox(-19.0F, -105.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone19.setTextureOffset(0, 0).addBox(18.0F, -105.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone20 = new ModelRenderer(this);
		bone20.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone15.addChild(bone20);
		setRotationAngle(bone20, 0.0F, -2.0944F, 0.0F);
		bone20.setTextureOffset(0, 0).addBox(-19.0F, -105.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone20.setTextureOffset(0, 0).addBox(18.0F, -105.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone21 = new ModelRenderer(this);
		bone21.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone15.addChild(bone21);
		setRotationAngle(bone21, 0.0F, -2.618F, 0.0F);
		bone21.setTextureOffset(0, 0).addBox(-19.0F, -105.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone21.setTextureOffset(0, 0).addBox(18.0F, -105.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(0.0F, 69.0F, 0.0F);
		rocket.addChild(bone8);
		

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone8.addChild(bone9);
		bone9.setTextureOffset(0, 0).addBox(-19.0F, -105.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone9.setTextureOffset(0, 0).addBox(18.0F, -105.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone8.addChild(bone10);
		setRotationAngle(bone10, 0.0F, -0.5236F, 0.0F);
		bone10.setTextureOffset(0, 0).addBox(-19.0F, -105.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone10.setTextureOffset(0, 0).addBox(18.0F, -105.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone8.addChild(bone11);
		setRotationAngle(bone11, 0.0F, -1.0472F, 0.0F);
		bone11.setTextureOffset(0, 0).addBox(-19.0F, -105.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone11.setTextureOffset(0, 0).addBox(18.0F, -105.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone12 = new ModelRenderer(this);
		bone12.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone8.addChild(bone12);
		setRotationAngle(bone12, 0.0F, -1.5708F, 0.0F);
		bone12.setTextureOffset(0, 0).addBox(-19.0F, -105.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone12.setTextureOffset(0, 0).addBox(18.0F, -105.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone13 = new ModelRenderer(this);
		bone13.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone8.addChild(bone13);
		setRotationAngle(bone13, 0.0F, -2.0944F, 0.0F);
		bone13.setTextureOffset(0, 0).addBox(-19.0F, -105.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone13.setTextureOffset(0, 0).addBox(18.0F, -105.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone14 = new ModelRenderer(this);
		bone14.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone8.addChild(bone14);
		setRotationAngle(bone14, 0.0F, -2.618F, 0.0F);
		bone14.setTextureOffset(0, 0).addBox(-19.0F, -105.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone14.setTextureOffset(0, 0).addBox(18.0F, -105.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(0.0F, 69.0F, 0.0F);
		rocket.addChild(bone7);
		

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone7.addChild(bone);
		bone.setTextureOffset(0, 80).addBox(-19.0F, -35.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone.setTextureOffset(0, 80).addBox(18.0F, -35.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone7.addChild(bone2);
		setRotationAngle(bone2, 0.0F, -0.5236F, 0.0F);
		bone2.setTextureOffset(0, 80).addBox(-19.0F, -35.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone2.setTextureOffset(0, 80).addBox(18.0F, -35.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone7.addChild(bone3);
		setRotationAngle(bone3, 0.0F, -1.0472F, 0.0F);
		bone3.setTextureOffset(0, 80).addBox(-19.0F, -35.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone3.setTextureOffset(0, 80).addBox(18.0F, -35.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone7.addChild(bone4);
		setRotationAngle(bone4, 0.0F, -1.5708F, 0.0F);
		bone4.setTextureOffset(0, 80).addBox(-19.0F, -35.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone4.setTextureOffset(0, 80).addBox(18.0F, -35.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone7.addChild(bone5);
		setRotationAngle(bone5, 0.0F, -2.0944F, 0.0F);
		bone5.setTextureOffset(0, 80).addBox(-19.0F, -35.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone5.setTextureOffset(0, 80).addBox(18.0F, -35.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone7.addChild(bone6);
		setRotationAngle(bone6, 0.0F, -2.618F, 0.0F);
		bone6.setTextureOffset(0, 80).addBox(-19.0F, -35.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone6.setTextureOffset(0, 80).addBox(18.0F, -35.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone57 = new ModelRenderer(this);
		bone57.setRotationPoint(0.0F, -4.0F, 0.0F);
		rocket.addChild(bone57);
		bone57.setTextureOffset(24, 0).addBox(-5.0F, 68.0F, -18.0F, 10.0F, 1.0F, 36.0F, 0.0F, false);
		bone57.setTextureOffset(24, 0).addBox(-5.0F, 68.0F, -18.0F, 10.0F, 1.0F, 36.0F, 0.0F, false);
		bone57.setTextureOffset(24, 0).addBox(-5.0F, 68.0F, -18.0F, 10.0F, 1.0F, 36.0F, 0.0F, false);
		bone57.setTextureOffset(24, 0).addBox(-5.0F, 68.0F, -18.0F, 10.0F, 1.0F, 36.0F, 0.0F, false);
		bone57.setTextureOffset(24, 0).addBox(-5.0F, 68.0F, -18.0F, 10.0F, 1.0F, 36.0F, 0.0F, false);
		bone57.setTextureOffset(24, 0).addBox(-5.0F, 68.0F, -18.0F, 10.0F, 1.0F, 36.0F, 0.0F, false);

		bone92 = new ModelRenderer(this);
		bone92.setRotationPoint(0.0F, -483.0F, 0.0F);
		rocket.addChild(bone92);
		bone92.setTextureOffset(24, 0).addBox(-5.0F, 68.0F, -18.0F, 10.0F, 1.0F, 36.0F, 0.0F, false);
		bone92.setTextureOffset(24, 0).addBox(-5.0F, 68.0F, -18.0F, 10.0F, 1.0F, 36.0F, 0.0F, false);
		bone92.setTextureOffset(24, 0).addBox(-5.0F, 68.0F, -18.0F, 10.0F, 1.0F, 36.0F, 0.0F, false);
		bone92.setTextureOffset(24, 0).addBox(-5.0F, 68.0F, -18.0F, 10.0F, 1.0F, 36.0F, 0.0F, false);
		bone92.setTextureOffset(24, 0).addBox(-5.0F, 68.0F, -18.0F, 10.0F, 1.0F, 36.0F, 0.0F, false);
		bone92.setTextureOffset(24, 0).addBox(-5.0F, 68.0F, -18.0F, 10.0F, 1.0F, 36.0F, 0.0F, false);

		boosters = new ModelRenderer(this);
		boosters.setRotationPoint(0.0F, 0.0F, 0.0F);
		falcon9.addChild(boosters);
		

		merlin = new ModelRenderer(this);
		merlin.setRotationPoint(0.0F, 0.0F, 0.0F);
		boosters.addChild(merlin);
		merlin.setTextureOffset(29, 0).addBox(-3.0F, -11.0F, -3.0F, 6.0F, 9.0F, 6.0F, 0.0F, false);

		bone58 = new ModelRenderer(this);
		bone58.setRotationPoint(0.0F, -3.0F, 0.0F);
		merlin.addChild(bone58);
		bone58.setTextureOffset(23, 11).addBox(-5.0F, -5.0F, -2.0F, 1.0F, 8.0F, 4.0F, 0.0F, false);
		bone58.setTextureOffset(23, 11).addBox(4.0F, -5.0F, -2.0F, 1.0F, 8.0F, 4.0F, 0.0F, false);

		bone59 = new ModelRenderer(this);
		bone59.setRotationPoint(0.0F, -3.0F, 0.0F);
		merlin.addChild(bone59);
		setRotationAngle(bone59, 0.0F, -0.7854F, 0.0F);
		bone59.setTextureOffset(23, 11).addBox(-5.0F, -5.0F, -2.0F, 1.0F, 8.0F, 4.0F, 0.0F, false);
		bone59.setTextureOffset(23, 11).addBox(4.0F, -5.0F, -2.0F, 1.0F, 8.0F, 4.0F, 0.0F, false);

		bone60 = new ModelRenderer(this);
		bone60.setRotationPoint(0.0F, -3.0F, 0.0F);
		merlin.addChild(bone60);
		setRotationAngle(bone60, 0.0F, -1.5708F, 0.0F);
		bone60.setTextureOffset(23, 11).addBox(-5.0F, -5.0F, -2.0F, 1.0F, 8.0F, 4.0F, 0.0F, false);
		bone60.setTextureOffset(23, 11).addBox(4.0F, -5.0F, -2.0F, 1.0F, 8.0F, 4.0F, 0.0F, false);

		bone61 = new ModelRenderer(this);
		bone61.setRotationPoint(0.0F, -3.0F, 0.0F);
		merlin.addChild(bone61);
		setRotationAngle(bone61, 0.0F, -2.3562F, 0.0F);
		bone61.setTextureOffset(23, 11).addBox(-5.0F, -5.0F, -2.0F, 1.0F, 8.0F, 4.0F, 0.0F, false);
		bone61.setTextureOffset(23, 11).addBox(4.0F, -5.0F, -2.0F, 1.0F, 8.0F, 4.0F, 0.0F, false);

		merlin2 = new ModelRenderer(this);
		merlin2.setRotationPoint(0.0F, 0.0F, 0.0F);
		boosters.addChild(merlin2);
		merlin2.setTextureOffset(29, 0).addBox(-3.0F, -11.0F, 10.5F, 6.0F, 9.0F, 6.0F, 0.0F, false);

		bone62 = new ModelRenderer(this);
		bone62.setRotationPoint(0.0F, -3.0F, 13.5F);
		merlin2.addChild(bone62);
		bone62.setTextureOffset(23, 11).addBox(-5.0F, -5.0F, -2.0F, 1.0F, 8.0F, 4.0F, 0.0F, false);
		bone62.setTextureOffset(23, 11).addBox(4.0F, -5.0F, -2.0F, 1.0F, 8.0F, 4.0F, 0.0F, false);

		bone63 = new ModelRenderer(this);
		bone63.setRotationPoint(0.0F, -3.0F, 13.5F);
		merlin2.addChild(bone63);
		setRotationAngle(bone63, 0.0F, -0.7854F, 0.0F);
		bone63.setTextureOffset(23, 11).addBox(-5.0F, -5.0F, -2.0F, 1.0F, 8.0F, 4.0F, 0.0F, false);
		bone63.setTextureOffset(23, 11).addBox(4.0F, -5.0F, -2.0F, 1.0F, 8.0F, 4.0F, 0.0F, false);

		bone64 = new ModelRenderer(this);
		bone64.setRotationPoint(0.0F, -3.0F, 13.5F);
		merlin2.addChild(bone64);
		setRotationAngle(bone64, 0.0F, -1.5708F, 0.0F);
		bone64.setTextureOffset(23, 11).addBox(-5.0F, -5.0F, -2.0F, 1.0F, 8.0F, 4.0F, 0.0F, false);
		bone64.setTextureOffset(23, 11).addBox(4.0F, -5.0F, -2.0F, 1.0F, 8.0F, 4.0F, 0.0F, false);

		bone65 = new ModelRenderer(this);
		bone65.setRotationPoint(0.0F, -3.0F, 13.5F);
		merlin2.addChild(bone65);
		setRotationAngle(bone65, 0.0F, -2.3562F, 0.0F);
		bone65.setTextureOffset(23, 11).addBox(-5.0F, -5.0F, -2.0F, 1.0F, 8.0F, 4.0F, 0.0F, false);
		bone65.setTextureOffset(23, 11).addBox(4.0F, -5.0F, -2.0F, 1.0F, 8.0F, 4.0F, 0.0F, false);

		merlin3 = new ModelRenderer(this);
		merlin3.setRotationPoint(0.0F, 0.0F, 0.0F);
		boosters.addChild(merlin3);
		setRotationAngle(merlin3, 0.0F, -0.7854F, 0.0F);
		merlin3.setTextureOffset(29, 0).addBox(-3.0F, -11.0F, 10.5F, 6.0F, 9.0F, 6.0F, 0.0F, false);

		bone66 = new ModelRenderer(this);
		bone66.setRotationPoint(0.0F, -3.0F, 13.5F);
		merlin3.addChild(bone66);
		bone66.setTextureOffset(23, 11).addBox(-5.0F, -5.0F, -2.0F, 1.0F, 8.0F, 4.0F, 0.0F, false);
		bone66.setTextureOffset(23, 11).addBox(4.0F, -5.0F, -2.0F, 1.0F, 8.0F, 4.0F, 0.0F, false);

		bone67 = new ModelRenderer(this);
		bone67.setRotationPoint(0.0F, -3.0F, 13.5F);
		merlin3.addChild(bone67);
		setRotationAngle(bone67, 0.0F, -0.7854F, 0.0F);
		bone67.setTextureOffset(23, 11).addBox(-5.0F, -5.0F, -2.0F, 1.0F, 8.0F, 4.0F, 0.0F, false);
		bone67.setTextureOffset(23, 11).addBox(4.0F, -5.0F, -2.0F, 1.0F, 8.0F, 4.0F, 0.0F, false);

		bone68 = new ModelRenderer(this);
		bone68.setRotationPoint(0.0F, -3.0F, 13.5F);
		merlin3.addChild(bone68);
		setRotationAngle(bone68, 0.0F, -1.5708F, 0.0F);
		bone68.setTextureOffset(23, 11).addBox(-5.0F, -5.0F, -2.0F, 1.0F, 8.0F, 4.0F, 0.0F, false);
		bone68.setTextureOffset(23, 11).addBox(4.0F, -5.0F, -2.0F, 1.0F, 8.0F, 4.0F, 0.0F, false);

		bone69 = new ModelRenderer(this);
		bone69.setRotationPoint(0.0F, -3.0F, 13.5F);
		merlin3.addChild(bone69);
		setRotationAngle(bone69, 0.0F, -2.3562F, 0.0F);
		bone69.setTextureOffset(23, 11).addBox(-5.0F, -5.0F, -2.0F, 1.0F, 8.0F, 4.0F, 0.0F, false);
		bone69.setTextureOffset(23, 11).addBox(4.0F, -5.0F, -2.0F, 1.0F, 8.0F, 4.0F, 0.0F, false);

		merlin4 = new ModelRenderer(this);
		merlin4.setRotationPoint(0.0F, 0.0F, 0.0F);
		boosters.addChild(merlin4);
		setRotationAngle(merlin4, 0.0F, -1.5708F, 0.0F);
		merlin4.setTextureOffset(29, 0).addBox(-3.0F, -11.0F, 10.5F, 6.0F, 9.0F, 6.0F, 0.0F, false);

		bone70 = new ModelRenderer(this);
		bone70.setRotationPoint(0.0F, -3.0F, 13.5F);
		merlin4.addChild(bone70);
		bone70.setTextureOffset(23, 11).addBox(-5.0F, -5.0F, -2.0F, 1.0F, 8.0F, 4.0F, 0.0F, false);
		bone70.setTextureOffset(23, 11).addBox(4.0F, -5.0F, -2.0F, 1.0F, 8.0F, 4.0F, 0.0F, false);

		bone71 = new ModelRenderer(this);
		bone71.setRotationPoint(0.0F, -3.0F, 13.5F);
		merlin4.addChild(bone71);
		setRotationAngle(bone71, 0.0F, -0.7854F, 0.0F);
		bone71.setTextureOffset(23, 11).addBox(-5.0F, -5.0F, -2.0F, 1.0F, 8.0F, 4.0F, 0.0F, false);
		bone71.setTextureOffset(23, 11).addBox(4.0F, -5.0F, -2.0F, 1.0F, 8.0F, 4.0F, 0.0F, false);

		bone72 = new ModelRenderer(this);
		bone72.setRotationPoint(0.0F, -3.0F, 13.5F);
		merlin4.addChild(bone72);
		setRotationAngle(bone72, 0.0F, -1.5708F, 0.0F);
		bone72.setTextureOffset(23, 11).addBox(-5.0F, -5.0F, -2.0F, 1.0F, 8.0F, 4.0F, 0.0F, false);
		bone72.setTextureOffset(23, 11).addBox(4.0F, -5.0F, -2.0F, 1.0F, 8.0F, 4.0F, 0.0F, false);

		bone73 = new ModelRenderer(this);
		bone73.setRotationPoint(0.0F, -3.0F, 13.5F);
		merlin4.addChild(bone73);
		setRotationAngle(bone73, 0.0F, -2.3562F, 0.0F);
		bone73.setTextureOffset(23, 11).addBox(-5.0F, -5.0F, -2.0F, 1.0F, 8.0F, 4.0F, 0.0F, false);
		bone73.setTextureOffset(23, 11).addBox(4.0F, -5.0F, -2.0F, 1.0F, 8.0F, 4.0F, 0.0F, false);

		merlin5 = new ModelRenderer(this);
		merlin5.setRotationPoint(0.0F, 0.0F, 0.0F);
		boosters.addChild(merlin5);
		setRotationAngle(merlin5, 0.0F, -2.3562F, 0.0F);
		merlin5.setTextureOffset(29, 0).addBox(-3.0F, -11.0F, 10.5F, 6.0F, 9.0F, 6.0F, 0.0F, false);

		bone74 = new ModelRenderer(this);
		bone74.setRotationPoint(0.0F, -3.0F, 13.5F);
		merlin5.addChild(bone74);
		bone74.setTextureOffset(23, 11).addBox(-5.0F, -5.0F, -2.0F, 1.0F, 8.0F, 4.0F, 0.0F, false);
		bone74.setTextureOffset(23, 11).addBox(4.0F, -5.0F, -2.0F, 1.0F, 8.0F, 4.0F, 0.0F, false);

		bone75 = new ModelRenderer(this);
		bone75.setRotationPoint(0.0F, -3.0F, 13.5F);
		merlin5.addChild(bone75);
		setRotationAngle(bone75, 0.0F, -0.7854F, 0.0F);
		bone75.setTextureOffset(23, 11).addBox(-5.0F, -5.0F, -2.0F, 1.0F, 8.0F, 4.0F, 0.0F, false);
		bone75.setTextureOffset(23, 11).addBox(4.0F, -5.0F, -2.0F, 1.0F, 8.0F, 4.0F, 0.0F, false);

		bone114 = new ModelRenderer(this);
		bone114.setRotationPoint(0.0F, -3.0F, 13.5F);
		merlin5.addChild(bone114);
		setRotationAngle(bone114, 0.0F, -1.5708F, 0.0F);
		bone114.setTextureOffset(23, 11).addBox(-5.0F, -5.0F, -2.0F, 1.0F, 8.0F, 4.0F, 0.0F, false);
		bone114.setTextureOffset(23, 11).addBox(4.0F, -5.0F, -2.0F, 1.0F, 8.0F, 4.0F, 0.0F, false);

		bone115 = new ModelRenderer(this);
		bone115.setRotationPoint(0.0F, -3.0F, 13.5F);
		merlin5.addChild(bone115);
		setRotationAngle(bone115, 0.0F, -2.3562F, 0.0F);
		bone115.setTextureOffset(23, 11).addBox(-5.0F, -5.0F, -2.0F, 1.0F, 8.0F, 4.0F, 0.0F, false);
		bone115.setTextureOffset(23, 11).addBox(4.0F, -5.0F, -2.0F, 1.0F, 8.0F, 4.0F, 0.0F, false);

		merlin6 = new ModelRenderer(this);
		merlin6.setRotationPoint(0.0F, 0.0F, 0.0F);
		boosters.addChild(merlin6);
		setRotationAngle(merlin6, 0.0F, 3.1416F, 0.0F);
		merlin6.setTextureOffset(29, 0).addBox(-3.0F, -11.0F, 10.5F, 6.0F, 9.0F, 6.0F, 0.0F, false);

		bone116 = new ModelRenderer(this);
		bone116.setRotationPoint(0.0F, -3.0F, 13.5F);
		merlin6.addChild(bone116);
		bone116.setTextureOffset(23, 11).addBox(-5.0F, -5.0F, -2.0F, 1.0F, 8.0F, 4.0F, 0.0F, false);
		bone116.setTextureOffset(23, 11).addBox(4.0F, -5.0F, -2.0F, 1.0F, 8.0F, 4.0F, 0.0F, false);

		bone117 = new ModelRenderer(this);
		bone117.setRotationPoint(0.0F, -3.0F, 13.5F);
		merlin6.addChild(bone117);
		setRotationAngle(bone117, 0.0F, -0.7854F, 0.0F);
		bone117.setTextureOffset(23, 11).addBox(-5.0F, -5.0F, -2.0F, 1.0F, 8.0F, 4.0F, 0.0F, false);
		bone117.setTextureOffset(23, 11).addBox(4.0F, -5.0F, -2.0F, 1.0F, 8.0F, 4.0F, 0.0F, false);

		bone118 = new ModelRenderer(this);
		bone118.setRotationPoint(0.0F, -3.0F, 13.5F);
		merlin6.addChild(bone118);
		setRotationAngle(bone118, 0.0F, -1.5708F, 0.0F);
		bone118.setTextureOffset(23, 11).addBox(-5.0F, -5.0F, -2.0F, 1.0F, 8.0F, 4.0F, 0.0F, false);
		bone118.setTextureOffset(23, 11).addBox(4.0F, -5.0F, -2.0F, 1.0F, 8.0F, 4.0F, 0.0F, false);

		bone119 = new ModelRenderer(this);
		bone119.setRotationPoint(0.0F, -3.0F, 13.5F);
		merlin6.addChild(bone119);
		setRotationAngle(bone119, 0.0F, -2.3562F, 0.0F);
		bone119.setTextureOffset(23, 11).addBox(-5.0F, -5.0F, -2.0F, 1.0F, 8.0F, 4.0F, 0.0F, false);
		bone119.setTextureOffset(23, 11).addBox(4.0F, -5.0F, -2.0F, 1.0F, 8.0F, 4.0F, 0.0F, false);

		merlin7 = new ModelRenderer(this);
		merlin7.setRotationPoint(0.0F, 0.0F, 0.0F);
		boosters.addChild(merlin7);
		setRotationAngle(merlin7, 0.0F, 2.3562F, 0.0F);
		merlin7.setTextureOffset(29, 0).addBox(-3.0F, -11.0F, 10.5F, 6.0F, 9.0F, 6.0F, 0.0F, false);

		bone120 = new ModelRenderer(this);
		bone120.setRotationPoint(0.0F, -3.0F, 13.5F);
		merlin7.addChild(bone120);
		bone120.setTextureOffset(23, 11).addBox(-5.0F, -5.0F, -2.0F, 1.0F, 8.0F, 4.0F, 0.0F, false);
		bone120.setTextureOffset(23, 11).addBox(4.0F, -5.0F, -2.0F, 1.0F, 8.0F, 4.0F, 0.0F, false);

		bone121 = new ModelRenderer(this);
		bone121.setRotationPoint(0.0F, -3.0F, 13.5F);
		merlin7.addChild(bone121);
		setRotationAngle(bone121, 0.0F, -0.7854F, 0.0F);
		bone121.setTextureOffset(23, 11).addBox(-5.0F, -5.0F, -2.0F, 1.0F, 8.0F, 4.0F, 0.0F, false);
		bone121.setTextureOffset(23, 11).addBox(4.0F, -5.0F, -2.0F, 1.0F, 8.0F, 4.0F, 0.0F, false);

		bone122 = new ModelRenderer(this);
		bone122.setRotationPoint(0.0F, -3.0F, 13.5F);
		merlin7.addChild(bone122);
		setRotationAngle(bone122, 0.0F, -1.5708F, 0.0F);
		bone122.setTextureOffset(23, 11).addBox(-5.0F, -5.0F, -2.0F, 1.0F, 8.0F, 4.0F, 0.0F, false);
		bone122.setTextureOffset(23, 11).addBox(4.0F, -5.0F, -2.0F, 1.0F, 8.0F, 4.0F, 0.0F, false);

		bone123 = new ModelRenderer(this);
		bone123.setRotationPoint(0.0F, -3.0F, 13.5F);
		merlin7.addChild(bone123);
		setRotationAngle(bone123, 0.0F, -2.3562F, 0.0F);
		bone123.setTextureOffset(23, 11).addBox(-5.0F, -5.0F, -2.0F, 1.0F, 8.0F, 4.0F, 0.0F, false);
		bone123.setTextureOffset(23, 11).addBox(4.0F, -5.0F, -2.0F, 1.0F, 8.0F, 4.0F, 0.0F, false);

		merlin8 = new ModelRenderer(this);
		merlin8.setRotationPoint(0.0F, 0.0F, 0.0F);
		boosters.addChild(merlin8);
		setRotationAngle(merlin8, 0.0F, 1.5708F, 0.0F);
		merlin8.setTextureOffset(29, 0).addBox(-3.0F, -11.0F, 10.5F, 6.0F, 9.0F, 6.0F, 0.0F, false);

		bone124 = new ModelRenderer(this);
		bone124.setRotationPoint(0.0F, -3.0F, 13.5F);
		merlin8.addChild(bone124);
		bone124.setTextureOffset(23, 11).addBox(-5.0F, -5.0F, -2.0F, 1.0F, 8.0F, 4.0F, 0.0F, false);
		bone124.setTextureOffset(23, 11).addBox(4.0F, -5.0F, -2.0F, 1.0F, 8.0F, 4.0F, 0.0F, false);

		bone125 = new ModelRenderer(this);
		bone125.setRotationPoint(0.0F, -3.0F, 13.5F);
		merlin8.addChild(bone125);
		setRotationAngle(bone125, 0.0F, -0.7854F, 0.0F);
		bone125.setTextureOffset(23, 11).addBox(-5.0F, -5.0F, -2.0F, 1.0F, 8.0F, 4.0F, 0.0F, false);
		bone125.setTextureOffset(23, 11).addBox(4.0F, -5.0F, -2.0F, 1.0F, 8.0F, 4.0F, 0.0F, false);

		bone126 = new ModelRenderer(this);
		bone126.setRotationPoint(0.0F, -3.0F, 13.5F);
		merlin8.addChild(bone126);
		setRotationAngle(bone126, 0.0F, -1.5708F, 0.0F);
		bone126.setTextureOffset(23, 11).addBox(-5.0F, -5.0F, -2.0F, 1.0F, 8.0F, 4.0F, 0.0F, false);
		bone126.setTextureOffset(23, 11).addBox(4.0F, -5.0F, -2.0F, 1.0F, 8.0F, 4.0F, 0.0F, false);

		bone127 = new ModelRenderer(this);
		bone127.setRotationPoint(0.0F, -3.0F, 13.5F);
		merlin8.addChild(bone127);
		setRotationAngle(bone127, 0.0F, -2.3562F, 0.0F);
		bone127.setTextureOffset(23, 11).addBox(-5.0F, -5.0F, -2.0F, 1.0F, 8.0F, 4.0F, 0.0F, false);
		bone127.setTextureOffset(23, 11).addBox(4.0F, -5.0F, -2.0F, 1.0F, 8.0F, 4.0F, 0.0F, false);

		merlin9 = new ModelRenderer(this);
		merlin9.setRotationPoint(0.0F, 0.0F, 0.0F);
		boosters.addChild(merlin9);
		setRotationAngle(merlin9, 0.0F, 0.7854F, 0.0F);
		merlin9.setTextureOffset(29, 0).addBox(-3.0F, -11.0F, 10.5F, 6.0F, 9.0F, 6.0F, 0.0F, false);

		bone129 = new ModelRenderer(this);
		bone129.setRotationPoint(0.0F, -3.0F, 13.5F);
		merlin9.addChild(bone129);
		bone129.setTextureOffset(23, 11).addBox(-5.0F, -5.0F, -2.0F, 1.0F, 8.0F, 4.0F, 0.0F, false);
		bone129.setTextureOffset(23, 11).addBox(4.0F, -5.0F, -2.0F, 1.0F, 8.0F, 4.0F, 0.0F, false);

		bone130 = new ModelRenderer(this);
		bone130.setRotationPoint(0.0F, -3.0F, 13.5F);
		merlin9.addChild(bone130);
		setRotationAngle(bone130, 0.0F, -0.7854F, 0.0F);
		bone130.setTextureOffset(23, 11).addBox(-5.0F, -5.0F, -2.0F, 1.0F, 8.0F, 4.0F, 0.0F, false);
		bone130.setTextureOffset(23, 11).addBox(4.0F, -5.0F, -2.0F, 1.0F, 8.0F, 4.0F, 0.0F, false);

		bone131 = new ModelRenderer(this);
		bone131.setRotationPoint(0.0F, -3.0F, 13.5F);
		merlin9.addChild(bone131);
		setRotationAngle(bone131, 0.0F, -1.5708F, 0.0F);
		bone131.setTextureOffset(23, 11).addBox(-5.0F, -5.0F, -2.0F, 1.0F, 8.0F, 4.0F, 0.0F, false);
		bone131.setTextureOffset(23, 11).addBox(4.0F, -5.0F, -2.0F, 1.0F, 8.0F, 4.0F, 0.0F, false);

		bone132 = new ModelRenderer(this);
		bone132.setRotationPoint(0.0F, -3.0F, 13.5F);
		merlin9.addChild(bone132);
		setRotationAngle(bone132, 0.0F, -2.3562F, 0.0F);
		bone132.setTextureOffset(23, 11).addBox(-5.0F, -5.0F, -2.0F, 1.0F, 8.0F, 4.0F, 0.0F, false);
		bone132.setTextureOffset(23, 11).addBox(4.0F, -5.0F, -2.0F, 1.0F, 8.0F, 4.0F, 0.0F, false);

		legs_main = new ModelRenderer(this);
		legs_main.setRotationPoint(0.0F, 0.0F, 0.0F);
		falcon9.addChild(legs_main);
		setRotationAngle(legs_main, 0.0F, -0.7854F, 0.0F);
		

		leg = new ModelRenderer(this);
		leg.setRotationPoint(0.0F, 0.0F, 0.0F);
		legs_main.addChild(leg);
		leg.setTextureOffset(69, 141).addBox(-6.0F, -117.0F, -20.0F, 1.0F, 110.0F, 5.0F, 0.0F, false);
		leg.setTextureOffset(69, 141).addBox(5.0F, -117.0F, -20.0F, 1.0F, 110.0F, 5.0F, 0.0F, false);
		leg.setTextureOffset(69, 141).addBox(5.8277F, -56.5317F, -22.0F, 1.0F, 50.0F, 5.0F, 0.0F, false);
		leg.setTextureOffset(69, 141).addBox(-6.8277F, -56.5317F, -22.0F, 1.0F, 50.0F, 5.0F, 0.0F, false);
		leg.setTextureOffset(66, 250).addBox(-2.0F, -56.0F, -24.0F, 4.0F, 1.0F, 5.0F, 0.0F, false);
		leg.setTextureOffset(66, 250).addBox(-1.5F, -117.0F, -20.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		leg.setTextureOffset(70, 194).addBox(-1.5F, -116.5F, -20.5F, 3.0F, 61.0F, 1.0F, 0.0F, false);
		leg.setTextureOffset(70, 194).addBox(1.019F, -56.2519F, -22.2142F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		leg.setTextureOffset(70, 194).addBox(-6.981F, -56.2519F, -22.2142F, 6.0F, 1.0F, 1.0F, 0.0F, false);

		bone76 = new ModelRenderer(this);
		bone76.setRotationPoint(-4.6653F, -69.251F, -23.0365F);
		leg.addChild(bone76);
		bone76.setTextureOffset(70, 194).addBox(0.2F, -37.0F, -0.5F, 2.0F, 51.0F, 1.0F, 0.0F, false);
		bone76.setTextureOffset(70, 194).addBox(-0.8F, -23.0F, -0.5F, 1.0F, 37.0F, 1.0F, 0.0F, false);
		bone76.setTextureOffset(70, 194).addBox(-1.8F, -8.0F, -0.5F, 1.0F, 22.0F, 1.0F, 0.0F, false);
		bone76.setTextureOffset(70, 194).addBox(-2.8F, 1.0F, -0.5F, 1.0F, 13.0F, 1.0F, 0.0F, false);
		bone76.setTextureOffset(70, 194).addBox(2.2F, -3.0F, -0.5F, 1.0F, 17.0F, 1.0F, 0.0F, false);

		bone77 = new ModelRenderer(this);
		bone77.setRotationPoint(4.8347F, -69.251F, -23.0365F);
		leg.addChild(bone77);
		setRotationAngle(bone77, 0.0F, -1.2217F, 0.0F);
		bone77.setTextureOffset(70, 194).addBox(-1.8F, -37.0F, -0.5F, 2.0F, 51.0F, 1.0F, 0.0F, false);
		bone77.setTextureOffset(70, 194).addBox(0.2F, -23.0F, -0.5F, 1.0F, 37.0F, 1.0F, 0.0F, false);
		bone77.setTextureOffset(70, 194).addBox(1.2F, -8.0F, -0.5F, 1.0F, 22.0F, 1.0F, 0.0F, false);
		bone77.setTextureOffset(70, 194).addBox(2.2F, 1.0F, -0.5F, 1.0F, 13.0F, 1.0F, 0.0F, false);
		bone77.setTextureOffset(70, 194).addBox(-2.8F, -3.0F, -0.5F, 1.0F, 17.0F, 1.0F, 0.0F, false);

		bone78 = new ModelRenderer(this);
		bone78.setRotationPoint(7.0347F, -55.251F, -23.0365F);
		leg.addChild(bone78);
		bone78.setTextureOffset(70, 194).addBox(0.6683F, -0.0105F, 3.2577F, 1.0F, 41.0F, 1.0F, 0.0F, false);
		bone78.setTextureOffset(70, 194).addBox(-0.3317F, -0.0105F, 3.2577F, 1.0F, 34.0F, 1.0F, 0.0F, false);
		bone78.setTextureOffset(70, 194).addBox(-1.3317F, -0.0105F, 3.2577F, 1.0F, 27.0F, 1.0F, 0.0F, false);
		bone78.setTextureOffset(70, 194).addBox(-2.3317F, -0.0105F, 3.2577F, 1.0F, 19.0F, 1.0F, 0.0F, false);
		bone78.setTextureOffset(70, 194).addBox(-3.3317F, -0.0105F, 3.2577F, 1.0F, 11.0F, 1.0F, 0.0F, false);
		bone78.setTextureOffset(70, 194).addBox(-3.8317F, -1.0105F, 3.2577F, 5.0F, 1.0F, 1.0F, 0.0F, false);

		bone79 = new ModelRenderer(this);
		bone79.setRotationPoint(6.6614F, -43.3447F, -14.2788F);
		leg.addChild(bone79);
		setRotationAngle(bone79, -0.0873F, 0.6109F, 0.0F);
		bone79.setTextureOffset(70, 194).addBox(-8.3368F, -9.9474F, -13.9985F, 1.0F, 41.0F, 1.0F, 0.0F, false);
		bone79.setTextureOffset(70, 194).addBox(-7.3368F, -9.9474F, -13.9985F, 1.0F, 34.0F, 1.0F, 0.0F, false);
		bone79.setTextureOffset(70, 194).addBox(-6.3368F, -9.9474F, -13.9985F, 1.0F, 27.0F, 1.0F, 0.0F, false);
		bone79.setTextureOffset(70, 194).addBox(-5.3368F, -9.9474F, -13.9985F, 1.0F, 19.0F, 1.0F, 0.0F, false);
		bone79.setTextureOffset(70, 194).addBox(-4.3368F, -9.9474F, -13.9985F, 1.0F, 11.0F, 1.0F, 0.0F, false);
		bone79.setTextureOffset(70, 194).addBox(-8.3368F, -10.9474F, -13.9985F, 5.0F, 1.0F, 1.0F, 0.0F, false);

		leg2 = new ModelRenderer(this);
		leg2.setRotationPoint(0.0F, 0.0F, 0.0F);
		legs_main.addChild(leg2);
		setRotationAngle(leg2, 0.0F, -1.5708F, 0.0F);
		leg2.setTextureOffset(69, 141).addBox(-6.0F, -117.0F, -20.0F, 1.0F, 110.0F, 5.0F, 0.0F, false);
		leg2.setTextureOffset(69, 141).addBox(5.0F, -117.0F, -20.0F, 1.0F, 110.0F, 5.0F, 0.0F, false);
		leg2.setTextureOffset(69, 141).addBox(5.8277F, -56.5317F, -22.0F, 1.0F, 50.0F, 5.0F, 0.0F, false);
		leg2.setTextureOffset(69, 141).addBox(-6.8277F, -56.5317F, -22.0F, 1.0F, 50.0F, 5.0F, 0.0F, false);
		leg2.setTextureOffset(66, 250).addBox(-2.0F, -56.0F, -24.0F, 4.0F, 1.0F, 5.0F, 0.0F, false);
		leg2.setTextureOffset(66, 250).addBox(-1.5F, -117.0F, -20.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		leg2.setTextureOffset(70, 194).addBox(-1.5F, -116.5F, -20.5F, 3.0F, 61.0F, 1.0F, 0.0F, false);
		leg2.setTextureOffset(70, 194).addBox(1.019F, -56.2519F, -22.2142F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		leg2.setTextureOffset(70, 194).addBox(-6.981F, -56.2519F, -22.2142F, 6.0F, 1.0F, 1.0F, 0.0F, false);

		bone80 = new ModelRenderer(this);
		bone80.setRotationPoint(-4.6653F, -69.251F, -23.0365F);
		leg2.addChild(bone80);
		bone80.setTextureOffset(70, 194).addBox(0.2F, -37.0F, -0.5F, 2.0F, 51.0F, 1.0F, 0.0F, false);
		bone80.setTextureOffset(70, 194).addBox(-0.8F, -23.0F, -0.5F, 1.0F, 37.0F, 1.0F, 0.0F, false);
		bone80.setTextureOffset(70, 194).addBox(-1.8F, -8.0F, -0.5F, 1.0F, 22.0F, 1.0F, 0.0F, false);
		bone80.setTextureOffset(70, 194).addBox(-2.8F, 1.0F, -0.5F, 1.0F, 13.0F, 1.0F, 0.0F, false);
		bone80.setTextureOffset(70, 194).addBox(2.2F, -3.0F, -0.5F, 1.0F, 17.0F, 1.0F, 0.0F, false);

		bone81 = new ModelRenderer(this);
		bone81.setRotationPoint(4.8347F, -69.251F, -23.0365F);
		leg2.addChild(bone81);
		setRotationAngle(bone81, 0.0F, -1.2217F, 0.0F);
		bone81.setTextureOffset(70, 194).addBox(-1.8F, -37.0F, -0.5F, 2.0F, 51.0F, 1.0F, 0.0F, false);
		bone81.setTextureOffset(70, 194).addBox(0.2F, -23.0F, -0.5F, 1.0F, 37.0F, 1.0F, 0.0F, false);
		bone81.setTextureOffset(70, 194).addBox(1.2F, -8.0F, -0.5F, 1.0F, 22.0F, 1.0F, 0.0F, false);
		bone81.setTextureOffset(70, 194).addBox(2.2F, 1.0F, -0.5F, 1.0F, 13.0F, 1.0F, 0.0F, false);
		bone81.setTextureOffset(70, 194).addBox(-2.8F, -3.0F, -0.5F, 1.0F, 17.0F, 1.0F, 0.0F, false);

		bone82 = new ModelRenderer(this);
		bone82.setRotationPoint(7.0347F, -55.251F, -23.0365F);
		leg2.addChild(bone82);
		bone82.setTextureOffset(70, 194).addBox(0.6683F, -0.0105F, 3.2577F, 1.0F, 41.0F, 1.0F, 0.0F, false);
		bone82.setTextureOffset(70, 194).addBox(-0.3317F, -0.0105F, 3.2577F, 1.0F, 34.0F, 1.0F, 0.0F, false);
		bone82.setTextureOffset(70, 194).addBox(-1.3317F, -0.0105F, 3.2577F, 1.0F, 27.0F, 1.0F, 0.0F, false);
		bone82.setTextureOffset(70, 194).addBox(-2.3317F, -0.0105F, 3.2577F, 1.0F, 19.0F, 1.0F, 0.0F, false);
		bone82.setTextureOffset(70, 194).addBox(-3.3317F, -0.0105F, 3.2577F, 1.0F, 11.0F, 1.0F, 0.0F, false);
		bone82.setTextureOffset(70, 194).addBox(-3.8317F, -1.0105F, 3.2577F, 5.0F, 1.0F, 1.0F, 0.0F, false);

		bone83 = new ModelRenderer(this);
		bone83.setRotationPoint(6.6614F, -43.3447F, -14.2788F);
		leg2.addChild(bone83);
		setRotationAngle(bone83, -0.0873F, 0.6109F, 0.0F);
		bone83.setTextureOffset(70, 194).addBox(-8.3368F, -9.9474F, -13.9985F, 1.0F, 41.0F, 1.0F, 0.0F, false);
		bone83.setTextureOffset(70, 194).addBox(-7.3368F, -9.9474F, -13.9985F, 1.0F, 34.0F, 1.0F, 0.0F, false);
		bone83.setTextureOffset(70, 194).addBox(-6.3368F, -9.9474F, -13.9985F, 1.0F, 27.0F, 1.0F, 0.0F, false);
		bone83.setTextureOffset(70, 194).addBox(-5.3368F, -9.9474F, -13.9985F, 1.0F, 19.0F, 1.0F, 0.0F, false);
		bone83.setTextureOffset(70, 194).addBox(-4.3368F, -9.9474F, -13.9985F, 1.0F, 11.0F, 1.0F, 0.0F, false);
		bone83.setTextureOffset(70, 194).addBox(-8.3368F, -10.9474F, -13.9985F, 5.0F, 1.0F, 1.0F, 0.0F, false);

		leg3 = new ModelRenderer(this);
		leg3.setRotationPoint(0.0F, 0.0F, 0.0F);
		legs_main.addChild(leg3);
		setRotationAngle(leg3, 0.0F, 3.1416F, 0.0F);
		leg3.setTextureOffset(69, 141).addBox(-6.0F, -117.0F, -20.0F, 1.0F, 110.0F, 5.0F, 0.0F, false);
		leg3.setTextureOffset(69, 141).addBox(5.0F, -117.0F, -20.0F, 1.0F, 110.0F, 5.0F, 0.0F, false);
		leg3.setTextureOffset(69, 141).addBox(5.8277F, -56.5317F, -22.0F, 1.0F, 50.0F, 5.0F, 0.0F, false);
		leg3.setTextureOffset(69, 141).addBox(-6.8277F, -56.5317F, -22.0F, 1.0F, 50.0F, 5.0F, 0.0F, false);
		leg3.setTextureOffset(66, 250).addBox(-2.0F, -56.0F, -24.0F, 4.0F, 1.0F, 5.0F, 0.0F, false);
		leg3.setTextureOffset(66, 250).addBox(-1.5F, -117.0F, -20.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		leg3.setTextureOffset(70, 194).addBox(-1.5F, -116.5F, -20.5F, 3.0F, 61.0F, 1.0F, 0.0F, false);
		leg3.setTextureOffset(70, 194).addBox(1.019F, -56.2519F, -22.2142F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		leg3.setTextureOffset(70, 194).addBox(-6.981F, -56.2519F, -22.2142F, 6.0F, 1.0F, 1.0F, 0.0F, false);

		bone84 = new ModelRenderer(this);
		bone84.setRotationPoint(-4.6653F, -69.251F, -23.0365F);
		leg3.addChild(bone84);
		bone84.setTextureOffset(70, 194).addBox(0.2F, -37.0F, -0.5F, 2.0F, 51.0F, 1.0F, 0.0F, false);
		bone84.setTextureOffset(70, 194).addBox(-0.8F, -23.0F, -0.5F, 1.0F, 37.0F, 1.0F, 0.0F, false);
		bone84.setTextureOffset(70, 194).addBox(-1.8F, -8.0F, -0.5F, 1.0F, 22.0F, 1.0F, 0.0F, false);
		bone84.setTextureOffset(70, 194).addBox(-2.8F, 1.0F, -0.5F, 1.0F, 13.0F, 1.0F, 0.0F, false);
		bone84.setTextureOffset(70, 194).addBox(2.2F, -3.0F, -0.5F, 1.0F, 17.0F, 1.0F, 0.0F, false);

		bone85 = new ModelRenderer(this);
		bone85.setRotationPoint(4.8347F, -69.251F, -23.0365F);
		leg3.addChild(bone85);
		setRotationAngle(bone85, 0.0F, -1.2217F, 0.0F);
		bone85.setTextureOffset(70, 194).addBox(-1.8F, -37.0F, -0.5F, 2.0F, 51.0F, 1.0F, 0.0F, false);
		bone85.setTextureOffset(70, 194).addBox(0.2F, -23.0F, -0.5F, 1.0F, 37.0F, 1.0F, 0.0F, false);
		bone85.setTextureOffset(70, 194).addBox(1.2F, -8.0F, -0.5F, 1.0F, 22.0F, 1.0F, 0.0F, false);
		bone85.setTextureOffset(70, 194).addBox(2.2F, 1.0F, -0.5F, 1.0F, 13.0F, 1.0F, 0.0F, false);
		bone85.setTextureOffset(70, 194).addBox(-2.8F, -3.0F, -0.5F, 1.0F, 17.0F, 1.0F, 0.0F, false);

		bone86 = new ModelRenderer(this);
		bone86.setRotationPoint(7.0347F, -55.251F, -23.0365F);
		leg3.addChild(bone86);
		bone86.setTextureOffset(70, 194).addBox(0.6683F, -0.0105F, 3.2577F, 1.0F, 41.0F, 1.0F, 0.0F, false);
		bone86.setTextureOffset(70, 194).addBox(-0.3317F, -0.0105F, 3.2577F, 1.0F, 34.0F, 1.0F, 0.0F, false);
		bone86.setTextureOffset(70, 194).addBox(-1.3317F, -0.0105F, 3.2577F, 1.0F, 27.0F, 1.0F, 0.0F, false);
		bone86.setTextureOffset(70, 194).addBox(-2.3317F, -0.0105F, 3.2577F, 1.0F, 19.0F, 1.0F, 0.0F, false);
		bone86.setTextureOffset(70, 194).addBox(-3.3317F, -0.0105F, 3.2577F, 1.0F, 11.0F, 1.0F, 0.0F, false);
		bone86.setTextureOffset(70, 194).addBox(-3.8317F, -1.0105F, 3.2577F, 5.0F, 1.0F, 1.0F, 0.0F, false);

		bone87 = new ModelRenderer(this);
		bone87.setRotationPoint(6.6614F, -43.3447F, -14.2788F);
		leg3.addChild(bone87);
		setRotationAngle(bone87, -0.0873F, 0.6109F, 0.0F);
		bone87.setTextureOffset(70, 194).addBox(-8.3368F, -9.9474F, -13.9985F, 1.0F, 41.0F, 1.0F, 0.0F, false);
		bone87.setTextureOffset(70, 194).addBox(-7.3368F, -9.9474F, -13.9985F, 1.0F, 34.0F, 1.0F, 0.0F, false);
		bone87.setTextureOffset(70, 194).addBox(-6.3368F, -9.9474F, -13.9985F, 1.0F, 27.0F, 1.0F, 0.0F, false);
		bone87.setTextureOffset(70, 194).addBox(-5.3368F, -9.9474F, -13.9985F, 1.0F, 19.0F, 1.0F, 0.0F, false);
		bone87.setTextureOffset(70, 194).addBox(-4.3368F, -9.9474F, -13.9985F, 1.0F, 11.0F, 1.0F, 0.0F, false);
		bone87.setTextureOffset(70, 194).addBox(-8.3368F, -10.9474F, -13.9985F, 5.0F, 1.0F, 1.0F, 0.0F, false);

		leg4 = new ModelRenderer(this);
		leg4.setRotationPoint(0.0F, 0.0F, 0.0F);
		legs_main.addChild(leg4);
		setRotationAngle(leg4, 0.0F, 1.5708F, 0.0F);
		leg4.setTextureOffset(69, 141).addBox(-6.0F, -117.0F, -20.0F, 1.0F, 110.0F, 5.0F, 0.0F, false);
		leg4.setTextureOffset(69, 141).addBox(5.0F, -117.0F, -20.0F, 1.0F, 110.0F, 5.0F, 0.0F, false);
		leg4.setTextureOffset(69, 141).addBox(5.8277F, -56.5317F, -22.0F, 1.0F, 50.0F, 5.0F, 0.0F, false);
		leg4.setTextureOffset(69, 141).addBox(-6.8277F, -56.5317F, -22.0F, 1.0F, 50.0F, 5.0F, 0.0F, false);
		leg4.setTextureOffset(66, 250).addBox(-2.0F, -56.0F, -24.0F, 4.0F, 1.0F, 5.0F, 0.0F, false);
		leg4.setTextureOffset(66, 250).addBox(-1.5F, -117.0F, -20.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		leg4.setTextureOffset(70, 194).addBox(-1.5F, -116.5F, -20.5F, 3.0F, 61.0F, 1.0F, 0.0F, false);
		leg4.setTextureOffset(70, 194).addBox(1.019F, -56.2519F, -22.2142F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		leg4.setTextureOffset(70, 194).addBox(-6.981F, -56.2519F, -22.2142F, 6.0F, 1.0F, 1.0F, 0.0F, false);

		bone88 = new ModelRenderer(this);
		bone88.setRotationPoint(-4.6653F, -69.251F, -23.0365F);
		leg4.addChild(bone88);
		bone88.setTextureOffset(70, 194).addBox(0.2F, -37.0F, -0.5F, 2.0F, 51.0F, 1.0F, 0.0F, false);
		bone88.setTextureOffset(70, 194).addBox(-0.8F, -23.0F, -0.5F, 1.0F, 37.0F, 1.0F, 0.0F, false);
		bone88.setTextureOffset(70, 194).addBox(-1.8F, -8.0F, -0.5F, 1.0F, 22.0F, 1.0F, 0.0F, false);
		bone88.setTextureOffset(70, 194).addBox(-2.8F, 1.0F, -0.5F, 1.0F, 13.0F, 1.0F, 0.0F, false);
		bone88.setTextureOffset(70, 194).addBox(2.2F, -3.0F, -0.5F, 1.0F, 17.0F, 1.0F, 0.0F, false);

		bone89 = new ModelRenderer(this);
		bone89.setRotationPoint(4.8347F, -69.251F, -23.0365F);
		leg4.addChild(bone89);
		setRotationAngle(bone89, 0.0F, -1.2217F, 0.0F);
		bone89.setTextureOffset(70, 194).addBox(-1.8F, -37.0F, -0.5F, 2.0F, 51.0F, 1.0F, 0.0F, false);
		bone89.setTextureOffset(70, 194).addBox(0.2F, -23.0F, -0.5F, 1.0F, 37.0F, 1.0F, 0.0F, false);
		bone89.setTextureOffset(70, 194).addBox(1.2F, -8.0F, -0.5F, 1.0F, 22.0F, 1.0F, 0.0F, false);
		bone89.setTextureOffset(70, 194).addBox(2.2F, 1.0F, -0.5F, 1.0F, 13.0F, 1.0F, 0.0F, false);
		bone89.setTextureOffset(70, 194).addBox(-2.8F, -3.0F, -0.5F, 1.0F, 17.0F, 1.0F, 0.0F, false);

		bone90 = new ModelRenderer(this);
		bone90.setRotationPoint(7.0347F, -55.251F, -23.0365F);
		leg4.addChild(bone90);
		bone90.setTextureOffset(70, 194).addBox(0.6683F, -0.0105F, 3.2577F, 1.0F, 41.0F, 1.0F, 0.0F, false);
		bone90.setTextureOffset(70, 194).addBox(-0.3317F, -0.0105F, 3.2577F, 1.0F, 34.0F, 1.0F, 0.0F, false);
		bone90.setTextureOffset(70, 194).addBox(-1.3317F, -0.0105F, 3.2577F, 1.0F, 27.0F, 1.0F, 0.0F, false);
		bone90.setTextureOffset(70, 194).addBox(-2.3317F, -0.0105F, 3.2577F, 1.0F, 19.0F, 1.0F, 0.0F, false);
		bone90.setTextureOffset(70, 194).addBox(-3.3317F, -0.0105F, 3.2577F, 1.0F, 11.0F, 1.0F, 0.0F, false);
		bone90.setTextureOffset(70, 194).addBox(-3.8317F, -1.0105F, 3.2577F, 5.0F, 1.0F, 1.0F, 0.0F, false);

		bone91 = new ModelRenderer(this);
		bone91.setRotationPoint(6.6614F, -43.3447F, -14.2788F);
		leg4.addChild(bone91);
		setRotationAngle(bone91, -0.0873F, 0.6109F, 0.0F);
		bone91.setTextureOffset(70, 194).addBox(-8.3368F, -9.9474F, -13.9985F, 1.0F, 41.0F, 1.0F, 0.0F, false);
		bone91.setTextureOffset(70, 194).addBox(-7.3368F, -9.9474F, -13.9985F, 1.0F, 34.0F, 1.0F, 0.0F, false);
		bone91.setTextureOffset(70, 194).addBox(-6.3368F, -9.9474F, -13.9985F, 1.0F, 27.0F, 1.0F, 0.0F, false);
		bone91.setTextureOffset(70, 194).addBox(-5.3368F, -9.9474F, -13.9985F, 1.0F, 19.0F, 1.0F, 0.0F, false);
		bone91.setTextureOffset(70, 194).addBox(-4.3368F, -9.9474F, -13.9985F, 1.0F, 11.0F, 1.0F, 0.0F, false);
		bone91.setTextureOffset(70, 194).addBox(-8.3368F, -10.9474F, -13.9985F, 5.0F, 1.0F, 1.0F, 0.0F, false);

		fins_main = new ModelRenderer(this);
		fins_main.setRotationPoint(0.0F, 0.0F, 0.0F);
		falcon9.addChild(fins_main);
		setRotationAngle(fins_main, 0.0F, -0.7854F, 0.0F);
		

		fins1_2 = new ModelRenderer(this);
		fins1_2.setRotationPoint(0.0F, 0.0F, 0.0F);
		fins_main.addChild(fins1_2);
		

		fin = new ModelRenderer(this);
		fin.setRotationPoint(0.0F, -518.5F, -19.25F);
		fins1_2.addChild(fin);
		setRotationAngle(fin, 1.5708F, 0.0F, 0.0F);
		fin.setTextureOffset(86, 243).addBox(-4.0F, -0.5F, -12.75F, 8.0F, 1.0F, 12.0F, 0.0F, false);
		fin.setTextureOffset(69, 159).addBox(-2.0F, -0.5F, -0.75F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		fin2 = new ModelRenderer(this);
		fin2.setRotationPoint(0.0F, -518.5F, -19.25F);
		fins1_2.addChild(fin2);
		setRotationAngle(fin2, 1.5708F, 0.0F, 0.0F);
		fin2.setTextureOffset(86, 243).addBox(-3.8232F, 37.1534F, -12.75F, 8.0F, 1.0F, 12.0F, 0.0F, false);
		fin2.setTextureOffset(69, 159).addBox(-1.8232F, 37.1534F, -0.75F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		fins3_4 = new ModelRenderer(this);
		fins3_4.setRotationPoint(0.0F, 0.0F, 0.0F);
		fins_main.addChild(fins3_4);
		setRotationAngle(fins3_4, 0.0F, -1.5708F, 0.0F);
		

		fin3 = new ModelRenderer(this);
		fin3.setRotationPoint(0.0F, -518.5F, -19.25F);
		fins3_4.addChild(fin3);
		setRotationAngle(fin3, 1.5708F, 0.0F, 0.0F);
		fin3.setTextureOffset(86, 243).addBox(-4.0F, -0.5F, -12.75F, 8.0F, 1.0F, 12.0F, 0.0F, false);
		fin3.setTextureOffset(69, 159).addBox(-2.0F, -0.5F, -0.75F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		fin4 = new ModelRenderer(this);
		fin4.setRotationPoint(0.0F, -518.5F, -19.25F);
		fins3_4.addChild(fin4);
		setRotationAngle(fin4, 1.5708F, 0.0F, 0.0F);
		fin4.setTextureOffset(86, 243).addBox(-3.8232F, 37.1534F, -12.75F, 8.0F, 1.0F, 12.0F, 0.0F, false);
		fin4.setTextureOffset(69, 159).addBox(-1.8232F, 37.1534F, -0.75F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		stage2 = new ModelRenderer(this);
		stage2.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		bone94 = new ModelRenderer(this);
		bone94.setRotationPoint(0.0F, -76.0F, 0.0F);
		stage2.addChild(bone94);
		

		bone95 = new ModelRenderer(this);
		bone95.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone94.addChild(bone95);
		bone95.setTextureOffset(0, 0).addBox(-19.0F, -525.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone95.setTextureOffset(0, 0).addBox(18.0F, -525.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone96 = new ModelRenderer(this);
		bone96.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone94.addChild(bone96);
		setRotationAngle(bone96, 0.0F, -0.5236F, 0.0F);
		bone96.setTextureOffset(0, 0).addBox(-19.0F, -525.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone96.setTextureOffset(0, 0).addBox(18.0F, -525.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone97 = new ModelRenderer(this);
		bone97.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone94.addChild(bone97);
		setRotationAngle(bone97, 0.0F, -1.0472F, 0.0F);
		bone97.setTextureOffset(0, 0).addBox(-19.0F, -525.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone97.setTextureOffset(0, 0).addBox(18.0F, -525.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone98 = new ModelRenderer(this);
		bone98.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone94.addChild(bone98);
		setRotationAngle(bone98, 0.0F, -1.5708F, 0.0F);
		bone98.setTextureOffset(46, 160).addBox(-19.0F, -525.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone98.setTextureOffset(0, 0).addBox(18.0F, -525.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone99 = new ModelRenderer(this);
		bone99.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone94.addChild(bone99);
		setRotationAngle(bone99, 0.0F, -2.0944F, 0.0F);
		bone99.setTextureOffset(0, 0).addBox(-19.0F, -525.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone99.setTextureOffset(0, 0).addBox(18.0F, -525.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone100 = new ModelRenderer(this);
		bone100.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone94.addChild(bone100);
		setRotationAngle(bone100, 0.0F, -2.618F, 0.0F);
		bone100.setTextureOffset(0, 0).addBox(-19.0F, -525.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone100.setTextureOffset(0, 0).addBox(18.0F, -525.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		fairing = new ModelRenderer(this);
		fairing.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		dragon = new ModelRenderer(this);
		dragon.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		bone143 = new ModelRenderer(this);
		bone143.setRotationPoint(0.0F, -653.25F, 0.0F);
		dragon.addChild(bone143);
		bone143.setTextureOffset(150, 45).addBox(-0.5F, -2.75F, -27.0F, 1.0F, 20.0F, 8.0F, 0.0F, false);
		bone143.setTextureOffset(150, 74).addBox(-0.5F, -15.25F, -22.5F, 1.0F, 16.0F, 8.0F, 0.0F, false);
		bone143.setTextureOffset(90, 74).addBox(-0.5F, -15.25F, 14.5F, 1.0F, 16.0F, 8.0F, 0.0F, false);
		bone143.setTextureOffset(90, 45).addBox(-0.5F, -2.75F, 19.0F, 1.0F, 20.0F, 8.0F, 0.0F, false);

		bone144 = new ModelRenderer(this);
		bone144.setRotationPoint(0.0F, -653.25F, 0.0F);
		dragon.addChild(bone144);
		setRotationAngle(bone144, 0.0F, -1.5708F, 0.0F);
		bone144.setTextureOffset(130, 45).addBox(-0.5F, -2.75F, -27.0F, 1.0F, 20.0F, 8.0F, 0.0F, false);
		bone144.setTextureOffset(130, 75).addBox(-0.5F, -15.25F, -22.5F, 1.0F, 16.0F, 8.0F, 0.0F, false);
		bone144.setTextureOffset(109, 74).addBox(-0.5F, -15.25F, 14.5F, 1.0F, 16.0F, 8.0F, 0.0F, false);
		bone144.setTextureOffset(109, 45).addBox(-0.5F, -2.75F, 19.0F, 1.0F, 20.0F, 8.0F, 0.0F, false);

		bone136 = new ModelRenderer(this);
		bone136.setRotationPoint(0.0F, -146.0F, 0.0F);
		dragon.addChild(bone136);
		

		bone137 = new ModelRenderer(this);
		bone137.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone136.addChild(bone137);
		bone137.setTextureOffset(90, 170).addBox(-19.0F, -490.0F, -5.0F, 1.0F, 35.0F, 10.0F, 0.0F, false);
		bone137.setTextureOffset(115, 120).addBox(18.0F, -490.0F, -5.0F, 1.0F, 35.0F, 10.0F, 0.0F, false);

		bone138 = new ModelRenderer(this);
		bone138.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone136.addChild(bone138);
		setRotationAngle(bone138, 0.0F, -0.5236F, 0.0F);
		bone138.setTextureOffset(90, 170).addBox(-19.0F, -490.0F, -5.0F, 1.0F, 35.0F, 10.0F, 0.0F, false);
		bone138.setTextureOffset(115, 120).addBox(18.0F, -490.0F, -5.0F, 1.0F, 35.0F, 10.0F, 0.0F, false);

		bone139 = new ModelRenderer(this);
		bone139.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone136.addChild(bone139);
		setRotationAngle(bone139, 0.0F, -1.0472F, 0.0F);
		bone139.setTextureOffset(90, 170).addBox(-19.0F, -490.0F, -5.0F, 1.0F, 35.0F, 10.0F, 0.0F, false);
		bone139.setTextureOffset(115, 120).addBox(18.0F, -490.0F, -5.0F, 1.0F, 35.0F, 10.0F, 0.0F, false);

		bone140 = new ModelRenderer(this);
		bone140.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone136.addChild(bone140);
		setRotationAngle(bone140, 0.0F, -1.5708F, 0.0F);
		bone140.setTextureOffset(90, 120).addBox(-19.0F, -490.0F, -5.0F, 1.0F, 35.0F, 10.0F, 0.0F, false);
		bone140.setTextureOffset(90, 120).addBox(18.0F, -490.0F, -5.0F, 1.0F, 35.0F, 10.0F, 0.0F, false);

		bone141 = new ModelRenderer(this);
		bone141.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone136.addChild(bone141);
		setRotationAngle(bone141, 0.0F, -2.0944F, 0.0F);
		bone141.setTextureOffset(115, 120).addBox(-19.0F, -490.0F, -5.0F, 1.0F, 35.0F, 10.0F, 0.0F, false);
		bone141.setTextureOffset(90, 170).addBox(18.0F, -490.0F, -5.0F, 1.0F, 35.0F, 10.0F, 0.0F, false);

		bone142 = new ModelRenderer(this);
		bone142.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone136.addChild(bone142);
		setRotationAngle(bone142, 0.0F, -2.618F, 0.0F);
		bone142.setTextureOffset(115, 120).addBox(-19.0F, -490.0F, -5.0F, 1.0F, 35.0F, 10.0F, 0.0F, false);
		bone142.setTextureOffset(90, 170).addBox(18.0F, -490.0F, -5.0F, 1.0F, 35.0F, 10.0F, 0.0F, false);

		bone128 = new ModelRenderer(this);
		bone128.setRotationPoint(0.0F, -184.5F, 0.0F);
		dragon.addChild(bone128);
		setRotationAngle(bone128, 0.0F, -0.5236F, 0.0F);
		

		bone93 = new ModelRenderer(this);
		bone93.setRotationPoint(0.0F, -515.0F, 0.0F);
		bone128.addChild(bone93);
		bone93.setTextureOffset(106, 26).addBox(-4.0F, -4.5F, -7.0F, 8.0F, 1.0F, 14.0F, 0.0F, false);
		bone93.setTextureOffset(106, 26).addBox(-4.0F, -4.5F, -7.0F, 8.0F, 1.0F, 14.0F, 0.0F, false);
		bone93.setTextureOffset(106, 26).addBox(-4.0F, -4.5F, -7.0F, 8.0F, 1.0F, 14.0F, 0.0F, false);

		bone101 = new ModelRenderer(this);
		bone101.setRotationPoint(0.0F, -498.0F, 0.0F);
		bone128.addChild(bone101);
		setRotationAngle(bone101, 0.0F, 0.5236F, 0.0F);
		bone101.setTextureOffset(115, 180).addBox(14.6F, -12.5F, -5.0F, 1.0F, 25.0F, 10.0F, 0.0F, false);
		bone101.setTextureOffset(115, 180).addBox(-15.6F, -12.5F, -5.0F, 1.0F, 25.0F, 10.0F, 0.0F, false);

		bone102 = new ModelRenderer(this);
		bone102.setRotationPoint(0.0F, -498.0F, 0.0F);
		bone128.addChild(bone102);
		setRotationAngle(bone102, 0.0F, -0.5236F, 0.0F);
		bone102.setTextureOffset(150, 0).addBox(14.6F, -12.5F, -5.0F, 1.0F, 25.0F, 10.0F, 0.0F, false);
		bone102.setTextureOffset(150, 0).addBox(-15.6F, -12.5F, -5.0F, 1.0F, 25.0F, 10.0F, 0.0F, false);

		bone103 = new ModelRenderer(this);
		bone103.setRotationPoint(0.0F, -498.0F, 0.0F);
		bone128.addChild(bone103);
		setRotationAngle(bone103, 0.0F, -1.5708F, 0.0F);
		bone103.setTextureOffset(150, 0).addBox(14.6F, -12.5F, -5.0F, 1.0F, 25.0F, 10.0F, 0.0F, false);
		bone103.setTextureOffset(150, 0).addBox(-15.6F, -12.5F, -5.0F, 1.0F, 25.0F, 10.0F, 0.0F, false);

		bone134 = new ModelRenderer(this);
		bone134.setRotationPoint(0.0F, -502.0F, 0.0F);
		bone128.addChild(bone134);
		setRotationAngle(bone134, 0.0F, -2.618F, 0.0F);
		bone134.setTextureOffset(0, 12).addBox(17.7F, -18.741F, -4.0F, 1.0F, 10.0F, 8.0F, 0.0F, false);
		bone134.setTextureOffset(0, 12).addBox(-18.7F, -19.1513F, -4.0F, 1.0F, 11.0F, 8.0F, 0.0F, false);

		bone104 = new ModelRenderer(this);
		bone104.setRotationPoint(0.0F, -502.0F, 0.0F);
		bone128.addChild(bone104);
		setRotationAngle(bone104, 0.0F, 2.618F, 0.0F);
		bone104.setTextureOffset(0, 12).addBox(17.7F, -18.741F, -4.0F, 1.0F, 10.0F, 8.0F, 0.0F, false);
		bone104.setTextureOffset(0, 12).addBox(-18.7F, -19.1513F, -4.0F, 1.0F, 11.0F, 8.0F, 0.0F, false);

		bone105 = new ModelRenderer(this);
		bone105.setRotationPoint(0.0F, -502.0F, 0.0F);
		bone128.addChild(bone105);
		setRotationAngle(bone105, 0.0F, 1.5708F, 0.0F);
		bone105.setTextureOffset(0, 12).addBox(17.7F, -18.741F, -4.0F, 1.0F, 10.0F, 8.0F, 0.0F, false);
		bone105.setTextureOffset(0, 12).addBox(-18.7F, -19.1513F, -4.0F, 1.0F, 11.0F, 8.0F, 0.0F, false);

		bone109 = new ModelRenderer(this);
		bone109.setRotationPoint(0.0F, -658.5F, 0.0F);
		

		bone106 = new ModelRenderer(this);
		bone106.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone109.addChild(bone106);
		setRotationAngle(bone106, 0.0F, 0.5236F, 0.0F);
		bone106.setTextureOffset(115, 215).addBox(-14.6F, -12.5F, -5.0F, 1.0F, 25.0F, 10.0F, 0.0F, false);
		bone106.setTextureOffset(115, 215).addBox(13.6F, -12.5F, -5.0F, 1.0F, 25.0F, 10.0F, 0.0F, false);

		bone107 = new ModelRenderer(this);
		bone107.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone109.addChild(bone107);
		setRotationAngle(bone107, 0.0F, -0.5236F, 0.0F);
		bone107.setTextureOffset(115, 215).addBox(-14.6F, -12.5F, -5.0F, 1.0F, 25.0F, 10.0F, 0.0F, false);
		bone107.setTextureOffset(115, 215).addBox(13.6F, -12.5F, -5.0F, 1.0F, 25.0F, 10.0F, 0.0F, false);

		bone108 = new ModelRenderer(this);
		bone108.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone109.addChild(bone108);
		setRotationAngle(bone108, 0.0F, -1.5708F, 0.0F);
		bone108.setTextureOffset(0, 12).addBox(-14.6F, -12.5F, -5.0F, 1.0F, 25.0F, 10.0F, 0.0F, false);
		bone108.setTextureOffset(0, 12).addBox(13.6F, -12.5F, -5.0F, 1.0F, 25.0F, 10.0F, 0.0F, false);

		bone110 = new ModelRenderer(this);
		bone110.setRotationPoint(0.0F, -658.5F, 0.0F);
		

		bone111 = new ModelRenderer(this);
		bone111.setRotationPoint(0.0F, -18.0F, 0.0F);
		bone110.addChild(bone111);
		setRotationAngle(bone111, 0.0F, 0.5236F, 0.0F);
		bone111.setTextureOffset(0, 12).addBox(-9.35F, -5.75F, -2.5F, 1.0F, 10.0F, 5.0F, 0.0F, false);
		bone111.setTextureOffset(0, 12).addBox(8.35F, -5.5F, -2.5F, 1.0F, 10.0F, 5.0F, 0.0F, false);

		bone112 = new ModelRenderer(this);
		bone112.setRotationPoint(0.0F, -18.0F, 0.0F);
		bone110.addChild(bone112);
		setRotationAngle(bone112, 0.0F, -0.5236F, 0.0F);
		bone112.setTextureOffset(0, 12).addBox(-9.35F, -5.75F, -2.5F, 1.0F, 10.0F, 5.0F, 0.0F, false);
		bone112.setTextureOffset(0, 12).addBox(8.35F, -5.5F, -2.5F, 1.0F, 10.0F, 5.0F, 0.0F, false);

		bone113 = new ModelRenderer(this);
		bone113.setRotationPoint(0.0F, -18.0F, 0.0F);
		bone110.addChild(bone113);
		setRotationAngle(bone113, 0.0F, -1.5708F, 0.0F);
		bone113.setTextureOffset(0, 12).addBox(-9.35F, -5.75F, -2.5F, 1.0F, 10.0F, 5.0F, 0.0F, false);
		bone113.setTextureOffset(0, 12).addBox(8.35F, -5.5F, -2.5F, 1.0F, 10.0F, 5.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(CrewDragonRocket entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		falcon9.render(matrixStack, buffer, packedLight, packedOverlay);
		stage2.render(matrixStack, buffer, packedLight, packedOverlay);
		fairing.render(matrixStack, buffer, packedLight, packedOverlay);
		dragon.render(matrixStack, buffer, packedLight, packedOverlay);
		bone109.render(matrixStack, buffer, packedLight, packedOverlay);
		bone110.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}