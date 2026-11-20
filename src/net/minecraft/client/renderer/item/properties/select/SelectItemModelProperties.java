package net.minecraft.client.renderer.item.properties.select;

import com.mojang.serialization.Codec;
import net.minecraft.client.core.registries.BuiltInClientRegistries;
import net.minecraft.core.Registry;

public class SelectItemModelProperties {
   public static final Codec<SelectItemModelProperty.Type<?, ?>> CODEC = BuiltInClientRegistries.SELECT_ITEM_MODEL_PROPERTY_TYPE.byNameCodec();

   public static Object bootstrap(final Registry<SelectItemModelProperty.Type<?, ?>> registry) {
      Registry.register(registry, "custom_model_data", CustomModelDataProperty.TYPE);
      Registry.register(registry, "main_hand", MainHand.TYPE);
      Registry.register(registry, "charge_type", Charge.TYPE);
      Registry.register(registry, "trim_material", TrimMaterialProperty.TYPE);
      Registry.register(registry, "block_state", ItemBlockState.TYPE);
      Registry.register(registry, "display_context", DisplayContext.TYPE);
      Registry.register(registry, "local_time", LocalTime.TYPE);
      Registry.register(registry, "context_entity_type", ContextEntityType.TYPE);
      Registry.register(registry, "context_dimension", ContextDimension.TYPE);
      return Registry.register(registry, "component", ComponentContents.castType());
   }
}
