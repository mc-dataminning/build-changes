package net.minecraft.world.attribute;

import com.google.common.annotations.VisibleForTesting;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import net.minecraft.SharedConstants;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.util.DevUtil;
import net.minecraft.util.Mth;
import net.minecraft.world.clock.ClockManager;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.BiomeResolver;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.timeline.AttributeTrackSampler;
import net.minecraft.world.timeline.Timeline;
import org.jspecify.annotations.Nullable;

public class EnvironmentAttributeSystem implements EnvironmentAttributeReader {
   private final Map<EnvironmentAttribute<?>, EnvironmentAttributeSystem.ValueSampler<?>> attributeSamplers = new Reference2ObjectOpenHashMap();

   private EnvironmentAttributeSystem(final Map<EnvironmentAttribute<?>, List<EnvironmentAttributeLayer<?>>> layersByAttribute) {
      layersByAttribute.forEach(
         (attribute, layers) -> this.attributeSamplers
            .put(
               (EnvironmentAttribute<?>)attribute,
               this.bakeLayerSampler((EnvironmentAttribute<?>)attribute, (List<? extends EnvironmentAttributeLayer<?>>)layers)
            )
      );
   }

   private <Value> EnvironmentAttributeSystem.ValueSampler<Value> bakeLayerSampler(
      final EnvironmentAttribute<Value> attribute, final List<? extends EnvironmentAttributeLayer<?>> untypedLayers
   ) {
      List<EnvironmentAttributeLayer<Value>> layers = new ArrayList<>((Collection<? extends EnvironmentAttributeLayer<Value>>)untypedLayers);
      Value constantBaseValue = attribute.defaultValue();

      while (!SharedConstants.DEBUG_ENABLED && !DevUtil.IS_RUNNING_IN_IDE && !layers.isEmpty()) {
         if (!(layers.getFirst() instanceof EnvironmentAttributeLayer.Constant<Value> constantLayer)) {
            break;
         }

         constantBaseValue = constantLayer.applyConstant(constantBaseValue);
         layers.removeFirst();
      }

      boolean isAffectedByPosition = layers.stream().anyMatch(layer -> layer instanceof EnvironmentAttributeLayer.Positional);
      return new EnvironmentAttributeSystem.ValueSampler<>(attribute, constantBaseValue, List.copyOf(layers), isAffectedByPosition);
   }

   public static EnvironmentAttributeSystem.Builder builder() {
      return new EnvironmentAttributeSystem.Builder();
   }

   private static void addStaticLayers(final EnvironmentAttributeSystem.Builder builder, final LevelAccessor level) {
      HolderLookup.Provider registries = level.registryAccess();
      addDimensionLayer(builder, level.dimensionType());
      addBiomeLayer(builder, registries.lookupOrThrow(Registries.BIOME), level);
   }

   private static void addDynamicLayers(final EnvironmentAttributeSystem.Builder builder, final Level level) {
      ClockManager clockManager = level.clockManager();
      level.dimensionType().timelines().forEach(timeline -> builder.addTimelineLayer((Holder<Timeline>)timeline, clockManager));
      if (level.canHaveWeather()) {
         WeatherAttributes.addBuiltinLayers(builder, WeatherAttributes.WeatherAccess.from(level));
      }
   }

   private static void addDimensionLayer(final EnvironmentAttributeSystem.Builder builder, final DimensionType dimensionType) {
      builder.addConstantLayer(dimensionType.attributes());
   }

   private static void addBiomeLayer(final EnvironmentAttributeSystem.Builder builder, final HolderLookup<Biome> biomes, final BiomeResolver biomeResolver) {
      Stream<EnvironmentAttribute<?>> attributesProvidedByBiomes = biomes.listElements()
         .flatMap(biome -> biome.value().getAttributes().keySet().stream())
         .distinct();
      attributesProvidedByBiomes.forEach(attribute -> addBiomeLayerForAttribute(builder, (EnvironmentAttribute<?>)attribute, biomeResolver));
   }

   private static <Value> void addBiomeLayerForAttribute(
      final EnvironmentAttributeSystem.Builder builder, final EnvironmentAttribute<Value> attribute, final BiomeResolver biomeResolver
   ) {
      builder.addPositionalLayer(attribute, new EnvironmentAttributeSystem.BiomeLayer<>(attribute, biomeResolver));
   }

   public void invalidateTickCache() {
      this.attributeSamplers.values().forEach(EnvironmentAttributeSystem.ValueSampler::invalidateTickCache);
   }

   void setLayerDisabled(final EnvironmentAttribute<?> attribute, final int layerIndex, final boolean disabled) {
      EnvironmentAttributeSystem.ValueSampler<?> sampler = this.getValueSampler(attribute);
      if (sampler != null) {
         sampler.setLayerDisabled(layerIndex, disabled);
      }
   }

