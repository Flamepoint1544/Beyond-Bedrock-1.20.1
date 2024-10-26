package flamepoint1544.beyond_bedrock;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item ULTIMATIUM = register(new Item(new Item.Settings()), "ultimatium");
    public static final Item ULTIMATIUM_RAW = register(new Item(new Item.Settings()), "ultimatium_raw");
    
    // Registry keys
    public static final RegistryKey<ItemGroup> PRIMARY_GROUP_KEY = RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of(BeyondBedrock.MOD_ID, "primary_item_group"));

    // Item Groups
    public static final ItemGroup PRIMARY_ITEM_GROUP = FabricItemGroup.builder()
    .icon(() -> new ItemStack(Items.BEDROCK))
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
    }
}