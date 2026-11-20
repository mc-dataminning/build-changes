package net.minecraft.world.attribute;

import java.util.List;
import org.jspecify.annotations.Nullable;

public record EnvironmentAttributeLayerValues(List<EnvironmentAttributeLayerValues.LayerValue> layers, Object finalValue) {
   public record LayerValue(int layerIndex, String kind, @Nullable String modifier, Object value, boolean disabled) {
   }
}
