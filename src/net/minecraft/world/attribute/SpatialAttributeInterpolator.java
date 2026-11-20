package net.minecraft.world.attribute;

import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Reference2DoubleArrayMap;
import it.unimi.dsi.fastutil.objects.Reference2DoubleMaps;
import it.unimi.dsi.fastutil.objects.Reference2DoubleMap.Entry;
import java.util.Objects;
import net.minecraft.core.Holder;
import net.minecraft.core.QuartPos;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.BiomeResolver;
import net.minecraft.world.phys.Vec3;

public class SpatialAttributeInterpolator {
   private final Reference2DoubleArrayMap<EnvironmentAttributeMap> weightsBySource = new Reference2DoubleArrayMap();

   public void clear() {
      this.weightsBySource.clear();
   }

   public SpatialAttributeInterpolator sampleBiomes(final BiomeResolver biomeResolver, final Vec3 position) {
      this.clear();
      GaussianSampler.sample(position.scale(0.25), (quartX, quartY, quartZ, weight) -> {
         Holder<Biome> biome = biomeResolver.getBiome(QuartPos.toBlock(quartX) + 2, QuartPos.toBlock(quartY) + 2, QuartPos.toBlock(quartZ) + 2);
         this.accumulate(weight, biome.value().getAttributes());
      });
      return this;
   }

   public SpatialAttributeInterpolator accumulate(final double weight, final EnvironmentAttributeMap attributes) {
      this.weightsBySource.mergeDouble(attributes, weight, Double::sum);
      return this;
   }

   public <Value> Value applyAttributeLayer(final EnvironmentAttribute<Value> attribute, final Value baseValue) {
      if (this.weightsBySource.isEmpty()) {
         return baseValue;
      }

      if (this.weightsBySource.size() == 1) {
         EnvironmentAttributeMap sourceAttributes = (EnvironmentAttributeMap)this.weightsBySource.keySet().iterator().next();
         return sourceAttributes.applyModifier(attribute, baseValue);
      }

      LerpFunction<Value> lerp = attribute.type().spatialLerp();
      Value resultValue = null;
      double accumulatedWeight = 0.0;
      ObjectIterator var7 = Reference2DoubleMaps.fastIterable(this.weightsBySource).iterator();

      while (var7.hasNext()) {
         Entry<EnvironmentAttributeMap> entry = (Entry<EnvironmentAttributeMap>)var7.next();
         EnvironmentAttributeMap sourceAttributes = (EnvironmentAttributeMap)entry.getKey();
         double sourceWeight = entry.getDoubleValue();
         Value sourceValue = sourceAttributes.applyModifier(attribute, baseValue);
         accumulatedWeight += sourceWeight;
         if (resultValue == null) {
            resultValue = sourceValue;
         } else {
            float relativeFraction = (float)(sourceWeight / accumulatedWeight);
            resultValue = lerp.apply(relativeFraction, resultValue, sourceValue);
         }
      }

      return Objects.requireNonNull(resultValue);
   }
}
