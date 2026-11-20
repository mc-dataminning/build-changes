package net.minecraft.world.level.levelgen.densityfunction.op;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.Direction;
import net.minecraft.util.Interval;
import net.minecraft.world.level.levelgen.densityfunction.DensityBuffer;
import net.minecraft.world.level.levelgen.densityfunction.DensityFunction;
import net.minecraft.world.level.levelgen.densityfunction.DensitySampler;
import net.minecraft.world.level.levelgen.densityfunction.DensityVolume;
import net.minecraft.world.level.levelgen.densityfunction.DfRewriteRule;
import net.minecraft.world.level.levelgen.densityfunction.SamplerContext;
import net.minecraft.world.level.levelgen.densityfunction.ScopedDensityBuffer;

public record SliceFunction(Direction.Axis axis, int coordinate, DensityFunction input) implements DensityFunction {
   public static final MapCodec<SliceFunction> CODEC = RecordCodecBuilder.mapCodec(
      i -> i.group(
            Direction.Axis.CODEC.fieldOf("axis").forGetter(SliceFunction::axis),
            Codec.INT.fieldOf("coordinate").forGetter(SliceFunction::coordinate),
            DensityFunction.CODEC.fieldOf("input").forGetter(SliceFunction::input)
         )
         .apply(i, SliceFunction::new)
   );

   @Override
   public DensitySampler compileSampler(final DensityFunction.CompileContext context) {
      if (!(
         this.input instanceof SliceFunction(Direction.Axis innerAxis, int innerCoordinate, DensityFunction innerInput)
            && (this.axis == Direction.Axis.X && innerAxis == Direction.Axis.Z || this.axis == Direction.Axis.Z && innerAxis == Direction.Axis.X)
      )) {
         DensitySampler input = this.input.compileSampler(context);

         return switch (this.axis) {
            case X -> new SliceFunction.XSampler(input, this.coordinate);
            case Y -> new SliceFunction.YSampler(input, this.coordinate);
            case Z -> new SliceFunction.ZSampler(input, this.coordinate);
         };
      } else {
         int x;
         int z;
         if (this.axis == Direction.Axis.X) {
            x = this.coordinate;
            z = innerCoordinate;
         } else {
            x = innerCoordinate;
            z = this.coordinate;
         }

         return new SliceFunction.XzSampler(innerInput.compileSampler(context), x, z);
      }
   }

   @Override
   public DensityFunction rewriteChildren(final DfRewriteRule rule) {
      DensityFunction input = rule.rewrite(this.input);
      return input == this.input ? this : new SliceFunction(this.axis, this.coordinate, input);
   }

   @Override
   public Interval range() {
      return this.input.range();
   }

   @Override
   public @DensityFunction.Axes int domainAxes() {
      return this.input.domainAxes() & ~DensityFunction.axesFrom(this.axis);
   }

   @Override
   public MapCodec<SliceFunction> codec() {
      return CODEC;
   }

   public record XSampler(DensitySampler input, int x) implements DensitySampler {
      @Override
      public void sampleVolume(final SamplerContext context, final DensityBuffer outputBuffer, final DensityVolume volume) {
         if (volume.sizeX() == 1 && volume.minBlockX() == this.x) {
            this.input.sampleVolume(context, outputBuffer, volume);
         } else {
            DensityVolume inputVolume = new DensityVolume(
               1, volume.sizeY(), volume.sizeZ(), this.x, volume.minBlockY(), volume.minBlockZ(), volume.stepBlockX(), volume.stepBlockY(), volume.stepBlockZ()
            );

            try (ScopedDensityBuffer inputBuffer = context.acquireBuffer(inputVolume)) {
               this.input.sampleVolume(context, inputBuffer, inputVolume);
               int outputIndex = 0;

               for (int z = 0; z < volume.sizeZ(); z++) {
                  int inputIndex = z * volume.sizeY();

                  for (int x = 0; x < volume.sizeX(); x++) {
                     outputBuffer.copyFrom(inputBuffer, inputIndex, outputIndex, volume.sizeY());
                     outputIndex += volume.sizeY();
                  }
               }
            }
         }
      }

