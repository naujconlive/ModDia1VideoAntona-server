package net.naujconlive.modantonadia1.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.naujconlive.modantonadia1.ModDia1;
import net.naujconlive.modantonadia1.entity.custom.DickEntity;
import net.naujconlive.modantonadia1.entity.custom.MajajiEntity;

public class ModEntities {

  public static final EntityType<MajajiEntity> MAJAJI = Registry.register(Registries.ENTITY_TYPE,
  Identifier.of(ModDia1.MOD_ID, "majaji"),
  EntityType.Builder.create(MajajiEntity::new, SpawnGroup.CREATURE)
  .dimensions(0.6F, 1.8F).build(RegistryKey.of(RegistryKeys.ENTITY_TYPE, Identifier.of(ModDia1.MOD_ID, "majaji"))));

  public static final EntityType<DickEntity> DICK = Registry.register(Registries.ENTITY_TYPE,
  Identifier.of(ModDia1.MOD_ID, "dick_entity"),
  EntityType.Builder.create(DickEntity::new, SpawnGroup.MISC)
  .dimensions(0.7f, 0.8f).build(RegistryKey.of(RegistryKeys.ENTITY_TYPE, Identifier.of(ModDia1.MOD_ID, "dick_entity"))));

  public static void registerModEntities() {
    ModDia1.LOGGER.info("Registering Mod Entities for " + ModDia1.MOD_ID);
  }
}
