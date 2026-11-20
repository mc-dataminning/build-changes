package net.minecraft.world.level.levelgen.carver;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.Registry;
import net.minecraft.core.WritableRegistry;

public interface WorldCarverTypes {
   static void bootstrap(final WritableRegistry<MapCodec<? extends WorldCarver>> registry) {
      Registry.register(registry, "cave", CaveWorldCarver.MAP_CODEC);
      Registry.register(registry, "canyon", CanyonWorldCarver.MAP_CODEC);
   }
}
