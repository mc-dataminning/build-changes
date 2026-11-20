package net.minecraft.client.renderer.item;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import net.minecraft.client.core.registries.BuiltInClientRegistries;
import net.minecraft.core.Registry;

public class ItemModels {
   public static final Codec<ItemModel.Unbaked> CODEC = BuiltInClientRegistries.ITEM_MODEL_TYPE.byNameCodec().dispatch(ItemModel.Unbaked::type, c -> c);

   public static Object bootstrap(final Registry<MapCodec<? extends ItemModel.Unbaked>> registry) {
      Registry.register(registry, "empty", EmptyModel.Unbaked.MAP_CODEC);
      Registry.register(registry, "model", CuboidItemModelWrapper.Unbaked.MAP_CODEC);
      Registry.register(registry, "range_dispatch", RangeSelectItemModel.Unbaked.MAP_CODEC);
      Registry.register(registry, "special", SpecialModelWrapper.Unbaked.MAP_CODEC);
      Registry.register(registry, "composite", CompositeModel.Unbaked.MAP_CODEC);
      Registry.register(registry, "bundle/selected_item", BundleSelectedItemSpecialRenderer.Unbaked.MAP_CODEC);
      Registry.register(registry, "select", SelectItemModel.Unbaked.MAP_CODEC);
      return Registry.register(registry, "condition", ConditionalItemModel.Unbaked.MAP_CODEC);
   }
}
