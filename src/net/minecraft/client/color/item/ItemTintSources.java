package net.minecraft.client.color.item;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import net.minecraft.client.core.registries.BuiltInClientRegistries;
import net.minecraft.core.Registry;

public class ItemTintSources {
   public static final Codec<ItemTintSource> CODEC = BuiltInClientRegistries.ITEM_TINT_SOURCE_TYPE.byNameCodec().dispatch(ItemTintSource::type, c -> c);

   public static Object bootstrap(final Registry<MapCodec<? extends ItemTintSource>> registry) {
      Registry.register(registry, "custom_model_data", CustomModelDataSource.MAP_CODEC);
      Registry.register(registry, "constant", Constant.MAP_CODEC);
      Registry.register(registry, "dye", Dye.MAP_CODEC);
      Registry.register(registry, "grass", GrassColorSource.MAP_CODEC);
      Registry.register(registry, "firework", Firework.MAP_CODEC);
      Registry.register(registry, "potion", Potion.MAP_CODEC);
      return Registry.register(registry, "team", TeamColor.MAP_CODEC);
   }
}
