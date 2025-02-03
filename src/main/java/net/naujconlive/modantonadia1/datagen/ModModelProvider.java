package net.naujconlive.modantonadia1.datagen;

import java.util.Optional;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.Model;
import net.minecraft.client.data.Models;
import net.minecraft.util.Identifier;
import net.naujconlive.modantonadia1.block.ModBlocks;
import net.naujconlive.modantonadia1.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
  public ModModelProvider(FabricDataOutput output) {
    super(output);
  }

  @Override
  public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
    blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.DICK);
  }

  @Override
  public void generateItemModels(ItemModelGenerator itemModelGenerator) {
    itemModelGenerator.register(ModItems.I_GOT_BITCHES_MUSIC_DISC, Models.GENERATED);
    itemModelGenerator.register(ModItems.MAJAJI_SPAWN_EGG, Models.GENERATED);
  }
}
