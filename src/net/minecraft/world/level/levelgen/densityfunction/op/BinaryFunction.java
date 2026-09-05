package net.minecraft.world.level.levelgen.densityfunction.op;

import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.util.Interval;
import net.minecraft.world.level.levelgen.densityfunction.DensityBuffer;
import net.minecraft.world.level.levelgen.densityfunction.DensityFunction;
import net.minecraft.world.level.levelgen.densityfunction.DensitySampler;
import net.minecraft.world.level.levelgen.densityfunction.DensityVolume;
import net.minecraft.world.level.levelgen.densityfunction.DfRewriteRule;
import net.minecraft.world.level.levelgen.densityfunction.SamplerContext;
import net.minecraft.world.level.levelgen.densityfunction.ScopedDensityBuffer;
import net.minecraft.world.level.levelgen.densityfunction.generator.ConstantFunction;
import org.slf4j.Logger;

public record BinaryFunction(BinaryFunction.Type type, DensityFunction left, DensityFunction right) implements DensityFunction {
   private static final Logger LOGGER = LogUtils.getLogger();

   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   @Override
   public DensitySampler compileSampler(final DensityFunction.CompileContext context) {
      DensitySampler left = this.left.compileSampler(context);
      DensitySampler right = this.right.compileSampler(context);
      Throwable var59;
      switch (this.type) {
         case ADD:
            if (this.left instanceof ConstantFunction var29) {
               ConstantFunction var80 = var29;

               try {
                  var81 = var80.value();
               } catch (Throwable var24) {
                  var59 = var24;
                  boolean var93 = false;
                  break;
               }

               float var51 = var81;
               if (true) {
                  return new BinaryFunction.ConstAddSampler(right, var51);
               }
            }

            if (this.right instanceof ConstantFunction var36) {
               ConstantFunction var82 = var36;

               try {
                  var83 = var82.value();
               } catch (Throwable var23) {
                  var59 = var23;
                  boolean var94 = false;
                  break;
               }

               float var52 = var83;
               if (true) {
                  return new BinaryFunction.ConstAddSampler(left, var52);
               }
            }

            return new BinaryFunction.AddSampler(left, right);
         case SUB:
            if (this.left instanceof ConstantFunction var28) {
               ConstantFunction var76 = var28;

               try {
                  var77 = var76.value();
               } catch (Throwable var22) {
                  var59 = var22;
                  boolean var91 = false;
                  break;
               }

               float var49 = var77;
               if (true) {
                  return new BinaryFunction.ConstSubSampler(var49, right);
               }
            }

            if (this.right instanceof ConstantFunction var35) {
               ConstantFunction var78 = var35;

               try {
                  var79 = var78.value();
               } catch (Throwable var21) {
                  var59 = var21;
                  boolean var92 = false;
                  break;
               }

               float var50 = var79;
               if (true) {
                  return new BinaryFunction.ConstAddSampler(left, -var50);
               }
            }

            return new BinaryFunction.SubSampler(left, right);
         case MUL:
            if (this.left instanceof ConstantFunction var27) {
               ConstantFunction var72 = var27;

               try {
                  var73 = var72.value();
               } catch (Throwable var20) {
                  var59 = var20;
                  boolean var89 = false;
                  break;
               }

               float var47 = var73;
               if (true) {
                  return new BinaryFunction.ConstMulSampler(right, var47);
               }
            }

            if (this.right instanceof ConstantFunction var34) {
               ConstantFunction var74 = var34;

               try {
                  var75 = var74.value();
               } catch (Throwable var19) {
                  var59 = var19;
                  boolean var90 = false;
                  break;
               }

               float var48 = var75;
               if (true) {
                  return new BinaryFunction.ConstMulSampler(left, var48);
               }
            }

            return new BinaryFunction.MulSampler(left, right);
         case DIV:
            if (this.left instanceof ConstantFunction var26) {
               ConstantFunction var68 = var26;

               try {
                  var69 = var68.value();
               } catch (Throwable var18) {
                  var59 = var18;
                  boolean var87 = false;
                  break;
               }

               float rightValue = var69;
               if (true) {
                  return new BinaryFunction.ConstDivSampler(rightValue, right);
               }
            }

            if (this.right instanceof ConstantFunction var33) {
               ConstantFunction var70 = var33;

               try {
                  var71 = var70.value();
               } catch (Throwable var17) {
                  var59 = var17;
                  boolean var88 = false;
                  break;
               }

               float var46 = var71;
               if (true) {
                  return new BinaryFunction.ConstMulSampler(left, 1.0F / var46);
               }
            }

            return new BinaryFunction.DivSampler(left, right);
         case MIN:
            Interval leftRangex = this.left.range();
            Interval rightRangex = this.right.range();
            if (leftRangex.max() < rightRangex.min()) {
               this.warnNonIntersecting();
               return left;
            }

            if (rightRangex.max() < leftRangex.min()) {
               this.warnNonIntersecting();
               return right;
            }

            if (this.left instanceof ConstantFunction var32) {
               ConstantFunction var64 = var32;

               try {
                  var65 = var64.value();
               } catch (Throwable var16) {
                  var59 = var16;
                  boolean var85 = false;
                  break;
               }

               float var57 = var65;
               if (true) {
                  return new BinaryFunction.ConstMinSampler(right, var57);
               }
            }

            if (this.right instanceof ConstantFunction var37) {
               ConstantFunction var66 = var37;

               try {
                  var67 = var66.value();
               } catch (Throwable var15) {
                  var59 = var15;
                  boolean var86 = false;
                  break;
               }

               float var58 = var67;
               if (true) {
                  return new BinaryFunction.ConstMinSampler(left, var58);
               }
            }

            return new BinaryFunction.MinSampler(left, right, rightRangex.min());
         case MAX:
            Interval leftRange = this.left.range();
            Interval rightRange = this.right.range();
            if (leftRange.min() > rightRange.max()) {
               this.warnNonIntersecting();
               return left;
            }

            if (rightRange.min() > leftRange.max()) {
               this.warnNonIntersecting();
               return right;
            }

            if (this.left instanceof ConstantFunction var6) {
               ConstantFunction var10000 = var6;

               try {
                  var60 = var10000.value();
               } catch (Throwable var14) {
                  var59 = var14;
                  boolean var10001 = false;
                  break;
               }

               float var11 = var60;
               if (true) {
                  return new BinaryFunction.ConstMaxSampler(right, var11);
               }
            }

            if (this.right instanceof ConstantFunction var8) {
               ConstantFunction var61 = var8;

               try {
                  var62 = var61.value();
               } catch (Throwable var13) {
                  var59 = var13;
                  boolean var84 = false;
                  break;
               }

               float var56 = var62;
               if (true) {
                  return new BinaryFunction.ConstMaxSampler(left, var56);
               }
            }

            return new BinaryFunction.MaxSampler(left, right, rightRange.max());
         default:
            throw new MatchException(null, null);
      }

      Throwable var30 = var59;
      throw new MatchException(var30.toString(), var30);
   }

