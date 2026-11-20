package net.minecraft.client.renderer.item.properties.conditional;

import com.mojang.serialization.MapCodec;
import net.minecraft.client.core.registries.BuiltInClientRegistries;
import net.minecraft.core.Registry;
import net.minecraft.core.WritableRegistry;

public class ConditionalItemModelProperties {
   public static final MapCodec<ConditionalItemModelProperty> MAP_CODEC = BuiltInClientRegistries.CONDITIONAL_ITEM_MODEL_PROPERTY_TYPE
      .byNameCodec()
      .dispatchMap("property", ConditionalItemModelProperty::type, c -> c);

   public static void bootstrap(final WritableRegistry<MapCodec<? extends ConditionalItemModelProperty>> registry) {
      Registry.register(registry, "custom_model_data", CustomModelDataProperty.MAP_CODEC);
      Registry.register(registry, "using_item", IsUsingItem.MAP_CODEC);
      Registry.register(registry, "broken", Broken.MAP_CODEC);
      Registry.register(registry, "damaged", Damaged.MAP_CODEC);
      Registry.register(registry, "fishing_rod/cast", FishingRodCast.MAP_CODEC);
      Registry.register(registry, "has_component", HasComponent.MAP_CODEC);
      Registry.register(registry, "bundle/has_selected_item", BundleHasSelectedItem.MAP_CODEC);
      Registry.register(registry, "selected", IsSelected.MAP_CODEC);
      Registry.register(registry, "carried", IsCarried.MAP_CODEC);
      Registry.register(registry, "extended_view", ExtendedView.MAP_CODEC);
      Registry.register(registry, "keybind_down", IsKeybindDown.MAP_CODEC);
      Registry.register(registry, "view_entity", IsViewEntity.MAP_CODEC);
      Registry.register(registry, "component", ComponentMatches.MAP_CODEC);
   }
}
