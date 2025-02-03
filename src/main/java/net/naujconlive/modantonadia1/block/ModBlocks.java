package net.naujconlive.modantonadia1.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.naujconlive.modantonadia1.ModDia1;
import net.naujconlive.modantonadia1.block.custom.DickBlock;

public class ModBlocks {

  public static final Block DICK = registerBlock("dick",
  new DickBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(ModDia1.MOD_ID, "dick"))).nonOpaque()));

  private static Block registerBlock(String name, Block block) {
    registerBlockItem(name, block);
    return Registry.register(Registries.BLOCK, Identifier.of(ModDia1.MOD_ID, name), block);
  }

  private static void registerBlockItem(String name, Block block) {
    Registry.register(Registries.ITEM, Identifier.of(ModDia1.MOD_ID, name),
    new BlockItem(block, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(ModDia1.MOD_ID, name)))));
  }

  public static void registerModBlocks() {
    ModDia1.LOGGER.info("Registering Mod Blocks for " + ModDia1.MOD_ID);
  }
}
