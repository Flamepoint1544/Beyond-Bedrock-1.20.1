package flamepoint1544.beyond_bedrock.Items.geo.Ultimatium.Hoe;

import flamepoint1544.beyond_bedrock.BeyondBedrock;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class UltimatiumHoeModel extends GeoModel<UltimatiumHoe> {
    private final Identifier model = new Identifier(BeyondBedrock.MOD_ID, "geo/ultimatium_hoe.geo.json");
	private final Identifier texture = new Identifier(BeyondBedrock.MOD_ID, "textures/item/ultimatium/tools/ultimatium_hoe.png");
	private final Identifier animations = new Identifier(BeyondBedrock.MOD_ID, "animations/items/ultimatium_hoe.animation.json");

    @Override
    public Identifier getModelResource(UltimatiumHoe animatable) {
        return model;
    }

    @Override
    public Identifier getTextureResource(UltimatiumHoe animatable) {
        return texture;
    }

    @Override
    public Identifier getAnimationResource(UltimatiumHoe animatable) {
        return animations;
    }
    
}