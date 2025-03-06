package flamepoint1544.beyond_bedrock.Items.geo;

import flamepoint1544.beyond_bedrock.BeyondBedrock;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class UltimatiumAxeModel extends GeoModel<UltimatiumAxe> {
	private final Identifier model = new Identifier(BeyondBedrock.MOD_ID, "geo/ultimatium_axe.geo.json");
	private final Identifier texture = new Identifier(BeyondBedrock.MOD_ID, "textures/item/ultimatium/tools/ultimatium_axe.png");
	private final Identifier animations = new Identifier(BeyondBedrock.MOD_ID, "animations/example.animation.json");

	@Override
	public Identifier getModelResource(UltimatiumAxe animatable) {
		return model;
	}

	@Override
	public Identifier getTextureResource(UltimatiumAxe animatable) {
		return texture;
	}

	@Override
	public Identifier getAnimationResource(UltimatiumAxe animatable) {
		return animations;
	}
}