   private <Value> EnvironmentAttributeSystem.@Nullable ValueSampler<Value> getValueSampler(final EnvironmentAttribute<Value> attribute) {
      return (EnvironmentAttributeSystem.ValueSampler<Value>)this.attributeSamplers.get(attribute);
   }

   @Override
   public <Value> Value getDimensionValue(final EnvironmentAttribute<Value> attribute) {
      if (DevUtil.IS_RUNNING_IN_IDE && attribute.isPositional()) {
         throw new IllegalStateException("Position must always be provided for positional attribute " + attribute);
      }

      EnvironmentAttributeSystem.ValueSampler<Value> sampler = this.getValueSampler(attribute);
      return sampler == null ? attribute.defaultValue() : sampler.getDimensionValue();
   }

   @Override
   public <Value> Value getValue(final EnvironmentAttribute<Value> attribute, final Vec3 pos, final @Nullable SpatialAttributeInterpolator biomeInterpolator) {
      EnvironmentAttributeSystem.ValueSampler<Value> sampler = this.getValueSampler(attribute);
      return sampler == null ? attribute.defaultValue() : sampler.getValue(pos, biomeInterpolator);
   }

   <Value> EnvironmentAttributeLayerValues getValuePerLayer(
      final EnvironmentAttribute<Value> attribute, final Vec3 pos, final @Nullable SpatialAttributeInterpolator biomeInterpolator
   ) {
      EnvironmentAttributeSystem.ValueSampler<Value> sampler = this.getValueSampler(attribute);
      return sampler == null
         ? new EnvironmentAttributeLayerValues(List.of(), attribute.defaultValue())
         : sampler.getValuePerLayer(attribute.isPositional() ? pos : null, biomeInterpolator);
   }

   @VisibleForTesting
   <Value> Value getConstantBaseValue(final EnvironmentAttribute<Value> attribute) {
      EnvironmentAttributeSystem.ValueSampler<Value> sampler = this.getValueSampler(attribute);
      return sampler != null ? sampler.baseValue : attribute.defaultValue();
   }

   @VisibleForTesting
   boolean isAffectedByPosition(final EnvironmentAttribute<?> attribute) {
      EnvironmentAttributeSystem.ValueSampler<?> sampler = this.getValueSampler(attribute);
      return sampler != null && sampler.isAffectedByPosition;
   }

   private static <Value> @Nullable String describeModifier(
      final EnvironmentAttribute<Value> attribute, final EnvironmentAttributeLayer<Value> layer, final @Nullable Vec3 pos
   ) {
      return switch (layer) {
         case EnvironmentAttributeSystem.ConstantLayer<Value> constantLayer -> EnvironmentAttributeDebugFormat.describeModifier(
            attribute.type(), constantLayer.entry().modifier(), constantLayer.entry().argument()
         );
         case AttributeTrackSampler<?, ?> sampler -> EnvironmentAttributeDebugFormat.describeModifier(
            attribute.type(), sampler.modifier(), sampler.sampleArgument()
         );
         case EnvironmentAttributeSystem.BiomeLayer<Value> biomeLayer when pos != null -> describeBiomeModifier(attribute, biomeLayer.biomeAt(pos));
         default -> null;
      };
   }

   private static String describeBiomeModifier(final EnvironmentAttribute<?> attribute, final Holder<Biome> biome) {
      EnvironmentAttributeMap.Entry<?, ?> entry = biome.value().getAttributes().get(attribute);
      return biome.getRegisteredName()
         + (entry != null ? " " + EnvironmentAttributeDebugFormat.describeModifier(attribute.type(), entry.modifier(), entry.argument()) : "");
   }

   private static String kindName(final EnvironmentAttributeLayer<?> layer) {
      return switch (layer) {
         case AttributeTrackSampler var3 -> "Timeline";
         case EnvironmentAttributeSystem.BiomeLayer var4 -> "Biome";
         case EnvironmentAttributeLayer.Constant var5 -> "Constant";
         case EnvironmentAttributeLayer.TimeBased var6 -> "Time-based";
         case EnvironmentAttributeLayer.Positional var7 -> "Positional";
         default -> throw new MatchException(null, null);
      };
   }

   private record BiomeLayer<Value>(EnvironmentAttribute<Value> attribute, BiomeResolver biomeResolver) implements EnvironmentAttributeLayer.Positional<Value> {
      @Override
      public Value applyPositional(final Value baseValue, final Vec3 pos, final @Nullable SpatialAttributeInterpolator biomeWeights) {
         return biomeWeights != null && this.attribute.isSpatiallyInterpolated()
            ? biomeWeights.applyAttributeLayer(this.attribute, baseValue)
            : this.biomeAt(pos).value().getAttributes().applyModifier(this.attribute, baseValue);
      }

