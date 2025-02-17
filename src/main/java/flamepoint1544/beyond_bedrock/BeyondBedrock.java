package flamepoint1544.beyond_bedrock;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.PlacedFeature;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BeyondBedrock implements ModInitializer {
	// Mod ID
	public static final String MOD_ID = "beyond_bedrock";
	
	public static final RegistryKey<PlacedFeature> ULTIMATIUM_ORE_FEATURE = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(MOD_ID,"ultimatium"));
	public static final RegistryKey<PlacedFeature> TIN_ORE_FEATURE = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(MOD_ID,"tin"));

	// system logger
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	//Tags
	public static final TagKey<Block> BEYOND_BEDROCK_ORES = TagKey.of(RegistryKeys.BLOCK, new Identifier(MOD_ID, "ores"));
	public static final TagKey<Block> GLASS_BLOCKS = TagKey.of(RegistryKeys.BLOCK, new Identifier(MOD_ID, "glass"));

	@Override
	public void onInitialize() {
		// Initialize blocks
		ModBlocks.initialize();
		LOGGER.info("Blocks Loaded");

		// initialize items
		ModItems.initialize();
		LOGGER.info("Items Loaded");

		// add in ores
		BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, ULTIMATIUM_ORE_FEATURE);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, TIN_ORE_FEATURE);
		LOGGER.info("Ore generation Loaded");
	}
}