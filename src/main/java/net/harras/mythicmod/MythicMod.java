package net.harras.mythicmod;

import net.fabricmc.api.ModInitializer;
import net.harras.mythicmod.block.ModBlocks;
import net.harras.mythicmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MythicMod implements ModInitializer {

	public static final String MOD_ID = "mythicmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

	}
}
