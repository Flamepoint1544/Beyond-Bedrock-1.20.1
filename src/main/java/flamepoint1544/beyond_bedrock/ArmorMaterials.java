package flamepoint1544.beyond_bedrock;

import java.util.EnumMap;
import java.util.function.Supplier;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorItem.Type;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Lazy;
import net.minecraft.util.StringIdentifiable;
import net.minecraft.util.Util;

public enum ArmorMaterials implements StringIdentifiable, ArmorMaterial {
    @SuppressWarnings({ "rawtypes", "unchecked" })
    ULTIMATIUM("ultimatium", 5, (EnumMap)Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
        map.put(Type.BOOTS, 3);
        map.put(Type.LEGGINGS, 6);
        map.put(Type.CHESTPLATE, 8);
        map.put(Type.HELMET, 3);
    }), 15, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 5.0f, 0.4f, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{ModItems.ULTIMATIUM});
    });

    @SuppressWarnings("deprecation")
    public static final StringIdentifiable.Codec<ArmorMaterials> CODEC = StringIdentifiable.createCodec(ArmorMaterials::values);
    @SuppressWarnings({ "rawtypes", "unchecked" })
    private static final EnumMap<ArmorItem.Type, Integer> BASE_DURABILITY = (EnumMap)Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
      map.put(Type.BOOTS, 13);
      map.put(Type.LEGGINGS, 15);
      map.put(Type.CHESTPLATE, 16);
      map.put(Type.HELMET, 11);
   });
   private final String name;
   private final int durabilityMultiplier;
   private final EnumMap<ArmorItem.Type, Integer> protectionAmounts;
   private final int enchantability;
   private final SoundEvent equipSound;
   private final float toughness;
   private final float knockbackResistance;
   @SuppressWarnings("deprecation")
   private final Lazy<Ingredient> repairIngredientSupplier;

   @SuppressWarnings({ "rawtypes", "unchecked", "deprecation" })

   private ArmorMaterials(String name, int durabilityMultiplier, EnumMap protectionAmounts, int enchantability, SoundEvent equipSound, float toughness, float knockbackResistance, Supplier repairIngredientSupplier) {
      this.name = name;
      this.durabilityMultiplier = durabilityMultiplier;
      this.protectionAmounts = protectionAmounts;
      this.enchantability = enchantability;
      this.equipSound = equipSound;
      this.toughness = toughness;
      this.knockbackResistance = knockbackResistance;
      this.repairIngredientSupplier = new Lazy(repairIngredientSupplier);
   }

   public int getDurability(ArmorItem.Type type) {
      return (Integer)BASE_DURABILITY.get(type) * this.durabilityMultiplier;
   }

   public int getProtection(ArmorItem.Type type) {
      return (Integer)this.protectionAmounts.get(type);
   }

   public int getEnchantability() {
      return this.enchantability;
   }

   public SoundEvent getEquipSound() {
      return this.equipSound;
   }

   @SuppressWarnings("deprecation")
public Ingredient getRepairIngredient() {
      return (Ingredient)this.repairIngredientSupplier.get();
   }

   public String getName() {
      return this.name;
   }

   public float getToughness() {
      return this.toughness;
   }

   public float getKnockbackResistance() {
      return this.knockbackResistance;
   }

   public String asString() {
      return this.name;
   }
}