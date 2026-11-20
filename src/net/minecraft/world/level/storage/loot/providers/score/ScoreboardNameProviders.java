package net.minecraft.world.level.storage.loot.providers.score;

import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import net.minecraft.core.Registry;
import net.minecraft.core.WritableRegistry;
import net.minecraft.core.registries.BuiltInRegistries;

public class ScoreboardNameProviders {
   private static final Codec<ScoreboardNameProvider> TYPED_CODEC = BuiltInRegistries.LOOT_SCORE_PROVIDER_TYPE
      .byNameCodec()
      .dispatch(ScoreboardNameProvider::codec, c -> c);
   public static final Codec<ScoreboardNameProvider> CODEC = Codec.lazyInitialized(
      () -> Codec.either(ContextScoreboardNameProvider.INLINE_CODEC, TYPED_CODEC)
         .xmap(Either::unwrap, provider -> provider instanceof ContextScoreboardNameProvider context ? Either.left(context) : Either.right(provider))
   );

   public static void bootstrap(final WritableRegistry<MapCodec<? extends ScoreboardNameProvider>> registry) {
      Registry.register(registry, "fixed", FixedScoreboardNameProvider.MAP_CODEC);
      Registry.register(registry, "context", ContextScoreboardNameProvider.MAP_CODEC);
   }
}
