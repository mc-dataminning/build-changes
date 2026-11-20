package net.minecraft.client.renderer.texture.atlas;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;
import net.minecraft.client.core.registries.BuiltInClientRegistries;
import net.minecraft.client.renderer.texture.atlas.sources.DirectoryLister;
import net.minecraft.client.renderer.texture.atlas.sources.PalettedPermutations;
import net.minecraft.client.renderer.texture.atlas.sources.SingleFile;
import net.minecraft.client.renderer.texture.atlas.sources.SourceFilter;
import net.minecraft.client.renderer.texture.atlas.sources.Unstitcher;
import net.minecraft.core.Registry;

public class SpriteSources {
   public static final Codec<SpriteSource> CODEC = BuiltInClientRegistries.SPRITE_SOURCE_TYPE.byNameCodec().dispatch(SpriteSource::codec, c -> c);
   public static final Codec<List<SpriteSource>> FILE_CODEC = CODEC.listOf().fieldOf("sources").codec();

   public static Object bootstrap(final Registry<MapCodec<? extends SpriteSource>> registry) {
      Registry.register(registry, "single", SingleFile.MAP_CODEC);
      Registry.register(registry, "directory", DirectoryLister.MAP_CODEC);
      Registry.register(registry, "filter", SourceFilter.MAP_CODEC);
      Registry.register(registry, "unstitch", Unstitcher.MAP_CODEC);
      return Registry.register(registry, "paletted_permutations", PalettedPermutations.MAP_CODEC);
   }
}
