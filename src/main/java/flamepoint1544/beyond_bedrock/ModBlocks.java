package flamepoint1544.beyond_bedrock;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    // Ultimatium
    public static final Block ULTIMATIUM_ORE = register(new Block(AbstractBlock.Settings.create().luminance((state) -> {return 10;}).requiresTool().hardness(4.5f)), "ultimatium_ore", true);
    public static final Block ULTIMATIUM_RAW = register(new Block(AbstractBlock.Settings.create().luminance((state) -> {return 15;}).hardness(5f).requiresTool()), "ultimatium_raw_block", true); 
    public static final Block ULTIMATIUM = register(new Block(AbstractBlock.Settings.create().luminance((state) -> {return 15;}).hardness(5f).requiresTool()), "ultimatium_block", true);

    /******************************************************************
     * +# register(Block block, String id, boolean registerItem): Block
     * Registers a block using the string id and the modid defined in the main class to make an identifier.
     * If registerItem is true a block item is registered alongside the block.
     * If registerItem is false nothing special happens.
     ******************************************************************/
    public static Block register(Block block, String id, boolean registerItem){
        // Create Identifier
        Identifier blockID = Identifier.of(BeyondBedrock.MOD_ID, id);

        // check to see if it should register an item
        if(registerItem){
            BlockItem blockItem = new BlockItem(block, new Item.Settings());
            Registry.register(Registries.ITEM, blockID, blockItem);
        }

        return Registry.register(Registries.BLOCK, blockID, block);
    }

    public static void initialize(){
        
    }
}
