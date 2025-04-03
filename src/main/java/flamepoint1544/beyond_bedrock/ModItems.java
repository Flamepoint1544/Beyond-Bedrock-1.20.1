package flamepoint1544.beyond_bedrock;

import flamepoint1544.beyond_bedrock.Items.BBArmorMaterials;
import flamepoint1544.beyond_bedrock.Items.BBToolMaterials;
import flamepoint1544.beyond_bedrock.Items.MortarPestle;
import flamepoint1544.beyond_bedrock.Items.geo.Ultimatium.Axe.UltimatiumAxe;
import flamepoint1544.beyond_bedrock.Items.geo.Ultimatium.Hoe.UltimatiumHoe;
import flamepoint1544.beyond_bedrock.Items.geo.Ultimatium.Pickaxe.UltimatiumPickaxe;
import flamepoint1544.beyond_bedrock.Items.geo.Ultimatium.Shovel.UltimatiumShovel;
import flamepoint1544.beyond_bedrock.Items.geo.Ultimatium.Sword.UltimatiumSword;
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
import net.minecraft.item.ToolMaterials;
import net.minecraft.item.ArmorItem.Type;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class ModItems {
    // item stats
    // sword
    public static final int swordDamage = 3;
    public static final float swordSpeed = -2.4f;

    // shovel
    public static final float shovelDamage = 1.5f;
    public static final float shovelSpeed = -3;

    // pickaxe
    public static final int pickaxeDamage = 1;
    public static final float pickaxeSpeed = 2.8f;

    // Axe
    public static final int axeDamage = 6;
    public static final float axeSpeed = -3.2f;

    // Hoe
    public static final int hoeDamage = 0;
    public static final float hoeSpeed = -3;

    // tools
    // mortar tier 1
    public static final Item MORTAR_F = register(new MortarPestle(new Item.Settings(), 25, BBToolMaterials.FLINT), "mortar_pestle_flint");
    public static final Item MORTAR_G = register(new MortarPestle(new Item.Settings(), 10, ToolMaterials.GOLD), "mortar_pestle_gold");
    // mortar tier 2
    public static final Item MORTAR_C = register(new MortarPestle(new Item.Settings(), 25, BBToolMaterials.COPPER), "mortar_pestle_copper");
    public static final Item MORTAR_I = register(new MortarPestle(new Item.Settings(), 50, ToolMaterials.IRON), "mortar_pestle_iron");
    public static final Item MORTAR_S = register(new MortarPestle(new Item.Settings(), 75, BBToolMaterials.STEEL), "mortar_pestle_steel");
    // mortar tier 3
    public static final Item MORTAR_D = register(new MortarPestle(new Item.Settings(), 75, ToolMaterials.DIAMOND), "mortar_pestle_diamond");
    // mortar tier 4
    public static final Item MORTAR_N = register(new MortarPestle(new Item.Settings(), 100, ToolMaterials.NETHERITE), "mortar_pestle_netherite");
    public static final Item MORTAR_U = register(new MortarPestle(new Item.Settings(), 200, BBToolMaterials.ULTIMATIUM), "mortar_pestle_ultimatium");

    // random crafting items
    public static final Item INFUSED_SUGAR = register(new Item(new Item.Settings()), "infused_sugar");
    public static final Item RED_DIAMOND = register(new Item(new Item.Settings()), "red_diamond");
    public static final Item GILDED_STAR = register(new Item(new Item.Settings()), "gilded_star");
    public static final Item GILDED_STAR_CLUSTER = register(new Item(new Item.Settings()), "gilded_star_cluster");

    // Ultimatium
    public static final Item ULTIMATIUM = register(new Item(new Item.Settings().rarity(Rarity.RARE)), "ultimatium");
    public static final Item ULTIMATIUM_RAW = register(new Item(new Item.Settings().rarity(Rarity.RARE)), "ultimatium_raw");
    public static final Item ULTIMATIUM_CORE = register(new Item(new Item.Settings().rarity(Rarity.RARE)), "ultimatium_core");
    // Ultimatium tools
    public static final Item ULTIMATIUM_SWORD = register(new UltimatiumSword(BBToolMaterials.ULTIMATIUM, swordDamage, swordSpeed, new Item.Settings().rarity(Rarity.EPIC)), "ultimatium_sword");
    public static final Item ULTIMATIUM_SHOVEL = register(new UltimatiumShovel(BBToolMaterials.ULTIMATIUM, shovelDamage, shovelSpeed, new Item.Settings().rarity(Rarity.EPIC)), "ultimatium_shovel");
    public static final Item ULTIMATIUM_PICKAXE = register(new UltimatiumPickaxe(BBToolMaterials.ULTIMATIUM, pickaxeDamage, pickaxeSpeed, new Item.Settings().rarity(Rarity.EPIC)), "ultimatium_pickaxe");
    public static final Item ULTIMATIUM_AXE = register(new UltimatiumAxe(BBToolMaterials.ULTIMATIUM, axeDamage, axeSpeed, new Item.Settings().rarity(Rarity.EPIC)), "ultimatium_axe");
    public static final Item ULTIMATIUM_HOE = register(new UltimatiumHoe(BBToolMaterials.ULTIMATIUM, hoeDamage, hoeSpeed, new Item.Settings().rarity(Rarity.EPIC)), "ultimatium_hoe");
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
    public static final Item COPPER_SWORD = register(new SwordItem(BBToolMaterials.COPPER, swordDamage, swordSpeed, new Item.Settings()), "copper_sword");
    public static final Item COPPER_SHOVEL = register(new ShovelItem(BBToolMaterials.COPPER, shovelDamage, shovelSpeed, new Item.Settings()), "copper_shovel");
    public static final Item COPPER_PICKAXE = register(new PickaxeItem(BBToolMaterials.COPPER, pickaxeDamage, pickaxeSpeed, new Item.Settings()), "copper_pickaxe");
    public static final Item COPPER_AXE = register(new AxeItem(BBToolMaterials.COPPER, axeDamage, axeSpeed, new Item.Settings()), "copper_axe");
    public static final Item COPPER_HOE = register(new HoeItem(BBToolMaterials.COPPER, hoeDamage, hoeDamage, new Item.Settings()), "copper_hoe");
    // Copper Armor
    public static final Item COPPER_HELMET = register(new ArmorItem(BBArmorMaterials.COPPER, Type.HELMET, new Item.Settings()), "copper_helmet");
    public static final Item COPPER_CHESTPLATE = register(new ArmorItem(BBArmorMaterials.COPPER, Type.CHESTPLATE, new Item.Settings()), "copper_chestplate");
    public static final Item COPPER_LEGGINGS = register(new ArmorItem(BBArmorMaterials.COPPER, Type.LEGGINGS, new Item.Settings()), "copper_leggings");
    public static final Item COPPER_BOOTS = register(new ArmorItem(BBArmorMaterials.COPPER, Type.BOOTS, new Item.Settings()), "copper_boots");

    // Steel
    public static final Item STEEL_INGOT = register(new Item(new Item.Settings()), "steel_ingot");
    public static final Item STEEL_BLEND = register(new Item(new Item.Settings()), "steel_blend");
    public static final Item CRUSHED_IRON = register(new Item(new Item.Settings()), "crushed_iron");
    public static final Item CRUSHED_COAL = register(new Item(new Item.Settings()), "crushed_coal");
    // Steel Tools
    public static final Item STEEL_SWORD = register(new SwordItem(BBToolMaterials.STEEL, swordDamage, swordSpeed, new Item.Settings()), "steel_sword");
    public static final Item STEEL_SHOVEL = register(new ShovelItem(BBToolMaterials.STEEL, shovelDamage, shovelSpeed, new Item.Settings()), "steel_shovel");
    public static final Item STEEL_PICKAXE = register(new PickaxeItem(BBToolMaterials.STEEL, pickaxeDamage, pickaxeSpeed, new Item.Settings()), "steel_pickaxe");
    public static final Item STEEL_AXE = register(new AxeItem(BBToolMaterials.STEEL, axeDamage, axeSpeed, new Item.Settings()), "steel_axe");
    public static final Item STEEL_HOE = register(new HoeItem(BBToolMaterials.STEEL, axeDamage, axeSpeed, new Item.Settings()), "steel_hoe");
    public static final Item STEEL_SHEAR = register(new ShearsItem(new Item.Settings().maxDamage(476)), "steel_shear");
    // Steel armor
    public static final Item STEEL_HELMET = register(new ArmorItem(BBArmorMaterials.STEEL, Type.HELMET, new Item.Settings()), "steel_helmet");
    public static final Item STEEL_CHESTPLATE = register(new ArmorItem(BBArmorMaterials.STEEL, Type.CHESTPLATE, new Item.Settings()), "steel_chestplate");
    public static final Item STEEL_LEGGINGS = register(new ArmorItem(BBArmorMaterials.STEEL, Type.LEGGINGS, new Item.Settings()), "steel_leggings");
    public static final Item STEEL_BOOTS = register(new ArmorItem(BBArmorMaterials.STEEL, Type.BOOTS, new Item.Settings()), "steel_boots");

    // Tin
    public static final Item TIN_RAW = register(new Item(new Item.Settings()), "raw_tin");
    public static final Item TIN = register(new Item(new Item.Settings()), "tin_ingot");
    // Tin Tools
    public static final Item TIN_SWORD = register(new SwordItem(BBToolMaterials.TIN, swordDamage, swordSpeed, new Item.Settings()), "tin_sword");
    public static final Item TIN_SHOVEL = register(new ShovelItem(BBToolMaterials.TIN, shovelDamage, shovelSpeed, new Item.Settings()), "tin_shovel");
    public static final Item TIN_PICKAXE = register(new PickaxeItem(BBToolMaterials.TIN, pickaxeDamage, pickaxeSpeed, new Item.Settings()), "tin_pickaxe");
    public static final Item TIN_AXE = register(new AxeItem(BBToolMaterials.TIN, axeDamage, axeSpeed, new Item.Settings()), "tin_axe");
    public static final Item TIN_HOE = register(new HoeItem(BBToolMaterials.TIN, hoeDamage, hoeSpeed, new Item.Settings()), "tin_hoe");
    // Tin Armor
    public static final Item TIN_HELMET = register(new ArmorItem(BBArmorMaterials.TIN, Type.HELMET, new Item.Settings()), "tin_helmet");
    public static final Item TIN_CHESTPLATE = register(new ArmorItem(BBArmorMaterials.TIN, Type.CHESTPLATE, new Item.Settings()), "tin_chestplate");
    public static final Item TIN_LEGGINGS = register(new ArmorItem(BBArmorMaterials.TIN, Type.LEGGINGS, new Item.Settings()), "tin_leggings");
    public static final Item TIN_BOOTS = register(new ArmorItem(BBArmorMaterials.TIN, Type.BOOTS, new Item.Settings()), "tin_boots");

    // Silver

    // Lead

    // Uranium

    // Nickel

    // Platinum

    // Zinc

    // Titanium

    // Cobalt

    // Thorium

    // Bronze (Copper Tin)

    // Brass (Copper Zinc)

    // Magnesium

    // cupronickel (Copper Nickel)

    // Sterling Silver (Silver Copper)

    // Inconel (Nickel Iron)

    // Solder (Tin Lead)

    // Electrum (Silver Gold)

    // Rose-Gold (Copper Gold)

    // Stelaruim (Steal Ultimatium)

    // Coultium (Copper Ultimatium)

    // (Tin Ultimatium)

    // (Silver Ultimatium)

    // (Lead Ultimatium)

    // Ultiranium (Uranium Ultimatium)

    // (Nickel Ultimatium)

    // (Platinum Ultimatium)

    // Zultium (Zinc Ultimatium)

    // (Titanium Ultimatium)
    
    // (Cobalt Ultimatium)

    // (Thorium Ultimatium)

    // item group registry keys
    public static final RegistryKey<ItemGroup> PRIMARY_GROUP_KEY = RegistryKey.of(
        Registries.ITEM_GROUP.getKey(), 
        Identifier.of(BeyondBedrock.MOD_ID, "primary_item_group"));
    public static final RegistryKey<ItemGroup> EQUIPMENT_GROUP_KEY = RegistryKey.of(
        Registries.ITEM_GROUP.getKey(), 
        Identifier.of(BeyondBedrock.MOD_ID, "equipment_item_group"));
    public static final RegistryKey<ItemGroup> ALTSTONE_GROUP_KEY = RegistryKey.of(
        Registries.ITEM_GROUP.getKey(), 
        Identifier.of(BeyondBedrock.MOD_ID, "altstone_item_group"));

    // Item Groups
    public static final ItemGroup PRIMARY_ITEM_GROUP = FabricItemGroup.builder()
        .icon(() -> new ItemStack(Items.BEDROCK.asItem()))
        .displayName(Text.translatable("itemGroup.beyond_bedrock.primary_item_group"))
        .build();
    public static final ItemGroup EQUIPMENT_ITEM_GROUP = FabricItemGroup.builder()
        .icon(() -> new ItemStack(ULTIMATIUM_SWORD))
        .displayName(Text.translatable("itemGroup.beyond_bedrock.equipment_item_group"))
        .build();
    public static final ItemGroup ALTSTONE_ITEM_GROUP = FabricItemGroup.builder()
        .icon(() -> new ItemStack(Items.BEDROCK.asItem()))
        .displayName(Text.translatable("itemGroup.beyond_bedrock.altstone_item_group"))
        .build();

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
        Registry.register(Registries.ITEM_GROUP, EQUIPMENT_GROUP_KEY, EQUIPMENT_ITEM_GROUP);
        Registry.register(Registries.ITEM_GROUP, ALTSTONE_GROUP_KEY, ALTSTONE_ITEM_GROUP);
        Registry.register(Registries.ITEM_GROUP, PRIMARY_GROUP_KEY, PRIMARY_ITEM_GROUP);

        // add items to registered group
        ItemGroupEvents.modifyEntriesEvent(EQUIPMENT_GROUP_KEY).register(itemGroup ->{
            // Ultimatium
            // Ultimatium Tools
            itemGroup.add(ULTIMATIUM_SWORD);
            itemGroup.add(ULTIMATIUM_PICKAXE);
            itemGroup.add(ULTIMATIUM_AXE);
            itemGroup.add(ULTIMATIUM_SHOVEL);
            itemGroup.add(ULTIMATIUM_HOE);
            itemGroup.add(ULTIMATIUM_SHEAR);
            // Ultimatium Armor
            itemGroup.add(ULTIMATIUM_HELMET);
            itemGroup.add(ULTIMATIUM_CHESTPLATE);
            itemGroup.add(ULTIMATIUM_LEGGINGS);
            itemGroup.add(ULTIMATIUM_BOOTS);

            // Netherite
            // Frame
            itemGroup.add(NETHERITE_FRAME_HELMET);
            itemGroup.add(NETHERITE_FRAME_CHESTPLATE);
            itemGroup.add(NETHERITE_FRAME_LEGGINGS);
            itemGroup.add(NETHERITE_FRAME_BOOTS);
            // Base
            itemGroup.add(NETHERITE_BASE_HELMET);
            itemGroup.add(NETHERITE_BASE_CHESTPLATE);
            itemGroup.add(NETHERITE_BASE_LEGGINGS);
            itemGroup.add(NETHERITE_BASE_BOOTS);

            // Copper
            // copper tools
            itemGroup.add(COPPER_SWORD);
            itemGroup.add(COPPER_PICKAXE);
            itemGroup.add(COPPER_AXE);
            itemGroup.add(COPPER_SHOVEL);
            itemGroup.add(COPPER_HOE);
            // copper armor
            itemGroup.add(COPPER_HELMET);
            itemGroup.add(COPPER_CHESTPLATE);
            itemGroup.add(COPPER_LEGGINGS);
            itemGroup.add(COPPER_BOOTS);

            // Tin tools
            itemGroup.add(TIN_SWORD);
            itemGroup.add(TIN_SHOVEL);
            itemGroup.add(TIN_PICKAXE);
            itemGroup.add(TIN_AXE);
            itemGroup.add(TIN_HOE);
            // Tin Armor
            itemGroup.add(TIN_HELMET);
            itemGroup.add(TIN_CHESTPLATE);
            itemGroup.add(TIN_LEGGINGS);
            itemGroup.add(TIN_BOOTS);

            // Steel tools
            itemGroup.add(STEEL_SWORD);
            itemGroup.add(STEEL_SHOVEL);
            itemGroup.add(STEEL_PICKAXE);
            itemGroup.add(STEEL_AXE);
            itemGroup.add(STEEL_HOE);
            itemGroup.add(STEEL_SHEAR);
            // Steel armor
            itemGroup.add(STEEL_HELMET);
            itemGroup.add(STEEL_CHESTPLATE);
            itemGroup.add(STEEL_LEGGINGS);
            itemGroup.add(STEEL_BOOTS);

            // Mortar and Pestles
            // tier 1
            itemGroup.add(MORTAR_F);
            itemGroup.add(MORTAR_G);
            // tier 2
            itemGroup.add(MORTAR_I);
            itemGroup.add(MORTAR_C);
            itemGroup.add(MORTAR_S);
            //tier 3
            itemGroup.add(MORTAR_D);
            // tier 4
            itemGroup.add(MORTAR_N);
            itemGroup.add(MORTAR_U);
        });

        ItemGroupEvents.modifyEntriesEvent(ALTSTONE_GROUP_KEY).register(itemGroup ->{
            // Stone varients
            itemGroup.add(ModBlocks.STONE_WALL);
            // Stone Bricks
            itemGroup.add(ModBlocks.STONE_BRICK_BUTTON);
            itemGroup.add(ModBlocks.STONE_BRICK_PRESSURE);
            // Cracked stone bricks
            itemGroup.add(ModBlocks.CRACKED_STONE_BRICK_STAIR);
            itemGroup.add(ModBlocks.CRACKED_STONE_BRICK_SLAB);
            itemGroup.add(ModBlocks.CRACKED_STONE_BRICK_WALL);
            itemGroup.add(ModBlocks.CRACKED_STONE_BRICK_PRESSURE);
            itemGroup.add(ModBlocks.CRACKED_STONE_BRICK_BUTTON);
            // Chiseled Stone
            itemGroup.add(ModBlocks.CHISELED_STONE_STAIR);
            itemGroup.add(ModBlocks.CHISELED_STONE_SLAB);
            itemGroup.add(ModBlocks.CHISELED_STONE_WALL);
            itemGroup.add(ModBlocks.CHISELED_STONE_BUTTON);
            itemGroup.add(ModBlocks.CHISELED_STONE_PRESSURE);
            // Gilded Stone
            // Smooth Stone
            itemGroup.add(ModBlocks.SMOOTH_STONE_STAIR);
            itemGroup.add(ModBlocks.SMOOTH_STONE_WALL);
            itemGroup.add(ModBlocks.SMOOTH_STONE_BUTTON);
            itemGroup.add(ModBlocks.SMOOTH_STONE_PRESSURE);

            // Glass
            itemGroup.add(ModBlocks.BORDERLESS_GLASS);
            itemGroup.add(ModBlocks.BORDERLESS_GLASS_SLAB);
        });

        ItemGroupEvents.modifyEntriesEvent(PRIMARY_GROUP_KEY).register(itemGroup ->{
            // Ultimatium
            itemGroup.add(ULTIMATIUM);
            itemGroup.add(ULTIMATIUM_RAW);
            itemGroup.add(ULTIMATIUM_CORE);
            // Blocks
            itemGroup.add(ModBlocks.ULTIMATIUM);
            itemGroup.add(ModBlocks.ULTIMATIUM_ORE);
            itemGroup.add(ModBlocks.ULTIMATIUM_RAW);

            // Tin
            itemGroup.add(TIN);
            itemGroup.add(TIN_RAW);
            // Tin Blocks
            itemGroup.add(ModBlocks.TIN_BLOCK);
            itemGroup.add(ModBlocks.TIN_ORE);
            itemGroup.add(ModBlocks.TIN_RAW);

            // Steel
            itemGroup.add(STEEL_BLEND);
            itemGroup.add(STEEL_INGOT);
            itemGroup.add(CRUSHED_IRON);
            itemGroup.add(CRUSHED_COAL);
            // Steel blocks
            itemGroup.add(ModBlocks.STEEL_BLOCK);
            itemGroup.add(ModBlocks.STEEL_DUST);
            itemGroup.add(ModBlocks.IRON_DUST);
            itemGroup.add(ModBlocks.COAL_DUST);

            // Misc
            itemGroup.add(INFUSED_SUGAR);
            itemGroup.add(RED_DIAMOND);
            itemGroup.add(GILDED_STAR);
            itemGroup.add(GILDED_STAR_CLUSTER);
         });
    }
}