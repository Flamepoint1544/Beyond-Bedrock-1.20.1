package flamepoint1544.beyond_bedrock.Items.geo;

import flamepoint1544.beyond_bedrock.BeyondBedrock;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class UltimatiumShovelModel extends GeoModel<UltimatiumShovel> {
	private final Identifier model = new Identifier(BeyondBedrock.MOD_ID, "geo/ultimatium_shovel.geo.json");
	private final Identifier texture = new Identifier(BeyondBedrock.MOD_ID, "textures/item/ultimatium/tools/ultimatium_shovel.png");
	private final Identifier animations = new Identifier(BeyondBedrock.MOD_ID, "animations/example.animation.json");

	@Override
	public Identifier getModelResource(UltimatiumShovel animatable) {
		return model;
	}

	@Override
	public Identifier getTextureResource(UltimatiumShovel animatable) {
		return texture;
	}

	@Override
	public Identifier getAnimationResource(UltimatiumShovel animatable) {
		return animations;
	}
}
