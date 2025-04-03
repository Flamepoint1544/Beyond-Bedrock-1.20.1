package flamepoint1544.beyond_bedrock.Items.geo;

import flamepoint1544.beyond_bedrock.BeyondBedrock;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class UltimatiumSwordModel extends GeoModel<UltimatiumSword> {
    private final Identifier model = new Identifier(BeyondBedrock.MOD_ID, "geo/ultimatium_sword.geo.json");
	private final Identifier texture = new Identifier(BeyondBedrock.MOD_ID, "textures/item/ultimatium/tools/ultimatium_sword.png");
	private final Identifier animations = new Identifier(BeyondBedrock.MOD_ID, "animations/items/ultimatium_sword.animation.json");
    @Override
    public Identifier getModelResource(UltimatiumSword animatable) {
        return model;
    }
    @Override
    public Identifier getTextureResource(UltimatiumSword animatable) {
        return texture;
    }
    @Override
    public Identifier getAnimationResource(UltimatiumSword animatable) {
        return animations;
    }
    
}
