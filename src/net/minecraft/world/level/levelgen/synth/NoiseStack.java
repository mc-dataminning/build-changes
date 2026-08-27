package net.minecraft.world.level.levelgen.synth;

import com.google.common.annotations.VisibleForTesting;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.util.Interval;
import net.minecraft.world.level.levelgen.densityfunction.DensityBuffer;
import net.minecraft.world.level.levelgen.densityfunction.DensityVolume;

public class NoiseStack implements Noise {
   protected final NoiseStack.Layer[] layers;
   private final Interval range;

   private NoiseStack(final NoiseStack.Layer[] layers) {
      this.layers = layers;
      Interval range = Interval.ofExact(0.0F);

      for (NoiseStack.Layer layer : layers) {
         Interval layerRange = Interval.mul(layer.noise.range(), Interval.ofExact(layer.amplitude));
         range = Interval.add(range, layerRange);
      }

      this.range = range;
   }

   public static NoiseStack.Builder builder() {
      return new NoiseStack.Builder();
   }

   @Override
   public Interval range() {
      return this.range;
   }

   @Override
   public float get(final double x, final double y, final double z) {
      float value = 0.0F;

      for (NoiseStack.Layer layer : this.layers) {
         double frequency = layer.frequency;
         value += layer.amplitude * layer.noise.get(x * frequency, y * frequency, z * frequency);
      }

      return value;
   }

   @Override
   public float get(final double x, final double y) {
      float value = 0.0F;

      for (NoiseStack.Layer layer : this.layers) {
         double frequency = layer.frequency;
         value += layer.amplitude * layer.noise.get(x * frequency, y * frequency);
      }

      return value;
   }

   @Override
   public void addToVolume(final DensityBuffer buffer, final DensityVolume volume, final double xzScale, final double yScale, final float amplitude) {
      for (NoiseStack.Layer layer : this.layers) {
         double frequency = layer.frequency;
         layer.noise.addToVolume(buffer, volume, xzScale * frequency, yScale * frequency, amplitude * layer.amplitude);
      }
   }

   @VisibleForTesting
   public Noise getLayer(final int index) {
      return this.layers[index].noise;
   }

   public static class Builder {
      private final List<NoiseStack.Layer> layers = new ArrayList<>();

      private Builder() {
      }

      public NoiseStack.Builder add(final Noise noise, final double frequency, final float amplitude) {
         this.layers.add(new NoiseStack.Layer(noise, frequency, amplitude));
         return this;
      }

      public NoiseStack.Builder addStack(final NoiseStack stack, final double frequency, final float amplitude) {
         for (NoiseStack.Layer layer : stack.layers) {
            this.layers.add(new NoiseStack.Layer(layer.noise, layer.frequency * frequency, layer.amplitude * amplitude));
         }

         return this;
      }

      public NoiseStack build() {
         NoiseStack.Layer[] layers = this.layers.toArray(NoiseStack.Layer[]::new);
         if (this.layers.stream().allMatch(layer -> layer.noise.getClass() == PerlinNoise.class)) {
            return new NoiseStack.Perlin(layers);
         } else {
            return (NoiseStack)(this.layers.stream().allMatch(layer -> layer.noise.getClass() == SmearedPerlinNoise.class)
               ? new NoiseStack.SmearedPerlin(layers)
               : new NoiseStack(layers));
         }
      }
   }

   protected static record Layer(Noise noise, double frequency, float amplitude) {
   }

   private static class Perlin extends NoiseStack {
      private Perlin(final NoiseStack.Layer[] layers) {
         super(layers);
      }

      @Override
      public float get(final double x, final double y, final double z) {
         float value = 0.0F;

         for (NoiseStack.Layer layer : this.layers) {
            double frequency = layer.frequency;
            value += layer.amplitude * layer.noise.get(x * frequency, y * frequency, z * frequency);
         }

         return value;
      }

      @Override
      public void addToVolume(final DensityBuffer buffer, final DensityVolume volume, final double xzScale, final double yScale, final float amplitude) {
         for (NoiseStack.Layer layer : this.layers) {
            double frequency = layer.frequency;
            layer.noise.addToVolume(buffer, volume, xzScale * frequency, yScale * frequency, amplitude * layer.amplitude);
         }
      }
   }

   private static class SmearedPerlin extends NoiseStack {
      private SmearedPerlin(final NoiseStack.Layer[] layers) {
         super(layers);
      }

      @Override
      public float get(final double x, final double y, final double z) {
         float value = 0.0F;

         for (NoiseStack.Layer layer : this.layers) {
            double frequency = layer.frequency;
            value += layer.amplitude * layer.noise.get(x * frequency, y * frequency, z * frequency);
         }

         return value;
      }

      @Override
      public void addToVolume(final DensityBuffer buffer, final DensityVolume volume, final double xzScale, final double yScale, final float amplitude) {
         for (NoiseStack.Layer layer : this.layers) {
            double frequency = layer.frequency;
            layer.noise.addToVolume(buffer, volume, xzScale * frequency, yScale * frequency, amplitude * layer.amplitude);
         }
      }
   }
}
