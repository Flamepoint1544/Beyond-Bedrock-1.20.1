package flamepoint1544.beyond_bedrock;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.AxeItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShearsItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ArmorItem.Type;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class ModItems {
    // Ultimatium
    public static final Item ULTIMATIUM = register(new Item(new Item.Settings().rarity(Rarity.RARE)), "ultimatium");
    public static final Item ULTIMATIUM_RAW = register(new Item(new Item.Settings().rarity(Rarity.RARE)), "ultimatium_raw");
    public static final Item ULTIMATIUM_CORE = register(new Item(new Item.Settings().rarity(Rarity.RARE)), "ultimatium_core");
    
    // Ultimatium tools
    public static final Item ULTIMATIUM_SWORD = register(new SwordItem(BBToolMaterials.ULTIMATIUM, 3, -2.4f, new Item.Settings().rarity(Rarity.EPIC)), "ultimatium_sword");
    public static final Item ULTIMATIUM_SHOVEL = register(new ShovelItem(BBToolMaterials.ULTIMATIUM, 1.5f, -3, new Item.Settings().rarity(Rarity.EPIC)), "ultimatium_shovel");
    public static final Item ULTIMATIUM_PICKAXE = register(new PickaxeItem(BBToolMaterials.ULTIMATIUM, 1, 2.8f, new Item.Settings().rarity(Rarity.EPIC)), "ultimatium_pickaxe");
    public static final Item ULTIMATIUM_AXE = register(new AxeItem(BBToolMaterials.ULTIMATIUM, 6, -3.2f, new Item.Settings().rarity(Rarity.EPIC)), "ultimatium_axe");
    public static final Item ULTIMATIUM_HOE = register(new HoeItem(BBToolMaterials.ULTIMATIUM, 0, -3, new Item.Settings().rarity(Rarity.EPIC)), "ultimatium_hoe");
    public static final Item ULTIMATIUM_SHEAR = register(new ShearsItem(new Item.Settings().maxDamage(4062).rarity(Rarity.EPIC)), "ultimatium_shears");

    // Ultimatium Armor
    public static final Item ULTIMATIUM_HELMET = register(new ArmorItem(BBArmorMaterials.ULTIMATIUM, Type.HELMET, new Item.Settings().rarity(Rarity.EPIC)), "ultimatium_helmet");
    public static final Item ULTIMATIUM_CHESTPLATE = register(new ArmorItem(BBArmorMaterials.ULTIMATIUM, Type.CHESTPLATE, new Item.Settings().rarity(Rarity.EPIC)), "ultimatium_chestplate");
    public static final Item ULTIMATIUM_LEGGINGS = register(new ArmorItem(BBArmorMaterials.ULTIMATIUM, Type.LEGGINGS, new Item.Settings().rarity(Rarity.EPIC)), "ultimatium_leggings");
    public static final Item ULTIMATIUM_BOOTS = register(new ArmorItem(BBArmorMaterials.ULTIMATIUM, Type.BOOTS, new Item.Settings().rarity(Rarity.EPIC)), "ultimatium_boots");

    // Netherite Frame
    public static final Item NETHERITE_FRAME_HELMET = register(new Item(new Item.Settings()), "netherite_frame_helmet");
    public static final Item NETHERITE_FRAME_CHESTPLATE = register(new Item(new Item.Settings()), "netherite_frame_chestplate");
    public static final Item NETHERITE_FRAME_LEGGINGS = register(new Item(new Item.Settings()), "netherite_frame_leggings");
    public static final Item NETHERITE_FRAME_BOOTS = register(new Item(new Item.Settings()), "netherite_frame_boots");

    // Netherite Base
    public static final Item NETHERITE_BASE_HELMET = register(new Item(new Item.Settings()), "netherite_base_helmet");
    public static final Item NETHERITE_BASE_CHESTPLATE = register(new Item(new Item.Settings()), "netherite_base_chestplate");
    public static final Item NETHERITE_BASE_LEGGINGS = register(new Item(new Item.Settings()), "netherite_base_leggings");
    public static final Item NETHERITE_BASE_BOOTS = register(new Item(new Item.Settings()), "netherite_base_boots");

    // Copper Tools
    public static final Item COPPER_SWORD = register(new SwordItem(BBToolMaterials.COPPER, 3, -2.4f, new Item.Settings()), "copper_sword");
    public static final Item COPPER_SHOVEL = register(new ShovelItem(BBToolMaterials.COPPER, 1.5f, -3, new Item.Settings()), "copper_shovel");
    public static final Item COPPER_PICKAXE = register(new PickaxeItem(BBToolMaterials.COPPER, 1, 2.8f, new Item.Settings()), "copper_pickaxe");
    public static final Item COPPER_AXE = register(new AxeItem(BBToolMaterials.COPPER, 6, -3.2f, new Item.Settings()), "copper_axe");
    public static final Item COPPER_HOE = register(new HoeItem(BBToolMaterials.COPPER, 0, -3, new Item.Settings()), "copper_hoe");

    // Copper Armor
    public static final Item COPPER_HELMET = register(new ArmorItem(BBArmorMaterials.COPPER, Type.HELMET, new Item.Settings()), "copper_helmet");
    public static final Item COPPER_CHESTPLATE = register(new ArmorItem(BBArmorMaterials.COPPER, Type.CHESTPLATE, new Item.Settings()), "copper_chestplate");
    public static final Item COPPER_LEGGINGS = register(new ArmorItem(BBArmorMaterials.COPPER, Type.LEGGINGS, new Item.Settings()), "copper_leggings");
    public static final Item COPPER_BOOTS = register(new ArmorItem(BBArmorMaterials.COPPER, Type.BOOTS, new Item.Settings()), "copper_boots");

    // Steel

    // Tin

    // Silver

    // Lead

    // Uranium

    // Nickel

    // Platinum

    // Zinc

    // Titanium

    // Cobalt

    // Thorium

    // Bronze

    // Brass

    // Magnesium

    // cupronickel

    // Sterling Silver

    // Inconel

    // Solder

    // Electrum

    // Steel-Ultimatium alloy

    // Copper-Ultimatium alloy

    // Tin-Ultimatium Alloy

    // Silver-Ultimatium Alloy

    // Lead-Ultimatium Alloy

    // Uranium-Ultimatium Alloy

    // Nickel-Ultimatium Alloy

    // Platinum-Ultimatium Alloy

    // Zinc-Ultimatium Alloy

    // Titanium-Ultimatium Alloy
    
    // Cobalt-Ultimatium Alloy

    // Thorium-Ultimatium Alloy

    // item group registry keys
    public static final RegistryKey<ItemGroup> PRIMARY_GROUP_KEY = RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of(BeyondBedrock.MOD_ID, "primary_item_group"));

    // Item Groups
    public static final ItemGroup PRIMARY_ITEM_GROUP = FabricItemGroup.builder()
    .icon(() -> new ItemStack(Items.BEDROCK.asItem()))
    .displayName(Text.translatable("itemGroup.beyond_bedrock.primary_item_group")).build();
    
    /***************************************************************************************************
     * +# register(Item item, String id): Item
     * Registers items using the string id and the modid defined in the main class to make an identifier
     ***************************************************************************************************/
    public static Item register(Item item, String id){
        // Create Identifier
        Identifier itemID = Identifier.of(BeyondBedrock.MOD_ID, id);

        // Register the item
        Item registeredItem = Registry.register(Registries.ITEM, itemID, item);

        // Return
        return registeredItem;
    }

    /**********************************************************
     * +# initialize(): void
     * Initializes the file while also registering item groups
     *********************************************************/
    public static void initialize(){
        // Register group
        Registry.register(Registries.ITEM_GROUP, PRIMARY_GROUP_KEY, PRIMARY_ITEM_GROUP);

        // add items to registered group
        ItemGroupEvents.modifyEntriesEvent(PRIMARY_GROUP_KEY).register(itemGroup ->{
            itemGroup.add(ULTIMATIUM);
            itemGroup.add(ULTIMATIUM_RAW);
            itemGroup.add(ULTIMATIUM_CORE);
            itemGroup.add(ULTIMATIUM_SWORD);
            itemGroup.add(ULTIMATIUM_PICKAXE);
            itemGroup.add(ULTIMATIUM_AXE);
            itemGroup.add(ULTIMATIUM_SHOVEL);
            itemGroup.add(ULTIMATIUM_HOE);
            itemGroup.add(ULTIMATIUM_SHEAR);
            itemGroup.add(ULTIMATIUM_HELMET);
            itemGroup.add(ULTIMATIUM_CHESTPLATE);
            itemGroup.add(ULTIMATIUM_LEGGINGS);
            itemGroup.add(ULTIMATIUM_BOOTS);
            itemGroup.add(ModBlocks.ULTIMATIUM);
            itemGroup.add(ModBlocks.ULTIMATIUM_ORE);
            itemGroup.add(ModBlocks.ULTIMATIUM_RAW);
            itemGroup.add(COPPER_SWORD);
            itemGroup.add(COPPER_PICKAXE);
            itemGroup.add(COPPER_AXE);
            itemGroup.add(COPPER_SHOVEL);
            itemGroup.add(COPPER_HOE);
            itemGroup.add(COPPER_HELMET);
            itemGroup.add(COPPER_CHESTPLATE);
            itemGroup.add(COPPER_LEGGINGS);
            itemGroup.add(COPPER_BOOTS);
            itemGroup.add(NETHERITE_FRAME_HELMET);
            itemGroup.add(NETHERITE_FRAME_CHESTPLATE);
            itemGroup.add(NETHERITE_FRAME_LEGGINGS);
            itemGroup.add(NETHERITE_FRAME_BOOTS);
            itemGroup.add(NETHERITE_BASE_HELMET);
            itemGroup.add(NETHERITE_BASE_CHESTPLATE);
            itemGroup.add(NETHERITE_BASE_LEGGINGS);
            itemGroup.add(NETHERITE_BASE_BOOTS);
         });
    }
}