      @Override
      public float sampleValue(final SamplerContext context, final int blockX, final int blockY, final int blockZ) {
         return this.input.sampleValue(context, this.x, blockY, blockZ);
      }
   }

   public record XzSampler(DensitySampler input, int x, int z) implements DensitySampler {
      @Override
      public void sampleVolume(final SamplerContext context, final DensityBuffer outputBuffer, final DensityVolume volume) {
         if (volume.sizeX() == 1 && volume.sizeZ() == 1 && volume.minBlockX() == this.x && volume.minBlockZ() == this.z) {
            this.input.sampleVolume(context, outputBuffer, volume);
         } else {
            DensityVolume inputVolume = new DensityVolume(
               1, volume.sizeY(), 1, this.x, volume.minBlockY(), this.z, volume.stepBlockX(), volume.stepBlockY(), volume.stepBlockZ()
            );
            this.input.sampleVolume(context, outputBuffer.slice(volume.sizeY()), inputVolume);

            for (int i = volume.sizeY(); i < volume.size(); i += volume.sizeY()) {
               outputBuffer.copyFrom(outputBuffer, 0, i, volume.sizeY());
            }
         }
      }

      @Override
      public float sampleValue(final SamplerContext context, final int blockX, final int blockY, final int blockZ) {
         return this.input.sampleValue(context, this.x, blockY, this.z);
      }
   }

   public record YSampler(DensitySampler input, int y) implements DensitySampler {
      @Override
      public void sampleVolume(final SamplerContext context, final DensityBuffer outputBuffer, final DensityVolume volume) {
         if (volume.sizeY() == 1 && volume.minBlockY() == this.y) {
            this.input.sampleVolume(context, outputBuffer, volume);
         } else {
            DensityVolume inputVolume = new DensityVolume(
               volume.sizeX(), 1, volume.sizeZ(), volume.minBlockX(), this.y, volume.minBlockZ(), volume.stepBlockX(), volume.stepBlockY(), volume.stepBlockZ()
            );

            try (ScopedDensityBuffer inputBuffer = context.acquireBuffer(inputVolume)) {
               this.input.sampleVolume(context, inputBuffer, inputVolume);

               for (int i = 0; i < inputVolume.size(); i++) {
                  float input = inputBuffer.get(i);
                  outputBuffer.setRange(i * volume.sizeY(), volume.sizeY(), input);
               }
            }
         }
      }

      @Override
      public float sampleValue(final SamplerContext context, final int blockX, final int blockY, final int blockZ) {
         return this.input.sampleValue(context, blockX, this.y, blockZ);
      }
   }

