package net.naujconlive.modantonadia1.sound;

import net.minecraft.block.jukebox.JukeboxSong;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.naujconlive.modantonadia1.ModDia1;

public class ModSounds {
  public static final SoundEvent MAJAJI_AMBIENT = registerSoundEvent("majaji_ambient");
  public static final SoundEvent MAJAJI_HIT = registerSoundEvent("majaji_hit");
  public static final SoundEvent MAJAJI_DEATH = registerSoundEvent("majaji_death");

  public static final SoundEvent I_GOT_BITCHES = registerSoundEvent("i_got_bitches");
  public static final RegistryKey<JukeboxSong> I_GOT_BITCHES_KEY =
  RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(ModDia1.MOD_ID, "i_got_bitches"));

  private static SoundEvent registerSoundEvent(String name) {
    Identifier id = Identifier.of(ModDia1.MOD_ID, name);
    return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
  }

  public static void registerSounds(){
    ModDia1.LOGGER.info("Registering Mod Sounds for " + ModDia1.MOD_ID);
  }
}
