package net.minecraft.client.renderer.special;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import net.minecraft.client.core.registries.BuiltInClientRegistries;
import net.minecraft.core.Registry;

public class SpecialModelRenderers {
   public static final Codec<SpecialModelRenderer.Unbaked<?>> CODEC = BuiltInClientRegistries.SPECIAL_MODEL_RENDERER_TYPE
      .byNameCodec()
      .dispatch(SpecialModelRenderer.Unbaked::type, c -> c);

   public static Object bootstrap(final Registry<MapCodec<? extends SpecialModelRenderer.Unbaked<?>>> registry) {
      Registry.register(registry, "bell", BellSpecialRenderer.Unbaked.MAP_CODEC);
      Registry.register(registry, "banner", BannerSpecialRenderer.Unbaked.MAP_CODEC);
      Registry.register(registry, "book", BookSpecialRenderer.Unbaked.MAP_CODEC);
      Registry.register(registry, "conduit", ConduitSpecialRenderer.Unbaked.MAP_CODEC);
      Registry.register(registry, "chest", ChestSpecialRenderer.Unbaked.MAP_CODEC);
      Registry.register(registry, "copper_golem_statue", CopperGolemStatueSpecialRenderer.Unbaked.MAP_CODEC);
      Registry.register(registry, "head", SkullSpecialRenderer.Unbaked.MAP_CODEC);
      Registry.register(registry, "player_head", PlayerHeadSpecialRenderer.Unbaked.MAP_CODEC);
      Registry.register(registry, "shulker_box", ShulkerBoxSpecialRenderer.Unbaked.MAP_CODEC);
      Registry.register(registry, "shield", ShieldSpecialRenderer.Unbaked.MAP_CODEC);
      Registry.register(registry, "trident", TridentSpecialRenderer.Unbaked.MAP_CODEC);
      Registry.register(registry, "decorated_pot", DecoratedPotSpecialRenderer.Unbaked.MAP_CODEC);
      return Registry.register(registry, "end_cube", EndCubeSpecialRenderer.Unbaked.MAP_CODEC);
   }
}
