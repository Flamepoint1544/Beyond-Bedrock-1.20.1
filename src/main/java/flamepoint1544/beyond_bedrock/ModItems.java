package flamepoint1544.beyond_bedrock;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
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
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class ModItems {
    public static final Item ULTIMATIUM = register(new Item(new Item.Settings().rarity(Rarity.RARE)), "ultimatium");
    public static final Item ULTIMATIUM_RAW = register(new Item(new Item.Settings().rarity(Rarity.RARE)), "ultimatium_raw");
    public static final Item ULTIMATIUM_CORE = register(new Item(new Item.Settings().rarity(Rarity.RARE)), "ultimatium_core");
    public static final Item ULTIMATIUM_SWORD = register(new SwordItem(ToolMaterials.ULTIMATIUM, 3, -2.4f, new Item.Settings().rarity(Rarity.EPIC)), "ultimatium_sword");
    public static final Item ULTIMATIUM_SHOVEL = register(new ShovelItem(ToolMaterials.ULTIMATIUM, 1.5f, -3.0f, new Item.Settings().rarity(Rarity.EPIC)), "ultimatium_shovel");
    public static final Item ULTIMATIUM_PICKAXE = register(new PickaxeItem(ToolMaterials.ULTIMATIUM, 1, 2.8f, new Item.Settings().rarity(Rarity.EPIC)), "ultimatium_pickaxe");
    public static final Item ULTIMATIUM_AXE = register(new AxeItem(ToolMaterials.ULTIMATIUM, 6, -3.2f, new Item.Settings().rarity(Rarity.EPIC)), "ultimatium_axe");
    public static final Item ULTIMATIUM_HOE = register(new HoeItem(ToolMaterials.ULTIMATIUM, 0, -3, new Item.Settings().rarity(Rarity.EPIC)), "ultimatium_hoe");
    public static final Item ULTIMATIUM_SHEAR = register(new ShearsItem(new Item.Settings().maxDamage(4062)), "ultimatium_shears");

    // Registry keys
    public static final RegistryKey<ItemGroup> PRIMARY_GROUP_KEY = RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of(BeyondBedrock.MOD_ID, "primary_item_group"));

    // Item Groups
    public static final ItemGroup PRIMARY_ITEM_GROUP = FabricItemGroup.builder()
    .icon(() -> new ItemStack(Items.BEDROCK.asItem()))
    .displayName(Text.translatable("itemGroup.beyond_bedrock.primary_item_group")).build();
    
    public static Item register(Item item, String id){
        // Create Identifier
        Identifier itemID = Identifier.of(BeyondBedrock.MOD_ID, id);

        // Register the item
        Item registeredItem = Registry.register(Registries.ITEM, itemID, item);

        // Return
        return registeredItem;
    }

    public static void initialize(){
        Registry.register(Registries.ITEM_GROUP, PRIMARY_GROUP_KEY, PRIMARY_ITEM_GROUP);

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
            itemGroup.add(ModBlocks.ULTIMATIUM);
            itemGroup.add(ModBlocks.ULTIMATIUM_ORE);
            itemGroup.add(ModBlocks.ULTIMATIUM_RAW);
         });
    }
}