// Made with Blockbench 4.7.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelRocket<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "rocket"), "main");
	private final ModelPart bb_main;

	public ModelRocket(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(38, 71)
						.addBox(-17.0F, -2.0F, -17.0F, 34.0F, 2.0F, 34.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(15.0F, -73.0F, -17.0F, 2.0F, 71.0F, 34.0F, new CubeDeformation(0.0F)).texOffs(72, 0)
						.addBox(-17.0F, -30.0F, -17.0F, 2.0F, 28.0F, 34.0F, new CubeDeformation(0.0F)).texOffs(64, 107)
						.addBox(-15.0F, -73.0F, 15.0F, 30.0F, 71.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 107)
						.addBox(-15.0F, -73.0F, -17.0F, 30.0F, 71.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(110, 0)
						.addBox(13.0F, -77.0F, -15.0F, 2.0F, 4.0F, 30.0F, new CubeDeformation(0.0F)).texOffs(38, 0)
						.addBox(-15.0F, -77.0F, -15.0F, 2.0F, 4.0F, 30.0F, new CubeDeformation(0.0F)).texOffs(158, 120)
						.addBox(-13.0F, -77.0F, 13.0F, 26.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(158, 114)
						.addBox(-13.0F, -77.0F, -15.0F, 26.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(158, 126)
						.addBox(-11.0F, -81.0F, 11.0F, 22.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(170, 6)
						.addBox(-9.0F, -85.0F, 9.0F, 18.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(72, 64)
						.addBox(-11.0F, -81.0F, -13.0F, 22.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(170, 0)
						.addBox(-9.0F, -85.0F, -11.0F, 18.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(72, 24)
						.addBox(-7.0F, -89.0F, 7.0F, 14.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(110, 0)
						.addBox(-5.0F, -93.0F, 5.0F, 10.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(18, 6)
						.addBox(-3.0F, -97.0F, 3.0F, 6.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(72, 18)
						.addBox(-7.0F, -89.0F, -9.0F, 14.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(38, 22)
						.addBox(-5.0F, -93.0F, -7.0F, 10.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(18, 0)
						.addBox(-3.0F, -97.0F, -5.0F, 6.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(38, 14)
						.addBox(-3.0F, -99.0F, -3.0F, 6.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(128, 107)
						.addBox(-13.0F, -81.0F, -13.0F, 2.0F, 4.0F, 26.0F, new CubeDeformation(0.0F)).texOffs(144, 0)
						.addBox(-11.0F, -85.0F, -11.0F, 2.0F, 4.0F, 22.0F, new CubeDeformation(0.0F)).texOffs(166, 64)
						.addBox(-9.0F, -89.0F, -9.0F, 2.0F, 4.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(72, 0)
						.addBox(-7.0F, -93.0F, -7.0F, 2.0F, 4.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(38, 0)
						.addBox(-5.0F, -97.0F, -5.0F, 2.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 18)
						.addBox(3.0F, -97.0F, -5.0F, 2.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(5.0F, -93.0F, -7.0F, 2.0F, 4.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(158, 92)
						.addBox(7.0F, -89.0F, -9.0F, 2.0F, 4.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(140, 66)
						.addBox(9.0F, -85.0F, -11.0F, 2.0F, 4.0F, 22.0F, new CubeDeformation(0.0F)).texOffs(118, 36)
						.addBox(11.0F, -81.0F, -13.0F, 2.0F, 4.0F, 26.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0F, -103.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(112, 180)
						.addBox(-1.0F, -22.0F, 17.0F, 2.0F, 18.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(104, 180)
						.addBox(-1.0F, -20.0F, 19.0F, 2.0F, 18.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(96, 180)
						.addBox(-1.0F, -18.0F, 21.0F, 2.0F, 18.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(88, 180)
						.addBox(-1.0F, -16.0F, 23.0F, 2.0F, 18.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(80, 180)
						.addBox(-1.0F, -14.0F, 25.0F, 2.0F, 18.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(72, 180)
						.addBox(-1.0F, -12.0F, 27.0F, 2.0F, 18.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(64, 180)
						.addBox(-1.0F, -10.0F, 29.0F, 2.0F, 18.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(156, 137)
						.addBox(-17.0F, -73.0F, -17.0F, 2.0F, 43.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(128, 137)
						.addBox(-17.0F, -73.0F, 5.0F, 2.0F, 43.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(174, 26)
						.addBox(-17.0F, -73.0F, -5.0F, 2.0F, 28.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = bb_main.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(110, 6)
						.addBox(-1.0F, -22.0F, 17.0F, 2.0F, 18.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(118, 6)
						.addBox(-1.0F, -20.0F, 19.0F, 2.0F, 18.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(126, 6)
						.addBox(-1.0F, -18.0F, 21.0F, 2.0F, 18.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(128, 107)
						.addBox(-1.0F, -16.0F, 23.0F, 2.0F, 18.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(136, 107)
						.addBox(-1.0F, -14.0F, 25.0F, 2.0F, 18.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(140, 66)
						.addBox(-1.0F, -12.0F, 27.0F, 2.0F, 18.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(144, 0)
						.addBox(-1.0F, -10.0F, 29.0F, 2.0F, 18.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r2 = bb_main.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(144, 107)
						.addBox(-1.0F, -10.0F, 29.0F, 2.0F, 18.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(148, 34)
						.addBox(-1.0F, -12.0F, 27.0F, 2.0F, 18.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(148, 66)
						.addBox(-1.0F, -14.0F, 25.0F, 2.0F, 18.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(152, 0)
						.addBox(-1.0F, -16.0F, 23.0F, 2.0F, 18.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(156, 34)
						.addBox(-1.0F, -18.0F, 21.0F, 2.0F, 18.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(164, 34)
						.addBox(-1.0F, -20.0F, 19.0F, 2.0F, 18.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 180)
						.addBox(-1.0F, -22.0F, 17.0F, 2.0F, 18.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r3 = bb_main.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(8, 180)
						.addBox(-1.0F, -22.0F, 17.0F, 2.0F, 18.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(16, 180)
						.addBox(-1.0F, -20.0F, 19.0F, 2.0F, 18.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(24, 180)
						.addBox(-1.0F, -18.0F, 21.0F, 2.0F, 18.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(32, 180)
						.addBox(-1.0F, -16.0F, 23.0F, 2.0F, 18.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(40, 180)
						.addBox(-1.0F, -14.0F, 25.0F, 2.0F, 18.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(48, 180)
						.addBox(-1.0F, -12.0F, 27.0F, 2.0F, 18.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(56, 180)
						.addBox(-1.0F, -10.0F, 29.0F, 2.0F, 18.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 3.1416F, 0.0F, 3.1416F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}