   public record ZSampler(DensitySampler input, int z) implements DensitySampler {
      @Override
      public void sampleVolume(final SamplerContext context, final DensityBuffer outputBuffer, final DensityVolume volume) {
         // $VF: Couldn't be decompiled
         // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
         //
         // Bytecode:
         // 00: aload 3
         // 01: invokevirtual net/minecraft/world/level/levelgen/densityfunction/DensityVolume.sizeZ ()I
         // 04: bipush 1
         // 05: if_icmpne 20
         // 08: aload 3
         // 09: invokevirtual net/minecraft/world/level/levelgen/densityfunction/DensityVolume.minBlockZ ()I
         // 0c: aload 0
         // 0d: getfield net/minecraft/world/level/levelgen/densityfunction/op/SliceFunction$ZSampler.z I
         // 10: if_icmpne 20
         // 13: aload 0
         // 14: getfield net/minecraft/world/level/levelgen/densityfunction/op/SliceFunction$ZSampler.input Lnet/minecraft/world/level/levelgen/densityfunction/DensitySampler;
         // 17: aload 1
         // 18: aload 2
         // 19: aload 3
         // 1a: invokeinterface net/minecraft/world/level/levelgen/densityfunction/DensitySampler.sampleVolume (Lnet/minecraft/world/level/levelgen/densityfunction/SamplerContext;Lnet/minecraft/world/level/levelgen/densityfunction/DensityBuffer;Lnet/minecraft/world/level/levelgen/densityfunction/DensityVolume;)V 4
         // 1f: return
         // 20: new net/minecraft/world/level/levelgen/densityfunction/DensityVolume
         // 23: dup
         // 24: aload 3
         // 25: invokevirtual net/minecraft/world/level/levelgen/densityfunction/DensityVolume.sizeX ()I
         // 28: aload 3
         // 29: invokevirtual net/minecraft/world/level/levelgen/densityfunction/DensityVolume.sizeY ()I
         // 2c: bipush 1
         // 2d: aload 3
         // 2e: invokevirtual net/minecraft/world/level/levelgen/densityfunction/DensityVolume.minBlockX ()I
         // 31: aload 3
         // 32: invokevirtual net/minecraft/world/level/levelgen/densityfunction/DensityVolume.minBlockY ()I
         // 35: aload 0
         // 36: getfield net/minecraft/world/level/levelgen/densityfunction/op/SliceFunction$ZSampler.z I
         // 39: aload 3
         // 3a: invokevirtual net/minecraft/world/level/levelgen/densityfunction/DensityVolume.stepBlockX ()I
         // 3d: aload 3
         // 3e: invokevirtual net/minecraft/world/level/levelgen/densityfunction/DensityVolume.stepBlockY ()I
         // 41: aload 3
         // 42: invokevirtual net/minecraft/world/level/levelgen/densityfunction/DensityVolume.stepBlockZ ()I
         // 45: invokespecial net/minecraft/world/level/levelgen/densityfunction/DensityVolume.<init> (IIIIIIIII)V
         // 48: astore 4
         // 4a: aload 4
         // 4c: invokevirtual net/minecraft/world/level/levelgen/densityfunction/DensityVolume.size ()I
         // 4f: istore 5
         // 51: aload 0
         // 52: getfield net/minecraft/world/level/levelgen/densityfunction/op/SliceFunction$ZSampler.input Lnet/minecraft/world/level/levelgen/densityfunction/DensitySampler;
         // 55: aload 1
         // 56: aload 2
         // 57: iload 5
         // 59: invokevirtual net/minecraft/world/level/levelgen/densityfunction/DensityBuffer.slice (I)Lnet/minecraft/world/level/levelgen/densityfunction/DensityBuffer;
         // 5c: aload 4
         // 5e: invokeinterface net/minecraft/world/level/levelgen/densityfunction/DensitySampler.sampleVolume (Lnet/minecraft/world/level/levelgen/densityfunction/SamplerContext;Lnet/minecraft/world/level/levelgen/densityfunction/DensityBuffer;Lnet/minecraft/world/level/levelgen/densityfunction/DensityVolume;)V 4
         // 63: iload 5
         // 65: istore 6
         // 67: iload 6
         // 69: aload 3
         // 6a: invokevirtual net/minecraft/world/level/levelgen/densityfunction/DensityVolume.size ()I
         // 6d: if_icmpge 84
         // 70: aload 2
         // 71: aload 2
         // 72: bipush 0
         // 73: iload 6
         // 75: iload 5
         // 77: invokevirtual net/minecraft/world/level/levelgen/densityfunction/DensityBuffer.copyFrom (Lnet/minecraft/world/level/levelgen/densityfunction/DensityBuffer;III)V
         // 7a: iload 6
         // 7c: iload 5
         // 7e: iadd
         // 7f: istore 6
         // 81: goto 67
         // 84: return
      }

      @Override
      public float sampleValue(final SamplerContext context, final int blockX, final int blockY, final int blockZ) {
         return this.input.sampleValue(context, blockX, blockY, this.z);
      }
   }
}
