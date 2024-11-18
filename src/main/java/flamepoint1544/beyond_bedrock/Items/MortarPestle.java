package flamepoint1544.beyond_bedrock.Items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;

public class MortarPestle extends Item{
    private final ToolMaterial material;

    public MortarPestle(Settings settings, int maxDamage, ToolMaterial material) {
        super(settings.maxDamage(maxDamage));
        this.material = material;
    }
    
    @Override
    public ItemStack getRecipeRemainder(ItemStack stack) {
        ItemStack defStack = this.getDefaultStack();
        defStack.setDamage(stack.getDamage() + 1);
        return defStack;
    }

    public boolean canRepair(ItemStack stack, ItemStack ingredient) {
        return this.material.getRepairIngredient().test(ingredient) || super.canRepair(stack, ingredient);
     }
}
