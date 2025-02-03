package net.naujconlive.modantonadia1.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.naujconlive.modantonadia1.ModDia1;
import net.naujconlive.modantonadia1.block.ModBlocks;

public class ModItemGroups {
  public static final ItemGroup MOD_DIA_1_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
  Identifier.of(ModDia1.MOD_ID, "mod_dia_1_items"),
  FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.I_GOT_BITCHES_MUSIC_DISC))
  .displayName(Text.translatable("itemgroup.modantonadia1.mod_dia_1_items"))
  .entries((displayContext, entries) -> {
    entries.add(ModItems.I_GOT_BITCHES_MUSIC_DISC);
    entries.add(ModItems.MAJAJI_SPAWN_EGG);
    entries.add(ModBlocks.DICK);
  }).build());

  public static void registerItemGroups() {
    ModDia1.LOGGER.info("Registering Item Groups for " + ModDia1.MOD_ID);
  }
}
