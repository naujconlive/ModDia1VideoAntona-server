package net.naujconlive.modantonadia1.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.SpawnLocationTypes;
import net.minecraft.entity.SpawnRestriction;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.world.Heightmap;
import net.naujconlive.modantonadia1.entity.ModEntities;

public class ModEntitySpawns {
  public static void addSpawns() {
    BiomeModifications.addSpawn(BiomeSelectors.foundInOverworld(),
    SpawnGroup.CREATURE, ModEntities.MAJAJI, 2, 1, 1);

    BiomeModifications.addSpawn(BiomeSelectors.foundInTheNether(),
    SpawnGroup.CREATURE, ModEntities.MAJAJI, 4, 1, 1);

    BiomeModifications.addSpawn(BiomeSelectors.foundInTheEnd(),
    SpawnGroup.CREATURE, ModEntities.MAJAJI, 1, 1, 1);

    SpawnRestriction.register(ModEntities.MAJAJI, SpawnLocationTypes.ON_GROUND,
    Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AnimalEntity::isValidNaturalSpawn);
  }
}
