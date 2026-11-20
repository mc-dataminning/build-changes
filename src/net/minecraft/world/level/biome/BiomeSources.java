package net.minecraft.world.level.biome;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.Registry;
import net.minecraft.core.WritableRegistry;

public class BiomeSources {
   public static void bootstrap(final WritableRegistry<MapCodec<? extends BiomeSource>> registry) {
      Registry.register(registry, "fixed", FixedBiomeSource.CODEC);
      Registry.register(registry, "multi_noise", MultiNoiseBiomeSource.CODEC);
      Registry.register(registry, "checkerboard", CheckerboardColumnBiomeSource.CODEC);
      Registry.register(registry, "the_end", TheEndBiomeSource.CODEC);
   }
}