   private void warnNonIntersecting() {
      LOGGER.warn(
         "Compiling a {} function between two non-overlapping inputs: {} ({}) and {} ({})",
         new Object[]{this.type, this.left, this.left.range(), this.right, this.right.range()}
      );
   }

   @Override
   public DensityFunction rewriteChildren(final DfRewriteRule rule) {
      DensityFunction left = rule.rewrite(this.left);
      DensityFunction right = rule.rewrite(this.right);
      return left == this.left && this.right == right ? this : new BinaryFunction(this.type, left, right);
   }

   @Override
   public Interval range() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield net/minecraft/world/level/levelgen/densityfunction/op/BinaryFunction.left Lnet/minecraft/world/level/levelgen/densityfunction/DensityFunction;
      // 04: invokeinterface net/minecraft/world/level/levelgen/densityfunction/DensityFunction.range ()Lnet/minecraft/util/Interval; 1
      // 09: astore 1
      // 0a: aload 0
      // 0b: getfield net/minecraft/world/level/levelgen/densityfunction/op/BinaryFunction.right Lnet/minecraft/world/level/levelgen/densityfunction/DensityFunction;
      // 0e: invokeinterface net/minecraft/world/level/levelgen/densityfunction/DensityFunction.range ()Lnet/minecraft/util/Interval; 1
      // 13: astore 2
      // 14: aload 0
      // 15: getfield net/minecraft/world/level/levelgen/densityfunction/op/BinaryFunction.type Lnet/minecraft/world/level/levelgen/densityfunction/op/BinaryFunction$Type;
      // 18: invokevirtual net/minecraft/world/level/levelgen/densityfunction/op/BinaryFunction$Type.ordinal ()I
      // 1b: tableswitch 37 0 5 47 55 63 71 87 79
      // 40: new java/lang/MatchException
      // 43: dup
      // 44: aconst_null
      // 45: aconst_null
      // 46: invokespecial java/lang/MatchException.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 49: athrow
      // 4a: aload 1
      // 4b: aload 2
      // 4c: invokestatic net/minecraft/util/Interval.add (Lnet/minecraft/util/Interval;Lnet/minecraft/util/Interval;)Lnet/minecraft/util/Interval;
      // 4f: goto 77
      // 52: aload 1
      // 53: aload 2
      // 54: invokestatic net/minecraft/util/Interval.sub (Lnet/minecraft/util/Interval;Lnet/minecraft/util/Interval;)Lnet/minecraft/util/Interval;
      // 57: goto 77
      // 5a: aload 1
      // 5b: aload 2
      // 5c: invokestatic net/minecraft/util/Interval.mul (Lnet/minecraft/util/Interval;Lnet/minecraft/util/Interval;)Lnet/minecraft/util/Interval;
      // 5f: goto 77
      // 62: aload 1
      // 63: aload 2
      // 64: invokestatic net/minecraft/util/Interval.div (Lnet/minecraft/util/Interval;Lnet/minecraft/util/Interval;)Lnet/minecraft/util/Interval;
      // 67: goto 77
      // 6a: aload 1
      // 6b: aload 2
      // 6c: invokestatic net/minecraft/util/Interval.max (Lnet/minecraft/util/Interval;Lnet/minecraft/util/Interval;)Lnet/minecraft/util/Interval;
      // 6f: goto 77
      // 72: aload 1
      // 73: aload 2
      // 74: invokestatic net/minecraft/util/Interval.min (Lnet/minecraft/util/Interval;Lnet/minecraft/util/Interval;)Lnet/minecraft/util/Interval;
      // 77: areturn
   }

   @DensityFunction.Axes
   @Override
   public int domainAxes() {
      return this.left.domainAxes() | this.right.domainAxes();
   }

   @Override
   public MapCodec<BinaryFunction> codec() {
      return this.type().codec;
   }

   public static record AddSampler(DensitySampler left, DensitySampler right) implements DensitySampler {
      @Override
      public void sampleVolume(final SamplerContext context, final DensityBuffer outputBuffer, final DensityVolume volume) {
         // $VF: Couldn't be decompiled
         // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
         //
         // Bytecode:
         // 00: aload 0
         // 01: getfield net/minecraft/world/level/levelgen/densityfunction/op/BinaryFunction$AddSampler.left Lnet/minecraft/world/level/levelgen/densityfunction/DensitySampler;
         // 04: aload 1
         // 05: aload 2
         // 06: aload 3
         // 07: invokeinterface net/minecraft/world/level/levelgen/densityfunction/DensitySampler.sampleVolume (Lnet/minecraft/world/level/levelgen/densityfunction/SamplerContext;Lnet/minecraft/world/level/levelgen/densityfunction/DensityBuffer;Lnet/minecraft/world/level/levelgen/densityfunction/DensityVolume;)V 4
         // 0c: aload 1
         // 0d: aload 3
         // 0e: invokevirtual net/minecraft/world/level/levelgen/densityfunction/SamplerContext.acquireBuffer (Lnet/minecraft/world/level/levelgen/densityfunction/DensityVolume;)Lnet/minecraft/world/level/levelgen/densityfunction/ScopedDensityBuffer;
         // 11: astore 4
         // 13: aload 0
         // 14: getfield net/minecraft/world/level/levelgen/densityfunction/op/BinaryFunction$AddSampler.right Lnet/minecraft/world/level/levelgen/densityfunction/DensitySampler;
         // 17: aload 1
         // 18: aload 4
         // 1a: aload 3
         // 1b: invokeinterface net/minecraft/world/level/levelgen/densityfunction/DensitySampler.sampleVolume (Lnet/minecraft/world/level/levelgen/densityfunction/SamplerContext;Lnet/minecraft/world/level/levelgen/densityfunction/DensityBuffer;Lnet/minecraft/world/level/levelgen/densityfunction/DensityVolume;)V 4
         // 20: bipush 0
         // 21: istore 5
         // 23: iload 5
         // 25: aload 2
         // 26: invokevirtual net/minecraft/world/level/levelgen/densityfunction/DensityBuffer.size ()I
         // 29: if_icmpge 3f
         // 2c: aload 2
         // 2d: iload 5
         // 2f: aload 4
         // 31: iload 5
         // 33: invokevirtual net/minecraft/world/level/levelgen/densityfunction/ScopedDensityBuffer.get (I)F
         // 36: invokevirtual net/minecraft/world/level/levelgen/densityfunction/DensityBuffer.addTo (IF)V
         // 39: iinc 5 1
         // 3c: goto 23
         // 3f: aload 4
         // 41: ifnull 67
         // 44: aload 4
         // 46: invokevirtual net/minecraft/world/level/levelgen/densityfunction/ScopedDensityBuffer.close ()V
         // 49: goto 67
         // 4c: astore 5
         // 4e: aload 4
         // 50: ifnull 64
         // 53: aload 4
         // 55: invokevirtual net/minecraft/world/level/levelgen/densityfunction/ScopedDensityBuffer.close ()V
         // 58: goto 64
         // 5b: astore 6
         // 5d: aload 5
         // 5f: aload 6
         // 61: invokevirtual java/lang/Throwable.addSuppressed (Ljava/lang/Throwable;)V
         // 64: aload 5
         // 66: athrow
         // 67: return
      }

      @Override
      public float sampleValue(final SamplerContext context, final int blockX, final int blockY, final int blockZ) {
         return this.left.sampleValue(context, blockX, blockY, blockZ) + this.right.sampleValue(context, blockX, blockY, blockZ);
      }
   }

   public static record ConstAddSampler(DensitySampler left, float right) implements DensitySampler {
      @Override
      public void sampleVolume(final SamplerContext context, final DensityBuffer outputBuffer, final DensityVolume volume) {
         this.left.sampleVolume(context, outputBuffer, volume);

         for (int i = 0; i < outputBuffer.size(); i++) {
            outputBuffer.addTo(i, this.right);
         }
      }

      @Override
      public float sampleValue(final SamplerContext context, final int blockX, final int blockY, final int blockZ) {
         return this.left.sampleValue(context, blockX, blockY, blockZ) + this.right;
      }
   }

   public static record ConstDivSampler(float left, DensitySampler right) implements DensitySampler {
      @Override
      public void sampleVolume(final SamplerContext context, final DensityBuffer outputBuffer, final DensityVolume volume) {
         this.right.sampleVolume(context, outputBuffer, volume);

         for (int i = 0; i < outputBuffer.size(); i++) {
            outputBuffer.set(i, this.left / outputBuffer.get(i));
         }
      }

      @Override
      public float sampleValue(final SamplerContext context, final int blockX, final int blockY, final int blockZ) {
         return this.left / this.right.sampleValue(context, blockX, blockY, blockZ);
      }
   }

   public static record ConstMaxSampler(DensitySampler left, float right) implements DensitySampler {
      @Override
      public void sampleVolume(final SamplerContext context, final DensityBuffer outputBuffer, final DensityVolume volume) {
         this.left.sampleVolume(context, outputBuffer, volume);

         for (int i = 0; i < outputBuffer.size(); i++) {
            if (this.right > outputBuffer.get(i)) {
               outputBuffer.set(i, this.right);
            }
         }
      }

      @Override
      public float sampleValue(final SamplerContext context, final int blockX, final int blockY, final int blockZ) {
         return Math.max(this.left.sampleValue(context, blockX, blockY, blockZ), this.right);
      }
   }

   public static record ConstMinSampler(DensitySampler left, float right) implements DensitySampler {
      @Override
      public void sampleVolume(final SamplerContext context, final DensityBuffer outputBuffer, final DensityVolume volume) {
         this.left.sampleVolume(context, outputBuffer, volume);

         for (int i = 0; i < outputBuffer.size(); i++) {
            if (this.right < outputBuffer.get(i)) {
               outputBuffer.set(i, this.right);
            }
         }
      }

      @Override
      public float sampleValue(final SamplerContext context, final int blockX, final int blockY, final int blockZ) {
         return Math.min(this.left.sampleValue(context, blockX, blockY, blockZ), this.right);
      }
   }

   public static record ConstMulSampler(DensitySampler left, float right) implements DensitySampler {
      @Override
      public void sampleVolume(final SamplerContext context, final DensityBuffer outputBuffer, final DensityVolume volume) {
         this.left.sampleVolume(context, outputBuffer, volume);

         for (int i = 0; i < outputBuffer.size(); i++) {
            outputBuffer.set(i, outputBuffer.get(i) * this.right);
         }
      }

      @Override
      public float sampleValue(final SamplerContext context, final int blockX, final int blockY, final int blockZ) {
         return this.left.sampleValue(context, blockX, blockY, blockZ) * this.right;
      }
   }

   public static record ConstSubSampler(float left, DensitySampler right) implements DensitySampler {
      @Override
      public void sampleVolume(final SamplerContext context, final DensityBuffer outputBuffer, final DensityVolume volume) {
         this.right.sampleVolume(context, outputBuffer, volume);

         for (int i = 0; i < outputBuffer.size(); i++) {
            outputBuffer.set(i, this.left - outputBuffer.get(i));
         }
      }

      @Override
      public float sampleValue(final SamplerContext context, final int blockX, final int blockY, final int blockZ) {
         return this.left - this.right.sampleValue(context, blockX, blockY, blockZ);
      }
   }

   public static record DivSampler(DensitySampler left, DensitySampler right) implements DensitySampler {
      @Override
      public void sampleVolume(final SamplerContext context, final DensityBuffer outputBuffer, final DensityVolume volume) {
         this.left.sampleVolume(context, outputBuffer, volume);

         try (ScopedDensityBuffer rightBuffer = context.acquireBuffer(volume)) {
            this.right.sampleVolume(context, rightBuffer, volume);

            for (int i = 0; i < outputBuffer.size(); i++) {
               outputBuffer.set(i, outputBuffer.get(i) / rightBuffer.get(i));
            }
         }
      }

      @Override
      public float sampleValue(final SamplerContext context, final int blockX, final int blockY, final int blockZ) {
         float left = this.left.sampleValue(context, blockX, blockY, blockZ);
         return left == 0.0F ? 0.0F : left / this.right.sampleValue(context, blockX, blockY, blockZ);
      }
   }

   public static record MaxSampler(DensitySampler left, DensitySampler right, float rightMaxValue) implements DensitySampler {
      @Override
      public void sampleVolume(final SamplerContext context, final DensityBuffer outputBuffer, final DensityVolume volume) {
         this.left.sampleVolume(context, outputBuffer, volume);

         try (ScopedDensityBuffer rightBuffer = context.acquireBuffer(volume)) {
            this.right.sampleVolume(context, rightBuffer, volume);

            for (int i = 0; i < outputBuffer.size(); i++) {
               float rightValue = rightBuffer.get(i);
               if (rightValue > outputBuffer.get(i)) {
                  outputBuffer.set(i, rightValue);
               }
            }
         }
      }

      @Override
      public float sampleValue(final SamplerContext context, final int blockX, final int blockY, final int blockZ) {
         float left = this.left.sampleValue(context, blockX, blockY, blockZ);
         return left >= this.rightMaxValue ? left : Math.max(left, this.right.sampleValue(context, blockX, blockY, blockZ));
      }
   }

   public static record MinSampler(DensitySampler left, DensitySampler right, float rightMinValue) implements DensitySampler {
      @Override
      public void sampleVolume(final SamplerContext context, final DensityBuffer outputBuffer, final DensityVolume volume) {
         this.left.sampleVolume(context, outputBuffer, volume);

         try (ScopedDensityBuffer rightBuffer = context.acquireBuffer(volume)) {
            this.right.sampleVolume(context, rightBuffer, volume);

            for (int i = 0; i < outputBuffer.size(); i++) {
               float rightValue = rightBuffer.get(i);
               if (rightValue < outputBuffer.get(i)) {
                  outputBuffer.set(i, rightValue);
               }
            }
         }
      }

      @Override
      public float sampleValue(final SamplerContext context, final int blockX, final int blockY, final int blockZ) {
         float left = this.left.sampleValue(context, blockX, blockY, blockZ);
         return left <= this.rightMinValue ? left : Math.min(left, this.right.sampleValue(context, blockX, blockY, blockZ));
      }
   }

   public static record MulSampler(DensitySampler left, DensitySampler right) implements DensitySampler {
      @Override
      public void sampleVolume(final SamplerContext context, final DensityBuffer outputBuffer, final DensityVolume volume) {
         this.left.sampleVolume(context, outputBuffer, volume);

         try (ScopedDensityBuffer rightBuffer = context.acquireBuffer(volume)) {
            this.right.sampleVolume(context, rightBuffer, volume);

            for (int i = 0; i < outputBuffer.size(); i++) {
               outputBuffer.set(i, outputBuffer.get(i) * rightBuffer.get(i));
            }
         }
      }

      @Override
      public float sampleValue(final SamplerContext context, final int blockX, final int blockY, final int blockZ) {
         float left = this.left.sampleValue(context, blockX, blockY, blockZ);
         return left == 0.0F ? 0.0F : left * this.right.sampleValue(context, blockX, blockY, blockZ);
      }
   }

   public static record SubSampler(DensitySampler left, DensitySampler right) implements DensitySampler {
      @Override
      public void sampleVolume(final SamplerContext context, final DensityBuffer outputBuffer, final DensityVolume volume) {
         this.left.sampleVolume(context, outputBuffer, volume);

         try (ScopedDensityBuffer rightBuffer = context.acquireBuffer(volume)) {
            this.right.sampleVolume(context, rightBuffer, volume);

            for (int i = 0; i < outputBuffer.size(); i++) {
               outputBuffer.addTo(i, -rightBuffer.get(i));
            }
         }
      }

      @Override
      public float sampleValue(final SamplerContext context, final int blockX, final int blockY, final int blockZ) {
         return this.left.sampleValue(context, blockX, blockY, blockZ) - this.right.sampleValue(context, blockX, blockY, blockZ);
      }
   }

   public static enum Type {
      ADD("add"),
      SUB("sub"),
      MUL("mul"),
      DIV("div"),
      MIN("min"),
      MAX("max");

      public final String id;
      public final MapCodec<BinaryFunction> codec = RecordCodecBuilder.mapCodec(
         i -> i.group(
                  DensityFunction.CODEC.fieldOf("left").forGetter(BinaryFunction::left),
                  DensityFunction.CODEC.fieldOf("right").forGetter(BinaryFunction::right)
               )
               .apply(i, (left, right) -> new BinaryFunction(this, left, right))
      );

      private Type(final String id) {
         this.id = id;
      }
   }
}
