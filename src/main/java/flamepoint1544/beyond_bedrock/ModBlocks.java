package flamepoint1544.beyond_bedrock;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSetType;
import net.minecraft.block.Blocks;
import net.minecraft.block.ButtonBlock;
import net.minecraft.block.FallingBlock;
import net.minecraft.block.MapColor;
import net.minecraft.block.PressurePlateBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.block.PressurePlateBlock.ActivationRule;
import net.minecraft.block.enums.Instrument;
import net.minecraft.block.piston.PistonBehavior;
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
        .mapColor(MapColor.LIGHT_GRAY)
    ), "tin_ore", true);
    public static final Block TIN_BLOCK = register(new Block(AbstractBlock.Settings.create()
        .sounds(BlockSoundGroup.METAL)
        .requiresTool()
        .strength(5.0f, 6.0f)
        .mapColor(MapColor.LIGHT_GRAY)
    ), "tin_block", true);
    public static final Block TIN_RAW = register(new Block(AbstractBlock.Settings.create()
        .sounds(BlockSoundGroup.METAL)
        .requiresTool()
        .strength(3.0f, 3.0f)
        .mapColor(MapColor.LIGHT_GRAY)
    ), "tin_raw_block", true);

    // Stone
    public static final Block STONE_WALL = register(new WallBlock(AbstractBlock.Settings.create()
    .mapColor(MapColor.STONE_GRAY)
    .instrument(Instrument.BASEDRUM)
    .requiresTool()
    .strength(1.5F, 6.0F)
    ), "stone_wall", true);
    // Bricks
    public static final Block STONE_BRICK_PRESSURE = register(createStonPressurePlate(), "stone_brick_pressure_plate", true);
    public static final Block STONE_BRICK_BUTTON = register(createStoneButtonBlock(), "stone_brick_button", true);
    // Mossy Bricks
    public static final Block MOSSY_STONE_BRICK_PRESSURE = register(createStonPressurePlate(), "mossy_stone_brick_pressure_plate", true);
    public static final Block MOSSY_STONE_BRICK_BUTTON = register(createStoneButtonBlock(), "mossy_stone_brick_button", true);
    // Cracked Bricks
    public static final Block CRACKED_STONE_BRICK_STAIR = register(new StairsBlock(Blocks.CRACKED_STONE_BRICKS.getDefaultState(), 
        AbstractBlock.Settings.create()
        .mapColor(MapColor.STONE_GRAY)
        .instrument(Instrument.BASEDRUM)
        .requiresTool()
        .strength(1.5F, 6.0F)
    ), "cracked_stone_brick_stairs", true);
    public static final Block CRACKED_STONE_BRICK_SLAB = register(new SlabBlock(AbstractBlock.Settings.create()
        .mapColor(MapColor.STONE_GRAY)
        .instrument(Instrument.BASEDRUM)
        .requiresTool()
        .strength(1.5F, 6.0F)
    ), "cracked_stone_brick_slab", true);
    public static final Block CRACKED_STONE_BRICK_WALL = register(new WallBlock(AbstractBlock.Settings.create()
    .mapColor(MapColor.STONE_GRAY)
    .instrument(Instrument.BASEDRUM)
    .requiresTool()
    .strength(1.5F, 6.0F)
    ), "cracked_stone_brick_wall", true);
    public static final Block CRACKED_STONE_BRICK_PRESSURE = register(createStonPressurePlate(), "cracked_stone_brick_pressure_plate", true);
    public static final Block CRACKED_STONE_BRICK_BUTTON = register(createStoneButtonBlock(), "cracked_stone_brick_button", true);
    // Chiseled
    public static final Block CHISELED_STONE_STAIR = register(new StairsBlock(Blocks.CHISELED_STONE_BRICKS.getDefaultState(), 
    AbstractBlock.Settings.create()
    .mapColor(MapColor.STONE_GRAY)
    .instrument(Instrument.BASEDRUM)
    .requiresTool()
    .strength(1.5F, 6.0F)
    ), "chiseled_stone_stair", true);
    public static final Block CHISELED_STONE_SLAB = register(new SlabBlock(AbstractBlock.Settings.create()
    .mapColor(MapColor.STONE_GRAY)
    .instrument(Instrument.BASEDRUM)
    .requiresTool()
    .strength(1.5F, 6.0F)
    ), "chiseled_stone_slab", true);
    public static final Block CHISELED_STONE_WALL = register(new WallBlock(AbstractBlock.Settings.create()
    .mapColor(MapColor.STONE_GRAY)
    .instrument(Instrument.BASEDRUM)
    .requiresTool()
    .strength(1.5F, 6.0F)
    ), "chiseled_stone_wall", true);
    public static final Block CHISELED_STONE_PRESSURE = register(createStonPressurePlate(), "chiseled_stone_pressure_plate", true);
    public static final Block CHISELED_STONE_BUTTON = register(createStoneButtonBlock(), "chiseled_stone_button", true);
    // Gilded
    // Smooth/polished
    public static final Block SMOOTH_STONE_WALL = register(new WallBlock(AbstractBlock.Settings.create()
    .mapColor(MapColor.STONE_GRAY)
    .instrument(Instrument.BASEDRUM)
    .requiresTool()
    .strength(1.5F, 6.0F)
    ), "smooth_stone_wall", true);
    public static final Block SMOOTH_STONE_STAIR = register(new StairsBlock(Blocks.SMOOTH_STONE.getDefaultState(), 
    AbstractBlock.Settings.create()
    .mapColor(MapColor.STONE_GRAY)
    .instrument(Instrument.BASEDRUM)
    .requiresTool()
    .strength(1.5F, 6.0F)
    ), "smooth_stone_stair", true);
    public static final Block SMOOTH_STONE_PRESSURE = register(createStonPressurePlate(), "smooth_stone_pressure_plate", true);
    public static final Block SMOOTH_STONE_BUTTON = register(createStoneButtonBlock(), "smooth_stone_button", true);

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

    public static ButtonBlock createStoneButtonBlock() {
        return new ButtonBlock(AbstractBlock.Settings.create()
        .noCollision()
        .strength(0.5F)
        .pistonBehavior(PistonBehavior.DESTROY), 
        BlockSetType.STONE, 
        20, 
        false);
    }

    public static PressurePlateBlock createStonPressurePlate() {
        return new PressurePlateBlock(ActivationRule.MOBS, AbstractBlock.Settings.create()
        .mapColor(MapColor.STONE_GRAY)
        .solid()
        .instrument(Instrument.BASEDRUM)
        .requiresTool()
        .noCollision()
        .strength(0.5F)
        .pistonBehavior(PistonBehavior.DESTROY), 
        BlockSetType.STONE);
    }

    public static void initialize(){
        
    }
}
