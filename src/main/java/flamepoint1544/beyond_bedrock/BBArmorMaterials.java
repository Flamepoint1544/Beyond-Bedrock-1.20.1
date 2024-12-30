package flamepoint1544.beyond_bedrock;

import java.util.EnumMap;
import java.util.function.Supplier;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorItem.Type;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Lazy;
import net.minecraft.util.StringIdentifiable;
import net.minecraft.util.Util;

public enum BBArmorMaterials implements StringIdentifiable, ArmorMaterial {
    @SuppressWarnings({ "rawtypes", "unchecked" })
    ULTIMATIUM("ultimatium", 45, (EnumMap)Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
        map.put(Type.BOOTS, 6);
        map.put(Type.LEGGINGS, 12);
        map.put(Type.CHESTPLATE, 16);
        map.put(Type.HELMET, 6);
    }), 15, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 5.0f, 0.4f, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{ModItems.ULTIMATIUM});
    }),
    @SuppressWarnings({ "rawtypes", "unchecked" })
   COPPER("copper", 10, (EnumMap)Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
      map.put(Type.BOOTS, 2);
      map.put(Type.LEGGINGS, 5);
      map.put(Type.CHESTPLATE, 6);
      map.put(Type.HELMET, 2);
    }), 13, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0, 0, () -> {
      return Ingredient.ofItems(new ItemConvertible[]{Items.COPPER_INGOT});
    }),
    @SuppressWarnings({ "unchecked", "rawtypes" })
   STEEL("steel", 20, (EnumMap)Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
      map.put(Type.BOOTS, 2);
      map.put(Type.LEGGINGS, 5);
      map.put(Type.CHESTPLATE, 6);
      map.put(Type.HELMET, 2);
   }), 13, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0, 0, () -> {
      return Ingredient.ofItems(new ItemConvertible[]{ModItems.STEEL_INGOT});
   }),
   @SuppressWarnings({ "rawtypes", "unchecked" })
   TIN("copper", 10, (EnumMap)Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
      map.put(Type.BOOTS, 2);
      map.put(Type.LEGGINGS, 5);
      map.put(Type.CHESTPLATE, 6);
      map.put(Type.HELMET, 2);
    }), 13, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0, 0, () -> {
      return Ingredient.ofItems(new ItemConvertible[]{Items.COPPER_INGOT});
    });

    @SuppressWarnings("deprecation")
    public static final StringIdentifiable.Codec<BBArmorMaterials> CODEC = StringIdentifiable.createCodec(BBArmorMaterials::values);
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

   private BBArmorMaterials(String name, int durabilityMultiplier, EnumMap protectionAmounts, int enchantability, SoundEvent equipSound, float toughness, float knockbackResistance, Supplier repairIngredientSupplier) {
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