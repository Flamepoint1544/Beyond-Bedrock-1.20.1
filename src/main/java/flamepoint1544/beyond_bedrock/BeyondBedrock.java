package flamepoint1544.beyond_bedrock;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BeyondBedrock implements ModInitializer {
	public static final String MOD_ID = "beyond_bedrock";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModBlocks.initialize();
		LOGGER.info("Blocks loaded");

		ModItems.initialize();
		LOGGER.info("Items Loaded");
	}
}