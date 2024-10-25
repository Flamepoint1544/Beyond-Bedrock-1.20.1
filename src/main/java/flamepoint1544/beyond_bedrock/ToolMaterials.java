package flamepoint1544.beyond_bedrock;

import java.util.function.Supplier;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Lazy;

public enum ToolMaterials implements ToolMaterial{
    ULTIMATIUM(5, 4062, 10.0f, 5.0f, 25, () ->{
        return Ingredient.ofItems(ModItems.ULTIMATIUM);
    });

    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    @SuppressWarnings("deprecation")
    private final Lazy<Ingredient> repairIngredient;

    @SuppressWarnings({ "deprecation", "rawtypes", "unchecked" })
    private ToolMaterials(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = new Lazy(repairIngredient);
    }

    public int getDurability() {
        return this.itemDurability;
    }

    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    public float getAttackDamage() {
        return this.attackDamage;
    }

    public int getMiningLevel() {
        return this.miningLevel;
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    @SuppressWarnings("deprecation")
    public Ingredient getRepairIngredient() {
        return (Ingredient)this.repairIngredient.get();
    }
    
}
