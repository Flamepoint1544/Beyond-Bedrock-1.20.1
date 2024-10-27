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
    public static final Item ULTIMATIUM_SWORD = register(new SwordItem(ToolMaterials.ULTIMATIUM, 3, -2.4f, new Item.Settings().rarity(Rarity.EPIC)), "ultimatium_sword");
    public static final Item ULTIMATIUM_SHOVEL = register(new ShovelItem(ToolMaterials.ULTIMATIUM, 1.5f, -3.0f, new Item.Settings().rarity(Rarity.EPIC)), "ultimatium_shovel");
    public static final Item ULTIMATIUM_PICKAXE = register(new PickaxeItem(ToolMaterials.ULTIMATIUM, 1, 2.8f, new Item.Settings().rarity(Rarity.EPIC)), "ultimatium_pickaxe");
    public static final Item ULTIMATIUM_AXE = register(new AxeItem(ToolMaterials.ULTIMATIUM, 6, -3.2f, new Item.Settings().rarity(Rarity.EPIC)), "ultimatium_axe");
    public static final Item ULTIMATIUM_HOE = register(new HoeItem(ToolMaterials.ULTIMATIUM, 0, -3, new Item.Settings().rarity(Rarity.EPIC)), "ultimatium_hoe");
    public static final Item ULTIMATIUM_SHEAR = register(new ShearsItem(new Item.Settings().maxDamage(4062).rarity(Rarity.EPIC)), "ultimatium_shears");

    // Ultimatium Armor
    public static final Item ULTIMATIUM_HELMET = register(new ArmorItem(ArmorMaterials.ULTIMATIUM, Type.HELMET, new Item.Settings().rarity(Rarity.EPIC)), "ultimatium_helment");
    public static final Item ULTIMATIUM_CHESTPLATE = register(new ArmorItem(ArmorMaterials.ULTIMATIUM, Type.CHESTPLATE, new Item.Settings().rarity(Rarity.EPIC)), "ultimatium_chestplate");
    public static final Item ULTIMATIUM_LEGGINGS = register(new ArmorItem(ArmorMaterials.ULTIMATIUM, Type.LEGGINGS, new Item.Settings().rarity(Rarity.EPIC)), "ultimatium_leggings");
    public static final Item ULTIMATIUM_BOOTS = register(new ArmorItem(ArmorMaterials.ULTIMATIUM, Type.BOOTS, new Item.Settings().rarity(Rarity.EPIC)), "ultimatium_boots");

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
         });
    }
}