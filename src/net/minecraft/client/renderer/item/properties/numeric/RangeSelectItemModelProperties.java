package net.minecraft.client.renderer.item.properties.numeric;

import com.mojang.serialization.MapCodec;
import net.minecraft.client.core.registries.BuiltInClientRegistries;
import net.minecraft.core.Registry;

public class RangeSelectItemModelProperties {
   public static final MapCodec<RangeSelectItemModelProperty> MAP_CODEC = BuiltInClientRegistries.RANGE_SELECT_ITEM_MODEL_PROPERTY_TYPE
      .byNameCodec()
      .dispatchMap("property", RangeSelectItemModelProperty::type, c -> c);

   public static Object bootstrap(final Registry<MapCodec<? extends RangeSelectItemModelProperty>> registry) {
      Registry.register(registry, "custom_model_data", CustomModelDataProperty.MAP_CODEC);
      Registry.register(registry, "bundle/fullness", BundleFullness.MAP_CODEC);
      Registry.register(registry, "damage", Damage.MAP_CODEC);
      Registry.register(registry, "cooldown", Cooldown.MAP_CODEC);
      Registry.register(registry, "time", Time.MAP_CODEC);
      Registry.register(registry, "compass", CompassAngle.MAP_CODEC);
      Registry.register(registry, "crossbow/pull", CrossbowPull.MAP_CODEC);
      Registry.register(registry, "use_cycle", UseCycle.MAP_CODEC);
      Registry.register(registry, "use_duration", UseDuration.MAP_CODEC);
      return Registry.register(registry, "count", Count.MAP_CODEC);
   }
}
