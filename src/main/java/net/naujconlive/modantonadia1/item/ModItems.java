package net.naujconlive.modantonadia1.item;

import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.naujconlive.modantonadia1.ModDia1;
import net.naujconlive.modantonadia1.entity.ModEntities;
import net.naujconlive.modantonadia1.sound.ModSounds;

public class ModItems {

  private static Item registerItem(String name, Item item) {
    return Registry.register(Registries.ITEM, Identifier.of(ModDia1.MOD_ID, name), item);
  }

  public static final Item I_GOT_BITCHES_MUSIC_DISC = registerItem("i_got_bitches_music_disc",
  new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(ModDia1.MOD_ID, "i_got_bitches_music_disc"))).jukeboxPlayable(ModSounds.I_GOT_BITCHES_KEY).maxCount(1)));

  public static final Item MAJAJI_SPAWN_EGG = registerItem("majaji_spawn_egg",
  new SpawnEggItem(ModEntities.MAJAJI, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(ModDia1.MOD_ID, "majaji_spawn_egg")))));

  public static void registerModItems() {
    ModDia1.LOGGER.info("Registering Mod Items for " + ModDia1.MOD_ID);
  }
}
