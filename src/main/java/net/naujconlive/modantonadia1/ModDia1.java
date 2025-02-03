package net.naujconlive.modantonadia1;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.naujconlive.modantonadia1.block.ModBlocks;
import net.naujconlive.modantonadia1.entity.ModEntities;
import net.naujconlive.modantonadia1.entity.custom.MajajiEntity;
import net.naujconlive.modantonadia1.item.ModItemGroups;
import net.naujconlive.modantonadia1.item.ModItems;
import net.naujconlive.modantonadia1.sound.ModSounds;
import net.naujconlive.modantonadia1.world.gen.ModWorldGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ModDia1 implements ModInitializer {
	public static final String MOD_ID = "modantonadia1";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Mod del Dia 1 esta LISTO");

		ModEntities.registerModEntities();
		ModWorldGeneration.generateModWorldGen();
		ModSounds.registerSounds();
		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();
		ModBlocks.registerModBlocks();

		FabricDefaultAttributeRegistry.register(ModEntities.MAJAJI, MajajiEntity.createAttributes());
	}
}