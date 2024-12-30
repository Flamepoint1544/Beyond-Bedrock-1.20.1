package flamepoint1544.beyond_bedrock;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.FallingBlock;
import net.minecraft.block.MapColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    // Ultimatium
    public static final Block ULTIMATIUM_ORE = register(new Block(AbstractBlock.Settings.create()
        .luminance((state) -> {return 10;})
        .requiresTool()
        .strength(40.0F, 1200.0F)
        .mapColor(MapColor.PALE_YELLOW)
    ), "ultimatium_ore", true);
    public static final Block ULTIMATIUM_RAW = register(new Block(AbstractBlock.Settings.create()
        .luminance((state) -> {return 12;})
        .requiresTool()
        .strength(40.0F, 1200.0F)
        .mapColor(MapColor.BRIGHT_TEAL)
    ), "ultimatium_raw_block", true); 
    public static final Block ULTIMATIUM = register(new Block(AbstractBlock.Settings.create()
        .luminance((state) -> {return 15;})
        .requiresTool()
        .strength(60.0F, 1200.0F)
        .mapColor(MapColor.BRIGHT_TEAL)
    ), "ultimatium_block", true);

    // Steel
    public static final Block STEEL_BLOCK = register(new Block(AbstractBlock.Settings.create()
        .sounds(BlockSoundGroup.METAL)
        .requiresTool()
        .strength(5.0F, 6.0F)
        .mapColor(MapColor.DEEPSLATE_GRAY)
    ), "steel_block", true);
    public static final Block STEEL_DUST = register(new FallingBlock(AbstractBlock.Settings.create()
        .sounds(BlockSoundGroup.SAND)
        .requiresTool()
        .strength(4.0F, 5.0F)
        .mapColor(MapColor.DEEPSLATE_GRAY)
    ), "steel_dust", true);
    public static final Block IRON_DUST = register(new FallingBlock(AbstractBlock.Settings.create()
        .sounds(BlockSoundGroup.SAND)
        .requiresTool()
        .strength(4.0F, 5.0F)
        .mapColor(MapColor.WHITE_GRAY)
    ), "iron_dust", true);
    public static final Block COAL_DUST = register(new FallingBlock(AbstractBlock.Settings.create()
        .sounds(BlockSoundGroup.SAND)
        .requiresTool()
        .strength(4.0F, 5.0F)
        .mapColor(MapColor.BLACK)
    ), "coal_dust", true);

    // Tin
    public static final Block TIN_ORE = register(new Block(AbstractBlock.Settings.create()
        .sounds(BlockSoundGroup.METAL)
        .requiresTool()
        .strength(3.0f, 3.0f)
    ), "tin_ore", true);
    public static final Block TIN_BLOCK = register(new Block(AbstractBlock.Settings.create()
        .sounds(BlockSoundGroup.METAL)
        .requiresTool()
        .strength(5.0f, 6.0f)
    ), "tin_block", true);
    public static final Block TIN_RAW = register(new Block(AbstractBlock.Settings.create()
        .sounds(BlockSoundGroup.METAL)
        .requiresTool()
        .strength(3.0f, 3.0f)
    ), "tin_raw_block", true);

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