      private Holder<Biome> biomeAt(final Vec3 pos) {
         return this.biomeResolver.getBiome(Mth.floor(pos.x), Mth.floor(pos.y), Mth.floor(pos.z));
      }
   }

   public static class Builder {
      private final Map<EnvironmentAttribute<?>, List<EnvironmentAttributeLayer<?>>> layersByAttribute = new HashMap<>();

      private Builder() {
      }

      public EnvironmentAttributeSystem.Builder addDefaultLayers(final Level level) {
         this.addStaticLayers(level);
         this.addDynamicLayers(level);
         return this;
      }

      public EnvironmentAttributeSystem.Builder addStaticLayers(final LevelAccessor level) {
         EnvironmentAttributeSystem.addStaticLayers(this, level);
         return this;
      }

      public EnvironmentAttributeSystem.Builder addDynamicLayers(final Level level) {
         EnvironmentAttributeSystem.addDynamicLayers(this, level);
         return this;
      }

      public EnvironmentAttributeSystem.Builder addConstantLayer(final EnvironmentAttributeMap attributeMap) {
         for (EnvironmentAttribute<?> attribute : attributeMap.keySet()) {
            this.addConstantEntry(attribute, attributeMap);
         }

         return this;
      }

      private <Value> EnvironmentAttributeSystem.Builder addConstantEntry(
         final EnvironmentAttribute<Value> attribute, final EnvironmentAttributeMap attributeMap
      ) {
         EnvironmentAttributeMap.Entry<Value, ?> entry = attributeMap.get(attribute);
         if (entry == null) {
            throw new IllegalArgumentException("Missing attribute " + attribute);
         } else {
            return this.addConstantLayer(attribute, new EnvironmentAttributeSystem.ConstantLayer<>(entry));
         }
      }

      public <Value> EnvironmentAttributeSystem.Builder addConstantLayer(
         final EnvironmentAttribute<Value> attribute, final EnvironmentAttributeLayer.Constant<Value> layer
      ) {
         return this.addLayer(attribute, layer);
      }

      public <Value> EnvironmentAttributeSystem.Builder addTimeBasedLayer(
         final EnvironmentAttribute<Value> attribute, final EnvironmentAttributeLayer.TimeBased<Value> layer
      ) {
         return this.addLayer(attribute, layer);
      }

      public <Value> EnvironmentAttributeSystem.Builder addPositionalLayer(
         final EnvironmentAttribute<Value> attribute, final EnvironmentAttributeLayer.Positional<Value> layer
      ) {
         return this.addLayer(attribute, layer);
      }

      private <Value> EnvironmentAttributeSystem.Builder addLayer(final EnvironmentAttribute<Value> attribute, final EnvironmentAttributeLayer<Value> layer) {
         this.layersByAttribute.computeIfAbsent(attribute, t -> new ArrayList<>()).add(layer);
         return this;
      }

      public EnvironmentAttributeSystem.Builder addTimelineLayer(final Holder<Timeline> timeline, final ClockManager clockManager) {
         for (EnvironmentAttribute<?> attribute : timeline.value().attributes()) {
            this.addTimelineLayerForAttribute(timeline, attribute, clockManager);
         }

         return this;
      }

      private <Value> void addTimelineLayerForAttribute(
         final Holder<Timeline> timeline, final EnvironmentAttribute<Value> attribute, final ClockManager clockManager
      ) {
         this.addTimeBasedLayer(attribute, timeline.value().createTrackSampler(attribute, clockManager));
      }

      public EnvironmentAttributeSystem build() {
         return new EnvironmentAttributeSystem(this.layersByAttribute);
      }
   }

   private record ConstantLayer<Value>(EnvironmentAttributeMap.Entry<Value, ?> entry) implements EnvironmentAttributeLayer.Constant<Value> {
      @Override
      public Value applyConstant(final Value baseValue) {
         return this.entry.applyModifier(baseValue);
      }
   }

   private static class ValueSampler<Value> {
      private final EnvironmentAttribute<Value> attribute;
      private final Value baseValue;
      private List<EnvironmentAttributeLayer<Value>> layers;
      private final List<EnvironmentAttributeLayer<Value>> allLayers;
      private final boolean isAffectedByPosition;
      private @Nullable Value cachedTickValue;
      private int cacheTickId;
      private @Nullable IntSet disabledLayers;

