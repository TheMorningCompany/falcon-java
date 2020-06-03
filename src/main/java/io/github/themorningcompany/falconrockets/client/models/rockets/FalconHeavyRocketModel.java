package io.github.themorningcompany.falconrockets.client.models.rockets;


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import io.github.themorningcompany.falconrockets.entitites.rockets.FalconHeavyRocket;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class FalconHeavyRocketModel extends EntityModel<FalconHeavyRocket> {
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
	private final ModelRenderer bone136;
	private final ModelRenderer bone137;
	private final ModelRenderer merlin6;
	private final ModelRenderer bone138;
	private final ModelRenderer bone139;
	private final ModelRenderer bone140;
	private final ModelRenderer bone141;
	private final ModelRenderer merlin7;
	private final ModelRenderer bone142;
	private final ModelRenderer bone143;
	private final ModelRenderer bone144;
	private final ModelRenderer bone145;
	private final ModelRenderer merlin8;
	private final ModelRenderer bone146;
	private final ModelRenderer bone147;
	private final ModelRenderer bone148;
	private final ModelRenderer bone149;
	private final ModelRenderer merlin9;
	private final ModelRenderer bone150;
	private final ModelRenderer bone151;
	private final ModelRenderer bone152;
	private final ModelRenderer bone153;
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
	private final ModelRenderer bone93;
	private final ModelRenderer bone101;
	private final ModelRenderer bone102;
	private final ModelRenderer bone103;
	private final ModelRenderer bone104;
	private final ModelRenderer bone105;
	private final ModelRenderer bone106;
	private final ModelRenderer bone107;
	private final ModelRenderer bone108;
	private final ModelRenderer bone109;
	private final ModelRenderer bone110;
	private final ModelRenderer bone111;
	private final ModelRenderer bone112;
	private final ModelRenderer bone113;
	private final ModelRenderer bone121;
	private final ModelRenderer bone122;
	private final ModelRenderer bone123;
	private final ModelRenderer bone124;
	private final ModelRenderer bone125;
	private final ModelRenderer bone126;
	private final ModelRenderer bone127;
	private final ModelRenderer bone128;
	private final ModelRenderer bone129;
	private final ModelRenderer bone130;
	private final ModelRenderer bone131;
	private final ModelRenderer bone132;
	private final ModelRenderer bone133;
	private final ModelRenderer bone134;
	private final ModelRenderer bone114;
	private final ModelRenderer bone115;
	private final ModelRenderer bone116;
	private final ModelRenderer bone117;
	private final ModelRenderer bone118;
	private final ModelRenderer bone119;
	private final ModelRenderer bone120;
	private final ModelRenderer bone135;
	private final ModelRenderer falcon_left;
	private final ModelRenderer rocket2;
	private final ModelRenderer bone154;
	private final ModelRenderer bone155;
	private final ModelRenderer bone156;
	private final ModelRenderer bone157;
	private final ModelRenderer bone158;
	private final ModelRenderer bone159;
	private final ModelRenderer bone160;
	private final ModelRenderer bone161;
	private final ModelRenderer bone162;
	private final ModelRenderer bone163;
	private final ModelRenderer bone164;
	private final ModelRenderer bone165;
	private final ModelRenderer bone166;
	private final ModelRenderer bone167;
	private final ModelRenderer bone168;
	private final ModelRenderer bone169;
	private final ModelRenderer bone170;
	private final ModelRenderer bone171;
	private final ModelRenderer bone172;
	private final ModelRenderer bone173;
	private final ModelRenderer bone174;
	private final ModelRenderer bone175;
	private final ModelRenderer bone176;
	private final ModelRenderer bone177;
	private final ModelRenderer bone178;
	private final ModelRenderer bone179;
	private final ModelRenderer bone180;
	private final ModelRenderer bone181;
	private final ModelRenderer bone182;
	private final ModelRenderer bone183;
	private final ModelRenderer bone184;
	private final ModelRenderer bone185;
	private final ModelRenderer bone186;
	private final ModelRenderer bone187;
	private final ModelRenderer bone188;
	private final ModelRenderer bone189;
	private final ModelRenderer bone190;
	private final ModelRenderer bone191;
	private final ModelRenderer bone192;
	private final ModelRenderer bone193;
	private final ModelRenderer bone194;
	private final ModelRenderer bone195;
	private final ModelRenderer bone196;
	private final ModelRenderer bone197;
	private final ModelRenderer bone198;
	private final ModelRenderer bone199;
	private final ModelRenderer bone200;
	private final ModelRenderer bone201;
	private final ModelRenderer bone202;
	private final ModelRenderer bone203;
	private final ModelRenderer bone204;
	private final ModelRenderer bone205;
	private final ModelRenderer bone206;
	private final ModelRenderer bone207;
	private final ModelRenderer bone208;
	private final ModelRenderer bone209;
	private final ModelRenderer bone210;
	private final ModelRenderer bone211;
	private final ModelRenderer boosters2;
	private final ModelRenderer merlin10;
	private final ModelRenderer bone212;
	private final ModelRenderer bone213;
	private final ModelRenderer bone214;
	private final ModelRenderer bone215;
	private final ModelRenderer merlin11;
	private final ModelRenderer bone216;
	private final ModelRenderer bone217;
	private final ModelRenderer bone218;
	private final ModelRenderer bone219;
	private final ModelRenderer merlin12;
	private final ModelRenderer bone220;
	private final ModelRenderer bone221;
	private final ModelRenderer bone222;
	private final ModelRenderer bone223;
	private final ModelRenderer merlin13;
	private final ModelRenderer bone224;
	private final ModelRenderer bone225;
	private final ModelRenderer bone226;
	private final ModelRenderer bone227;
	private final ModelRenderer merlin14;
	private final ModelRenderer bone228;
	private final ModelRenderer bone229;
	private final ModelRenderer bone230;
	private final ModelRenderer bone231;
	private final ModelRenderer merlin15;
	private final ModelRenderer bone232;
	private final ModelRenderer bone233;
	private final ModelRenderer bone234;
	private final ModelRenderer bone235;
	private final ModelRenderer merlin16;
	private final ModelRenderer bone236;
	private final ModelRenderer bone237;
	private final ModelRenderer bone238;
	private final ModelRenderer bone239;
	private final ModelRenderer merlin17;
	private final ModelRenderer bone240;
	private final ModelRenderer bone241;
	private final ModelRenderer bone242;
	private final ModelRenderer bone243;
	private final ModelRenderer merlin18;
	private final ModelRenderer bone244;
	private final ModelRenderer bone245;
	private final ModelRenderer bone246;
	private final ModelRenderer bone247;
	private final ModelRenderer legs_main2;
	private final ModelRenderer leg5;
	private final ModelRenderer bone248;
	private final ModelRenderer bone249;
	private final ModelRenderer bone250;
	private final ModelRenderer bone251;
	private final ModelRenderer leg6;
	private final ModelRenderer bone252;
	private final ModelRenderer bone253;
	private final ModelRenderer bone254;
	private final ModelRenderer bone255;
	private final ModelRenderer leg7;
	private final ModelRenderer bone256;
	private final ModelRenderer bone257;
	private final ModelRenderer bone258;
	private final ModelRenderer bone259;
	private final ModelRenderer leg8;
	private final ModelRenderer bone260;
	private final ModelRenderer bone261;
	private final ModelRenderer bone262;
	private final ModelRenderer bone263;
	private final ModelRenderer fins_main2;
	private final ModelRenderer fins1_3;
	private final ModelRenderer fin5;
	private final ModelRenderer fin6;
	private final ModelRenderer fins3_2;
	private final ModelRenderer fin7;
	private final ModelRenderer fin8;
	private final ModelRenderer falcon_right;
	private final ModelRenderer rocket3;
	private final ModelRenderer bone264;
	private final ModelRenderer bone265;
	private final ModelRenderer bone266;
	private final ModelRenderer bone267;
	private final ModelRenderer bone268;
	private final ModelRenderer bone269;
	private final ModelRenderer bone270;
	private final ModelRenderer bone271;
	private final ModelRenderer bone272;
	private final ModelRenderer bone273;
	private final ModelRenderer bone274;
	private final ModelRenderer bone275;
	private final ModelRenderer bone276;
	private final ModelRenderer bone277;
	private final ModelRenderer bone278;
	private final ModelRenderer bone279;
	private final ModelRenderer bone280;
	private final ModelRenderer bone281;
	private final ModelRenderer bone282;
	private final ModelRenderer bone283;
	private final ModelRenderer bone284;
	private final ModelRenderer bone285;
	private final ModelRenderer bone286;
	private final ModelRenderer bone287;
	private final ModelRenderer bone288;
	private final ModelRenderer bone289;
	private final ModelRenderer bone290;
	private final ModelRenderer bone291;
	private final ModelRenderer bone292;
	private final ModelRenderer bone293;
	private final ModelRenderer bone294;
	private final ModelRenderer bone295;
	private final ModelRenderer bone296;
	private final ModelRenderer bone297;
	private final ModelRenderer bone298;
	private final ModelRenderer bone299;
	private final ModelRenderer bone300;
	private final ModelRenderer bone301;
	private final ModelRenderer bone302;
	private final ModelRenderer bone303;
	private final ModelRenderer bone304;
	private final ModelRenderer bone305;
	private final ModelRenderer bone306;
	private final ModelRenderer bone307;
	private final ModelRenderer bone308;
	private final ModelRenderer bone309;
	private final ModelRenderer bone310;
	private final ModelRenderer bone311;
	private final ModelRenderer bone312;
	private final ModelRenderer bone313;
	private final ModelRenderer bone314;
	private final ModelRenderer bone315;
	private final ModelRenderer bone316;
	private final ModelRenderer bone317;
	private final ModelRenderer bone318;
	private final ModelRenderer bone319;
	private final ModelRenderer bone320;
	private final ModelRenderer bone321;
	private final ModelRenderer boosters3;
	private final ModelRenderer merlin19;
	private final ModelRenderer bone322;
	private final ModelRenderer bone323;
	private final ModelRenderer bone324;
	private final ModelRenderer bone325;
	private final ModelRenderer merlin20;
	private final ModelRenderer bone326;
	private final ModelRenderer bone327;
	private final ModelRenderer bone328;
	private final ModelRenderer bone329;
	private final ModelRenderer merlin21;
	private final ModelRenderer bone330;
	private final ModelRenderer bone331;
	private final ModelRenderer bone332;
	private final ModelRenderer bone333;
	private final ModelRenderer merlin22;
	private final ModelRenderer bone334;
	private final ModelRenderer bone335;
	private final ModelRenderer bone336;
	private final ModelRenderer bone337;
	private final ModelRenderer merlin23;
	private final ModelRenderer bone338;
	private final ModelRenderer bone339;
	private final ModelRenderer bone340;
	private final ModelRenderer bone341;
	private final ModelRenderer merlin24;
	private final ModelRenderer bone342;
	private final ModelRenderer bone343;
	private final ModelRenderer bone344;
	private final ModelRenderer bone345;
	private final ModelRenderer merlin25;
	private final ModelRenderer bone346;
	private final ModelRenderer bone347;
	private final ModelRenderer bone348;
	private final ModelRenderer bone349;
	private final ModelRenderer merlin26;
	private final ModelRenderer bone350;
	private final ModelRenderer bone351;
	private final ModelRenderer bone352;
	private final ModelRenderer bone353;
	private final ModelRenderer merlin27;
	private final ModelRenderer bone354;
	private final ModelRenderer bone355;
	private final ModelRenderer bone356;
	private final ModelRenderer bone357;
	private final ModelRenderer legs_main3;
	private final ModelRenderer leg9;
	private final ModelRenderer bone358;
	private final ModelRenderer bone359;
	private final ModelRenderer bone360;
	private final ModelRenderer bone361;
	private final ModelRenderer leg10;
	private final ModelRenderer bone362;
	private final ModelRenderer bone363;
	private final ModelRenderer bone364;
	private final ModelRenderer bone365;
	private final ModelRenderer leg11;
	private final ModelRenderer bone366;
	private final ModelRenderer bone367;
	private final ModelRenderer bone368;
	private final ModelRenderer bone369;
	private final ModelRenderer leg12;
	private final ModelRenderer bone370;
	private final ModelRenderer bone371;
	private final ModelRenderer bone372;
	private final ModelRenderer bone373;
	private final ModelRenderer fins_main3;
	private final ModelRenderer fins1_4;
	private final ModelRenderer fin9;
	private final ModelRenderer fin10;
	private final ModelRenderer fins3_3;
	private final ModelRenderer fin11;
	private final ModelRenderer fin12;
	private final ModelRenderer cone;
	private final ModelRenderer bone376;
	private final ModelRenderer bone378;
	private final ModelRenderer bone375;
	private final ModelRenderer bone377;
	private final ModelRenderer bone379;
	private final ModelRenderer bone380;
	private final ModelRenderer bone381;
	private final ModelRenderer bone382;
	private final ModelRenderer bone383;
	private final ModelRenderer bone384;
	private final ModelRenderer bone385;
	private final ModelRenderer bone386;
	private final ModelRenderer bone387;
	private final ModelRenderer bone388;
	private final ModelRenderer bone389;
	private final ModelRenderer bone390;
	private final ModelRenderer bone391;
	private final ModelRenderer bone392;
	private final ModelRenderer bone393;
	private final ModelRenderer bone394;
	private final ModelRenderer bone396;
	private final ModelRenderer bone397;
	private final ModelRenderer bone398;
	private final ModelRenderer bone399;
	private final ModelRenderer bone400;
	private final ModelRenderer bone401;
	private final ModelRenderer bone402;
	private final ModelRenderer bone403;
	private final ModelRenderer bone404;
	private final ModelRenderer bone405;
	private final ModelRenderer bone406;
	private final ModelRenderer bone407;
	private final ModelRenderer bone408;
	private final ModelRenderer bone409;
	private final ModelRenderer bone410;
	private final ModelRenderer bone411;
	private final ModelRenderer bone412;
	private final ModelRenderer bone413;
	private final ModelRenderer cone2;
	private final ModelRenderer bone374;
	private final ModelRenderer bone395;
	private final ModelRenderer bone414;
	private final ModelRenderer bone415;
	private final ModelRenderer bone416;
	private final ModelRenderer bone417;
	private final ModelRenderer bone418;
	private final ModelRenderer bone419;
	private final ModelRenderer bone420;
	private final ModelRenderer bone421;
	private final ModelRenderer bone422;
	private final ModelRenderer bone423;
	private final ModelRenderer bone424;
	private final ModelRenderer bone425;
	private final ModelRenderer bone426;
	private final ModelRenderer bone427;
	private final ModelRenderer bone428;
	private final ModelRenderer bone429;
	private final ModelRenderer bone430;
	private final ModelRenderer bone431;
	private final ModelRenderer bone432;
	private final ModelRenderer bone433;
	private final ModelRenderer bone434;
	private final ModelRenderer bone435;
	private final ModelRenderer bone436;
	private final ModelRenderer bone437;
	private final ModelRenderer bone438;
	private final ModelRenderer bone439;
	private final ModelRenderer bone440;
	private final ModelRenderer bone441;
	private final ModelRenderer bone442;
	private final ModelRenderer bone443;
	private final ModelRenderer bone444;
	private final ModelRenderer bone445;
	private final ModelRenderer bone446;
	private final ModelRenderer bone447;
	private final ModelRenderer bone448;
	private final ModelRenderer bone449;
	private final ModelRenderer mounting;
	private final ModelRenderer bone450;
	private final ModelRenderer bone451;

	public FalconHeavyRocketModel() {
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
		merlin.setTextureOffset(33, 0).addBox(-3.0F, -11.0F, -3.0F, 6.0F, 9.0F, 6.0F, 0.0F, false);

		bone58 = new ModelRenderer(this);
		bone58.setRotationPoint(0.0F, -3.0F, 0.0F);
		merlin.addChild(bone58);
		bone58.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone58.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		bone59 = new ModelRenderer(this);
		bone59.setRotationPoint(0.0F, -3.0F, 0.0F);
		merlin.addChild(bone59);
		setRotationAngle(bone59, 0.0F, -0.7854F, 0.0F);
		bone59.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone59.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		bone60 = new ModelRenderer(this);
		bone60.setRotationPoint(0.0F, -3.0F, 0.0F);
		merlin.addChild(bone60);
		setRotationAngle(bone60, 0.0F, -1.5708F, 0.0F);
		bone60.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone60.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		bone61 = new ModelRenderer(this);
		bone61.setRotationPoint(0.0F, -3.0F, 0.0F);
		merlin.addChild(bone61);
		setRotationAngle(bone61, 0.0F, -2.3562F, 0.0F);
		bone61.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone61.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		merlin2 = new ModelRenderer(this);
		merlin2.setRotationPoint(0.0F, 0.0F, 0.0F);
		boosters.addChild(merlin2);
		merlin2.setTextureOffset(33, 0).addBox(-16.5F, -11.0F, -3.0F, 6.0F, 9.0F, 6.0F, 0.0F, false);

		bone62 = new ModelRenderer(this);
		bone62.setRotationPoint(-13.5F, -3.0F, 0.0F);
		merlin2.addChild(bone62);
		bone62.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone62.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		bone63 = new ModelRenderer(this);
		bone63.setRotationPoint(-13.5F, -3.0F, 0.0F);
		merlin2.addChild(bone63);
		setRotationAngle(bone63, 0.0F, -0.7854F, 0.0F);
		bone63.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone63.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		bone64 = new ModelRenderer(this);
		bone64.setRotationPoint(-13.5F, -3.0F, 0.0F);
		merlin2.addChild(bone64);
		setRotationAngle(bone64, 0.0F, -1.5708F, 0.0F);
		bone64.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone64.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		bone65 = new ModelRenderer(this);
		bone65.setRotationPoint(-13.5F, -3.0F, 0.0F);
		merlin2.addChild(bone65);
		setRotationAngle(bone65, 0.0F, -2.3562F, 0.0F);
		bone65.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone65.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		merlin3 = new ModelRenderer(this);
		merlin3.setRotationPoint(0.0F, 0.0F, 0.0F);
		boosters.addChild(merlin3);
		setRotationAngle(merlin3, 0.0F, -0.7854F, 0.0F);
		merlin3.setTextureOffset(33, 0).addBox(-16.5F, -11.0F, -3.0F, 6.0F, 9.0F, 6.0F, 0.0F, false);

		bone66 = new ModelRenderer(this);
		bone66.setRotationPoint(-13.5F, -3.0F, 0.0F);
		merlin3.addChild(bone66);
		bone66.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone66.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		bone67 = new ModelRenderer(this);
		bone67.setRotationPoint(-13.5F, -3.0F, 0.0F);
		merlin3.addChild(bone67);
		setRotationAngle(bone67, 0.0F, -0.7854F, 0.0F);
		bone67.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone67.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		bone68 = new ModelRenderer(this);
		bone68.setRotationPoint(-13.5F, -3.0F, 0.0F);
		merlin3.addChild(bone68);
		setRotationAngle(bone68, 0.0F, -1.5708F, 0.0F);
		bone68.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone68.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		bone69 = new ModelRenderer(this);
		bone69.setRotationPoint(-13.5F, -3.0F, 0.0F);
		merlin3.addChild(bone69);
		setRotationAngle(bone69, 0.0F, -2.3562F, 0.0F);
		bone69.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone69.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		merlin4 = new ModelRenderer(this);
		merlin4.setRotationPoint(0.0F, 0.0F, 0.0F);
		boosters.addChild(merlin4);
		setRotationAngle(merlin4, 0.0F, -1.5708F, 0.0F);
		merlin4.setTextureOffset(33, 0).addBox(-16.5F, -11.0F, -3.0F, 6.0F, 9.0F, 6.0F, 0.0F, false);

		bone70 = new ModelRenderer(this);
		bone70.setRotationPoint(-13.5F, -3.0F, 0.0F);
		merlin4.addChild(bone70);
		bone70.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone70.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		bone71 = new ModelRenderer(this);
		bone71.setRotationPoint(-13.5F, -3.0F, 0.0F);
		merlin4.addChild(bone71);
		setRotationAngle(bone71, 0.0F, -0.7854F, 0.0F);
		bone71.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone71.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		bone72 = new ModelRenderer(this);
		bone72.setRotationPoint(-13.5F, -3.0F, 0.0F);
		merlin4.addChild(bone72);
		setRotationAngle(bone72, 0.0F, -1.5708F, 0.0F);
		bone72.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone72.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		bone73 = new ModelRenderer(this);
		bone73.setRotationPoint(-13.5F, -3.0F, 0.0F);
		merlin4.addChild(bone73);
		setRotationAngle(bone73, 0.0F, -2.3562F, 0.0F);
		bone73.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone73.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		merlin5 = new ModelRenderer(this);
		merlin5.setRotationPoint(0.0F, 0.0F, 0.0F);
		boosters.addChild(merlin5);
		setRotationAngle(merlin5, 0.0F, -2.3562F, 0.0F);
		merlin5.setTextureOffset(33, 0).addBox(-16.5F, -11.0F, -3.0F, 6.0F, 9.0F, 6.0F, 0.0F, false);

		bone74 = new ModelRenderer(this);
		bone74.setRotationPoint(-13.5F, -3.0F, 0.0F);
		merlin5.addChild(bone74);
		bone74.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone74.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		bone75 = new ModelRenderer(this);
		bone75.setRotationPoint(-13.5F, -3.0F, 0.0F);
		merlin5.addChild(bone75);
		setRotationAngle(bone75, 0.0F, -0.7854F, 0.0F);
		bone75.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone75.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		bone136 = new ModelRenderer(this);
		bone136.setRotationPoint(-13.5F, -3.0F, 0.0F);
		merlin5.addChild(bone136);
		setRotationAngle(bone136, 0.0F, -1.5708F, 0.0F);
		bone136.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone136.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		bone137 = new ModelRenderer(this);
		bone137.setRotationPoint(-13.5F, -3.0F, 0.0F);
		merlin5.addChild(bone137);
		setRotationAngle(bone137, 0.0F, -2.3562F, 0.0F);
		bone137.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone137.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		merlin6 = new ModelRenderer(this);
		merlin6.setRotationPoint(0.0F, 0.0F, 0.0F);
		boosters.addChild(merlin6);
		setRotationAngle(merlin6, 0.0F, 3.1416F, 0.0F);
		merlin6.setTextureOffset(33, 0).addBox(-16.5F, -11.0F, -3.0F, 6.0F, 9.0F, 6.0F, 0.0F, false);

		bone138 = new ModelRenderer(this);
		bone138.setRotationPoint(-13.5F, -3.0F, 0.0F);
		merlin6.addChild(bone138);
		bone138.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone138.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		bone139 = new ModelRenderer(this);
		bone139.setRotationPoint(-13.5F, -3.0F, 0.0F);
		merlin6.addChild(bone139);
		setRotationAngle(bone139, 0.0F, -0.7854F, 0.0F);
		bone139.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone139.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		bone140 = new ModelRenderer(this);
		bone140.setRotationPoint(-13.5F, -3.0F, 0.0F);
		merlin6.addChild(bone140);
		setRotationAngle(bone140, 0.0F, -1.5708F, 0.0F);
		bone140.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone140.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		bone141 = new ModelRenderer(this);
		bone141.setRotationPoint(-13.5F, -3.0F, 0.0F);
		merlin6.addChild(bone141);
		setRotationAngle(bone141, 0.0F, -2.3562F, 0.0F);
		bone141.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone141.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		merlin7 = new ModelRenderer(this);
		merlin7.setRotationPoint(0.0F, 0.0F, 0.0F);
		boosters.addChild(merlin7);
		setRotationAngle(merlin7, 0.0F, 2.3562F, 0.0F);
		merlin7.setTextureOffset(33, 0).addBox(-16.5F, -11.0F, -3.0F, 6.0F, 9.0F, 6.0F, 0.0F, false);

		bone142 = new ModelRenderer(this);
		bone142.setRotationPoint(-13.5F, -3.0F, 0.0F);
		merlin7.addChild(bone142);
		bone142.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone142.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		bone143 = new ModelRenderer(this);
		bone143.setRotationPoint(-13.5F, -3.0F, 0.0F);
		merlin7.addChild(bone143);
		setRotationAngle(bone143, 0.0F, -0.7854F, 0.0F);
		bone143.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone143.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		bone144 = new ModelRenderer(this);
		bone144.setRotationPoint(-13.5F, -3.0F, 0.0F);
		merlin7.addChild(bone144);
		setRotationAngle(bone144, 0.0F, -1.5708F, 0.0F);
		bone144.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone144.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		bone145 = new ModelRenderer(this);
		bone145.setRotationPoint(-13.5F, -3.0F, 0.0F);
		merlin7.addChild(bone145);
		setRotationAngle(bone145, 0.0F, -2.3562F, 0.0F);
		bone145.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone145.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		merlin8 = new ModelRenderer(this);
		merlin8.setRotationPoint(0.0F, 0.0F, 0.0F);
		boosters.addChild(merlin8);
		setRotationAngle(merlin8, 0.0F, 1.5708F, 0.0F);
		merlin8.setTextureOffset(33, 0).addBox(-16.5F, -11.0F, -3.0F, 6.0F, 9.0F, 6.0F, 0.0F, false);

		bone146 = new ModelRenderer(this);
		bone146.setRotationPoint(-13.5F, -3.0F, 0.0F);
		merlin8.addChild(bone146);
		bone146.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone146.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		bone147 = new ModelRenderer(this);
		bone147.setRotationPoint(-13.5F, -3.0F, 0.0F);
		merlin8.addChild(bone147);
		setRotationAngle(bone147, 0.0F, -0.7854F, 0.0F);
		bone147.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone147.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		bone148 = new ModelRenderer(this);
		bone148.setRotationPoint(-13.5F, -3.0F, 0.0F);
		merlin8.addChild(bone148);
		setRotationAngle(bone148, 0.0F, -1.5708F, 0.0F);
		bone148.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone148.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		bone149 = new ModelRenderer(this);
		bone149.setRotationPoint(-13.5F, -3.0F, 0.0F);
		merlin8.addChild(bone149);
		setRotationAngle(bone149, 0.0F, -2.3562F, 0.0F);
		bone149.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone149.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		merlin9 = new ModelRenderer(this);
		merlin9.setRotationPoint(0.0F, 0.0F, 0.0F);
		boosters.addChild(merlin9);
		setRotationAngle(merlin9, 0.0F, 0.7854F, 0.0F);
		merlin9.setTextureOffset(33, 0).addBox(-16.5F, -11.0F, -3.0F, 6.0F, 9.0F, 6.0F, 0.0F, false);

		bone150 = new ModelRenderer(this);
		bone150.setRotationPoint(-13.5F, -3.0F, 0.0F);
		merlin9.addChild(bone150);
		bone150.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone150.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		bone151 = new ModelRenderer(this);
		bone151.setRotationPoint(-13.5F, -3.0F, 0.0F);
		merlin9.addChild(bone151);
		setRotationAngle(bone151, 0.0F, -0.7854F, 0.0F);
		bone151.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone151.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		bone152 = new ModelRenderer(this);
		bone152.setRotationPoint(-13.5F, -3.0F, 0.0F);
		merlin9.addChild(bone152);
		setRotationAngle(bone152, 0.0F, -1.5708F, 0.0F);
		bone152.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone152.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		bone153 = new ModelRenderer(this);
		bone153.setRotationPoint(-13.5F, -3.0F, 0.0F);
		merlin9.addChild(bone153);
		setRotationAngle(bone153, 0.0F, -2.3562F, 0.0F);
		bone153.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone153.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

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
		fin.setTextureOffset(70, 158).addBox(-2.0F, -0.5F, -0.75F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		fin2 = new ModelRenderer(this);
		fin2.setRotationPoint(0.0F, -518.5F, 19.25F);
		fins1_2.addChild(fin2);
		setRotationAngle(fin2, 1.5708F, 3.1416F, 0.0F);
		fin2.setTextureOffset(86, 243).addBox(-4.0F, -0.5F, -12.75F, 8.0F, 1.0F, 12.0F, 0.0F, false);
		fin2.setTextureOffset(70, 158).addBox(-2.0F, -0.5F, -0.75F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		fins3_4 = new ModelRenderer(this);
		fins3_4.setRotationPoint(0.0F, 0.0F, 0.0F);
		fins_main.addChild(fins3_4);
		setRotationAngle(fins3_4, 0.0F, -1.5708F, 0.0F);
		

		fin3 = new ModelRenderer(this);
		fin3.setRotationPoint(0.0F, -518.5F, -19.25F);
		fins3_4.addChild(fin3);
		setRotationAngle(fin3, 1.5708F, 0.0F, 0.0F);
		fin3.setTextureOffset(86, 243).addBox(-4.0F, -0.5F, -12.75F, 8.0F, 1.0F, 12.0F, 0.0F, false);
		fin3.setTextureOffset(70, 158).addBox(-2.0F, -0.5F, -0.75F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		fin4 = new ModelRenderer(this);
		fin4.setRotationPoint(0.0F, -518.5F, 19.25F);
		fins3_4.addChild(fin4);
		setRotationAngle(fin4, 1.5708F, 3.1416F, 0.0F);
		fin4.setTextureOffset(86, 243).addBox(-4.0F, -0.5F, -12.75F, 8.0F, 1.0F, 12.0F, 0.0F, false);
		fin4.setTextureOffset(70, 158).addBox(-2.0F, -0.5F, -0.75F, 4.0F, 1.0F, 1.0F, 0.0F, false);

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
		

		bone93 = new ModelRenderer(this);
		bone93.setRotationPoint(0.0F, -76.0F, 0.0F);
		fairing.addChild(bone93);
		

		bone101 = new ModelRenderer(this);
		bone101.setRotationPoint(0.0F, -574.0F, 0.0F);
		bone93.addChild(bone101);
		bone101.setTextureOffset(0, 0).addBox(-23.0F, -15.0F, -5.0F, 1.0F, 30.0F, 10.0F, 0.0F, false);
		bone101.setTextureOffset(0, 0).addBox(22.0F, -15.0F, -5.0F, 1.0F, 30.0F, 10.0F, 0.0F, false);

		bone102 = new ModelRenderer(this);
		bone102.setRotationPoint(0.0F, -574.0F, 0.0F);
		bone93.addChild(bone102);
		setRotationAngle(bone102, 0.0F, -0.5236F, 0.0F);
		bone102.setTextureOffset(0, 0).addBox(-23.0F, -15.0F, -5.0F, 1.0F, 30.0F, 10.0F, 0.0F, false);
		bone102.setTextureOffset(0, 0).addBox(22.0F, -15.0F, -5.0F, 1.0F, 30.0F, 10.0F, 0.0F, false);

		bone103 = new ModelRenderer(this);
		bone103.setRotationPoint(0.0F, -574.0F, 0.0F);
		bone93.addChild(bone103);
		setRotationAngle(bone103, 0.0F, -1.0472F, 0.0F);
		bone103.setTextureOffset(0, 0).addBox(-23.0F, -15.0F, -5.0F, 1.0F, 30.0F, 10.0F, 0.0F, false);
		bone103.setTextureOffset(0, 0).addBox(22.0F, -15.0F, -5.0F, 1.0F, 30.0F, 10.0F, 0.0F, false);

		bone104 = new ModelRenderer(this);
		bone104.setRotationPoint(0.0F, -574.0F, 0.0F);
		bone93.addChild(bone104);
		setRotationAngle(bone104, 0.0F, -1.5708F, 0.0F);
		bone104.setTextureOffset(0, 0).addBox(-23.0F, -15.0F, -5.0F, 1.0F, 30.0F, 10.0F, 0.0F, false);
		bone104.setTextureOffset(0, 0).addBox(22.0F, -15.0F, -5.0F, 1.0F, 30.0F, 10.0F, 0.0F, false);

		bone105 = new ModelRenderer(this);
		bone105.setRotationPoint(0.0F, -574.0F, 0.0F);
		bone93.addChild(bone105);
		setRotationAngle(bone105, 0.0F, -2.0944F, 0.0F);
		bone105.setTextureOffset(0, 0).addBox(-23.0F, -15.0F, -5.0F, 1.0F, 30.0F, 10.0F, 0.0F, false);
		bone105.setTextureOffset(0, 0).addBox(22.0F, -15.0F, -5.0F, 1.0F, 30.0F, 10.0F, 0.0F, false);

		bone106 = new ModelRenderer(this);
		bone106.setRotationPoint(0.0F, -574.0F, 0.0F);
		bone93.addChild(bone106);
		setRotationAngle(bone106, 0.0F, -2.618F, 0.0F);
		bone106.setTextureOffset(0, 0).addBox(-23.0F, -15.0F, -5.0F, 1.0F, 30.0F, 10.0F, 0.0F, false);
		bone106.setTextureOffset(0, 0).addBox(22.0F, -15.0F, -5.0F, 1.0F, 30.0F, 10.0F, 0.0F, false);

		bone107 = new ModelRenderer(this);
		bone107.setRotationPoint(0.0F, -76.0F, 0.0F);
		fairing.addChild(bone107);
		setRotationAngle(bone107, 0.0F, -0.2618F, 0.0F);
		

		bone108 = new ModelRenderer(this);
		bone108.setRotationPoint(0.0F, -574.0F, 0.0F);
		bone107.addChild(bone108);
		bone108.setTextureOffset(0, 0).addBox(-23.0F, -15.0F, -5.0F, 1.0F, 30.0F, 10.0F, 0.0F, false);
		bone108.setTextureOffset(0, 0).addBox(22.0F, -15.0F, -5.0F, 1.0F, 30.0F, 10.0F, 0.0F, false);

		bone109 = new ModelRenderer(this);
		bone109.setRotationPoint(0.0F, -574.0F, 0.0F);
		bone107.addChild(bone109);
		setRotationAngle(bone109, 0.0F, -0.5236F, 0.0F);
		bone109.setTextureOffset(0, 0).addBox(-23.0F, -15.0F, -5.0F, 1.0F, 30.0F, 10.0F, 0.0F, false);
		bone109.setTextureOffset(0, 0).addBox(22.0F, -15.0F, -5.0F, 1.0F, 30.0F, 10.0F, 0.0F, false);

		bone110 = new ModelRenderer(this);
		bone110.setRotationPoint(0.0F, -574.0F, 0.0F);
		bone107.addChild(bone110);
		setRotationAngle(bone110, 0.0F, -1.0472F, 0.0F);
		bone110.setTextureOffset(0, 0).addBox(-23.0F, -15.0F, -5.0F, 1.0F, 30.0F, 10.0F, 0.0F, false);
		bone110.setTextureOffset(0, 0).addBox(22.0F, -15.0F, -5.0F, 1.0F, 30.0F, 10.0F, 0.0F, false);

		bone111 = new ModelRenderer(this);
		bone111.setRotationPoint(0.0F, -574.0F, 0.0F);
		bone107.addChild(bone111);
		setRotationAngle(bone111, 0.0F, -1.5708F, 0.0F);
		bone111.setTextureOffset(0, 0).addBox(-23.0F, -15.0F, -5.0F, 1.0F, 30.0F, 10.0F, 0.0F, false);
		bone111.setTextureOffset(0, 0).addBox(22.0F, -15.0F, -5.0F, 1.0F, 30.0F, 10.0F, 0.0F, false);

		bone112 = new ModelRenderer(this);
		bone112.setRotationPoint(0.0F, -574.0F, 0.0F);
		bone107.addChild(bone112);
		setRotationAngle(bone112, 0.0F, -2.0944F, 0.0F);
		bone112.setTextureOffset(0, 0).addBox(-23.0F, -15.0F, -5.0F, 1.0F, 30.0F, 10.0F, 0.0F, false);
		bone112.setTextureOffset(0, 0).addBox(22.0F, -15.0F, -5.0F, 1.0F, 30.0F, 10.0F, 0.0F, false);

		bone113 = new ModelRenderer(this);
		bone113.setRotationPoint(0.0F, -574.0F, 0.0F);
		bone107.addChild(bone113);
		setRotationAngle(bone113, 0.0F, -2.618F, 0.0F);
		bone113.setTextureOffset(0, 0).addBox(-23.0F, -15.0F, -5.0F, 1.0F, 30.0F, 10.0F, 0.0F, false);
		bone113.setTextureOffset(0, 0).addBox(22.0F, -15.0F, -5.0F, 1.0F, 30.0F, 10.0F, 0.0F, false);

		bone121 = new ModelRenderer(this);
		bone121.setRotationPoint(0.0F, -184.5F, 0.0F);
		fairing.addChild(bone121);
		setRotationAngle(bone121, 0.0F, -0.2618F, 0.0F);
		

		bone122 = new ModelRenderer(this);
		bone122.setRotationPoint(0.0F, -574.0F, 0.0F);
		bone121.addChild(bone122);
		bone122.setTextureOffset(0, 0).addBox(-23.0F, -15.0F, -5.0F, 1.0F, 30.0F, 10.0F, 0.0F, false);
		bone122.setTextureOffset(0, 0).addBox(22.0F, -15.0F, -5.0F, 1.0F, 30.0F, 10.0F, 0.0F, false);

		bone123 = new ModelRenderer(this);
		bone123.setRotationPoint(0.0F, -574.0F, 0.0F);
		bone121.addChild(bone123);
		setRotationAngle(bone123, 0.0F, -0.5236F, 0.0F);
		bone123.setTextureOffset(0, 0).addBox(-23.0F, -15.0F, -5.0F, 1.0F, 30.0F, 10.0F, 0.0F, false);
		bone123.setTextureOffset(0, 0).addBox(22.0F, -15.0F, -5.0F, 1.0F, 30.0F, 10.0F, 0.0F, false);

		bone124 = new ModelRenderer(this);
		bone124.setRotationPoint(0.0F, -574.0F, 0.0F);
		bone121.addChild(bone124);
		setRotationAngle(bone124, 0.0F, -1.0472F, 0.0F);
		bone124.setTextureOffset(0, 0).addBox(-23.0F, -15.0F, -5.0F, 1.0F, 30.0F, 10.0F, 0.0F, false);
		bone124.setTextureOffset(0, 0).addBox(22.0F, -15.0F, -5.0F, 1.0F, 30.0F, 10.0F, 0.0F, false);

		bone125 = new ModelRenderer(this);
		bone125.setRotationPoint(0.0F, -574.0F, 0.0F);
		bone121.addChild(bone125);
		setRotationAngle(bone125, 0.0F, -1.5708F, 0.0F);
		bone125.setTextureOffset(0, 0).addBox(-23.0F, -15.0F, -5.0F, 1.0F, 30.0F, 10.0F, 0.0F, false);
		bone125.setTextureOffset(0, 0).addBox(22.0F, -15.0F, -5.0F, 1.0F, 30.0F, 10.0F, 0.0F, false);

		bone126 = new ModelRenderer(this);
		bone126.setRotationPoint(0.0F, -574.0F, 0.0F);
		bone121.addChild(bone126);
		setRotationAngle(bone126, 0.0F, -2.0944F, 0.0F);
		bone126.setTextureOffset(0, 0).addBox(-23.0F, -15.0F, -5.0F, 1.0F, 30.0F, 10.0F, 0.0F, false);
		bone126.setTextureOffset(0, 0).addBox(22.0F, -15.0F, -5.0F, 1.0F, 30.0F, 10.0F, 0.0F, false);

		bone127 = new ModelRenderer(this);
		bone127.setRotationPoint(0.0F, -574.0F, 0.0F);
		bone121.addChild(bone127);
		setRotationAngle(bone127, 0.0F, -2.618F, 0.0F);
		bone127.setTextureOffset(0, 0).addBox(-23.0F, -15.0F, -5.0F, 1.0F, 30.0F, 10.0F, 0.0F, false);
		bone127.setTextureOffset(0, 0).addBox(22.0F, -15.0F, -5.0F, 1.0F, 30.0F, 10.0F, 0.0F, false);

		bone128 = new ModelRenderer(this);
		bone128.setRotationPoint(0.0F, -184.5F, 0.0F);
		fairing.addChild(bone128);
		setRotationAngle(bone128, 0.0F, -0.5236F, 0.0F);
		

		bone129 = new ModelRenderer(this);
		bone129.setRotationPoint(0.0F, -574.0F, 0.0F);
		bone128.addChild(bone129);
		bone129.setTextureOffset(0, 0).addBox(-23.0F, -15.0F, -5.0F, 1.0F, 30.0F, 10.0F, 0.0F, false);
		bone129.setTextureOffset(0, 0).addBox(22.0F, -15.0F, -5.0F, 1.0F, 30.0F, 10.0F, 0.0F, false);

		bone130 = new ModelRenderer(this);
		bone130.setRotationPoint(0.0F, -574.0F, 0.0F);
		bone128.addChild(bone130);
		setRotationAngle(bone130, 0.0F, -0.5236F, 0.0F);
		bone130.setTextureOffset(0, 0).addBox(-23.0F, -15.0F, -5.0F, 1.0F, 30.0F, 10.0F, 0.0F, false);
		bone130.setTextureOffset(0, 0).addBox(22.0F, -15.0F, -5.0F, 1.0F, 30.0F, 10.0F, 0.0F, false);

		bone131 = new ModelRenderer(this);
		bone131.setRotationPoint(0.0F, -574.0F, 0.0F);
		bone128.addChild(bone131);
		setRotationAngle(bone131, 0.0F, -1.0472F, 0.0F);
		bone131.setTextureOffset(0, 0).addBox(-23.0F, -15.0F, -5.0F, 1.0F, 30.0F, 10.0F, 0.0F, false);
		bone131.setTextureOffset(0, 0).addBox(22.0F, -15.0F, -5.0F, 1.0F, 30.0F, 10.0F, 0.0F, false);

		bone132 = new ModelRenderer(this);
		bone132.setRotationPoint(0.0F, -574.0F, 0.0F);
		bone128.addChild(bone132);
		setRotationAngle(bone132, 0.0F, -1.5708F, 0.0F);
		bone132.setTextureOffset(0, 0).addBox(-23.0F, -15.0F, -5.0F, 1.0F, 30.0F, 10.0F, 0.0F, false);
		bone132.setTextureOffset(0, 0).addBox(22.0F, -15.0F, -5.0F, 1.0F, 30.0F, 10.0F, 0.0F, false);

		bone133 = new ModelRenderer(this);
		bone133.setRotationPoint(0.0F, -574.0F, 0.0F);
		bone128.addChild(bone133);
		setRotationAngle(bone133, 0.0F, -2.0944F, 0.0F);
		bone133.setTextureOffset(0, 0).addBox(-23.0F, -15.0F, -5.0F, 1.0F, 30.0F, 10.0F, 0.0F, false);
		bone133.setTextureOffset(0, 0).addBox(22.0F, -15.0F, -5.0F, 1.0F, 30.0F, 10.0F, 0.0F, false);

		bone134 = new ModelRenderer(this);
		bone134.setRotationPoint(0.0F, -574.0F, 0.0F);
		bone128.addChild(bone134);
		setRotationAngle(bone134, 0.0F, -2.618F, 0.0F);
		bone134.setTextureOffset(0, 0).addBox(-23.0F, -15.0F, -5.0F, 1.0F, 30.0F, 10.0F, 0.0F, false);
		bone134.setTextureOffset(0, 0).addBox(22.0F, -15.0F, -5.0F, 1.0F, 30.0F, 10.0F, 0.0F, false);

		bone114 = new ModelRenderer(this);
		bone114.setRotationPoint(0.0F, -76.0F, 0.0F);
		fairing.addChild(bone114);
		setRotationAngle(bone114, 0.0F, -0.2618F, 0.0F);
		

		bone115 = new ModelRenderer(this);
		bone115.setRotationPoint(0.0F, -574.0F, 0.0F);
		bone114.addChild(bone115);
		bone115.setTextureOffset(56, 45).addBox(-26.5F, -94.25F, -7.0F, 1.0F, 80.0F, 14.0F, 0.0F, false);
		bone115.setTextureOffset(56, 45).addBox(25.5F, -94.25F, -7.0F, 1.0F, 80.0F, 14.0F, 0.0F, false);

		bone116 = new ModelRenderer(this);
		bone116.setRotationPoint(0.0F, -574.0F, 0.0F);
		bone114.addChild(bone116);
		setRotationAngle(bone116, 0.0F, -0.5236F, 0.0F);
		bone116.setTextureOffset(56, 45).addBox(-26.5F, -94.25F, -7.0F, 1.0F, 80.0F, 14.0F, 0.0F, false);
		bone116.setTextureOffset(56, 45).addBox(25.5F, -94.25F, -7.0F, 1.0F, 80.0F, 14.0F, 0.0F, false);

		bone117 = new ModelRenderer(this);
		bone117.setRotationPoint(0.0F, -574.0F, 0.0F);
		bone114.addChild(bone117);
		setRotationAngle(bone117, 0.0F, -1.0472F, 0.0F);
		bone117.setTextureOffset(56, 45).addBox(-26.5F, -94.25F, -7.0F, 1.0F, 80.0F, 14.0F, 0.0F, false);
		bone117.setTextureOffset(56, 45).addBox(25.5F, -94.25F, -7.0F, 1.0F, 80.0F, 14.0F, 0.0F, false);

		bone118 = new ModelRenderer(this);
		bone118.setRotationPoint(0.0F, -574.0F, 0.0F);
		bone114.addChild(bone118);
		setRotationAngle(bone118, 0.0F, -1.5708F, 0.0F);
		bone118.setTextureOffset(56, 45).addBox(-26.5F, -94.25F, -7.0F, 1.0F, 80.0F, 14.0F, 0.0F, false);
		bone118.setTextureOffset(56, 45).addBox(25.5F, -94.25F, -7.0F, 1.0F, 80.0F, 14.0F, 0.0F, false);

		bone119 = new ModelRenderer(this);
		bone119.setRotationPoint(0.0F, -574.0F, 0.0F);
		bone114.addChild(bone119);
		setRotationAngle(bone119, 0.0F, -2.0944F, 0.0F);
		bone119.setTextureOffset(56, 45).addBox(-26.5F, -94.25F, -7.0F, 1.0F, 80.0F, 14.0F, 0.0F, false);
		bone119.setTextureOffset(56, 45).addBox(25.5F, -94.25F, -7.0F, 1.0F, 80.0F, 14.0F, 0.0F, false);

		bone120 = new ModelRenderer(this);
		bone120.setRotationPoint(0.0F, -574.0F, 0.0F);
		bone114.addChild(bone120);
		setRotationAngle(bone120, 0.0F, -2.618F, 0.0F);
		bone120.setTextureOffset(56, 45).addBox(-26.5F, -94.25F, -7.0F, 1.0F, 80.0F, 14.0F, 0.0F, false);
		bone120.setTextureOffset(56, 45).addBox(25.5F, -94.25F, -7.0F, 1.0F, 80.0F, 14.0F, 0.0F, false);

		bone135 = new ModelRenderer(this);
		bone135.setRotationPoint(0.0F, -841.0F, 0.0F);
		fairing.addChild(bone135);
		bone135.setTextureOffset(82, 4).addBox(-5.0F, 68.0F, -18.0F, 10.0F, 1.0F, 36.0F, 0.0F, false);
		bone135.setTextureOffset(82, 4).addBox(-5.0F, 68.0F, -18.0F, 10.0F, 1.0F, 36.0F, 0.0F, false);
		bone135.setTextureOffset(82, 4).addBox(-5.0F, 68.0F, -18.0F, 10.0F, 1.0F, 36.0F, 0.0F, false);
		bone135.setTextureOffset(82, 4).addBox(-5.0F, 68.0F, -18.0F, 10.0F, 1.0F, 36.0F, 0.0F, false);
		bone135.setTextureOffset(82, 4).addBox(-5.0F, 68.0F, -18.0F, 10.0F, 1.0F, 36.0F, 0.0F, false);
		bone135.setTextureOffset(82, 4).addBox(-5.0F, 68.0F, -18.0F, 10.0F, 1.0F, 36.0F, 0.0F, false);

		falcon_left = new ModelRenderer(this);
		falcon_left.setRotationPoint(-43.0F, 24.0F, 0.0F);
		

		rocket2 = new ModelRenderer(this);
		rocket2.setRotationPoint(0.0F, -76.0F, 0.0F);
		falcon_left.addChild(rocket2);
		

		bone154 = new ModelRenderer(this);
		bone154.setRotationPoint(0.0F, 0.0F, 0.0F);
		rocket2.addChild(bone154);
		

		bone155 = new ModelRenderer(this);
		bone155.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone154.addChild(bone155);
		bone155.setTextureOffset(0, 160).addBox(-19.0F, -455.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone155.setTextureOffset(0, 160).addBox(18.0F, -455.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone156 = new ModelRenderer(this);
		bone156.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone154.addChild(bone156);
		setRotationAngle(bone156, 0.0F, -0.5236F, 0.0F);
		bone156.setTextureOffset(0, 160).addBox(-19.0F, -455.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone156.setTextureOffset(0, 160).addBox(18.0F, -455.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone157 = new ModelRenderer(this);
		bone157.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone154.addChild(bone157);
		setRotationAngle(bone157, 0.0F, -1.0472F, 0.0F);
		bone157.setTextureOffset(0, 160).addBox(-19.0F, -455.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone157.setTextureOffset(0, 160).addBox(18.0F, -455.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone158 = new ModelRenderer(this);
		bone158.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone154.addChild(bone158);
		setRotationAngle(bone158, 0.0F, -1.5708F, 0.0F);
		bone158.setTextureOffset(0, 160).addBox(-19.0F, -455.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone158.setTextureOffset(0, 160).addBox(18.0F, -455.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone159 = new ModelRenderer(this);
		bone159.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone154.addChild(bone159);
		setRotationAngle(bone159, 0.0F, -2.0944F, 0.0F);
		bone159.setTextureOffset(0, 160).addBox(-19.0F, -455.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone159.setTextureOffset(0, 160).addBox(18.0F, -455.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone160 = new ModelRenderer(this);
		bone160.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone154.addChild(bone160);
		setRotationAngle(bone160, 0.0F, -2.618F, 0.0F);
		bone160.setTextureOffset(0, 160).addBox(-19.0F, -455.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone160.setTextureOffset(0, 160).addBox(18.0F, -455.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone161 = new ModelRenderer(this);
		bone161.setRotationPoint(0.0F, 0.0F, 0.0F);
		rocket2.addChild(bone161);
		

		bone162 = new ModelRenderer(this);
		bone162.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone161.addChild(bone162);
		bone162.setTextureOffset(0, 0).addBox(-19.0F, -385.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone162.setTextureOffset(0, 0).addBox(18.0F, -385.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone163 = new ModelRenderer(this);
		bone163.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone161.addChild(bone163);
		setRotationAngle(bone163, 0.0F, -0.5236F, 0.0F);
		bone163.setTextureOffset(0, 0).addBox(-19.0F, -385.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone163.setTextureOffset(0, 0).addBox(18.0F, -385.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone164 = new ModelRenderer(this);
		bone164.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone161.addChild(bone164);
		setRotationAngle(bone164, 0.0F, -1.0472F, 0.0F);
		bone164.setTextureOffset(0, 0).addBox(-19.0F, -385.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone164.setTextureOffset(0, 0).addBox(18.0F, -385.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone165 = new ModelRenderer(this);
		bone165.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone161.addChild(bone165);
		setRotationAngle(bone165, 0.0F, -1.5708F, 0.0F);
		bone165.setTextureOffset(46, 160).addBox(-19.0F, -385.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone165.setTextureOffset(0, 0).addBox(18.0F, -385.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone166 = new ModelRenderer(this);
		bone166.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone161.addChild(bone166);
		setRotationAngle(bone166, 0.0F, -2.0944F, 0.0F);
		bone166.setTextureOffset(0, 0).addBox(-19.0F, -385.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone166.setTextureOffset(0, 0).addBox(18.0F, -385.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone167 = new ModelRenderer(this);
		bone167.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone161.addChild(bone167);
		setRotationAngle(bone167, 0.0F, -2.618F, 0.0F);
		bone167.setTextureOffset(0, 0).addBox(-19.0F, -385.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone167.setTextureOffset(0, 0).addBox(18.0F, -385.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone168 = new ModelRenderer(this);
		bone168.setRotationPoint(0.0F, 0.0F, 0.0F);
		rocket2.addChild(bone168);
		

		bone169 = new ModelRenderer(this);
		bone169.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone168.addChild(bone169);
		bone169.setTextureOffset(0, 0).addBox(-19.0F, -315.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone169.setTextureOffset(0, 0).addBox(18.0F, -315.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone170 = new ModelRenderer(this);
		bone170.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone168.addChild(bone170);
		setRotationAngle(bone170, 0.0F, -0.5236F, 0.0F);
		bone170.setTextureOffset(0, 0).addBox(-19.0F, -315.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone170.setTextureOffset(0, 0).addBox(18.0F, -315.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone171 = new ModelRenderer(this);
		bone171.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone168.addChild(bone171);
		setRotationAngle(bone171, 0.0F, -1.0472F, 0.0F);
		bone171.setTextureOffset(0, 0).addBox(-19.0F, -315.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone171.setTextureOffset(0, 0).addBox(18.0F, -315.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone172 = new ModelRenderer(this);
		bone172.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone168.addChild(bone172);
		setRotationAngle(bone172, 0.0F, -1.5708F, 0.0F);
		bone172.setTextureOffset(0, 0).addBox(-19.0F, -315.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone172.setTextureOffset(0, 0).addBox(18.0F, -315.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone173 = new ModelRenderer(this);
		bone173.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone168.addChild(bone173);
		setRotationAngle(bone173, 0.0F, -2.0944F, 0.0F);
		bone173.setTextureOffset(0, 0).addBox(-19.0F, -315.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone173.setTextureOffset(0, 0).addBox(18.0F, -315.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone174 = new ModelRenderer(this);
		bone174.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone168.addChild(bone174);
		setRotationAngle(bone174, 0.0F, -2.618F, 0.0F);
		bone174.setTextureOffset(0, 0).addBox(-19.0F, -315.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone174.setTextureOffset(0, 0).addBox(18.0F, -315.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone175 = new ModelRenderer(this);
		bone175.setRotationPoint(0.0F, 0.0F, 0.0F);
		rocket2.addChild(bone175);
		

		bone176 = new ModelRenderer(this);
		bone176.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone175.addChild(bone176);
		bone176.setTextureOffset(0, 0).addBox(-19.0F, -245.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone176.setTextureOffset(0, 0).addBox(18.0F, -245.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone177 = new ModelRenderer(this);
		bone177.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone175.addChild(bone177);
		setRotationAngle(bone177, 0.0F, -0.5236F, 0.0F);
		bone177.setTextureOffset(0, 0).addBox(-19.0F, -245.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone177.setTextureOffset(0, 0).addBox(18.0F, -245.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone178 = new ModelRenderer(this);
		bone178.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone175.addChild(bone178);
		setRotationAngle(bone178, 0.0F, -1.0472F, 0.0F);
		bone178.setTextureOffset(0, 0).addBox(-19.0F, -245.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone178.setTextureOffset(0, 0).addBox(18.0F, -245.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone179 = new ModelRenderer(this);
		bone179.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone175.addChild(bone179);
		setRotationAngle(bone179, 0.0F, -1.5708F, 0.0F);
		bone179.setTextureOffset(0, 0).addBox(-19.0F, -245.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone179.setTextureOffset(0, 0).addBox(18.0F, -245.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone180 = new ModelRenderer(this);
		bone180.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone175.addChild(bone180);
		setRotationAngle(bone180, 0.0F, -2.0944F, 0.0F);
		bone180.setTextureOffset(0, 0).addBox(-19.0F, -245.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone180.setTextureOffset(0, 0).addBox(18.0F, -245.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone181 = new ModelRenderer(this);
		bone181.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone175.addChild(bone181);
		setRotationAngle(bone181, 0.0F, -2.618F, 0.0F);
		bone181.setTextureOffset(0, 0).addBox(-19.0F, -245.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone181.setTextureOffset(0, 0).addBox(18.0F, -245.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone182 = new ModelRenderer(this);
		bone182.setRotationPoint(0.0F, 0.0F, 0.0F);
		rocket2.addChild(bone182);
		

		bone183 = new ModelRenderer(this);
		bone183.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone182.addChild(bone183);
		bone183.setTextureOffset(0, 0).addBox(-19.0F, -175.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone183.setTextureOffset(0, 0).addBox(18.0F, -175.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone184 = new ModelRenderer(this);
		bone184.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone182.addChild(bone184);
		setRotationAngle(bone184, 0.0F, -0.5236F, 0.0F);
		bone184.setTextureOffset(0, 0).addBox(-19.0F, -175.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone184.setTextureOffset(0, 0).addBox(18.0F, -175.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone185 = new ModelRenderer(this);
		bone185.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone182.addChild(bone185);
		setRotationAngle(bone185, 0.0F, -1.0472F, 0.0F);
		bone185.setTextureOffset(0, 0).addBox(-19.0F, -175.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone185.setTextureOffset(0, 0).addBox(18.0F, -175.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone186 = new ModelRenderer(this);
		bone186.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone182.addChild(bone186);
		setRotationAngle(bone186, 0.0F, -1.5708F, 0.0F);
		bone186.setTextureOffset(0, 0).addBox(-19.0F, -175.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone186.setTextureOffset(0, 0).addBox(18.0F, -175.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone187 = new ModelRenderer(this);
		bone187.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone182.addChild(bone187);
		setRotationAngle(bone187, 0.0F, -2.0944F, 0.0F);
		bone187.setTextureOffset(0, 0).addBox(-19.0F, -175.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone187.setTextureOffset(0, 0).addBox(18.0F, -175.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone188 = new ModelRenderer(this);
		bone188.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone182.addChild(bone188);
		setRotationAngle(bone188, 0.0F, -2.618F, 0.0F);
		bone188.setTextureOffset(0, 0).addBox(-19.0F, -175.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone188.setTextureOffset(0, 0).addBox(18.0F, -175.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone189 = new ModelRenderer(this);
		bone189.setRotationPoint(0.0F, 0.0F, 0.0F);
		rocket2.addChild(bone189);
		

		bone190 = new ModelRenderer(this);
		bone190.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone189.addChild(bone190);
		bone190.setTextureOffset(0, 0).addBox(-19.0F, -105.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone190.setTextureOffset(0, 0).addBox(18.0F, -105.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone191 = new ModelRenderer(this);
		bone191.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone189.addChild(bone191);
		setRotationAngle(bone191, 0.0F, -0.5236F, 0.0F);
		bone191.setTextureOffset(0, 0).addBox(-19.0F, -105.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone191.setTextureOffset(0, 0).addBox(18.0F, -105.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone192 = new ModelRenderer(this);
		bone192.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone189.addChild(bone192);
		setRotationAngle(bone192, 0.0F, -1.0472F, 0.0F);
		bone192.setTextureOffset(0, 0).addBox(-19.0F, -105.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone192.setTextureOffset(0, 0).addBox(18.0F, -105.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone193 = new ModelRenderer(this);
		bone193.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone189.addChild(bone193);
		setRotationAngle(bone193, 0.0F, -1.5708F, 0.0F);
		bone193.setTextureOffset(0, 0).addBox(-19.0F, -105.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone193.setTextureOffset(0, 0).addBox(18.0F, -105.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone194 = new ModelRenderer(this);
		bone194.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone189.addChild(bone194);
		setRotationAngle(bone194, 0.0F, -2.0944F, 0.0F);
		bone194.setTextureOffset(0, 0).addBox(-19.0F, -105.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone194.setTextureOffset(0, 0).addBox(18.0F, -105.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone195 = new ModelRenderer(this);
		bone195.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone189.addChild(bone195);
		setRotationAngle(bone195, 0.0F, -2.618F, 0.0F);
		bone195.setTextureOffset(0, 0).addBox(-19.0F, -105.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone195.setTextureOffset(0, 0).addBox(18.0F, -105.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone196 = new ModelRenderer(this);
		bone196.setRotationPoint(0.0F, 69.0F, 0.0F);
		rocket2.addChild(bone196);
		

		bone197 = new ModelRenderer(this);
		bone197.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone196.addChild(bone197);
		bone197.setTextureOffset(0, 0).addBox(-19.0F, -105.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone197.setTextureOffset(0, 0).addBox(18.0F, -105.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone198 = new ModelRenderer(this);
		bone198.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone196.addChild(bone198);
		setRotationAngle(bone198, 0.0F, -0.5236F, 0.0F);
		bone198.setTextureOffset(0, 0).addBox(-19.0F, -105.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone198.setTextureOffset(0, 0).addBox(18.0F, -105.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone199 = new ModelRenderer(this);
		bone199.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone196.addChild(bone199);
		setRotationAngle(bone199, 0.0F, -1.0472F, 0.0F);
		bone199.setTextureOffset(0, 0).addBox(-19.0F, -105.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone199.setTextureOffset(0, 0).addBox(18.0F, -105.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone200 = new ModelRenderer(this);
		bone200.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone196.addChild(bone200);
		setRotationAngle(bone200, 0.0F, -1.5708F, 0.0F);
		bone200.setTextureOffset(0, 0).addBox(-19.0F, -105.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone200.setTextureOffset(0, 0).addBox(18.0F, -105.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone201 = new ModelRenderer(this);
		bone201.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone196.addChild(bone201);
		setRotationAngle(bone201, 0.0F, -2.0944F, 0.0F);
		bone201.setTextureOffset(0, 0).addBox(-19.0F, -105.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone201.setTextureOffset(0, 0).addBox(18.0F, -105.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone202 = new ModelRenderer(this);
		bone202.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone196.addChild(bone202);
		setRotationAngle(bone202, 0.0F, -2.618F, 0.0F);
		bone202.setTextureOffset(0, 0).addBox(-19.0F, -105.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone202.setTextureOffset(0, 0).addBox(18.0F, -105.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone203 = new ModelRenderer(this);
		bone203.setRotationPoint(0.0F, 69.0F, 0.0F);
		rocket2.addChild(bone203);
		

		bone204 = new ModelRenderer(this);
		bone204.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone203.addChild(bone204);
		bone204.setTextureOffset(0, 80).addBox(-19.0F, -35.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone204.setTextureOffset(0, 80).addBox(18.0F, -35.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone205 = new ModelRenderer(this);
		bone205.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone203.addChild(bone205);
		setRotationAngle(bone205, 0.0F, -0.5236F, 0.0F);
		bone205.setTextureOffset(0, 80).addBox(-19.0F, -35.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone205.setTextureOffset(0, 80).addBox(18.0F, -35.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone206 = new ModelRenderer(this);
		bone206.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone203.addChild(bone206);
		setRotationAngle(bone206, 0.0F, -1.0472F, 0.0F);
		bone206.setTextureOffset(0, 80).addBox(-19.0F, -35.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone206.setTextureOffset(0, 80).addBox(18.0F, -35.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone207 = new ModelRenderer(this);
		bone207.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone203.addChild(bone207);
		setRotationAngle(bone207, 0.0F, -1.5708F, 0.0F);
		bone207.setTextureOffset(0, 80).addBox(-19.0F, -35.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone207.setTextureOffset(0, 80).addBox(18.0F, -35.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone208 = new ModelRenderer(this);
		bone208.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone203.addChild(bone208);
		setRotationAngle(bone208, 0.0F, -2.0944F, 0.0F);
		bone208.setTextureOffset(0, 80).addBox(-19.0F, -35.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone208.setTextureOffset(0, 80).addBox(18.0F, -35.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone209 = new ModelRenderer(this);
		bone209.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone203.addChild(bone209);
		setRotationAngle(bone209, 0.0F, -2.618F, 0.0F);
		bone209.setTextureOffset(0, 80).addBox(-19.0F, -35.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone209.setTextureOffset(0, 80).addBox(18.0F, -35.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone210 = new ModelRenderer(this);
		bone210.setRotationPoint(0.0F, -4.0F, 0.0F);
		rocket2.addChild(bone210);
		bone210.setTextureOffset(24, 0).addBox(-5.0F, 68.0F, -18.0F, 10.0F, 1.0F, 36.0F, 0.0F, false);
		bone210.setTextureOffset(24, 0).addBox(-5.0F, 68.0F, -18.0F, 10.0F, 1.0F, 36.0F, 0.0F, false);
		bone210.setTextureOffset(24, 0).addBox(-5.0F, 68.0F, -18.0F, 10.0F, 1.0F, 36.0F, 0.0F, false);
		bone210.setTextureOffset(24, 0).addBox(-5.0F, 68.0F, -18.0F, 10.0F, 1.0F, 36.0F, 0.0F, false);
		bone210.setTextureOffset(24, 0).addBox(-5.0F, 68.0F, -18.0F, 10.0F, 1.0F, 36.0F, 0.0F, false);
		bone210.setTextureOffset(24, 0).addBox(-5.0F, 68.0F, -18.0F, 10.0F, 1.0F, 36.0F, 0.0F, false);

		bone211 = new ModelRenderer(this);
		bone211.setRotationPoint(0.0F, -483.0F, 0.0F);
		rocket2.addChild(bone211);
		bone211.setTextureOffset(24, 0).addBox(-5.0F, 68.0F, -18.0F, 10.0F, 1.0F, 36.0F, 0.0F, false);
		bone211.setTextureOffset(24, 0).addBox(-5.0F, 68.0F, -18.0F, 10.0F, 1.0F, 36.0F, 0.0F, false);
		bone211.setTextureOffset(24, 0).addBox(-5.0F, 68.0F, -18.0F, 10.0F, 1.0F, 36.0F, 0.0F, false);
		bone211.setTextureOffset(24, 0).addBox(-5.0F, 68.0F, -18.0F, 10.0F, 1.0F, 36.0F, 0.0F, false);
		bone211.setTextureOffset(24, 0).addBox(-5.0F, 68.0F, -18.0F, 10.0F, 1.0F, 36.0F, 0.0F, false);
		bone211.setTextureOffset(24, 0).addBox(-5.0F, 68.0F, -18.0F, 10.0F, 1.0F, 36.0F, 0.0F, false);

		boosters2 = new ModelRenderer(this);
		boosters2.setRotationPoint(0.0F, 0.0F, 0.0F);
		falcon_left.addChild(boosters2);
		

		merlin10 = new ModelRenderer(this);
		merlin10.setRotationPoint(0.0F, 0.0F, 0.0F);
		boosters2.addChild(merlin10);
		merlin10.setTextureOffset(33, 0).addBox(-3.0F, -11.0F, -3.0F, 6.0F, 9.0F, 6.0F, 0.0F, false);

		bone212 = new ModelRenderer(this);
		bone212.setRotationPoint(0.0F, -3.0F, 0.0F);
		merlin10.addChild(bone212);
		bone212.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone212.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		bone213 = new ModelRenderer(this);
		bone213.setRotationPoint(0.0F, -3.0F, 0.0F);
		merlin10.addChild(bone213);
		setRotationAngle(bone213, 0.0F, -0.7854F, 0.0F);
		bone213.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone213.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		bone214 = new ModelRenderer(this);
		bone214.setRotationPoint(0.0F, -3.0F, 0.0F);
		merlin10.addChild(bone214);
		setRotationAngle(bone214, 0.0F, -1.5708F, 0.0F);
		bone214.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone214.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		bone215 = new ModelRenderer(this);
		bone215.setRotationPoint(0.0F, -3.0F, 0.0F);
		merlin10.addChild(bone215);
		setRotationAngle(bone215, 0.0F, -2.3562F, 0.0F);
		bone215.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone215.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		merlin11 = new ModelRenderer(this);
		merlin11.setRotationPoint(0.0F, 0.0F, 0.0F);
		boosters2.addChild(merlin11);
		merlin11.setTextureOffset(33, 0).addBox(-16.5F, -11.0F, -3.0F, 6.0F, 9.0F, 6.0F, 0.0F, false);

		bone216 = new ModelRenderer(this);
		bone216.setRotationPoint(-13.5F, -3.0F, 0.0F);
		merlin11.addChild(bone216);
		bone216.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone216.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		bone217 = new ModelRenderer(this);
		bone217.setRotationPoint(-13.5F, -3.0F, 0.0F);
		merlin11.addChild(bone217);
		setRotationAngle(bone217, 0.0F, -0.7854F, 0.0F);
		bone217.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone217.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		bone218 = new ModelRenderer(this);
		bone218.setRotationPoint(-13.5F, -3.0F, 0.0F);
		merlin11.addChild(bone218);
		setRotationAngle(bone218, 0.0F, -1.5708F, 0.0F);
		bone218.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone218.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		bone219 = new ModelRenderer(this);
		bone219.setRotationPoint(-13.5F, -3.0F, 0.0F);
		merlin11.addChild(bone219);
		setRotationAngle(bone219, 0.0F, -2.3562F, 0.0F);
		bone219.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone219.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		merlin12 = new ModelRenderer(this);
		merlin12.setRotationPoint(0.0F, 0.0F, 0.0F);
		boosters2.addChild(merlin12);
		setRotationAngle(merlin12, 0.0F, -0.7854F, 0.0F);
		merlin12.setTextureOffset(33, 0).addBox(-16.5F, -11.0F, -3.0F, 6.0F, 9.0F, 6.0F, 0.0F, false);

		bone220 = new ModelRenderer(this);
		bone220.setRotationPoint(-13.5F, -3.0F, 0.0F);
		merlin12.addChild(bone220);
		bone220.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone220.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		bone221 = new ModelRenderer(this);
		bone221.setRotationPoint(-13.5F, -3.0F, 0.0F);
		merlin12.addChild(bone221);
		setRotationAngle(bone221, 0.0F, -0.7854F, 0.0F);
		bone221.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone221.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		bone222 = new ModelRenderer(this);
		bone222.setRotationPoint(-13.5F, -3.0F, 0.0F);
		merlin12.addChild(bone222);
		setRotationAngle(bone222, 0.0F, -1.5708F, 0.0F);
		bone222.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone222.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		bone223 = new ModelRenderer(this);
		bone223.setRotationPoint(-13.5F, -3.0F, 0.0F);
		merlin12.addChild(bone223);
		setRotationAngle(bone223, 0.0F, -2.3562F, 0.0F);
		bone223.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone223.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		merlin13 = new ModelRenderer(this);
		merlin13.setRotationPoint(0.0F, 0.0F, 0.0F);
		boosters2.addChild(merlin13);
		setRotationAngle(merlin13, 0.0F, -1.5708F, 0.0F);
		merlin13.setTextureOffset(33, 0).addBox(-16.5F, -11.0F, -3.0F, 6.0F, 9.0F, 6.0F, 0.0F, false);

		bone224 = new ModelRenderer(this);
		bone224.setRotationPoint(-13.5F, -3.0F, 0.0F);
		merlin13.addChild(bone224);
		bone224.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone224.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		bone225 = new ModelRenderer(this);
		bone225.setRotationPoint(-13.5F, -3.0F, 0.0F);
		merlin13.addChild(bone225);
		setRotationAngle(bone225, 0.0F, -0.7854F, 0.0F);
		bone225.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone225.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		bone226 = new ModelRenderer(this);
		bone226.setRotationPoint(-13.5F, -3.0F, 0.0F);
		merlin13.addChild(bone226);
		setRotationAngle(bone226, 0.0F, -1.5708F, 0.0F);
		bone226.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone226.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		bone227 = new ModelRenderer(this);
		bone227.setRotationPoint(-13.5F, -3.0F, 0.0F);
		merlin13.addChild(bone227);
		setRotationAngle(bone227, 0.0F, -2.3562F, 0.0F);
		bone227.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone227.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		merlin14 = new ModelRenderer(this);
		merlin14.setRotationPoint(0.0F, 0.0F, 0.0F);
		boosters2.addChild(merlin14);
		setRotationAngle(merlin14, 0.0F, -2.3562F, 0.0F);
		merlin14.setTextureOffset(33, 0).addBox(-16.5F, -11.0F, -3.0F, 6.0F, 9.0F, 6.0F, 0.0F, false);

		bone228 = new ModelRenderer(this);
		bone228.setRotationPoint(-13.5F, -3.0F, 0.0F);
		merlin14.addChild(bone228);
		bone228.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone228.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		bone229 = new ModelRenderer(this);
		bone229.setRotationPoint(-13.5F, -3.0F, 0.0F);
		merlin14.addChild(bone229);
		setRotationAngle(bone229, 0.0F, -0.7854F, 0.0F);
		bone229.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone229.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		bone230 = new ModelRenderer(this);
		bone230.setRotationPoint(-13.5F, -3.0F, 0.0F);
		merlin14.addChild(bone230);
		setRotationAngle(bone230, 0.0F, -1.5708F, 0.0F);
		bone230.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone230.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		bone231 = new ModelRenderer(this);
		bone231.setRotationPoint(-13.5F, -3.0F, 0.0F);
		merlin14.addChild(bone231);
		setRotationAngle(bone231, 0.0F, -2.3562F, 0.0F);
		bone231.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone231.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		merlin15 = new ModelRenderer(this);
		merlin15.setRotationPoint(0.0F, 0.0F, 0.0F);
		boosters2.addChild(merlin15);
		setRotationAngle(merlin15, 0.0F, 3.1416F, 0.0F);
		merlin15.setTextureOffset(33, 0).addBox(-16.5F, -11.0F, -3.0F, 6.0F, 9.0F, 6.0F, 0.0F, false);

		bone232 = new ModelRenderer(this);
		bone232.setRotationPoint(-13.5F, -3.0F, 0.0F);
		merlin15.addChild(bone232);
		bone232.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone232.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		bone233 = new ModelRenderer(this);
		bone233.setRotationPoint(-13.5F, -3.0F, 0.0F);
		merlin15.addChild(bone233);
		setRotationAngle(bone233, 0.0F, -0.7854F, 0.0F);
		bone233.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone233.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		bone234 = new ModelRenderer(this);
		bone234.setRotationPoint(-13.5F, -3.0F, 0.0F);
		merlin15.addChild(bone234);
		setRotationAngle(bone234, 0.0F, -1.5708F, 0.0F);
		bone234.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone234.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		bone235 = new ModelRenderer(this);
		bone235.setRotationPoint(-13.5F, -3.0F, 0.0F);
		merlin15.addChild(bone235);
		setRotationAngle(bone235, 0.0F, -2.3562F, 0.0F);
		bone235.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone235.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		merlin16 = new ModelRenderer(this);
		merlin16.setRotationPoint(0.0F, 0.0F, 0.0F);
		boosters2.addChild(merlin16);
		setRotationAngle(merlin16, 0.0F, 2.3562F, 0.0F);
		merlin16.setTextureOffset(33, 0).addBox(-16.5F, -11.0F, -3.0F, 6.0F, 9.0F, 6.0F, 0.0F, false);

		bone236 = new ModelRenderer(this);
		bone236.setRotationPoint(-13.5F, -3.0F, 0.0F);
		merlin16.addChild(bone236);
		bone236.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone236.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		bone237 = new ModelRenderer(this);
		bone237.setRotationPoint(-13.5F, -3.0F, 0.0F);
		merlin16.addChild(bone237);
		setRotationAngle(bone237, 0.0F, -0.7854F, 0.0F);
		bone237.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone237.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		bone238 = new ModelRenderer(this);
		bone238.setRotationPoint(-13.5F, -3.0F, 0.0F);
		merlin16.addChild(bone238);
		setRotationAngle(bone238, 0.0F, -1.5708F, 0.0F);
		bone238.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone238.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		bone239 = new ModelRenderer(this);
		bone239.setRotationPoint(-13.5F, -3.0F, 0.0F);
		merlin16.addChild(bone239);
		setRotationAngle(bone239, 0.0F, -2.3562F, 0.0F);
		bone239.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone239.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		merlin17 = new ModelRenderer(this);
		merlin17.setRotationPoint(0.0F, 0.0F, 0.0F);
		boosters2.addChild(merlin17);
		setRotationAngle(merlin17, 0.0F, 1.5708F, 0.0F);
		merlin17.setTextureOffset(33, 0).addBox(-16.5F, -11.0F, -3.0F, 6.0F, 9.0F, 6.0F, 0.0F, false);

		bone240 = new ModelRenderer(this);
		bone240.setRotationPoint(-13.5F, -3.0F, 0.0F);
		merlin17.addChild(bone240);
		bone240.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone240.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		bone241 = new ModelRenderer(this);
		bone241.setRotationPoint(-13.5F, -3.0F, 0.0F);
		merlin17.addChild(bone241);
		setRotationAngle(bone241, 0.0F, -0.7854F, 0.0F);
		bone241.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone241.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		bone242 = new ModelRenderer(this);
		bone242.setRotationPoint(-13.5F, -3.0F, 0.0F);
		merlin17.addChild(bone242);
		setRotationAngle(bone242, 0.0F, -1.5708F, 0.0F);
		bone242.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone242.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		bone243 = new ModelRenderer(this);
		bone243.setRotationPoint(-13.5F, -3.0F, 0.0F);
		merlin17.addChild(bone243);
		setRotationAngle(bone243, 0.0F, -2.3562F, 0.0F);
		bone243.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone243.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		merlin18 = new ModelRenderer(this);
		merlin18.setRotationPoint(0.0F, 0.0F, 0.0F);
		boosters2.addChild(merlin18);
		setRotationAngle(merlin18, 0.0F, 0.7854F, 0.0F);
		merlin18.setTextureOffset(33, 0).addBox(-16.5F, -11.0F, -3.0F, 6.0F, 9.0F, 6.0F, 0.0F, false);

		bone244 = new ModelRenderer(this);
		bone244.setRotationPoint(-13.5F, -3.0F, 0.0F);
		merlin18.addChild(bone244);
		bone244.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone244.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		bone245 = new ModelRenderer(this);
		bone245.setRotationPoint(-13.5F, -3.0F, 0.0F);
		merlin18.addChild(bone245);
		setRotationAngle(bone245, 0.0F, -0.7854F, 0.0F);
		bone245.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone245.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		bone246 = new ModelRenderer(this);
		bone246.setRotationPoint(-13.5F, -3.0F, 0.0F);
		merlin18.addChild(bone246);
		setRotationAngle(bone246, 0.0F, -1.5708F, 0.0F);
		bone246.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone246.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		bone247 = new ModelRenderer(this);
		bone247.setRotationPoint(-13.5F, -3.0F, 0.0F);
		merlin18.addChild(bone247);
		setRotationAngle(bone247, 0.0F, -2.3562F, 0.0F);
		bone247.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone247.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		legs_main2 = new ModelRenderer(this);
		legs_main2.setRotationPoint(0.0F, 0.0F, 0.0F);
		falcon_left.addChild(legs_main2);
		setRotationAngle(legs_main2, 0.0F, -0.7854F, 0.0F);
		

		leg5 = new ModelRenderer(this);
		leg5.setRotationPoint(0.0F, 0.0F, 0.0F);
		legs_main2.addChild(leg5);
		leg5.setTextureOffset(69, 141).addBox(-6.0F, -117.0F, -20.0F, 1.0F, 110.0F, 5.0F, 0.0F, false);
		leg5.setTextureOffset(69, 141).addBox(5.0F, -117.0F, -20.0F, 1.0F, 110.0F, 5.0F, 0.0F, false);
		leg5.setTextureOffset(69, 141).addBox(5.8277F, -56.5317F, -22.0F, 1.0F, 50.0F, 5.0F, 0.0F, false);
		leg5.setTextureOffset(69, 141).addBox(-6.8277F, -56.5317F, -22.0F, 1.0F, 50.0F, 5.0F, 0.0F, false);
		leg5.setTextureOffset(66, 250).addBox(-2.0F, -56.0F, -24.0F, 4.0F, 1.0F, 5.0F, 0.0F, false);
		leg5.setTextureOffset(66, 250).addBox(-1.5F, -117.0F, -20.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		leg5.setTextureOffset(70, 194).addBox(-1.5F, -116.5F, -20.5F, 3.0F, 61.0F, 1.0F, 0.0F, false);
		leg5.setTextureOffset(70, 194).addBox(1.019F, -56.2519F, -22.2142F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		leg5.setTextureOffset(70, 194).addBox(-6.981F, -56.2519F, -22.2142F, 6.0F, 1.0F, 1.0F, 0.0F, false);

		bone248 = new ModelRenderer(this);
		bone248.setRotationPoint(-4.6653F, -69.251F, -23.0365F);
		leg5.addChild(bone248);
		bone248.setTextureOffset(70, 194).addBox(0.2F, -37.0F, -0.5F, 2.0F, 51.0F, 1.0F, 0.0F, false);
		bone248.setTextureOffset(70, 194).addBox(-0.8F, -23.0F, -0.5F, 1.0F, 37.0F, 1.0F, 0.0F, false);
		bone248.setTextureOffset(70, 194).addBox(-1.8F, -8.0F, -0.5F, 1.0F, 22.0F, 1.0F, 0.0F, false);
		bone248.setTextureOffset(70, 194).addBox(-2.8F, 1.0F, -0.5F, 1.0F, 13.0F, 1.0F, 0.0F, false);
		bone248.setTextureOffset(70, 194).addBox(2.2F, -3.0F, -0.5F, 1.0F, 17.0F, 1.0F, 0.0F, false);

		bone249 = new ModelRenderer(this);
		bone249.setRotationPoint(4.8347F, -69.251F, -23.0365F);
		leg5.addChild(bone249);
		setRotationAngle(bone249, 0.0F, -1.2217F, 0.0F);
		bone249.setTextureOffset(70, 194).addBox(-1.8F, -37.0F, -0.5F, 2.0F, 51.0F, 1.0F, 0.0F, false);
		bone249.setTextureOffset(70, 194).addBox(0.2F, -23.0F, -0.5F, 1.0F, 37.0F, 1.0F, 0.0F, false);
		bone249.setTextureOffset(70, 194).addBox(1.2F, -8.0F, -0.5F, 1.0F, 22.0F, 1.0F, 0.0F, false);
		bone249.setTextureOffset(70, 194).addBox(2.2F, 1.0F, -0.5F, 1.0F, 13.0F, 1.0F, 0.0F, false);
		bone249.setTextureOffset(70, 194).addBox(-2.8F, -3.0F, -0.5F, 1.0F, 17.0F, 1.0F, 0.0F, false);

		bone250 = new ModelRenderer(this);
		bone250.setRotationPoint(7.0347F, -55.251F, -23.0365F);
		leg5.addChild(bone250);
		bone250.setTextureOffset(70, 194).addBox(0.6683F, -0.0105F, 3.2577F, 1.0F, 41.0F, 1.0F, 0.0F, false);
		bone250.setTextureOffset(70, 194).addBox(-0.3317F, -0.0105F, 3.2577F, 1.0F, 34.0F, 1.0F, 0.0F, false);
		bone250.setTextureOffset(70, 194).addBox(-1.3317F, -0.0105F, 3.2577F, 1.0F, 27.0F, 1.0F, 0.0F, false);
		bone250.setTextureOffset(70, 194).addBox(-2.3317F, -0.0105F, 3.2577F, 1.0F, 19.0F, 1.0F, 0.0F, false);
		bone250.setTextureOffset(70, 194).addBox(-3.3317F, -0.0105F, 3.2577F, 1.0F, 11.0F, 1.0F, 0.0F, false);
		bone250.setTextureOffset(70, 194).addBox(-3.8317F, -1.0105F, 3.2577F, 5.0F, 1.0F, 1.0F, 0.0F, false);

		bone251 = new ModelRenderer(this);
		bone251.setRotationPoint(6.6614F, -43.3447F, -14.2788F);
		leg5.addChild(bone251);
		setRotationAngle(bone251, -0.0873F, 0.6109F, 0.0F);
		bone251.setTextureOffset(70, 194).addBox(-8.3368F, -9.9474F, -13.9985F, 1.0F, 41.0F, 1.0F, 0.0F, false);
		bone251.setTextureOffset(70, 194).addBox(-7.3368F, -9.9474F, -13.9985F, 1.0F, 34.0F, 1.0F, 0.0F, false);
		bone251.setTextureOffset(70, 194).addBox(-6.3368F, -9.9474F, -13.9985F, 1.0F, 27.0F, 1.0F, 0.0F, false);
		bone251.setTextureOffset(70, 194).addBox(-5.3368F, -9.9474F, -13.9985F, 1.0F, 19.0F, 1.0F, 0.0F, false);
		bone251.setTextureOffset(70, 194).addBox(-4.3368F, -9.9474F, -13.9985F, 1.0F, 11.0F, 1.0F, 0.0F, false);
		bone251.setTextureOffset(70, 194).addBox(-8.3368F, -10.9474F, -13.9985F, 5.0F, 1.0F, 1.0F, 0.0F, false);

		leg6 = new ModelRenderer(this);
		leg6.setRotationPoint(0.0F, 0.0F, 0.0F);
		legs_main2.addChild(leg6);
		setRotationAngle(leg6, 0.0F, -1.5708F, 0.0F);
		leg6.setTextureOffset(69, 141).addBox(-6.0F, -117.0F, -20.0F, 1.0F, 110.0F, 5.0F, 0.0F, false);
		leg6.setTextureOffset(69, 141).addBox(5.0F, -117.0F, -20.0F, 1.0F, 110.0F, 5.0F, 0.0F, false);
		leg6.setTextureOffset(69, 141).addBox(5.8277F, -56.5317F, -22.0F, 1.0F, 50.0F, 5.0F, 0.0F, false);
		leg6.setTextureOffset(69, 141).addBox(-6.8277F, -56.5317F, -22.0F, 1.0F, 50.0F, 5.0F, 0.0F, false);
		leg6.setTextureOffset(66, 250).addBox(-2.0F, -56.0F, -24.0F, 4.0F, 1.0F, 5.0F, 0.0F, false);
		leg6.setTextureOffset(66, 250).addBox(-1.5F, -117.0F, -20.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		leg6.setTextureOffset(70, 194).addBox(-1.5F, -116.5F, -20.5F, 3.0F, 61.0F, 1.0F, 0.0F, false);
		leg6.setTextureOffset(70, 194).addBox(1.019F, -56.2519F, -22.2142F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		leg6.setTextureOffset(70, 194).addBox(-6.981F, -56.2519F, -22.2142F, 6.0F, 1.0F, 1.0F, 0.0F, false);

		bone252 = new ModelRenderer(this);
		bone252.setRotationPoint(-4.6653F, -69.251F, -23.0365F);
		leg6.addChild(bone252);
		bone252.setTextureOffset(70, 194).addBox(0.2F, -37.0F, -0.5F, 2.0F, 51.0F, 1.0F, 0.0F, false);
		bone252.setTextureOffset(70, 194).addBox(-0.8F, -23.0F, -0.5F, 1.0F, 37.0F, 1.0F, 0.0F, false);
		bone252.setTextureOffset(70, 194).addBox(-1.8F, -8.0F, -0.5F, 1.0F, 22.0F, 1.0F, 0.0F, false);
		bone252.setTextureOffset(70, 194).addBox(-2.8F, 1.0F, -0.5F, 1.0F, 13.0F, 1.0F, 0.0F, false);
		bone252.setTextureOffset(70, 194).addBox(2.2F, -3.0F, -0.5F, 1.0F, 17.0F, 1.0F, 0.0F, false);

		bone253 = new ModelRenderer(this);
		bone253.setRotationPoint(4.8347F, -69.251F, -23.0365F);
		leg6.addChild(bone253);
		setRotationAngle(bone253, 0.0F, -1.2217F, 0.0F);
		bone253.setTextureOffset(70, 194).addBox(-1.8F, -37.0F, -0.5F, 2.0F, 51.0F, 1.0F, 0.0F, false);
		bone253.setTextureOffset(70, 194).addBox(0.2F, -23.0F, -0.5F, 1.0F, 37.0F, 1.0F, 0.0F, false);
		bone253.setTextureOffset(70, 194).addBox(1.2F, -8.0F, -0.5F, 1.0F, 22.0F, 1.0F, 0.0F, false);
		bone253.setTextureOffset(70, 194).addBox(2.2F, 1.0F, -0.5F, 1.0F, 13.0F, 1.0F, 0.0F, false);
		bone253.setTextureOffset(70, 194).addBox(-2.8F, -3.0F, -0.5F, 1.0F, 17.0F, 1.0F, 0.0F, false);

		bone254 = new ModelRenderer(this);
		bone254.setRotationPoint(7.0347F, -55.251F, -23.0365F);
		leg6.addChild(bone254);
		bone254.setTextureOffset(70, 194).addBox(0.6683F, -0.0105F, 3.2577F, 1.0F, 41.0F, 1.0F, 0.0F, false);
		bone254.setTextureOffset(70, 194).addBox(-0.3317F, -0.0105F, 3.2577F, 1.0F, 34.0F, 1.0F, 0.0F, false);
		bone254.setTextureOffset(70, 194).addBox(-1.3317F, -0.0105F, 3.2577F, 1.0F, 27.0F, 1.0F, 0.0F, false);
		bone254.setTextureOffset(70, 194).addBox(-2.3317F, -0.0105F, 3.2577F, 1.0F, 19.0F, 1.0F, 0.0F, false);
		bone254.setTextureOffset(70, 194).addBox(-3.3317F, -0.0105F, 3.2577F, 1.0F, 11.0F, 1.0F, 0.0F, false);
		bone254.setTextureOffset(70, 194).addBox(-3.8317F, -1.0105F, 3.2577F, 5.0F, 1.0F, 1.0F, 0.0F, false);

		bone255 = new ModelRenderer(this);
		bone255.setRotationPoint(6.6614F, -43.3447F, -14.2788F);
		leg6.addChild(bone255);
		setRotationAngle(bone255, -0.0873F, 0.6109F, 0.0F);
		bone255.setTextureOffset(70, 194).addBox(-8.3368F, -9.9474F, -13.9985F, 1.0F, 41.0F, 1.0F, 0.0F, false);
		bone255.setTextureOffset(70, 194).addBox(-7.3368F, -9.9474F, -13.9985F, 1.0F, 34.0F, 1.0F, 0.0F, false);
		bone255.setTextureOffset(70, 194).addBox(-6.3368F, -9.9474F, -13.9985F, 1.0F, 27.0F, 1.0F, 0.0F, false);
		bone255.setTextureOffset(70, 194).addBox(-5.3368F, -9.9474F, -13.9985F, 1.0F, 19.0F, 1.0F, 0.0F, false);
		bone255.setTextureOffset(70, 194).addBox(-4.3368F, -9.9474F, -13.9985F, 1.0F, 11.0F, 1.0F, 0.0F, false);
		bone255.setTextureOffset(70, 194).addBox(-8.3368F, -10.9474F, -13.9985F, 5.0F, 1.0F, 1.0F, 0.0F, false);

		leg7 = new ModelRenderer(this);
		leg7.setRotationPoint(0.0F, 0.0F, 0.0F);
		legs_main2.addChild(leg7);
		setRotationAngle(leg7, 0.0F, 3.1416F, 0.0F);
		leg7.setTextureOffset(69, 141).addBox(-6.0F, -117.0F, -20.0F, 1.0F, 110.0F, 5.0F, 0.0F, false);
		leg7.setTextureOffset(69, 141).addBox(5.0F, -117.0F, -20.0F, 1.0F, 110.0F, 5.0F, 0.0F, false);
		leg7.setTextureOffset(69, 141).addBox(5.8277F, -56.5317F, -22.0F, 1.0F, 50.0F, 5.0F, 0.0F, false);
		leg7.setTextureOffset(69, 141).addBox(-6.8277F, -56.5317F, -22.0F, 1.0F, 50.0F, 5.0F, 0.0F, false);
		leg7.setTextureOffset(66, 250).addBox(-2.0F, -56.0F, -24.0F, 4.0F, 1.0F, 5.0F, 0.0F, false);
		leg7.setTextureOffset(66, 250).addBox(-1.5F, -117.0F, -20.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		leg7.setTextureOffset(70, 194).addBox(-1.5F, -116.5F, -20.5F, 3.0F, 61.0F, 1.0F, 0.0F, false);
		leg7.setTextureOffset(70, 194).addBox(1.019F, -56.2519F, -22.2142F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		leg7.setTextureOffset(70, 194).addBox(-6.981F, -56.2519F, -22.2142F, 6.0F, 1.0F, 1.0F, 0.0F, false);

		bone256 = new ModelRenderer(this);
		bone256.setRotationPoint(-4.6653F, -69.251F, -23.0365F);
		leg7.addChild(bone256);
		bone256.setTextureOffset(70, 194).addBox(0.2F, -37.0F, -0.5F, 2.0F, 51.0F, 1.0F, 0.0F, false);
		bone256.setTextureOffset(70, 194).addBox(-0.8F, -23.0F, -0.5F, 1.0F, 37.0F, 1.0F, 0.0F, false);
		bone256.setTextureOffset(70, 194).addBox(-1.8F, -8.0F, -0.5F, 1.0F, 22.0F, 1.0F, 0.0F, false);
		bone256.setTextureOffset(70, 194).addBox(-2.8F, 1.0F, -0.5F, 1.0F, 13.0F, 1.0F, 0.0F, false);
		bone256.setTextureOffset(70, 194).addBox(2.2F, -3.0F, -0.5F, 1.0F, 17.0F, 1.0F, 0.0F, false);

		bone257 = new ModelRenderer(this);
		bone257.setRotationPoint(4.8347F, -69.251F, -23.0365F);
		leg7.addChild(bone257);
		setRotationAngle(bone257, 0.0F, -1.2217F, 0.0F);
		bone257.setTextureOffset(70, 194).addBox(-1.8F, -37.0F, -0.5F, 2.0F, 51.0F, 1.0F, 0.0F, false);
		bone257.setTextureOffset(70, 194).addBox(0.2F, -23.0F, -0.5F, 1.0F, 37.0F, 1.0F, 0.0F, false);
		bone257.setTextureOffset(70, 194).addBox(1.2F, -8.0F, -0.5F, 1.0F, 22.0F, 1.0F, 0.0F, false);
		bone257.setTextureOffset(70, 194).addBox(2.2F, 1.0F, -0.5F, 1.0F, 13.0F, 1.0F, 0.0F, false);
		bone257.setTextureOffset(70, 194).addBox(-2.8F, -3.0F, -0.5F, 1.0F, 17.0F, 1.0F, 0.0F, false);

		bone258 = new ModelRenderer(this);
		bone258.setRotationPoint(7.0347F, -55.251F, -23.0365F);
		leg7.addChild(bone258);
		bone258.setTextureOffset(70, 194).addBox(0.6683F, -0.0105F, 3.2577F, 1.0F, 41.0F, 1.0F, 0.0F, false);
		bone258.setTextureOffset(70, 194).addBox(-0.3317F, -0.0105F, 3.2577F, 1.0F, 34.0F, 1.0F, 0.0F, false);
		bone258.setTextureOffset(70, 194).addBox(-1.3317F, -0.0105F, 3.2577F, 1.0F, 27.0F, 1.0F, 0.0F, false);
		bone258.setTextureOffset(70, 194).addBox(-2.3317F, -0.0105F, 3.2577F, 1.0F, 19.0F, 1.0F, 0.0F, false);
		bone258.setTextureOffset(70, 194).addBox(-3.3317F, -0.0105F, 3.2577F, 1.0F, 11.0F, 1.0F, 0.0F, false);
		bone258.setTextureOffset(70, 194).addBox(-3.8317F, -1.0105F, 3.2577F, 5.0F, 1.0F, 1.0F, 0.0F, false);

		bone259 = new ModelRenderer(this);
		bone259.setRotationPoint(6.6614F, -43.3447F, -14.2788F);
		leg7.addChild(bone259);
		setRotationAngle(bone259, -0.0873F, 0.6109F, 0.0F);
		bone259.setTextureOffset(70, 194).addBox(-8.3368F, -9.9474F, -13.9985F, 1.0F, 41.0F, 1.0F, 0.0F, false);
		bone259.setTextureOffset(70, 194).addBox(-7.3368F, -9.9474F, -13.9985F, 1.0F, 34.0F, 1.0F, 0.0F, false);
		bone259.setTextureOffset(70, 194).addBox(-6.3368F, -9.9474F, -13.9985F, 1.0F, 27.0F, 1.0F, 0.0F, false);
		bone259.setTextureOffset(70, 194).addBox(-5.3368F, -9.9474F, -13.9985F, 1.0F, 19.0F, 1.0F, 0.0F, false);
		bone259.setTextureOffset(70, 194).addBox(-4.3368F, -9.9474F, -13.9985F, 1.0F, 11.0F, 1.0F, 0.0F, false);
		bone259.setTextureOffset(70, 194).addBox(-8.3368F, -10.9474F, -13.9985F, 5.0F, 1.0F, 1.0F, 0.0F, false);

		leg8 = new ModelRenderer(this);
		leg8.setRotationPoint(0.0F, 0.0F, 0.0F);
		legs_main2.addChild(leg8);
		setRotationAngle(leg8, 0.0F, 1.5708F, 0.0F);
		leg8.setTextureOffset(69, 141).addBox(-6.0F, -117.0F, -20.0F, 1.0F, 110.0F, 5.0F, 0.0F, false);
		leg8.setTextureOffset(69, 141).addBox(5.0F, -117.0F, -20.0F, 1.0F, 110.0F, 5.0F, 0.0F, false);
		leg8.setTextureOffset(69, 141).addBox(5.8277F, -56.5317F, -22.0F, 1.0F, 50.0F, 5.0F, 0.0F, false);
		leg8.setTextureOffset(69, 141).addBox(-6.8277F, -56.5317F, -22.0F, 1.0F, 50.0F, 5.0F, 0.0F, false);
		leg8.setTextureOffset(66, 250).addBox(-2.0F, -56.0F, -24.0F, 4.0F, 1.0F, 5.0F, 0.0F, false);
		leg8.setTextureOffset(66, 250).addBox(-1.5F, -117.0F, -20.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		leg8.setTextureOffset(70, 194).addBox(-1.5F, -116.5F, -20.5F, 3.0F, 61.0F, 1.0F, 0.0F, false);
		leg8.setTextureOffset(70, 194).addBox(1.019F, -56.2519F, -22.2142F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		leg8.setTextureOffset(70, 194).addBox(-6.981F, -56.2519F, -22.2142F, 6.0F, 1.0F, 1.0F, 0.0F, false);

		bone260 = new ModelRenderer(this);
		bone260.setRotationPoint(-4.6653F, -69.251F, -23.0365F);
		leg8.addChild(bone260);
		bone260.setTextureOffset(70, 194).addBox(0.2F, -37.0F, -0.5F, 2.0F, 51.0F, 1.0F, 0.0F, false);
		bone260.setTextureOffset(70, 194).addBox(-0.8F, -23.0F, -0.5F, 1.0F, 37.0F, 1.0F, 0.0F, false);
		bone260.setTextureOffset(70, 194).addBox(-1.8F, -8.0F, -0.5F, 1.0F, 22.0F, 1.0F, 0.0F, false);
		bone260.setTextureOffset(70, 194).addBox(-2.8F, 1.0F, -0.5F, 1.0F, 13.0F, 1.0F, 0.0F, false);
		bone260.setTextureOffset(70, 194).addBox(2.2F, -3.0F, -0.5F, 1.0F, 17.0F, 1.0F, 0.0F, false);

		bone261 = new ModelRenderer(this);
		bone261.setRotationPoint(4.8347F, -69.251F, -23.0365F);
		leg8.addChild(bone261);
		setRotationAngle(bone261, 0.0F, -1.2217F, 0.0F);
		bone261.setTextureOffset(70, 194).addBox(-1.8F, -37.0F, -0.5F, 2.0F, 51.0F, 1.0F, 0.0F, false);
		bone261.setTextureOffset(70, 194).addBox(0.2F, -23.0F, -0.5F, 1.0F, 37.0F, 1.0F, 0.0F, false);
		bone261.setTextureOffset(70, 194).addBox(1.2F, -8.0F, -0.5F, 1.0F, 22.0F, 1.0F, 0.0F, false);
		bone261.setTextureOffset(70, 194).addBox(2.2F, 1.0F, -0.5F, 1.0F, 13.0F, 1.0F, 0.0F, false);
		bone261.setTextureOffset(70, 194).addBox(-2.8F, -3.0F, -0.5F, 1.0F, 17.0F, 1.0F, 0.0F, false);

		bone262 = new ModelRenderer(this);
		bone262.setRotationPoint(7.0347F, -55.251F, -23.0365F);
		leg8.addChild(bone262);
		bone262.setTextureOffset(70, 194).addBox(0.6683F, -0.0105F, 3.2577F, 1.0F, 41.0F, 1.0F, 0.0F, false);
		bone262.setTextureOffset(70, 194).addBox(-0.3317F, -0.0105F, 3.2577F, 1.0F, 34.0F, 1.0F, 0.0F, false);
		bone262.setTextureOffset(70, 194).addBox(-1.3317F, -0.0105F, 3.2577F, 1.0F, 27.0F, 1.0F, 0.0F, false);
		bone262.setTextureOffset(70, 194).addBox(-2.3317F, -0.0105F, 3.2577F, 1.0F, 19.0F, 1.0F, 0.0F, false);
		bone262.setTextureOffset(70, 194).addBox(-3.3317F, -0.0105F, 3.2577F, 1.0F, 11.0F, 1.0F, 0.0F, false);
		bone262.setTextureOffset(70, 194).addBox(-3.8317F, -1.0105F, 3.2577F, 5.0F, 1.0F, 1.0F, 0.0F, false);

		bone263 = new ModelRenderer(this);
		bone263.setRotationPoint(6.6614F, -43.3447F, -14.2788F);
		leg8.addChild(bone263);
		setRotationAngle(bone263, -0.0873F, 0.6109F, 0.0F);
		bone263.setTextureOffset(70, 194).addBox(-8.3368F, -9.9474F, -13.9985F, 1.0F, 41.0F, 1.0F, 0.0F, false);
		bone263.setTextureOffset(70, 194).addBox(-7.3368F, -9.9474F, -13.9985F, 1.0F, 34.0F, 1.0F, 0.0F, false);
		bone263.setTextureOffset(70, 194).addBox(-6.3368F, -9.9474F, -13.9985F, 1.0F, 27.0F, 1.0F, 0.0F, false);
		bone263.setTextureOffset(70, 194).addBox(-5.3368F, -9.9474F, -13.9985F, 1.0F, 19.0F, 1.0F, 0.0F, false);
		bone263.setTextureOffset(70, 194).addBox(-4.3368F, -9.9474F, -13.9985F, 1.0F, 11.0F, 1.0F, 0.0F, false);
		bone263.setTextureOffset(70, 194).addBox(-8.3368F, -10.9474F, -13.9985F, 5.0F, 1.0F, 1.0F, 0.0F, false);

		fins_main2 = new ModelRenderer(this);
		fins_main2.setRotationPoint(0.0F, 0.0F, 0.0F);
		falcon_left.addChild(fins_main2);
		setRotationAngle(fins_main2, 0.0F, -0.7854F, 0.0F);
		

		fins1_3 = new ModelRenderer(this);
		fins1_3.setRotationPoint(0.0F, 0.0F, 0.0F);
		fins_main2.addChild(fins1_3);
		

		fin5 = new ModelRenderer(this);
		fin5.setRotationPoint(0.0F, -518.5F, -19.25F);
		fins1_3.addChild(fin5);
		setRotationAngle(fin5, 1.5708F, 0.0F, 0.0F);
		fin5.setTextureOffset(86, 243).addBox(-4.0F, -0.5F, -12.75F, 8.0F, 1.0F, 12.0F, 0.0F, false);
		fin5.setTextureOffset(70, 158).addBox(-2.0F, -0.5F, -0.75F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		fin6 = new ModelRenderer(this);
		fin6.setRotationPoint(0.0F, -518.5F, 19.25F);
		fins1_3.addChild(fin6);
		setRotationAngle(fin6, 1.5708F, 3.1416F, 0.0F);
		fin6.setTextureOffset(86, 243).addBox(-4.0F, -0.5F, -12.75F, 8.0F, 1.0F, 12.0F, 0.0F, false);
		fin6.setTextureOffset(70, 158).addBox(-2.0F, -0.5F, -0.75F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		fins3_2 = new ModelRenderer(this);
		fins3_2.setRotationPoint(0.0F, 0.0F, 0.0F);
		fins_main2.addChild(fins3_2);
		setRotationAngle(fins3_2, 0.0F, -1.5708F, 0.0F);
		

		fin7 = new ModelRenderer(this);
		fin7.setRotationPoint(0.0F, -518.5F, -19.25F);
		fins3_2.addChild(fin7);
		setRotationAngle(fin7, 1.5708F, 0.0F, 0.0F);
		fin7.setTextureOffset(86, 243).addBox(-4.0F, -0.5F, -12.75F, 8.0F, 1.0F, 12.0F, 0.0F, false);
		fin7.setTextureOffset(70, 158).addBox(-2.0F, -0.5F, -0.75F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		fin8 = new ModelRenderer(this);
		fin8.setRotationPoint(0.0F, -518.5F, 19.25F);
		fins3_2.addChild(fin8);
		setRotationAngle(fin8, 1.5708F, 3.1416F, 0.0F);
		fin8.setTextureOffset(86, 243).addBox(-4.0F, -0.5F, -12.75F, 8.0F, 1.0F, 12.0F, 0.0F, false);
		fin8.setTextureOffset(70, 158).addBox(-2.0F, -0.5F, -0.75F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		falcon_right = new ModelRenderer(this);
		falcon_right.setRotationPoint(43.0F, 24.0F, 0.0F);
		

		rocket3 = new ModelRenderer(this);
		rocket3.setRotationPoint(0.0F, -76.0F, 0.0F);
		falcon_right.addChild(rocket3);
		

		bone264 = new ModelRenderer(this);
		bone264.setRotationPoint(0.0F, 0.0F, 0.0F);
		rocket3.addChild(bone264);
		

		bone265 = new ModelRenderer(this);
		bone265.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone264.addChild(bone265);
		bone265.setTextureOffset(0, 160).addBox(-19.0F, -455.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone265.setTextureOffset(0, 160).addBox(18.0F, -455.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone266 = new ModelRenderer(this);
		bone266.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone264.addChild(bone266);
		setRotationAngle(bone266, 0.0F, -0.5236F, 0.0F);
		bone266.setTextureOffset(0, 160).addBox(-19.0F, -455.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone266.setTextureOffset(0, 160).addBox(18.0F, -455.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone267 = new ModelRenderer(this);
		bone267.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone264.addChild(bone267);
		setRotationAngle(bone267, 0.0F, -1.0472F, 0.0F);
		bone267.setTextureOffset(0, 160).addBox(-19.0F, -455.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone267.setTextureOffset(0, 160).addBox(18.0F, -455.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone268 = new ModelRenderer(this);
		bone268.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone264.addChild(bone268);
		setRotationAngle(bone268, 0.0F, -1.5708F, 0.0F);
		bone268.setTextureOffset(0, 160).addBox(-19.0F, -455.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone268.setTextureOffset(0, 160).addBox(18.0F, -455.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone269 = new ModelRenderer(this);
		bone269.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone264.addChild(bone269);
		setRotationAngle(bone269, 0.0F, -2.0944F, 0.0F);
		bone269.setTextureOffset(0, 160).addBox(-19.0F, -455.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone269.setTextureOffset(0, 160).addBox(18.0F, -455.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone270 = new ModelRenderer(this);
		bone270.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone264.addChild(bone270);
		setRotationAngle(bone270, 0.0F, -2.618F, 0.0F);
		bone270.setTextureOffset(0, 160).addBox(-19.0F, -455.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone270.setTextureOffset(0, 160).addBox(18.0F, -455.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone271 = new ModelRenderer(this);
		bone271.setRotationPoint(0.0F, 0.0F, 0.0F);
		rocket3.addChild(bone271);
		

		bone272 = new ModelRenderer(this);
		bone272.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone271.addChild(bone272);
		bone272.setTextureOffset(0, 0).addBox(-19.0F, -385.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone272.setTextureOffset(0, 0).addBox(18.0F, -385.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone273 = new ModelRenderer(this);
		bone273.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone271.addChild(bone273);
		setRotationAngle(bone273, 0.0F, -0.5236F, 0.0F);
		bone273.setTextureOffset(0, 0).addBox(-19.0F, -385.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone273.setTextureOffset(0, 0).addBox(18.0F, -385.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone274 = new ModelRenderer(this);
		bone274.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone271.addChild(bone274);
		setRotationAngle(bone274, 0.0F, -1.0472F, 0.0F);
		bone274.setTextureOffset(0, 0).addBox(-19.0F, -385.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone274.setTextureOffset(0, 0).addBox(18.0F, -385.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone275 = new ModelRenderer(this);
		bone275.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone271.addChild(bone275);
		setRotationAngle(bone275, 0.0F, -1.5708F, 0.0F);
		bone275.setTextureOffset(46, 160).addBox(-19.0F, -385.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone275.setTextureOffset(0, 0).addBox(18.0F, -385.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone276 = new ModelRenderer(this);
		bone276.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone271.addChild(bone276);
		setRotationAngle(bone276, 0.0F, -2.0944F, 0.0F);
		bone276.setTextureOffset(0, 0).addBox(-19.0F, -385.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone276.setTextureOffset(0, 0).addBox(18.0F, -385.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone277 = new ModelRenderer(this);
		bone277.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone271.addChild(bone277);
		setRotationAngle(bone277, 0.0F, -2.618F, 0.0F);
		bone277.setTextureOffset(0, 0).addBox(-19.0F, -385.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone277.setTextureOffset(0, 0).addBox(18.0F, -385.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone278 = new ModelRenderer(this);
		bone278.setRotationPoint(0.0F, 0.0F, 0.0F);
		rocket3.addChild(bone278);
		

		bone279 = new ModelRenderer(this);
		bone279.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone278.addChild(bone279);
		bone279.setTextureOffset(0, 0).addBox(-19.0F, -315.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone279.setTextureOffset(0, 0).addBox(18.0F, -315.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone280 = new ModelRenderer(this);
		bone280.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone278.addChild(bone280);
		setRotationAngle(bone280, 0.0F, -0.5236F, 0.0F);
		bone280.setTextureOffset(0, 0).addBox(-19.0F, -315.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone280.setTextureOffset(0, 0).addBox(18.0F, -315.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone281 = new ModelRenderer(this);
		bone281.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone278.addChild(bone281);
		setRotationAngle(bone281, 0.0F, -1.0472F, 0.0F);
		bone281.setTextureOffset(0, 0).addBox(-19.0F, -315.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone281.setTextureOffset(0, 0).addBox(18.0F, -315.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone282 = new ModelRenderer(this);
		bone282.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone278.addChild(bone282);
		setRotationAngle(bone282, 0.0F, -1.5708F, 0.0F);
		bone282.setTextureOffset(0, 0).addBox(-19.0F, -315.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone282.setTextureOffset(0, 0).addBox(18.0F, -315.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone283 = new ModelRenderer(this);
		bone283.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone278.addChild(bone283);
		setRotationAngle(bone283, 0.0F, -2.0944F, 0.0F);
		bone283.setTextureOffset(0, 0).addBox(-19.0F, -315.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone283.setTextureOffset(0, 0).addBox(18.0F, -315.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone284 = new ModelRenderer(this);
		bone284.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone278.addChild(bone284);
		setRotationAngle(bone284, 0.0F, -2.618F, 0.0F);
		bone284.setTextureOffset(0, 0).addBox(-19.0F, -315.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone284.setTextureOffset(0, 0).addBox(18.0F, -315.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone285 = new ModelRenderer(this);
		bone285.setRotationPoint(0.0F, 0.0F, 0.0F);
		rocket3.addChild(bone285);
		

		bone286 = new ModelRenderer(this);
		bone286.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone285.addChild(bone286);
		bone286.setTextureOffset(0, 0).addBox(-19.0F, -245.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone286.setTextureOffset(0, 0).addBox(18.0F, -245.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone287 = new ModelRenderer(this);
		bone287.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone285.addChild(bone287);
		setRotationAngle(bone287, 0.0F, -0.5236F, 0.0F);
		bone287.setTextureOffset(0, 0).addBox(-19.0F, -245.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone287.setTextureOffset(0, 0).addBox(18.0F, -245.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone288 = new ModelRenderer(this);
		bone288.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone285.addChild(bone288);
		setRotationAngle(bone288, 0.0F, -1.0472F, 0.0F);
		bone288.setTextureOffset(0, 0).addBox(-19.0F, -245.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone288.setTextureOffset(0, 0).addBox(18.0F, -245.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone289 = new ModelRenderer(this);
		bone289.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone285.addChild(bone289);
		setRotationAngle(bone289, 0.0F, -1.5708F, 0.0F);
		bone289.setTextureOffset(0, 0).addBox(-19.0F, -245.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone289.setTextureOffset(0, 0).addBox(18.0F, -245.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone290 = new ModelRenderer(this);
		bone290.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone285.addChild(bone290);
		setRotationAngle(bone290, 0.0F, -2.0944F, 0.0F);
		bone290.setTextureOffset(0, 0).addBox(-19.0F, -245.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone290.setTextureOffset(0, 0).addBox(18.0F, -245.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone291 = new ModelRenderer(this);
		bone291.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone285.addChild(bone291);
		setRotationAngle(bone291, 0.0F, -2.618F, 0.0F);
		bone291.setTextureOffset(0, 0).addBox(-19.0F, -245.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone291.setTextureOffset(0, 0).addBox(18.0F, -245.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone292 = new ModelRenderer(this);
		bone292.setRotationPoint(0.0F, 0.0F, 0.0F);
		rocket3.addChild(bone292);
		

		bone293 = new ModelRenderer(this);
		bone293.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone292.addChild(bone293);
		bone293.setTextureOffset(0, 0).addBox(-19.0F, -175.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone293.setTextureOffset(0, 0).addBox(18.0F, -175.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone294 = new ModelRenderer(this);
		bone294.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone292.addChild(bone294);
		setRotationAngle(bone294, 0.0F, -0.5236F, 0.0F);
		bone294.setTextureOffset(0, 0).addBox(-19.0F, -175.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone294.setTextureOffset(0, 0).addBox(18.0F, -175.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone295 = new ModelRenderer(this);
		bone295.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone292.addChild(bone295);
		setRotationAngle(bone295, 0.0F, -1.0472F, 0.0F);
		bone295.setTextureOffset(0, 0).addBox(-19.0F, -175.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone295.setTextureOffset(0, 0).addBox(18.0F, -175.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone296 = new ModelRenderer(this);
		bone296.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone292.addChild(bone296);
		setRotationAngle(bone296, 0.0F, -1.5708F, 0.0F);
		bone296.setTextureOffset(0, 0).addBox(-19.0F, -175.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone296.setTextureOffset(0, 0).addBox(18.0F, -175.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone297 = new ModelRenderer(this);
		bone297.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone292.addChild(bone297);
		setRotationAngle(bone297, 0.0F, -2.0944F, 0.0F);
		bone297.setTextureOffset(0, 0).addBox(-19.0F, -175.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone297.setTextureOffset(0, 0).addBox(18.0F, -175.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone298 = new ModelRenderer(this);
		bone298.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone292.addChild(bone298);
		setRotationAngle(bone298, 0.0F, -2.618F, 0.0F);
		bone298.setTextureOffset(0, 0).addBox(-19.0F, -175.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone298.setTextureOffset(0, 0).addBox(18.0F, -175.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone299 = new ModelRenderer(this);
		bone299.setRotationPoint(0.0F, 0.0F, 0.0F);
		rocket3.addChild(bone299);
		

		bone300 = new ModelRenderer(this);
		bone300.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone299.addChild(bone300);
		bone300.setTextureOffset(0, 0).addBox(-19.0F, -105.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone300.setTextureOffset(0, 0).addBox(18.0F, -105.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone301 = new ModelRenderer(this);
		bone301.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone299.addChild(bone301);
		setRotationAngle(bone301, 0.0F, -0.5236F, 0.0F);
		bone301.setTextureOffset(0, 0).addBox(-19.0F, -105.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone301.setTextureOffset(0, 0).addBox(18.0F, -105.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone302 = new ModelRenderer(this);
		bone302.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone299.addChild(bone302);
		setRotationAngle(bone302, 0.0F, -1.0472F, 0.0F);
		bone302.setTextureOffset(0, 0).addBox(-19.0F, -105.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone302.setTextureOffset(0, 0).addBox(18.0F, -105.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone303 = new ModelRenderer(this);
		bone303.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone299.addChild(bone303);
		setRotationAngle(bone303, 0.0F, -1.5708F, 0.0F);
		bone303.setTextureOffset(0, 0).addBox(-19.0F, -105.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone303.setTextureOffset(0, 0).addBox(18.0F, -105.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone304 = new ModelRenderer(this);
		bone304.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone299.addChild(bone304);
		setRotationAngle(bone304, 0.0F, -2.0944F, 0.0F);
		bone304.setTextureOffset(0, 0).addBox(-19.0F, -105.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone304.setTextureOffset(0, 0).addBox(18.0F, -105.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone305 = new ModelRenderer(this);
		bone305.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone299.addChild(bone305);
		setRotationAngle(bone305, 0.0F, -2.618F, 0.0F);
		bone305.setTextureOffset(0, 0).addBox(-19.0F, -105.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone305.setTextureOffset(0, 0).addBox(18.0F, -105.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone306 = new ModelRenderer(this);
		bone306.setRotationPoint(0.0F, 69.0F, 0.0F);
		rocket3.addChild(bone306);
		

		bone307 = new ModelRenderer(this);
		bone307.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone306.addChild(bone307);
		bone307.setTextureOffset(0, 0).addBox(-19.0F, -105.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone307.setTextureOffset(0, 0).addBox(18.0F, -105.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone308 = new ModelRenderer(this);
		bone308.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone306.addChild(bone308);
		setRotationAngle(bone308, 0.0F, -0.5236F, 0.0F);
		bone308.setTextureOffset(0, 0).addBox(-19.0F, -105.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone308.setTextureOffset(0, 0).addBox(18.0F, -105.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone309 = new ModelRenderer(this);
		bone309.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone306.addChild(bone309);
		setRotationAngle(bone309, 0.0F, -1.0472F, 0.0F);
		bone309.setTextureOffset(0, 0).addBox(-19.0F, -105.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone309.setTextureOffset(0, 0).addBox(18.0F, -105.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone310 = new ModelRenderer(this);
		bone310.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone306.addChild(bone310);
		setRotationAngle(bone310, 0.0F, -1.5708F, 0.0F);
		bone310.setTextureOffset(0, 0).addBox(-19.0F, -105.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone310.setTextureOffset(0, 0).addBox(18.0F, -105.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone311 = new ModelRenderer(this);
		bone311.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone306.addChild(bone311);
		setRotationAngle(bone311, 0.0F, -2.0944F, 0.0F);
		bone311.setTextureOffset(0, 0).addBox(-19.0F, -105.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone311.setTextureOffset(0, 0).addBox(18.0F, -105.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone312 = new ModelRenderer(this);
		bone312.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone306.addChild(bone312);
		setRotationAngle(bone312, 0.0F, -2.618F, 0.0F);
		bone312.setTextureOffset(0, 0).addBox(-19.0F, -105.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone312.setTextureOffset(0, 0).addBox(18.0F, -105.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone313 = new ModelRenderer(this);
		bone313.setRotationPoint(0.0F, 69.0F, 0.0F);
		rocket3.addChild(bone313);
		

		bone314 = new ModelRenderer(this);
		bone314.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone313.addChild(bone314);
		bone314.setTextureOffset(0, 80).addBox(-19.0F, -35.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone314.setTextureOffset(0, 80).addBox(18.0F, -35.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone315 = new ModelRenderer(this);
		bone315.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone313.addChild(bone315);
		setRotationAngle(bone315, 0.0F, -0.5236F, 0.0F);
		bone315.setTextureOffset(0, 80).addBox(-19.0F, -35.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone315.setTextureOffset(0, 80).addBox(18.0F, -35.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone316 = new ModelRenderer(this);
		bone316.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone313.addChild(bone316);
		setRotationAngle(bone316, 0.0F, -1.0472F, 0.0F);
		bone316.setTextureOffset(0, 80).addBox(-19.0F, -35.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone316.setTextureOffset(0, 80).addBox(18.0F, -35.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone317 = new ModelRenderer(this);
		bone317.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone313.addChild(bone317);
		setRotationAngle(bone317, 0.0F, -1.5708F, 0.0F);
		bone317.setTextureOffset(0, 80).addBox(-19.0F, -35.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone317.setTextureOffset(0, 80).addBox(18.0F, -35.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone318 = new ModelRenderer(this);
		bone318.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone313.addChild(bone318);
		setRotationAngle(bone318, 0.0F, -2.0944F, 0.0F);
		bone318.setTextureOffset(0, 80).addBox(-19.0F, -35.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone318.setTextureOffset(0, 80).addBox(18.0F, -35.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone319 = new ModelRenderer(this);
		bone319.setRotationPoint(0.0F, -35.0F, 0.0F);
		bone313.addChild(bone319);
		setRotationAngle(bone319, 0.0F, -2.618F, 0.0F);
		bone319.setTextureOffset(0, 80).addBox(-19.0F, -35.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);
		bone319.setTextureOffset(0, 80).addBox(18.0F, -35.0F, -5.0F, 1.0F, 70.0F, 10.0F, 0.0F, false);

		bone320 = new ModelRenderer(this);
		bone320.setRotationPoint(0.0F, -4.0F, 0.0F);
		rocket3.addChild(bone320);
		bone320.setTextureOffset(24, 0).addBox(-5.0F, 68.0F, -18.0F, 10.0F, 1.0F, 36.0F, 0.0F, false);
		bone320.setTextureOffset(24, 0).addBox(-5.0F, 68.0F, -18.0F, 10.0F, 1.0F, 36.0F, 0.0F, false);
		bone320.setTextureOffset(24, 0).addBox(-5.0F, 68.0F, -18.0F, 10.0F, 1.0F, 36.0F, 0.0F, false);
		bone320.setTextureOffset(24, 0).addBox(-5.0F, 68.0F, -18.0F, 10.0F, 1.0F, 36.0F, 0.0F, false);
		bone320.setTextureOffset(24, 0).addBox(-5.0F, 68.0F, -18.0F, 10.0F, 1.0F, 36.0F, 0.0F, false);
		bone320.setTextureOffset(24, 0).addBox(-5.0F, 68.0F, -18.0F, 10.0F, 1.0F, 36.0F, 0.0F, false);

		bone321 = new ModelRenderer(this);
		bone321.setRotationPoint(0.0F, -483.0F, 0.0F);
		rocket3.addChild(bone321);
		bone321.setTextureOffset(24, 0).addBox(-5.0F, 68.0F, -18.0F, 10.0F, 1.0F, 36.0F, 0.0F, false);
		bone321.setTextureOffset(24, 0).addBox(-5.0F, 68.0F, -18.0F, 10.0F, 1.0F, 36.0F, 0.0F, false);
		bone321.setTextureOffset(24, 0).addBox(-5.0F, 68.0F, -18.0F, 10.0F, 1.0F, 36.0F, 0.0F, false);
		bone321.setTextureOffset(24, 0).addBox(-5.0F, 68.0F, -18.0F, 10.0F, 1.0F, 36.0F, 0.0F, false);
		bone321.setTextureOffset(24, 0).addBox(-5.0F, 68.0F, -18.0F, 10.0F, 1.0F, 36.0F, 0.0F, false);
		bone321.setTextureOffset(24, 0).addBox(-5.0F, 68.0F, -18.0F, 10.0F, 1.0F, 36.0F, 0.0F, false);

		boosters3 = new ModelRenderer(this);
		boosters3.setRotationPoint(0.0F, 0.0F, 0.0F);
		falcon_right.addChild(boosters3);
		

		merlin19 = new ModelRenderer(this);
		merlin19.setRotationPoint(0.0F, 0.0F, 0.0F);
		boosters3.addChild(merlin19);
		merlin19.setTextureOffset(33, 0).addBox(-3.0F, -11.0F, -3.0F, 6.0F, 9.0F, 6.0F, 0.0F, false);

		bone322 = new ModelRenderer(this);
		bone322.setRotationPoint(0.0F, -3.0F, 0.0F);
		merlin19.addChild(bone322);
		bone322.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone322.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		bone323 = new ModelRenderer(this);
		bone323.setRotationPoint(0.0F, -3.0F, 0.0F);
		merlin19.addChild(bone323);
		setRotationAngle(bone323, 0.0F, -0.7854F, 0.0F);
		bone323.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone323.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		bone324 = new ModelRenderer(this);
		bone324.setRotationPoint(0.0F, -3.0F, 0.0F);
		merlin19.addChild(bone324);
		setRotationAngle(bone324, 0.0F, -1.5708F, 0.0F);
		bone324.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone324.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		bone325 = new ModelRenderer(this);
		bone325.setRotationPoint(0.0F, -3.0F, 0.0F);
		merlin19.addChild(bone325);
		setRotationAngle(bone325, 0.0F, -2.3562F, 0.0F);
		bone325.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone325.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		merlin20 = new ModelRenderer(this);
		merlin20.setRotationPoint(0.0F, 0.0F, 0.0F);
		boosters3.addChild(merlin20);
		merlin20.setTextureOffset(33, 0).addBox(-16.5F, -11.0F, -3.0F, 6.0F, 9.0F, 6.0F, 0.0F, false);

		bone326 = new ModelRenderer(this);
		bone326.setRotationPoint(-13.5F, -3.0F, 0.0F);
		merlin20.addChild(bone326);
		bone326.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone326.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		bone327 = new ModelRenderer(this);
		bone327.setRotationPoint(-13.5F, -3.0F, 0.0F);
		merlin20.addChild(bone327);
		setRotationAngle(bone327, 0.0F, -0.7854F, 0.0F);
		bone327.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone327.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		bone328 = new ModelRenderer(this);
		bone328.setRotationPoint(-13.5F, -3.0F, 0.0F);
		merlin20.addChild(bone328);
		setRotationAngle(bone328, 0.0F, -1.5708F, 0.0F);
		bone328.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone328.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		bone329 = new ModelRenderer(this);
		bone329.setRotationPoint(-13.5F, -3.0F, 0.0F);
		merlin20.addChild(bone329);
		setRotationAngle(bone329, 0.0F, -2.3562F, 0.0F);
		bone329.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone329.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		merlin21 = new ModelRenderer(this);
		merlin21.setRotationPoint(0.0F, 0.0F, 0.0F);
		boosters3.addChild(merlin21);
		setRotationAngle(merlin21, 0.0F, -0.7854F, 0.0F);
		merlin21.setTextureOffset(33, 0).addBox(-16.5F, -11.0F, -3.0F, 6.0F, 9.0F, 6.0F, 0.0F, false);

		bone330 = new ModelRenderer(this);
		bone330.setRotationPoint(-13.5F, -3.0F, 0.0F);
		merlin21.addChild(bone330);
		bone330.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone330.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		bone331 = new ModelRenderer(this);
		bone331.setRotationPoint(-13.5F, -3.0F, 0.0F);
		merlin21.addChild(bone331);
		setRotationAngle(bone331, 0.0F, -0.7854F, 0.0F);
		bone331.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone331.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		bone332 = new ModelRenderer(this);
		bone332.setRotationPoint(-13.5F, -3.0F, 0.0F);
		merlin21.addChild(bone332);
		setRotationAngle(bone332, 0.0F, -1.5708F, 0.0F);
		bone332.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone332.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		bone333 = new ModelRenderer(this);
		bone333.setRotationPoint(-13.5F, -3.0F, 0.0F);
		merlin21.addChild(bone333);
		setRotationAngle(bone333, 0.0F, -2.3562F, 0.0F);
		bone333.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone333.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		merlin22 = new ModelRenderer(this);
		merlin22.setRotationPoint(0.0F, 0.0F, 0.0F);
		boosters3.addChild(merlin22);
		setRotationAngle(merlin22, 0.0F, -1.5708F, 0.0F);
		merlin22.setTextureOffset(33, 0).addBox(-16.5F, -11.0F, -3.0F, 6.0F, 9.0F, 6.0F, 0.0F, false);

		bone334 = new ModelRenderer(this);
		bone334.setRotationPoint(-13.5F, -3.0F, 0.0F);
		merlin22.addChild(bone334);
		bone334.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone334.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		bone335 = new ModelRenderer(this);
		bone335.setRotationPoint(-13.5F, -3.0F, 0.0F);
		merlin22.addChild(bone335);
		setRotationAngle(bone335, 0.0F, -0.7854F, 0.0F);
		bone335.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone335.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		bone336 = new ModelRenderer(this);
		bone336.setRotationPoint(-13.5F, -3.0F, 0.0F);
		merlin22.addChild(bone336);
		setRotationAngle(bone336, 0.0F, -1.5708F, 0.0F);
		bone336.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone336.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		bone337 = new ModelRenderer(this);
		bone337.setRotationPoint(-13.5F, -3.0F, 0.0F);
		merlin22.addChild(bone337);
		setRotationAngle(bone337, 0.0F, -2.3562F, 0.0F);
		bone337.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone337.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		merlin23 = new ModelRenderer(this);
		merlin23.setRotationPoint(0.0F, 0.0F, 0.0F);
		boosters3.addChild(merlin23);
		setRotationAngle(merlin23, 0.0F, -2.3562F, 0.0F);
		merlin23.setTextureOffset(33, 0).addBox(-16.5F, -11.0F, -3.0F, 6.0F, 9.0F, 6.0F, 0.0F, false);

		bone338 = new ModelRenderer(this);
		bone338.setRotationPoint(-13.5F, -3.0F, 0.0F);
		merlin23.addChild(bone338);
		bone338.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone338.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		bone339 = new ModelRenderer(this);
		bone339.setRotationPoint(-13.5F, -3.0F, 0.0F);
		merlin23.addChild(bone339);
		setRotationAngle(bone339, 0.0F, -0.7854F, 0.0F);
		bone339.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone339.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		bone340 = new ModelRenderer(this);
		bone340.setRotationPoint(-13.5F, -3.0F, 0.0F);
		merlin23.addChild(bone340);
		setRotationAngle(bone340, 0.0F, -1.5708F, 0.0F);
		bone340.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone340.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		bone341 = new ModelRenderer(this);
		bone341.setRotationPoint(-13.5F, -3.0F, 0.0F);
		merlin23.addChild(bone341);
		setRotationAngle(bone341, 0.0F, -2.3562F, 0.0F);
		bone341.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone341.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		merlin24 = new ModelRenderer(this);
		merlin24.setRotationPoint(0.0F, 0.0F, 0.0F);
		boosters3.addChild(merlin24);
		setRotationAngle(merlin24, 0.0F, 3.1416F, 0.0F);
		merlin24.setTextureOffset(33, 0).addBox(-16.5F, -11.0F, -3.0F, 6.0F, 9.0F, 6.0F, 0.0F, false);

		bone342 = new ModelRenderer(this);
		bone342.setRotationPoint(-13.5F, -3.0F, 0.0F);
		merlin24.addChild(bone342);
		bone342.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone342.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		bone343 = new ModelRenderer(this);
		bone343.setRotationPoint(-13.5F, -3.0F, 0.0F);
		merlin24.addChild(bone343);
		setRotationAngle(bone343, 0.0F, -0.7854F, 0.0F);
		bone343.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone343.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		bone344 = new ModelRenderer(this);
		bone344.setRotationPoint(-13.5F, -3.0F, 0.0F);
		merlin24.addChild(bone344);
		setRotationAngle(bone344, 0.0F, -1.5708F, 0.0F);
		bone344.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone344.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		bone345 = new ModelRenderer(this);
		bone345.setRotationPoint(-13.5F, -3.0F, 0.0F);
		merlin24.addChild(bone345);
		setRotationAngle(bone345, 0.0F, -2.3562F, 0.0F);
		bone345.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone345.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		merlin25 = new ModelRenderer(this);
		merlin25.setRotationPoint(0.0F, 0.0F, 0.0F);
		boosters3.addChild(merlin25);
		setRotationAngle(merlin25, 0.0F, 2.3562F, 0.0F);
		merlin25.setTextureOffset(33, 0).addBox(-16.5F, -11.0F, -3.0F, 6.0F, 9.0F, 6.0F, 0.0F, false);

		bone346 = new ModelRenderer(this);
		bone346.setRotationPoint(-13.5F, -3.0F, 0.0F);
		merlin25.addChild(bone346);
		bone346.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone346.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		bone347 = new ModelRenderer(this);
		bone347.setRotationPoint(-13.5F, -3.0F, 0.0F);
		merlin25.addChild(bone347);
		setRotationAngle(bone347, 0.0F, -0.7854F, 0.0F);
		bone347.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone347.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		bone348 = new ModelRenderer(this);
		bone348.setRotationPoint(-13.5F, -3.0F, 0.0F);
		merlin25.addChild(bone348);
		setRotationAngle(bone348, 0.0F, -1.5708F, 0.0F);
		bone348.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone348.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		bone349 = new ModelRenderer(this);
		bone349.setRotationPoint(-13.5F, -3.0F, 0.0F);
		merlin25.addChild(bone349);
		setRotationAngle(bone349, 0.0F, -2.3562F, 0.0F);
		bone349.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone349.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		merlin26 = new ModelRenderer(this);
		merlin26.setRotationPoint(0.0F, 0.0F, 0.0F);
		boosters3.addChild(merlin26);
		setRotationAngle(merlin26, 0.0F, 1.5708F, 0.0F);
		merlin26.setTextureOffset(33, 0).addBox(-16.5F, -11.0F, -3.0F, 6.0F, 9.0F, 6.0F, 0.0F, false);

		bone350 = new ModelRenderer(this);
		bone350.setRotationPoint(-13.5F, -3.0F, 0.0F);
		merlin26.addChild(bone350);
		bone350.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone350.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		bone351 = new ModelRenderer(this);
		bone351.setRotationPoint(-13.5F, -3.0F, 0.0F);
		merlin26.addChild(bone351);
		setRotationAngle(bone351, 0.0F, -0.7854F, 0.0F);
		bone351.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone351.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		bone352 = new ModelRenderer(this);
		bone352.setRotationPoint(-13.5F, -3.0F, 0.0F);
		merlin26.addChild(bone352);
		setRotationAngle(bone352, 0.0F, -1.5708F, 0.0F);
		bone352.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone352.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		bone353 = new ModelRenderer(this);
		bone353.setRotationPoint(-13.5F, -3.0F, 0.0F);
		merlin26.addChild(bone353);
		setRotationAngle(bone353, 0.0F, -2.3562F, 0.0F);
		bone353.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone353.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		merlin27 = new ModelRenderer(this);
		merlin27.setRotationPoint(0.0F, 0.0F, 0.0F);
		boosters3.addChild(merlin27);
		setRotationAngle(merlin27, 0.0F, 0.7854F, 0.0F);
		merlin27.setTextureOffset(33, 0).addBox(-16.5F, -11.0F, -3.0F, 6.0F, 9.0F, 6.0F, 0.0F, false);

		bone354 = new ModelRenderer(this);
		bone354.setRotationPoint(-13.5F, -3.0F, 0.0F);
		merlin27.addChild(bone354);
		bone354.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone354.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		bone355 = new ModelRenderer(this);
		bone355.setRotationPoint(-13.5F, -3.0F, 0.0F);
		merlin27.addChild(bone355);
		setRotationAngle(bone355, 0.0F, -0.7854F, 0.0F);
		bone355.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone355.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		bone356 = new ModelRenderer(this);
		bone356.setRotationPoint(-13.5F, -3.0F, 0.0F);
		merlin27.addChild(bone356);
		setRotationAngle(bone356, 0.0F, -1.5708F, 0.0F);
		bone356.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone356.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		bone357 = new ModelRenderer(this);
		bone357.setRotationPoint(-13.5F, -3.0F, 0.0F);
		merlin27.addChild(bone357);
		setRotationAngle(bone357, 0.0F, -2.3562F, 0.0F);
		bone357.setTextureOffset(23, 9).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		bone357.setTextureOffset(23, 9).addBox(4.0F, -6.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		legs_main3 = new ModelRenderer(this);
		legs_main3.setRotationPoint(0.0F, 0.0F, 0.0F);
		falcon_right.addChild(legs_main3);
		setRotationAngle(legs_main3, 0.0F, -0.7854F, 0.0F);
		

		leg9 = new ModelRenderer(this);
		leg9.setRotationPoint(0.0F, 0.0F, 0.0F);
		legs_main3.addChild(leg9);
		leg9.setTextureOffset(69, 141).addBox(-6.0F, -117.0F, -20.0F, 1.0F, 110.0F, 5.0F, 0.0F, false);
		leg9.setTextureOffset(69, 141).addBox(5.0F, -117.0F, -20.0F, 1.0F, 110.0F, 5.0F, 0.0F, false);
		leg9.setTextureOffset(69, 141).addBox(5.8277F, -56.5317F, -22.0F, 1.0F, 50.0F, 5.0F, 0.0F, false);
		leg9.setTextureOffset(69, 141).addBox(-6.8277F, -56.5317F, -22.0F, 1.0F, 50.0F, 5.0F, 0.0F, false);
		leg9.setTextureOffset(66, 250).addBox(-2.0F, -56.0F, -24.0F, 4.0F, 1.0F, 5.0F, 0.0F, false);
		leg9.setTextureOffset(66, 250).addBox(-1.5F, -117.0F, -20.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		leg9.setTextureOffset(70, 194).addBox(-1.5F, -116.5F, -20.5F, 3.0F, 61.0F, 1.0F, 0.0F, false);
		leg9.setTextureOffset(70, 194).addBox(1.019F, -56.2519F, -22.2142F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		leg9.setTextureOffset(70, 194).addBox(-6.981F, -56.2519F, -22.2142F, 6.0F, 1.0F, 1.0F, 0.0F, false);

		bone358 = new ModelRenderer(this);
		bone358.setRotationPoint(-4.6653F, -69.251F, -23.0365F);
		leg9.addChild(bone358);
		bone358.setTextureOffset(70, 194).addBox(0.2F, -37.0F, -0.5F, 2.0F, 51.0F, 1.0F, 0.0F, false);
		bone358.setTextureOffset(70, 194).addBox(-0.8F, -23.0F, -0.5F, 1.0F, 37.0F, 1.0F, 0.0F, false);
		bone358.setTextureOffset(70, 194).addBox(-1.8F, -8.0F, -0.5F, 1.0F, 22.0F, 1.0F, 0.0F, false);
		bone358.setTextureOffset(70, 194).addBox(-2.8F, 1.0F, -0.5F, 1.0F, 13.0F, 1.0F, 0.0F, false);
		bone358.setTextureOffset(70, 194).addBox(2.2F, -3.0F, -0.5F, 1.0F, 17.0F, 1.0F, 0.0F, false);

		bone359 = new ModelRenderer(this);
		bone359.setRotationPoint(4.8347F, -69.251F, -23.0365F);
		leg9.addChild(bone359);
		setRotationAngle(bone359, 0.0F, -1.2217F, 0.0F);
		bone359.setTextureOffset(70, 194).addBox(-1.8F, -37.0F, -0.5F, 2.0F, 51.0F, 1.0F, 0.0F, false);
		bone359.setTextureOffset(70, 194).addBox(0.2F, -23.0F, -0.5F, 1.0F, 37.0F, 1.0F, 0.0F, false);
		bone359.setTextureOffset(70, 194).addBox(1.2F, -8.0F, -0.5F, 1.0F, 22.0F, 1.0F, 0.0F, false);
		bone359.setTextureOffset(70, 194).addBox(2.2F, 1.0F, -0.5F, 1.0F, 13.0F, 1.0F, 0.0F, false);
		bone359.setTextureOffset(70, 194).addBox(-2.8F, -3.0F, -0.5F, 1.0F, 17.0F, 1.0F, 0.0F, false);

		bone360 = new ModelRenderer(this);
		bone360.setRotationPoint(7.0347F, -55.251F, -23.0365F);
		leg9.addChild(bone360);
		bone360.setTextureOffset(70, 194).addBox(0.6683F, -0.0105F, 3.2577F, 1.0F, 41.0F, 1.0F, 0.0F, false);
		bone360.setTextureOffset(70, 194).addBox(-0.3317F, -0.0105F, 3.2577F, 1.0F, 34.0F, 1.0F, 0.0F, false);
		bone360.setTextureOffset(70, 194).addBox(-1.3317F, -0.0105F, 3.2577F, 1.0F, 27.0F, 1.0F, 0.0F, false);
		bone360.setTextureOffset(70, 194).addBox(-2.3317F, -0.0105F, 3.2577F, 1.0F, 19.0F, 1.0F, 0.0F, false);
		bone360.setTextureOffset(70, 194).addBox(-3.3317F, -0.0105F, 3.2577F, 1.0F, 11.0F, 1.0F, 0.0F, false);
		bone360.setTextureOffset(70, 194).addBox(-3.8317F, -1.0105F, 3.2577F, 5.0F, 1.0F, 1.0F, 0.0F, false);

		bone361 = new ModelRenderer(this);
		bone361.setRotationPoint(6.6614F, -43.3447F, -14.2788F);
		leg9.addChild(bone361);
		setRotationAngle(bone361, -0.0873F, 0.6109F, 0.0F);
		bone361.setTextureOffset(70, 194).addBox(-8.3368F, -9.9474F, -13.9985F, 1.0F, 41.0F, 1.0F, 0.0F, false);
		bone361.setTextureOffset(70, 194).addBox(-7.3368F, -9.9474F, -13.9985F, 1.0F, 34.0F, 1.0F, 0.0F, false);
		bone361.setTextureOffset(70, 194).addBox(-6.3368F, -9.9474F, -13.9985F, 1.0F, 27.0F, 1.0F, 0.0F, false);
		bone361.setTextureOffset(70, 194).addBox(-5.3368F, -9.9474F, -13.9985F, 1.0F, 19.0F, 1.0F, 0.0F, false);
		bone361.setTextureOffset(70, 194).addBox(-4.3368F, -9.9474F, -13.9985F, 1.0F, 11.0F, 1.0F, 0.0F, false);
		bone361.setTextureOffset(70, 194).addBox(-8.3368F, -10.9474F, -13.9985F, 5.0F, 1.0F, 1.0F, 0.0F, false);

		leg10 = new ModelRenderer(this);
		leg10.setRotationPoint(0.0F, 0.0F, 0.0F);
		legs_main3.addChild(leg10);
		setRotationAngle(leg10, 0.0F, -1.5708F, 0.0F);
		leg10.setTextureOffset(69, 141).addBox(-6.0F, -117.0F, -20.0F, 1.0F, 110.0F, 5.0F, 0.0F, false);
		leg10.setTextureOffset(69, 141).addBox(5.0F, -117.0F, -20.0F, 1.0F, 110.0F, 5.0F, 0.0F, false);
		leg10.setTextureOffset(69, 141).addBox(5.8277F, -56.5317F, -22.0F, 1.0F, 50.0F, 5.0F, 0.0F, false);
		leg10.setTextureOffset(69, 141).addBox(-6.8277F, -56.5317F, -22.0F, 1.0F, 50.0F, 5.0F, 0.0F, false);
		leg10.setTextureOffset(66, 250).addBox(-2.0F, -56.0F, -24.0F, 4.0F, 1.0F, 5.0F, 0.0F, false);
		leg10.setTextureOffset(66, 250).addBox(-1.5F, -117.0F, -20.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		leg10.setTextureOffset(70, 194).addBox(-1.5F, -116.5F, -20.5F, 3.0F, 61.0F, 1.0F, 0.0F, false);
		leg10.setTextureOffset(70, 194).addBox(1.019F, -56.2519F, -22.2142F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		leg10.setTextureOffset(70, 194).addBox(-6.981F, -56.2519F, -22.2142F, 6.0F, 1.0F, 1.0F, 0.0F, false);

		bone362 = new ModelRenderer(this);
		bone362.setRotationPoint(-4.6653F, -69.251F, -23.0365F);
		leg10.addChild(bone362);
		bone362.setTextureOffset(70, 194).addBox(0.2F, -37.0F, -0.5F, 2.0F, 51.0F, 1.0F, 0.0F, false);
		bone362.setTextureOffset(70, 194).addBox(-0.8F, -23.0F, -0.5F, 1.0F, 37.0F, 1.0F, 0.0F, false);
		bone362.setTextureOffset(70, 194).addBox(-1.8F, -8.0F, -0.5F, 1.0F, 22.0F, 1.0F, 0.0F, false);
		bone362.setTextureOffset(70, 194).addBox(-2.8F, 1.0F, -0.5F, 1.0F, 13.0F, 1.0F, 0.0F, false);
		bone362.setTextureOffset(70, 194).addBox(2.2F, -3.0F, -0.5F, 1.0F, 17.0F, 1.0F, 0.0F, false);

		bone363 = new ModelRenderer(this);
		bone363.setRotationPoint(4.8347F, -69.251F, -23.0365F);
		leg10.addChild(bone363);
		setRotationAngle(bone363, 0.0F, -1.2217F, 0.0F);
		bone363.setTextureOffset(70, 194).addBox(-1.8F, -37.0F, -0.5F, 2.0F, 51.0F, 1.0F, 0.0F, false);
		bone363.setTextureOffset(70, 194).addBox(0.2F, -23.0F, -0.5F, 1.0F, 37.0F, 1.0F, 0.0F, false);
		bone363.setTextureOffset(70, 194).addBox(1.2F, -8.0F, -0.5F, 1.0F, 22.0F, 1.0F, 0.0F, false);
		bone363.setTextureOffset(70, 194).addBox(2.2F, 1.0F, -0.5F, 1.0F, 13.0F, 1.0F, 0.0F, false);
		bone363.setTextureOffset(70, 194).addBox(-2.8F, -3.0F, -0.5F, 1.0F, 17.0F, 1.0F, 0.0F, false);

		bone364 = new ModelRenderer(this);
		bone364.setRotationPoint(7.0347F, -55.251F, -23.0365F);
		leg10.addChild(bone364);
		bone364.setTextureOffset(70, 194).addBox(0.6683F, -0.0105F, 3.2577F, 1.0F, 41.0F, 1.0F, 0.0F, false);
		bone364.setTextureOffset(70, 194).addBox(-0.3317F, -0.0105F, 3.2577F, 1.0F, 34.0F, 1.0F, 0.0F, false);
		bone364.setTextureOffset(70, 194).addBox(-1.3317F, -0.0105F, 3.2577F, 1.0F, 27.0F, 1.0F, 0.0F, false);
		bone364.setTextureOffset(70, 194).addBox(-2.3317F, -0.0105F, 3.2577F, 1.0F, 19.0F, 1.0F, 0.0F, false);
		bone364.setTextureOffset(70, 194).addBox(-3.3317F, -0.0105F, 3.2577F, 1.0F, 11.0F, 1.0F, 0.0F, false);
		bone364.setTextureOffset(70, 194).addBox(-3.8317F, -1.0105F, 3.2577F, 5.0F, 1.0F, 1.0F, 0.0F, false);

		bone365 = new ModelRenderer(this);
		bone365.setRotationPoint(6.6614F, -43.3447F, -14.2788F);
		leg10.addChild(bone365);
		setRotationAngle(bone365, -0.0873F, 0.6109F, 0.0F);
		bone365.setTextureOffset(70, 194).addBox(-8.3368F, -9.9474F, -13.9985F, 1.0F, 41.0F, 1.0F, 0.0F, false);
		bone365.setTextureOffset(70, 194).addBox(-7.3368F, -9.9474F, -13.9985F, 1.0F, 34.0F, 1.0F, 0.0F, false);
		bone365.setTextureOffset(70, 194).addBox(-6.3368F, -9.9474F, -13.9985F, 1.0F, 27.0F, 1.0F, 0.0F, false);
		bone365.setTextureOffset(70, 194).addBox(-5.3368F, -9.9474F, -13.9985F, 1.0F, 19.0F, 1.0F, 0.0F, false);
		bone365.setTextureOffset(70, 194).addBox(-4.3368F, -9.9474F, -13.9985F, 1.0F, 11.0F, 1.0F, 0.0F, false);
		bone365.setTextureOffset(70, 194).addBox(-8.3368F, -10.9474F, -13.9985F, 5.0F, 1.0F, 1.0F, 0.0F, false);

		leg11 = new ModelRenderer(this);
		leg11.setRotationPoint(0.0F, 0.0F, 0.0F);
		legs_main3.addChild(leg11);
		setRotationAngle(leg11, 0.0F, 3.1416F, 0.0F);
		leg11.setTextureOffset(69, 141).addBox(-6.0F, -117.0F, -20.0F, 1.0F, 110.0F, 5.0F, 0.0F, false);
		leg11.setTextureOffset(69, 141).addBox(5.0F, -117.0F, -20.0F, 1.0F, 110.0F, 5.0F, 0.0F, false);
		leg11.setTextureOffset(69, 141).addBox(5.8277F, -56.5317F, -22.0F, 1.0F, 50.0F, 5.0F, 0.0F, false);
		leg11.setTextureOffset(69, 141).addBox(-6.8277F, -56.5317F, -22.0F, 1.0F, 50.0F, 5.0F, 0.0F, false);
		leg11.setTextureOffset(66, 250).addBox(-2.0F, -56.0F, -24.0F, 4.0F, 1.0F, 5.0F, 0.0F, false);
		leg11.setTextureOffset(66, 250).addBox(-1.5F, -117.0F, -20.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		leg11.setTextureOffset(70, 194).addBox(-1.5F, -116.5F, -20.5F, 3.0F, 61.0F, 1.0F, 0.0F, false);
		leg11.setTextureOffset(70, 194).addBox(1.019F, -56.2519F, -22.2142F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		leg11.setTextureOffset(70, 194).addBox(-6.981F, -56.2519F, -22.2142F, 6.0F, 1.0F, 1.0F, 0.0F, false);

		bone366 = new ModelRenderer(this);
		bone366.setRotationPoint(-4.6653F, -69.251F, -23.0365F);
		leg11.addChild(bone366);
		bone366.setTextureOffset(70, 194).addBox(0.2F, -37.0F, -0.5F, 2.0F, 51.0F, 1.0F, 0.0F, false);
		bone366.setTextureOffset(70, 194).addBox(-0.8F, -23.0F, -0.5F, 1.0F, 37.0F, 1.0F, 0.0F, false);
		bone366.setTextureOffset(70, 194).addBox(-1.8F, -8.0F, -0.5F, 1.0F, 22.0F, 1.0F, 0.0F, false);
		bone366.setTextureOffset(70, 194).addBox(-2.8F, 1.0F, -0.5F, 1.0F, 13.0F, 1.0F, 0.0F, false);
		bone366.setTextureOffset(70, 194).addBox(2.2F, -3.0F, -0.5F, 1.0F, 17.0F, 1.0F, 0.0F, false);

		bone367 = new ModelRenderer(this);
		bone367.setRotationPoint(4.8347F, -69.251F, -23.0365F);
		leg11.addChild(bone367);
		setRotationAngle(bone367, 0.0F, -1.2217F, 0.0F);
		bone367.setTextureOffset(70, 194).addBox(-1.8F, -37.0F, -0.5F, 2.0F, 51.0F, 1.0F, 0.0F, false);
		bone367.setTextureOffset(70, 194).addBox(0.2F, -23.0F, -0.5F, 1.0F, 37.0F, 1.0F, 0.0F, false);
		bone367.setTextureOffset(70, 194).addBox(1.2F, -8.0F, -0.5F, 1.0F, 22.0F, 1.0F, 0.0F, false);
		bone367.setTextureOffset(70, 194).addBox(2.2F, 1.0F, -0.5F, 1.0F, 13.0F, 1.0F, 0.0F, false);
		bone367.setTextureOffset(70, 194).addBox(-2.8F, -3.0F, -0.5F, 1.0F, 17.0F, 1.0F, 0.0F, false);

		bone368 = new ModelRenderer(this);
		bone368.setRotationPoint(7.0347F, -55.251F, -23.0365F);
		leg11.addChild(bone368);
		bone368.setTextureOffset(70, 194).addBox(0.6683F, -0.0105F, 3.2577F, 1.0F, 41.0F, 1.0F, 0.0F, false);
		bone368.setTextureOffset(70, 194).addBox(-0.3317F, -0.0105F, 3.2577F, 1.0F, 34.0F, 1.0F, 0.0F, false);
		bone368.setTextureOffset(70, 194).addBox(-1.3317F, -0.0105F, 3.2577F, 1.0F, 27.0F, 1.0F, 0.0F, false);
		bone368.setTextureOffset(70, 194).addBox(-2.3317F, -0.0105F, 3.2577F, 1.0F, 19.0F, 1.0F, 0.0F, false);
		bone368.setTextureOffset(70, 194).addBox(-3.3317F, -0.0105F, 3.2577F, 1.0F, 11.0F, 1.0F, 0.0F, false);
		bone368.setTextureOffset(70, 194).addBox(-3.8317F, -1.0105F, 3.2577F, 5.0F, 1.0F, 1.0F, 0.0F, false);

		bone369 = new ModelRenderer(this);
		bone369.setRotationPoint(6.6614F, -43.3447F, -14.2788F);
		leg11.addChild(bone369);
		setRotationAngle(bone369, -0.0873F, 0.6109F, 0.0F);
		bone369.setTextureOffset(70, 194).addBox(-8.3368F, -9.9474F, -13.9985F, 1.0F, 41.0F, 1.0F, 0.0F, false);
		bone369.setTextureOffset(70, 194).addBox(-7.3368F, -9.9474F, -13.9985F, 1.0F, 34.0F, 1.0F, 0.0F, false);
		bone369.setTextureOffset(70, 194).addBox(-6.3368F, -9.9474F, -13.9985F, 1.0F, 27.0F, 1.0F, 0.0F, false);
		bone369.setTextureOffset(70, 194).addBox(-5.3368F, -9.9474F, -13.9985F, 1.0F, 19.0F, 1.0F, 0.0F, false);
		bone369.setTextureOffset(70, 194).addBox(-4.3368F, -9.9474F, -13.9985F, 1.0F, 11.0F, 1.0F, 0.0F, false);
		bone369.setTextureOffset(70, 194).addBox(-8.3368F, -10.9474F, -13.9985F, 5.0F, 1.0F, 1.0F, 0.0F, false);

		leg12 = new ModelRenderer(this);
		leg12.setRotationPoint(0.0F, 0.0F, 0.0F);
		legs_main3.addChild(leg12);
		setRotationAngle(leg12, 0.0F, 1.5708F, 0.0F);
		leg12.setTextureOffset(69, 141).addBox(-6.0F, -117.0F, -20.0F, 1.0F, 110.0F, 5.0F, 0.0F, false);
		leg12.setTextureOffset(69, 141).addBox(5.0F, -117.0F, -20.0F, 1.0F, 110.0F, 5.0F, 0.0F, false);
		leg12.setTextureOffset(69, 141).addBox(5.8277F, -56.5317F, -22.0F, 1.0F, 50.0F, 5.0F, 0.0F, false);
		leg12.setTextureOffset(69, 141).addBox(-6.8277F, -56.5317F, -22.0F, 1.0F, 50.0F, 5.0F, 0.0F, false);
		leg12.setTextureOffset(66, 250).addBox(-2.0F, -56.0F, -24.0F, 4.0F, 1.0F, 5.0F, 0.0F, false);
		leg12.setTextureOffset(66, 250).addBox(-1.5F, -117.0F, -20.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		leg12.setTextureOffset(70, 194).addBox(-1.5F, -116.5F, -20.5F, 3.0F, 61.0F, 1.0F, 0.0F, false);
		leg12.setTextureOffset(70, 194).addBox(1.019F, -56.2519F, -22.2142F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		leg12.setTextureOffset(70, 194).addBox(-6.981F, -56.2519F, -22.2142F, 6.0F, 1.0F, 1.0F, 0.0F, false);

		bone370 = new ModelRenderer(this);
		bone370.setRotationPoint(-4.6653F, -69.251F, -23.0365F);
		leg12.addChild(bone370);
		bone370.setTextureOffset(70, 194).addBox(0.2F, -37.0F, -0.5F, 2.0F, 51.0F, 1.0F, 0.0F, false);
		bone370.setTextureOffset(70, 194).addBox(-0.8F, -23.0F, -0.5F, 1.0F, 37.0F, 1.0F, 0.0F, false);
		bone370.setTextureOffset(70, 194).addBox(-1.8F, -8.0F, -0.5F, 1.0F, 22.0F, 1.0F, 0.0F, false);
		bone370.setTextureOffset(70, 194).addBox(-2.8F, 1.0F, -0.5F, 1.0F, 13.0F, 1.0F, 0.0F, false);
		bone370.setTextureOffset(70, 194).addBox(2.2F, -3.0F, -0.5F, 1.0F, 17.0F, 1.0F, 0.0F, false);

		bone371 = new ModelRenderer(this);
		bone371.setRotationPoint(4.8347F, -69.251F, -23.0365F);
		leg12.addChild(bone371);
		setRotationAngle(bone371, 0.0F, -1.2217F, 0.0F);
		bone371.setTextureOffset(70, 194).addBox(-1.8F, -37.0F, -0.5F, 2.0F, 51.0F, 1.0F, 0.0F, false);
		bone371.setTextureOffset(70, 194).addBox(0.2F, -23.0F, -0.5F, 1.0F, 37.0F, 1.0F, 0.0F, false);
		bone371.setTextureOffset(70, 194).addBox(1.2F, -8.0F, -0.5F, 1.0F, 22.0F, 1.0F, 0.0F, false);
		bone371.setTextureOffset(70, 194).addBox(2.2F, 1.0F, -0.5F, 1.0F, 13.0F, 1.0F, 0.0F, false);
		bone371.setTextureOffset(70, 194).addBox(-2.8F, -3.0F, -0.5F, 1.0F, 17.0F, 1.0F, 0.0F, false);

		bone372 = new ModelRenderer(this);
		bone372.setRotationPoint(7.0347F, -55.251F, -23.0365F);
		leg12.addChild(bone372);
		bone372.setTextureOffset(70, 194).addBox(0.6683F, -0.0105F, 3.2577F, 1.0F, 41.0F, 1.0F, 0.0F, false);
		bone372.setTextureOffset(70, 194).addBox(-0.3317F, -0.0105F, 3.2577F, 1.0F, 34.0F, 1.0F, 0.0F, false);
		bone372.setTextureOffset(70, 194).addBox(-1.3317F, -0.0105F, 3.2577F, 1.0F, 27.0F, 1.0F, 0.0F, false);
		bone372.setTextureOffset(70, 194).addBox(-2.3317F, -0.0105F, 3.2577F, 1.0F, 19.0F, 1.0F, 0.0F, false);
		bone372.setTextureOffset(70, 194).addBox(-3.3317F, -0.0105F, 3.2577F, 1.0F, 11.0F, 1.0F, 0.0F, false);
		bone372.setTextureOffset(70, 194).addBox(-3.8317F, -1.0105F, 3.2577F, 5.0F, 1.0F, 1.0F, 0.0F, false);

		bone373 = new ModelRenderer(this);
		bone373.setRotationPoint(6.6614F, -43.3447F, -14.2788F);
		leg12.addChild(bone373);
		setRotationAngle(bone373, -0.0873F, 0.6109F, 0.0F);
		bone373.setTextureOffset(70, 194).addBox(-8.3368F, -9.9474F, -13.9985F, 1.0F, 41.0F, 1.0F, 0.0F, false);
		bone373.setTextureOffset(70, 194).addBox(-7.3368F, -9.9474F, -13.9985F, 1.0F, 34.0F, 1.0F, 0.0F, false);
		bone373.setTextureOffset(70, 194).addBox(-6.3368F, -9.9474F, -13.9985F, 1.0F, 27.0F, 1.0F, 0.0F, false);
		bone373.setTextureOffset(70, 194).addBox(-5.3368F, -9.9474F, -13.9985F, 1.0F, 19.0F, 1.0F, 0.0F, false);
		bone373.setTextureOffset(70, 194).addBox(-4.3368F, -9.9474F, -13.9985F, 1.0F, 11.0F, 1.0F, 0.0F, false);
		bone373.setTextureOffset(70, 194).addBox(-8.3368F, -10.9474F, -13.9985F, 5.0F, 1.0F, 1.0F, 0.0F, false);

		fins_main3 = new ModelRenderer(this);
		fins_main3.setRotationPoint(0.0F, 0.0F, 0.0F);
		falcon_right.addChild(fins_main3);
		setRotationAngle(fins_main3, 0.0F, -0.7854F, 0.0F);
		

		fins1_4 = new ModelRenderer(this);
		fins1_4.setRotationPoint(0.0F, 0.0F, 0.0F);
		fins_main3.addChild(fins1_4);
		

		fin9 = new ModelRenderer(this);
		fin9.setRotationPoint(0.0F, -518.5F, -19.25F);
		fins1_4.addChild(fin9);
		setRotationAngle(fin9, 1.5708F, 0.0F, 0.0F);
		fin9.setTextureOffset(86, 243).addBox(-4.0F, -0.5F, -12.75F, 8.0F, 1.0F, 12.0F, 0.0F, false);
		fin9.setTextureOffset(70, 158).addBox(-2.0F, -0.5F, -0.75F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		fin10 = new ModelRenderer(this);
		fin10.setRotationPoint(0.0F, -518.5F, 19.25F);
		fins1_4.addChild(fin10);
		setRotationAngle(fin10, 1.5708F, 3.1416F, 0.0F);
		fin10.setTextureOffset(86, 243).addBox(-4.0F, -0.5F, -12.75F, 8.0F, 1.0F, 12.0F, 0.0F, false);
		fin10.setTextureOffset(70, 158).addBox(-2.0F, -0.5F, -0.75F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		fins3_3 = new ModelRenderer(this);
		fins3_3.setRotationPoint(0.0F, 0.0F, 0.0F);
		fins_main3.addChild(fins3_3);
		setRotationAngle(fins3_3, 0.0F, -1.5708F, 0.0F);
		

		fin11 = new ModelRenderer(this);
		fin11.setRotationPoint(0.0F, -518.5F, -19.25F);
		fins3_3.addChild(fin11);
		setRotationAngle(fin11, 1.5708F, 0.0F, 0.0F);
		fin11.setTextureOffset(86, 243).addBox(-4.0F, -0.5F, -12.75F, 8.0F, 1.0F, 12.0F, 0.0F, false);
		fin11.setTextureOffset(70, 158).addBox(-2.0F, -0.5F, -0.75F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		fin12 = new ModelRenderer(this);
		fin12.setRotationPoint(0.0F, -518.5F, 19.25F);
		fins3_3.addChild(fin12);
		setRotationAngle(fin12, 1.5708F, 3.1416F, 0.0F);
		fin12.setTextureOffset(86, 243).addBox(-4.0F, -0.5F, -12.75F, 8.0F, 1.0F, 12.0F, 0.0F, false);
		fin12.setTextureOffset(70, 158).addBox(-2.0F, -0.5F, -0.75F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		cone = new ModelRenderer(this);
		cone.setRotationPoint(46.0F, 5.0F, 0.0F);
		

		bone376 = new ModelRenderer(this);
		bone376.setRotationPoint(-3.0F, -568.75F, 0.0F);
		cone.addChild(bone376);
		bone376.setTextureOffset(56, 60).addBox(-4.0F, -0.5F, -7.0F, 8.0F, 1.0F, 14.0F, 0.0F, false);
		bone376.setTextureOffset(59, 85).addBox(-4.0F, -0.5F, -7.0F, 8.0F, 1.0F, 14.0F, 0.0F, false);
		bone376.setTextureOffset(59, 85).addBox(-4.0F, -0.5F, -7.0F, 8.0F, 1.0F, 14.0F, 0.0F, false);

		bone378 = new ModelRenderer(this);
		bone378.setRotationPoint(0.0F, 0.0F, 0.0F);
		cone.addChild(bone378);
		

		bone375 = new ModelRenderer(this);
		bone375.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone378.addChild(bone375);
		bone375.setTextureOffset(59, 67).addBox(-7.0F, -572.0F, -19.0F, 8.0F, 25.0F, 1.0F, 0.0F, false);

		bone377 = new ModelRenderer(this);
		bone377.setRotationPoint(-3.0F, 0.0F, 0.0F);
		bone378.addChild(bone377);
		setRotationAngle(bone377, 0.0F, 3.1416F, 0.0F);
		bone377.setTextureOffset(59, 67).addBox(-4.0F, -572.0F, -19.0F, 8.0F, 25.0F, 1.0F, 0.0F, false);

		bone379 = new ModelRenderer(this);
		bone379.setRotationPoint(-3.0F, 0.0F, 0.0F);
		cone.addChild(bone379);
		setRotationAngle(bone379, 0.0F, -0.5236F, 0.0F);
		

		bone380 = new ModelRenderer(this);
		bone380.setRotationPoint(3.0F, 0.0F, 0.0F);
		bone379.addChild(bone380);
		bone380.setTextureOffset(59, 67).addBox(-7.0F, -572.0F, -19.0F, 8.0F, 25.0F, 1.0F, 0.0F, false);

		bone381 = new ModelRenderer(this);
		bone381.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone379.addChild(bone381);
		setRotationAngle(bone381, 0.0F, 3.1416F, 0.0F);
		bone381.setTextureOffset(59, 67).addBox(-4.0F, -572.0F, -19.0F, 8.0F, 25.0F, 1.0F, 0.0F, false);

		bone382 = new ModelRenderer(this);
		bone382.setRotationPoint(-3.0F, 0.0F, 0.0F);
		cone.addChild(bone382);
		setRotationAngle(bone382, 0.0F, -1.0472F, 0.0F);
		

		bone383 = new ModelRenderer(this);
		bone383.setRotationPoint(3.0F, 0.0F, 0.0F);
		bone382.addChild(bone383);
		bone383.setTextureOffset(59, 67).addBox(-7.0F, -572.0F, -19.0F, 8.0F, 25.0F, 1.0F, 0.0F, false);

		bone384 = new ModelRenderer(this);
		bone384.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone382.addChild(bone384);
		setRotationAngle(bone384, 0.0F, 3.1416F, 0.0F);
		bone384.setTextureOffset(59, 67).addBox(-4.0F, -572.0F, -19.0F, 8.0F, 25.0F, 1.0F, 0.0F, false);

		bone385 = new ModelRenderer(this);
		bone385.setRotationPoint(-3.0F, 0.0F, 0.0F);
		cone.addChild(bone385);
		setRotationAngle(bone385, 0.0F, -1.5708F, 0.0F);
		

		bone386 = new ModelRenderer(this);
		bone386.setRotationPoint(3.0F, 0.0F, 0.0F);
		bone385.addChild(bone386);
		bone386.setTextureOffset(59, 67).addBox(-7.0F, -572.0F, -19.0F, 8.0F, 25.0F, 1.0F, 0.0F, false);

		bone387 = new ModelRenderer(this);
		bone387.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone385.addChild(bone387);
		setRotationAngle(bone387, 0.0F, 3.1416F, 0.0F);
		bone387.setTextureOffset(59, 67).addBox(-4.0F, -572.0F, -19.0F, 8.0F, 25.0F, 1.0F, 0.0F, false);

		bone388 = new ModelRenderer(this);
		bone388.setRotationPoint(-3.0F, 0.0F, 0.0F);
		cone.addChild(bone388);
		setRotationAngle(bone388, 0.0F, -2.0944F, 0.0F);
		

		bone389 = new ModelRenderer(this);
		bone389.setRotationPoint(3.0F, 0.0F, 0.0F);
		bone388.addChild(bone389);
		bone389.setTextureOffset(59, 67).addBox(-7.0F, -572.0F, -19.0F, 8.0F, 25.0F, 1.0F, 0.0F, false);

		bone390 = new ModelRenderer(this);
		bone390.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone388.addChild(bone390);
		setRotationAngle(bone390, 0.0F, 3.1416F, 0.0F);
		bone390.setTextureOffset(59, 67).addBox(-4.0F, -572.0F, -19.0F, 8.0F, 25.0F, 1.0F, 0.0F, false);

		bone391 = new ModelRenderer(this);
		bone391.setRotationPoint(-3.0F, 0.0F, 0.0F);
		cone.addChild(bone391);
		setRotationAngle(bone391, 0.0F, -2.618F, 0.0F);
		

		bone392 = new ModelRenderer(this);
		bone392.setRotationPoint(3.0F, 0.0F, 0.0F);
		bone391.addChild(bone392);
		bone392.setTextureOffset(59, 67).addBox(-7.0F, -572.0F, -19.0F, 8.0F, 25.0F, 1.0F, 0.0F, false);

		bone393 = new ModelRenderer(this);
		bone393.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone391.addChild(bone393);
		setRotationAngle(bone393, 0.0F, 3.1416F, 0.0F);
		bone393.setTextureOffset(59, 67).addBox(-4.0F, -572.0F, -19.0F, 8.0F, 25.0F, 1.0F, 0.0F, false);

		bone394 = new ModelRenderer(this);
		bone394.setRotationPoint(-3.0F, 0.0F, 0.0F);
		cone.addChild(bone394);
		setRotationAngle(bone394, 0.0F, -0.2618F, 0.0F);
		

		bone396 = new ModelRenderer(this);
		bone396.setRotationPoint(3.0F, 0.0F, 0.0F);
		bone394.addChild(bone396);
		

		bone397 = new ModelRenderer(this);
		bone397.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone396.addChild(bone397);
		bone397.setTextureOffset(59, 67).addBox(-7.0F, -572.0F, -19.0F, 8.0F, 25.0F, 1.0F, 0.0F, false);

		bone398 = new ModelRenderer(this);
		bone398.setRotationPoint(-3.0F, 0.0F, 0.0F);
		bone396.addChild(bone398);
		setRotationAngle(bone398, 0.0F, 3.1416F, 0.0F);
		bone398.setTextureOffset(59, 67).addBox(-4.0F, -572.0F, -19.0F, 8.0F, 25.0F, 1.0F, 0.0F, false);

		bone399 = new ModelRenderer(this);
		bone399.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone394.addChild(bone399);
		setRotationAngle(bone399, 0.0F, -0.5236F, 0.0F);
		

		bone400 = new ModelRenderer(this);
		bone400.setRotationPoint(3.0F, 0.0F, 0.0F);
		bone399.addChild(bone400);
		bone400.setTextureOffset(59, 67).addBox(-7.0F, -572.0F, -19.0F, 8.0F, 25.0F, 1.0F, 0.0F, false);

		bone401 = new ModelRenderer(this);
		bone401.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone399.addChild(bone401);
		setRotationAngle(bone401, 0.0F, 3.1416F, 0.0F);
		bone401.setTextureOffset(59, 67).addBox(-4.0F, -572.0F, -19.0F, 8.0F, 25.0F, 1.0F, 0.0F, false);

		bone402 = new ModelRenderer(this);
		bone402.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone394.addChild(bone402);
		setRotationAngle(bone402, 0.0F, -1.0472F, 0.0F);
		

		bone403 = new ModelRenderer(this);
		bone403.setRotationPoint(3.0F, 0.0F, 0.0F);
		bone402.addChild(bone403);
		bone403.setTextureOffset(59, 67).addBox(-7.0F, -572.0F, -19.0F, 8.0F, 25.0F, 1.0F, 0.0F, false);

		bone404 = new ModelRenderer(this);
		bone404.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone402.addChild(bone404);
		setRotationAngle(bone404, 0.0F, 3.1416F, 0.0F);
		bone404.setTextureOffset(59, 67).addBox(-4.0F, -572.0F, -19.0F, 8.0F, 25.0F, 1.0F, 0.0F, false);

		bone405 = new ModelRenderer(this);
		bone405.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone394.addChild(bone405);
		setRotationAngle(bone405, 0.0F, -1.5708F, 0.0F);
		

		bone406 = new ModelRenderer(this);
		bone406.setRotationPoint(3.0F, 0.0F, 0.0F);
		bone405.addChild(bone406);
		bone406.setTextureOffset(59, 67).addBox(-7.0F, -572.0F, -19.0F, 8.0F, 25.0F, 1.0F, 0.0F, false);

		bone407 = new ModelRenderer(this);
		bone407.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone405.addChild(bone407);
		setRotationAngle(bone407, 0.0F, 3.1416F, 0.0F);
		bone407.setTextureOffset(59, 67).addBox(-4.0F, -572.0F, -19.0F, 8.0F, 25.0F, 1.0F, 0.0F, false);

		bone408 = new ModelRenderer(this);
		bone408.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone394.addChild(bone408);
		setRotationAngle(bone408, 0.0F, -2.0944F, 0.0F);
		

		bone409 = new ModelRenderer(this);
		bone409.setRotationPoint(3.0F, 0.0F, 0.0F);
		bone408.addChild(bone409);
		bone409.setTextureOffset(59, 67).addBox(-7.0F, -572.0F, -19.0F, 8.0F, 25.0F, 1.0F, 0.0F, false);

		bone410 = new ModelRenderer(this);
		bone410.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone408.addChild(bone410);
		setRotationAngle(bone410, 0.0F, 3.1416F, 0.0F);
		bone410.setTextureOffset(59, 67).addBox(-4.0F, -572.0F, -19.0F, 8.0F, 25.0F, 1.0F, 0.0F, false);

		bone411 = new ModelRenderer(this);
		bone411.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone394.addChild(bone411);
		setRotationAngle(bone411, 0.0F, -2.618F, 0.0F);
		

		bone412 = new ModelRenderer(this);
		bone412.setRotationPoint(3.0F, 0.0F, 0.0F);
		bone411.addChild(bone412);
		bone412.setTextureOffset(59, 67).addBox(-7.0F, -572.0F, -19.0F, 8.0F, 25.0F, 1.0F, 0.0F, false);

		bone413 = new ModelRenderer(this);
		bone413.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone411.addChild(bone413);
		setRotationAngle(bone413, 0.0F, 3.1416F, 0.0F);
		bone413.setTextureOffset(59, 67).addBox(-4.0F, -572.0F, -19.0F, 8.0F, 25.0F, 1.0F, 0.0F, false);

		cone2 = new ModelRenderer(this);
		cone2.setRotationPoint(-40.0F, 5.0F, 0.0F);
		

		bone374 = new ModelRenderer(this);
		bone374.setRotationPoint(-3.0F, -568.75F, 0.0F);
		cone2.addChild(bone374);
		bone374.setTextureOffset(56, 60).addBox(-4.0F, -0.5F, -7.0F, 8.0F, 1.0F, 14.0F, 0.0F, false);
		bone374.setTextureOffset(59, 85).addBox(-4.0F, -0.5F, -7.0F, 8.0F, 1.0F, 14.0F, 0.0F, false);
		bone374.setTextureOffset(59, 85).addBox(-4.0F, -0.5F, -7.0F, 8.0F, 1.0F, 14.0F, 0.0F, false);

		bone395 = new ModelRenderer(this);
		bone395.setRotationPoint(0.0F, 0.0F, 0.0F);
		cone2.addChild(bone395);
		

		bone414 = new ModelRenderer(this);
		bone414.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone395.addChild(bone414);
		bone414.setTextureOffset(59, 67).addBox(-7.0F, -572.0F, -19.0F, 8.0F, 25.0F, 1.0F, 0.0F, false);

		bone415 = new ModelRenderer(this);
		bone415.setRotationPoint(-3.0F, 0.0F, 0.0F);
		bone395.addChild(bone415);
		setRotationAngle(bone415, 0.0F, 3.1416F, 0.0F);
		bone415.setTextureOffset(59, 67).addBox(-4.0F, -572.0F, -19.0F, 8.0F, 25.0F, 1.0F, 0.0F, false);

		bone416 = new ModelRenderer(this);
		bone416.setRotationPoint(-3.0F, 0.0F, 0.0F);
		cone2.addChild(bone416);
		setRotationAngle(bone416, 0.0F, -0.5236F, 0.0F);
		

		bone417 = new ModelRenderer(this);
		bone417.setRotationPoint(3.0F, 0.0F, 0.0F);
		bone416.addChild(bone417);
		bone417.setTextureOffset(59, 67).addBox(-7.0F, -572.0F, -19.0F, 8.0F, 25.0F, 1.0F, 0.0F, false);

		bone418 = new ModelRenderer(this);
		bone418.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone416.addChild(bone418);
		setRotationAngle(bone418, 0.0F, 3.1416F, 0.0F);
		bone418.setTextureOffset(59, 67).addBox(-4.0F, -572.0F, -19.0F, 8.0F, 25.0F, 1.0F, 0.0F, false);

		bone419 = new ModelRenderer(this);
		bone419.setRotationPoint(-3.0F, 0.0F, 0.0F);
		cone2.addChild(bone419);
		setRotationAngle(bone419, 0.0F, -1.0472F, 0.0F);
		

		bone420 = new ModelRenderer(this);
		bone420.setRotationPoint(3.0F, 0.0F, 0.0F);
		bone419.addChild(bone420);
		bone420.setTextureOffset(59, 67).addBox(-7.0F, -572.0F, -19.0F, 8.0F, 25.0F, 1.0F, 0.0F, false);

		bone421 = new ModelRenderer(this);
		bone421.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone419.addChild(bone421);
		setRotationAngle(bone421, 0.0F, 3.1416F, 0.0F);
		bone421.setTextureOffset(59, 67).addBox(-4.0F, -572.0F, -19.0F, 8.0F, 25.0F, 1.0F, 0.0F, false);

		bone422 = new ModelRenderer(this);
		bone422.setRotationPoint(-3.0F, 0.0F, 0.0F);
		cone2.addChild(bone422);
		setRotationAngle(bone422, 0.0F, -1.5708F, 0.0F);
		

		bone423 = new ModelRenderer(this);
		bone423.setRotationPoint(3.0F, 0.0F, 0.0F);
		bone422.addChild(bone423);
		bone423.setTextureOffset(59, 67).addBox(-7.0F, -572.0F, -19.0F, 8.0F, 25.0F, 1.0F, 0.0F, false);

		bone424 = new ModelRenderer(this);
		bone424.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone422.addChild(bone424);
		setRotationAngle(bone424, 0.0F, 3.1416F, 0.0F);
		bone424.setTextureOffset(59, 67).addBox(-4.0F, -572.0F, -19.0F, 8.0F, 25.0F, 1.0F, 0.0F, false);

		bone425 = new ModelRenderer(this);
		bone425.setRotationPoint(-3.0F, 0.0F, 0.0F);
		cone2.addChild(bone425);
		setRotationAngle(bone425, 0.0F, -2.0944F, 0.0F);
		

		bone426 = new ModelRenderer(this);
		bone426.setRotationPoint(3.0F, 0.0F, 0.0F);
		bone425.addChild(bone426);
		bone426.setTextureOffset(59, 67).addBox(-7.0F, -572.0F, -19.0F, 8.0F, 25.0F, 1.0F, 0.0F, false);

		bone427 = new ModelRenderer(this);
		bone427.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone425.addChild(bone427);
		setRotationAngle(bone427, 0.0F, 3.1416F, 0.0F);
		bone427.setTextureOffset(59, 67).addBox(-4.0F, -572.0F, -19.0F, 8.0F, 25.0F, 1.0F, 0.0F, false);

		bone428 = new ModelRenderer(this);
		bone428.setRotationPoint(-3.0F, 0.0F, 0.0F);
		cone2.addChild(bone428);
		setRotationAngle(bone428, 0.0F, -2.618F, 0.0F);
		

		bone429 = new ModelRenderer(this);
		bone429.setRotationPoint(3.0F, 0.0F, 0.0F);
		bone428.addChild(bone429);
		bone429.setTextureOffset(59, 67).addBox(-7.0F, -572.0F, -19.0F, 8.0F, 25.0F, 1.0F, 0.0F, false);

		bone430 = new ModelRenderer(this);
		bone430.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone428.addChild(bone430);
		setRotationAngle(bone430, 0.0F, 3.1416F, 0.0F);
		bone430.setTextureOffset(59, 67).addBox(-4.0F, -572.0F, -19.0F, 8.0F, 25.0F, 1.0F, 0.0F, false);

		bone431 = new ModelRenderer(this);
		bone431.setRotationPoint(-3.0F, 0.0F, 0.0F);
		cone2.addChild(bone431);
		setRotationAngle(bone431, 0.0F, -0.2618F, 0.0F);
		

		bone432 = new ModelRenderer(this);
		bone432.setRotationPoint(3.0F, 0.0F, 0.0F);
		bone431.addChild(bone432);
		

		bone433 = new ModelRenderer(this);
		bone433.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone432.addChild(bone433);
		bone433.setTextureOffset(59, 67).addBox(-7.0F, -572.0F, -19.0F, 8.0F, 25.0F, 1.0F, 0.0F, false);

		bone434 = new ModelRenderer(this);
		bone434.setRotationPoint(-3.0F, 0.0F, 0.0F);
		bone432.addChild(bone434);
		setRotationAngle(bone434, 0.0F, 3.1416F, 0.0F);
		bone434.setTextureOffset(59, 67).addBox(-4.0F, -572.0F, -19.0F, 8.0F, 25.0F, 1.0F, 0.0F, false);

		bone435 = new ModelRenderer(this);
		bone435.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone431.addChild(bone435);
		setRotationAngle(bone435, 0.0F, -0.5236F, 0.0F);
		

		bone436 = new ModelRenderer(this);
		bone436.setRotationPoint(3.0F, 0.0F, 0.0F);
		bone435.addChild(bone436);
		bone436.setTextureOffset(59, 67).addBox(-7.0F, -572.0F, -19.0F, 8.0F, 25.0F, 1.0F, 0.0F, false);

		bone437 = new ModelRenderer(this);
		bone437.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone435.addChild(bone437);
		setRotationAngle(bone437, 0.0F, 3.1416F, 0.0F);
		bone437.setTextureOffset(59, 67).addBox(-4.0F, -572.0F, -19.0F, 8.0F, 25.0F, 1.0F, 0.0F, false);

		bone438 = new ModelRenderer(this);
		bone438.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone431.addChild(bone438);
		setRotationAngle(bone438, 0.0F, -1.0472F, 0.0F);
		

		bone439 = new ModelRenderer(this);
		bone439.setRotationPoint(3.0F, 0.0F, 0.0F);
		bone438.addChild(bone439);
		bone439.setTextureOffset(59, 67).addBox(-7.0F, -572.0F, -19.0F, 8.0F, 25.0F, 1.0F, 0.0F, false);

		bone440 = new ModelRenderer(this);
		bone440.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone438.addChild(bone440);
		setRotationAngle(bone440, 0.0F, 3.1416F, 0.0F);
		bone440.setTextureOffset(59, 67).addBox(-4.0F, -572.0F, -19.0F, 8.0F, 25.0F, 1.0F, 0.0F, false);

		bone441 = new ModelRenderer(this);
		bone441.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone431.addChild(bone441);
		setRotationAngle(bone441, 0.0F, -1.5708F, 0.0F);
		

		bone442 = new ModelRenderer(this);
		bone442.setRotationPoint(3.0F, 0.0F, 0.0F);
		bone441.addChild(bone442);
		bone442.setTextureOffset(59, 67).addBox(-7.0F, -572.0F, -19.0F, 8.0F, 25.0F, 1.0F, 0.0F, false);

		bone443 = new ModelRenderer(this);
		bone443.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone441.addChild(bone443);
		setRotationAngle(bone443, 0.0F, 3.1416F, 0.0F);
		bone443.setTextureOffset(59, 67).addBox(-4.0F, -572.0F, -19.0F, 8.0F, 25.0F, 1.0F, 0.0F, false);

		bone444 = new ModelRenderer(this);
		bone444.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone431.addChild(bone444);
		setRotationAngle(bone444, 0.0F, -2.0944F, 0.0F);
		

		bone445 = new ModelRenderer(this);
		bone445.setRotationPoint(3.0F, 0.0F, 0.0F);
		bone444.addChild(bone445);
		bone445.setTextureOffset(59, 67).addBox(-7.0F, -572.0F, -19.0F, 8.0F, 25.0F, 1.0F, 0.0F, false);

		bone446 = new ModelRenderer(this);
		bone446.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone444.addChild(bone446);
		setRotationAngle(bone446, 0.0F, 3.1416F, 0.0F);
		bone446.setTextureOffset(59, 67).addBox(-4.0F, -572.0F, -19.0F, 8.0F, 25.0F, 1.0F, 0.0F, false);

		bone447 = new ModelRenderer(this);
		bone447.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone431.addChild(bone447);
		setRotationAngle(bone447, 0.0F, -2.618F, 0.0F);
		

		bone448 = new ModelRenderer(this);
		bone448.setRotationPoint(3.0F, 0.0F, 0.0F);
		bone447.addChild(bone448);
		bone448.setTextureOffset(59, 67).addBox(-7.0F, -572.0F, -19.0F, 8.0F, 25.0F, 1.0F, 0.0F, false);

		bone449 = new ModelRenderer(this);
		bone449.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone447.addChild(bone449);
		setRotationAngle(bone449, 0.0F, 3.1416F, 0.0F);
		bone449.setTextureOffset(59, 67).addBox(-4.0F, -572.0F, -19.0F, 8.0F, 25.0F, 1.0F, 0.0F, false);

		mounting = new ModelRenderer(this);
		mounting.setRotationPoint(0.0F, 24.0F, 0.0F);
		mounting.setTextureOffset(45, 44).addBox(-40.0F, -527.0F, -19.5F, 80.0F, 1.0F, 1.0F, 0.0F, false);
		mounting.setTextureOffset(45, 44).addBox(-40.0F, -527.0F, 18.5F, 80.0F, 1.0F, 1.0F, 0.0F, false);

		bone450 = new ModelRenderer(this);
		bone450.setRotationPoint(-10.0F, -540.5F, 19.0F);
		mounting.addChild(bone450);
		bone450.setTextureOffset(45, 44).addBox(0.0F, -0.5F, -0.5F, 20.0F, 1.0F, 1.0F, 0.0F, false);
		bone450.setTextureOffset(45, 44).addBox(0.0F, -0.5F, -0.5F, 20.0F, 1.0F, 1.0F, 0.0F, false);
		bone450.setTextureOffset(45, 44).addBox(-20.0F, -0.5F, -0.5F, 20.0F, 1.0F, 1.0F, 0.0F, false);

		bone451 = new ModelRenderer(this);
		bone451.setRotationPoint(-10.0F, -540.5F, -19.0F);
		mounting.addChild(bone451);
		bone451.setTextureOffset(45, 44).addBox(0.0F, -0.5F, -0.5F, 20.0F, 1.0F, 1.0F, 0.0F, false);
		bone451.setTextureOffset(45, 44).addBox(0.0F, -0.5F, -0.5F, 20.0F, 1.0F, 1.0F, 0.0F, false);
		bone451.setTextureOffset(45, 44).addBox(-20.0F, -0.5F, -0.5F, 20.0F, 1.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(FalconHeavyRocket entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		falcon9.render(matrixStack, buffer, packedLight, packedOverlay);
		stage2.render(matrixStack, buffer, packedLight, packedOverlay);
		fairing.render(matrixStack, buffer, packedLight, packedOverlay);
		falcon_left.render(matrixStack, buffer, packedLight, packedOverlay);
		falcon_right.render(matrixStack, buffer, packedLight, packedOverlay);
		cone.render(matrixStack, buffer, packedLight, packedOverlay);
		cone2.render(matrixStack, buffer, packedLight, packedOverlay);
		mounting.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}