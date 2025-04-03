package flamepoint1544.beyond_bedrock.Items.geo.Ultimatium.Shovel;

import java.util.function.Consumer;
import java.util.function.Supplier;

import net.minecraft.client.render.item.BuiltinModelItemRenderer;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterial;
import software.bernie.geckolib.animatable.GeoItem;
import software.bernie.geckolib.animatable.client.RenderProvider;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animation.AnimatableManager.ControllerRegistrar;
import software.bernie.geckolib.util.GeckoLibUtil;

public class UltimatiumShovel extends ShovelItem implements GeoItem {
    // Declare
    private final Supplier<Object> renderProvider = GeoItem.makeRenderer(this);
    private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);

    public UltimatiumShovel(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }

    @Override
    public void createRenderer(Consumer<Object> consumer) {
        consumer.accept(new RenderProvider() {
		private UltimatiumShovelRenderer renderer;

		@Override
		public BuiltinModelItemRenderer getCustomRenderer() {
			if (this.renderer == null)
				this.renderer = new UltimatiumShovelRenderer();

			return this.renderer;
		}
	});
    }

    @Override
    public Supplier<Object> getRenderProvider() {
        return this.renderProvider;
    }

    @Override
    public void registerControllers(ControllerRegistrar controllers) {
        
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return this.cache;
    }
}