      private ValueSampler(
         final EnvironmentAttribute<Value> attribute,
         final Value baseValue,
         final List<EnvironmentAttributeLayer<Value>> layers,
         final boolean isAffectedByPosition
      ) {
         this.attribute = attribute;
         this.baseValue = baseValue;
         this.layers = layers;
         this.allLayers = layers;
         this.isAffectedByPosition = isAffectedByPosition;
      }

      public void invalidateTickCache() {
         this.cachedTickValue = null;
         this.cacheTickId++;
      }

      public Value getDimensionValue() {
         if (this.cachedTickValue != null) {
            return this.cachedTickValue;
         }

         Value result = this.computeValueNotPositional();
         this.cachedTickValue = result;
         return result;
      }

      public Value getValue(final Vec3 pos, final @Nullable SpatialAttributeInterpolator biomeInterpolator) {
         return !this.isAffectedByPosition ? this.getDimensionValue() : this.computeValuePositional(pos, biomeInterpolator);
      }

      private void setLayerDisabled(final int layerIndex, final boolean disabled) {
         if (this.disabledLayers == null) {
            this.disabledLayers = new IntOpenHashSet();
         }

         if (disabled) {
            this.disabledLayers.add(layerIndex);
         } else {
            this.disabledLayers.remove(layerIndex);
         }

         this.layers = IntStream.range(0, this.allLayers.size()).filter(i -> !this.disabledLayers.contains(i)).mapToObj(this.allLayers::get).toList();
         this.invalidateTickCache();
      }

      private boolean isDisabled(final int layerIndex) {
         return this.disabledLayers != null && this.disabledLayers.contains(layerIndex);
      }

      private Value computeValuePositional(final Vec3 pos, final @Nullable SpatialAttributeInterpolator biomeInterpolator) {
         Value result = this.baseValue;

         for (EnvironmentAttributeLayer<Value> layer : this.layers) {
            result = (Value)(switch (layer) {
               case EnvironmentAttributeLayer.Constant<Value> constantLayer -> constantLayer.applyConstant(result);
               case EnvironmentAttributeLayer.TimeBased<Value> timeBasedLayer -> timeBasedLayer.applyTimeBased(result, this.cacheTickId);
               case EnvironmentAttributeLayer.Positional<Value> positionalLayer -> positionalLayer.applyPositional(
                  result, Objects.requireNonNull(pos), biomeInterpolator
               );
               default -> throw new MatchException(null, null);
            });
         }

         return this.attribute.sanitizeValue(result);
      }

      private Value computeValueNotPositional() {
         Value result = this.baseValue;

         for (EnvironmentAttributeLayer<Value> layer : this.layers) {
            result = (Value)(switch (layer) {
               case EnvironmentAttributeLayer.Constant<Value> constantLayer -> constantLayer.applyConstant(result);
               case EnvironmentAttributeLayer.TimeBased<Value> timeBasedLayer -> timeBasedLayer.applyTimeBased(result, this.cacheTickId);
               case EnvironmentAttributeLayer.Positional<Value> ignored -> result;
               default -> throw new MatchException(null, null);
            });
         }

         return this.attribute.sanitizeValue(result);
      }

      public EnvironmentAttributeLayerValues getValuePerLayer(final @Nullable Vec3 pos, final @Nullable SpatialAttributeInterpolator biomeInterpolator) {
         List<EnvironmentAttributeLayerValues.LayerValue> layerValues = new ArrayList<>();
         Value result = this.baseValue;
         layerValues.add(new EnvironmentAttributeLayerValues.LayerValue(-1, "Base value", null, result, false));

         for (int layerIndex = 0; layerIndex < this.allLayers.size(); layerIndex++) {
            EnvironmentAttributeLayer<Value> layer = this.allLayers.get(layerIndex);
            boolean disabled = this.isDisabled(layerIndex);
            if (!disabled) {
               result = (Value)(switch (layer) {
                  case EnvironmentAttributeLayer.Constant<Value> constantLayer -> constantLayer.applyConstant(result);
                  case EnvironmentAttributeLayer.TimeBased<Value> timeBasedLayer -> timeBasedLayer.applyTimeBased(result, this.cacheTickId);
                  case EnvironmentAttributeLayer.Positional<Value> positionalLayer -> pos != null
                     ? positionalLayer.applyPositional(result, pos, biomeInterpolator)
                     : result;
                  default -> throw new MatchException(null, null);
               });
            }

            layerValues.add(
               new EnvironmentAttributeLayerValues.LayerValue(
                  layerIndex,
                  EnvironmentAttributeSystem.kindName(layer),
                  EnvironmentAttributeSystem.describeModifier(this.attribute, layer, pos),
                  result,
                  disabled
               )
            );
         }

         return new EnvironmentAttributeLayerValues(List.copyOf(layerValues), this.attribute.sanitizeValue(result));
      }
   }
}
