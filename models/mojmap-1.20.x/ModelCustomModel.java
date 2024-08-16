// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelCustomModel<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "custommodel"), "main");
	private final ModelPart Head;
	private final ModelPart RightArm;
	private final ModelPart LeftArm;
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;
	private final ModelPart Body;

	public ModelCustomModel(ModelPart root) {
		this.Head = root.getChild("Head");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
		this.Body = root.getChild("Body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create(),
				PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create(),
				PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create(),
				PartPose.offset(-1.9F, 12.0F, 0.0F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create(),
				PartPose.offset(1.9F, 12.0F, 0.0F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(0, 44)
						.addBox(-5.0F, -1.0F, -3.0F, 2.0F, 14.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(5, 5)
						.addBox(-3.0F, 3.0F, 6.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(1.0F, 2.0F, 3.0F, 6.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(59, 55)
						.addBox(8.0F, 6.0F, 5.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(59, 55)
						.addBox(9.0F, 8.0F, 5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(59, 55)
						.addBox(7.0F, 4.0F, 5.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(59, 55)
						.addBox(-10.0F, 8.0F, 5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(59, 55)
						.addBox(-9.0F, 6.0F, 5.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(59, 55)
						.addBox(-8.0F, 4.0F, 5.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 57)
						.addBox(1.0F, 1.0F, 3.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(43, 59)
						.addBox(2.0F, 0.0F, 4.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(46, 61)
						.addBox(3.0F, -1.0F, 5.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(40, 57)
						.addBox(-7.0F, 1.0F, 3.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(43, 59)
						.addBox(-6.0F, 0.0F, 4.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(46, 61)
						.addBox(-5.0F, -1.0F, 5.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(40, 0)
						.addBox(-7.0F, 11.0F, 3.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(43, 2)
						.addBox(-6.0F, 10.0F, 4.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 0)
						.addBox(1.0F, 11.0F, 3.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(43, 2)
						.addBox(2.0F, 10.0F, 4.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-7.0F, 2.0F, 3.0F, 6.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 44)
						.addBox(3.0F, -1.0F, -3.0F, 2.0F, 14.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}