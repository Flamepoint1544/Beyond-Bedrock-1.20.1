package flamepoint1544.beyond_bedrock.Items.geo;

import flamepoint1544.beyond_bedrock.BeyondBedrock;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class UltimatiumPickaxeModel extends GeoModel<UltimatiumPickaxe> {
    private final Identifier model = new Identifier(BeyondBedrock.MOD_ID, "geo/ultimatium_pickaxe.geo.json");
	private final Identifier texture = new Identifier(BeyondBedrock.MOD_ID, "textures/item/ultimatium/tools/ultimatium_pickaxe.png");
	private final Identifier animations = new Identifier(BeyondBedrock.MOD_ID, "animations/items/ultimatium_pickaxe.animation.json");

    @Override
	public Identifier getModelResource(UltimatiumPickaxe animatable) {
		return model;
	}

	@Override
	public Identifier getTextureResource(UltimatiumPickaxe animatable) {
		return texture;
	}

	@Override
	public Identifier getAnimationResource(UltimatiumPickaxe animatable) {
		return animations;
	}
}
