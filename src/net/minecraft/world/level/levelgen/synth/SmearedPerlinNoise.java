package net.minecraft.world.level.levelgen.synth;

import net.minecraft.util.Interval;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.levelgen.densityfunction.DensityBuffer;
import net.minecraft.world.level.levelgen.densityfunction.DensityVolume;

@Deprecated
public class SmearedPerlinNoise extends PerlinNoise {
   private static final float SHIFT_UP_EPSILON = 1.0E-7F;
   private final double fudgeYScale;

   public SmearedPerlinNoise(final RandomSource random, final double fudgeYScale) {
      super(random);
      this.fudgeYScale = fudgeYScale;
   }

   public static Interval range(final double fudgeYScale) {
      return Interval.ofSymmetric((float)(Math.abs(fudgeYScale) + 2.0));
   }

   @Override
   public Interval range() {
      return range(this.fudgeYScale);
   }

   @Override
   public float get(final double _x, final double _y, final double _z) {
      double x = wrap(_x) + this.offsetX;
      double y = wrap(_y) + this.offsetY;
      double z = wrap(_z) + this.offsetZ;
      int floorX = Mth.floor(x);
      int floorY = Mth.floor(y);
      int floorZ = Mth.floor(z);
      float relativeX = (float)(x - floorX);
      double relativeY = y - floorY;
      float relativeZ = (float)(z - floorZ);
      float fudgedRelativeY = (float)(relativeY - this.computeFudgeY(_y, relativeY));
      return this.sampleAndLerp(floorX, floorY, floorZ, relativeX, fudgedRelativeY, relativeZ, (float)relativeY);
   }

   private double computeFudgeY(final double originalY, final double relativeY) {
      double fudgeLimit;
      if (originalY >= 0.0 && originalY < relativeY) {
         fudgeLimit = originalY;
      } else {
         fudgeLimit = relativeY;
      }

      return Mth.floor(fudgeLimit / this.fudgeYScale + 1.0E-7F) * this.fudgeYScale;
   }

   @Override
   public void addToVolume(final DensityBuffer buffer, final DensityVolume volume, final double xzScale, final double yScale, final float amplitude) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.OutOfMemoryError: Java heap space
      //   at java.base/java.util.HashMap.resize(HashMap.java:711)
      //   at java.base/java.util.HashMap.putVal(HashMap.java:670)
      //   at java.base/java.util.HashMap.put(HashMap.java:619)
      //   at org.jetbrains.java.decompiler.util.collections.PackedMap.putWithKey(PackedMap.java:41)
      //   at org.jetbrains.java.decompiler.util.collections.PackedMap.putWithKey(PackedMap.java:22)
      //   at org.jetbrains.java.decompiler.util.collections.FastSparseSetFactory.<init>(FastSparseSetFactory.java:30)
      //   at org.jetbrains.java.decompiler.modules.decompiler.sforms.SFormsConstructor.splitVariables(SFormsConstructor.java:85)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:54)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:43)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:317)
      //
      // Bytecode:
      // 000: fconst_0
      // 001: fstore 8
      // 003: fconst_0
      // 004: fstore 9
      // 006: fconst_0
      // 007: fstore 10
      // 009: fconst_0
      // 00a: fstore 11
      // 00c: fconst_0
      // 00d: fstore 12
      // 00f: fconst_0
      // 010: fstore 13
      // 012: fconst_0
      // 013: fstore 14
      // 015: fconst_0
      // 016: fstore 15
      // 018: fconst_0
      // 019: fstore 16
      // 01b: fconst_0
      // 01c: fstore 17
      // 01e: fconst_0
      // 01f: fstore 18
      // 021: fconst_0
      // 022: fstore 19
      // 024: fconst_0
      // 025: fstore 20
      // 027: fconst_0
      // 028: fstore 21
      // 02a: fconst_0
      // 02b: fstore 22
      // 02d: fconst_0
      // 02e: fstore 23
      // 030: bipush 0
      // 031: istore 24
      // 033: bipush 0
      // 034: istore 25
      // 036: iload 25
      // 038: aload 2
      // 039: invokevirtual net/minecraft/world/level/levelgen/densityfunction/DensityVolume.sizeX ()I
      // 03c: if_icmpge 2b0
      // 03f: aload 2
      // 040: iload 25
      // 042: invokevirtual net/minecraft/world/level/levelgen/densityfunction/DensityVolume.blockX (I)I
      // 045: i2d
      // 046: dload 3
      // 047: dmul
      // 048: invokestatic net/minecraft/world/level/levelgen/synth/SmearedPerlinNoise.wrap (D)D
      // 04b: aload 0
      // 04c: getfield net/minecraft/world/level/levelgen/synth/SmearedPerlinNoise.offsetX D
      // 04f: dadd
      // 050: dstore 26
      // 052: dload 26
      // 054: invokestatic net/minecraft/util/Mth.floor (D)I
      // 057: istore 28
      // 059: dload 26
      // 05b: iload 28
      // 05d: i2d
      // 05e: dsub
      // 05f: d2f
      // 060: fstore 29
      // 062: aload 0
      // 063: iload 28
      // 065: invokevirtual net/minecraft/world/level/levelgen/synth/SmearedPerlinNoise.permute (I)I
      // 068: istore 30
      // 06a: aload 0
      // 06b: iload 28
      // 06d: bipush 1
      // 06e: iadd
      // 06f: invokevirtual net/minecraft/world/level/levelgen/synth/SmearedPerlinNoise.permute (I)I
      // 072: istore 31
      // 074: fload 29
      // 076: invokestatic net/minecraft/util/Mth.smoothstep (F)F
      // 079: fstore 32
      // 07b: bipush 0
      // 07c: istore 33
      // 07e: iload 33
      // 080: aload 2
      // 081: invokevirtual net/minecraft/world/level/levelgen/densityfunction/DensityVolume.sizeZ ()I
      // 084: if_icmpge 2aa
      // 087: aload 2
      // 088: iload 33
      // 08a: invokevirtual net/minecraft/world/level/levelgen/densityfunction/DensityVolume.blockZ (I)I
      // 08d: i2d
      // 08e: dload 3
      // 08f: dmul
      // 090: invokestatic net/minecraft/world/level/levelgen/synth/SmearedPerlinNoise.wrap (D)D
      // 093: aload 0
      // 094: getfield net/minecraft/world/level/levelgen/synth/SmearedPerlinNoise.offsetZ D
      // 097: dadd
      // 098: dstore 34
      // 09a: dload 34
      // 09c: invokestatic net/minecraft/util/Mth.floor (D)I
      // 09f: istore 36
      // 0a1: dload 34
      // 0a3: iload 36
      // 0a5: i2d
      // 0a6: dsub
      // 0a7: d2f
      // 0a8: fstore 37
      // 0aa: fload 37
      // 0ac: invokestatic net/minecraft/util/Mth.smoothstep (F)F
      // 0af: fstore 38
      // 0b1: ldc -2147483648
      // 0b3: istore 39
      // 0b5: bipush 0
      // 0b6: istore 40
      // 0b8: iload 40
      // 0ba: aload 2
      // 0bb: invokevirtual net/minecraft/world/level/levelgen/densityfunction/DensityVolume.sizeY ()I
      // 0be: if_icmpge 2a4
      // 0c1: aload 2
      // 0c2: iload 40
      // 0c4: invokevirtual net/minecraft/world/level/levelgen/densityfunction/DensityVolume.blockY (I)I
      // 0c7: i2d
      // 0c8: dload 5
      // 0ca: dmul
      // 0cb: dstore 41
      // 0cd: dload 41
      // 0cf: invokestatic net/minecraft/world/level/levelgen/synth/SmearedPerlinNoise.wrap (D)D
      // 0d2: aload 0
      // 0d3: getfield net/minecraft/world/level/levelgen/synth/SmearedPerlinNoise.offsetY D
      // 0d6: dadd
      // 0d7: dstore 43
      // 0d9: dload 43
      // 0db: invokestatic net/minecraft/util/Mth.floor (D)I
      // 0de: istore 45
      // 0e0: dload 43
      // 0e2: iload 45
      // 0e4: i2d
      // 0e5: dsub
      // 0e6: dstore 46
      // 0e8: dload 46
      // 0ea: d2f
      // 0eb: invokestatic net/minecraft/util/Mth.smoothstep (F)F
      // 0ee: fstore 48
      // 0f0: iload 39
      // 0f2: iload 45
      // 0f4: if_icmpeq 233
      // 0f7: aload 0
      // 0f8: iload 30
      // 0fa: iload 45
      // 0fc: iadd
      // 0fd: invokevirtual net/minecraft/world/level/levelgen/synth/SmearedPerlinNoise.permute (I)I
      // 100: istore 49
      // 102: aload 0
      // 103: iload 30
      // 105: iload 45
      // 107: iadd
      // 108: bipush 1
      // 109: iadd
      // 10a: invokevirtual net/minecraft/world/level/levelgen/synth/SmearedPerlinNoise.permute (I)I
      // 10d: istore 50
      // 10f: aload 0
      // 110: iload 31
      // 112: iload 45
      // 114: iadd
      // 115: invokevirtual net/minecraft/world/level/levelgen/synth/SmearedPerlinNoise.permute (I)I
      // 118: istore 51
      // 11a: aload 0
      // 11b: iload 31
      // 11d: iload 45
      // 11f: iadd
      // 120: bipush 1
      // 121: iadd
      // 122: invokevirtual net/minecraft/world/level/levelgen/synth/SmearedPerlinNoise.permute (I)I
      // 125: istore 52
      // 127: aload 0
      // 128: iload 49
      // 12a: iload 36
      // 12c: iadd
      // 12d: invokevirtual net/minecraft/world/level/levelgen/synth/SmearedPerlinNoise.permuteToGrad (I)Lnet/minecraft/world/level/levelgen/synth/GradientNoise$Gradient;
      // 130: astore 53
      // 132: aload 53
      // 134: fload 29
      // 136: fload 37
      // 138: invokevirtual net/minecraft/world/level/levelgen/synth/GradientNoise$Gradient.dotXz (FF)F
      // 13b: fstore 8
      // 13d: aload 53
      // 13f: invokevirtual net/minecraft/world/level/levelgen/synth/GradientNoise$Gradient.y ()I
      // 142: i2f
      // 143: fstore 16
      // 145: aload 0
      // 146: iload 51
      // 148: iload 36
      // 14a: iadd
      // 14b: invokevirtual net/minecraft/world/level/levelgen/synth/SmearedPerlinNoise.permuteToGrad (I)Lnet/minecraft/world/level/levelgen/synth/GradientNoise$Gradient;
      // 14e: astore 54
      // 150: aload 54
      // 152: fload 29
      // 154: fconst_1
      // 155: fsub
      // 156: fload 37
      // 158: invokevirtual net/minecraft/world/level/levelgen/synth/GradientNoise$Gradient.dotXz (FF)F
      // 15b: fstore 9
      // 15d: aload 54
      // 15f: invokevirtual net/minecraft/world/level/levelgen/synth/GradientNoise$Gradient.y ()I
      // 162: i2f
      // 163: fstore 17
      // 165: aload 0
      // 166: iload 50
      // 168: iload 36
      // 16a: iadd
      // 16b: invokevirtual net/minecraft/world/level/levelgen/synth/SmearedPerlinNoise.permuteToGrad (I)Lnet/minecraft/world/level/levelgen/synth/GradientNoise$Gradient;
      // 16e: astore 55
      // 170: aload 55
      // 172: fload 29
      // 174: fload 37
      // 176: invokevirtual net/minecraft/world/level/levelgen/synth/GradientNoise$Gradient.dotXz (FF)F
      // 179: fstore 10
      // 17b: aload 55
      // 17d: invokevirtual net/minecraft/world/level/levelgen/synth/GradientNoise$Gradient.y ()I
      // 180: i2f
      // 181: fstore 18
      // 183: aload 0
      // 184: iload 52
      // 186: iload 36
      // 188: iadd
      // 189: invokevirtual net/minecraft/world/level/levelgen/synth/SmearedPerlinNoise.permuteToGrad (I)Lnet/minecraft/world/level/levelgen/synth/GradientNoise$Gradient;
      // 18c: astore 56
      // 18e: aload 56
      // 190: fload 29
      // 192: fconst_1
      // 193: fsub
      // 194: fload 37
      // 196: invokevirtual net/minecraft/world/level/levelgen/synth/GradientNoise$Gradient.dotXz (FF)F
      // 199: fstore 11
      // 19b: aload 56
      // 19d: invokevirtual net/minecraft/world/level/levelgen/synth/GradientNoise$Gradient.y ()I
      // 1a0: i2f
      // 1a1: fstore 19
      // 1a3: aload 0
      // 1a4: iload 49
      // 1a6: iload 36
      // 1a8: iadd
      // 1a9: bipush 1
      // 1aa: iadd
      // 1ab: invokevirtual net/minecraft/world/level/levelgen/synth/SmearedPerlinNoise.permuteToGrad (I)Lnet/minecraft/world/level/levelgen/synth/GradientNoise$Gradient;
      // 1ae: astore 57
      // 1b0: aload 57
      // 1b2: fload 29
      // 1b4: fload 37
      // 1b6: fconst_1
      // 1b7: fsub
      // 1b8: invokevirtual net/minecraft/world/level/levelgen/synth/GradientNoise$Gradient.dotXz (FF)F
      // 1bb: fstore 12
      // 1bd: aload 57
      // 1bf: invokevirtual net/minecraft/world/level/levelgen/synth/GradientNoise$Gradient.y ()I
      // 1c2: i2f
      // 1c3: fstore 20
      // 1c5: aload 0
      // 1c6: iload 51
      // 1c8: iload 36
      // 1ca: iadd
      // 1cb: bipush 1
      // 1cc: iadd
      // 1cd: invokevirtual net/minecraft/world/level/levelgen/synth/SmearedPerlinNoise.permuteToGrad (I)Lnet/minecraft/world/level/levelgen/synth/GradientNoise$Gradient;
      // 1d0: astore 58
      // 1d2: aload 58
      // 1d4: fload 29
      // 1d6: fconst_1
      // 1d7: fsub
      // 1d8: fload 37
      // 1da: fconst_1
      // 1db: fsub
      // 1dc: invokevirtual net/minecraft/world/level/levelgen/synth/GradientNoise$Gradient.dotXz (FF)F
      // 1df: fstore 13
      // 1e1: aload 58
      // 1e3: invokevirtual net/minecraft/world/level/levelgen/synth/GradientNoise$Gradient.y ()I
      // 1e6: i2f
      // 1e7: fstore 21
      // 1e9: aload 0
      // 1ea: iload 50
      // 1ec: iload 36
      // 1ee: iadd
      // 1ef: bipush 1
      // 1f0: iadd
      // 1f1: invokevirtual net/minecraft/world/level/levelgen/synth/SmearedPerlinNoise.permuteToGrad (I)Lnet/minecraft/world/level/levelgen/synth/GradientNoise$Gradient;
      // 1f4: astore 59
      // 1f6: aload 59
      // 1f8: fload 29
      // 1fa: fload 37
      // 1fc: fconst_1
      // 1fd: fsub
      // 1fe: invokevirtual net/minecraft/world/level/levelgen/synth/GradientNoise$Gradient.dotXz (FF)F
      // 201: fstore 14
      // 203: aload 59
      // 205: invokevirtual net/minecraft/world/level/levelgen/synth/GradientNoise$Gradient.y ()I
      // 208: i2f
      // 209: fstore 22
      // 20b: aload 0
      // 20c: iload 52
      // 20e: iload 36
      // 210: iadd
      // 211: bipush 1
      // 212: iadd
      // 213: invokevirtual net/minecraft/world/level/levelgen/synth/SmearedPerlinNoise.permuteToGrad (I)Lnet/minecraft/world/level/levelgen/synth/GradientNoise$Gradient;
      // 216: astore 60
      // 218: aload 60
      // 21a: fload 29
      // 21c: fconst_1
      // 21d: fsub
      // 21e: fload 37
      // 220: fconst_1
      // 221: fsub
      // 222: invokevirtual net/minecraft/world/level/levelgen/synth/GradientNoise$Gradient.dotXz (FF)F
      // 225: fstore 15
      // 227: aload 60
      // 229: invokevirtual net/minecraft/world/level/levelgen/synth/GradientNoise$Gradient.y ()I
      // 22c: i2f
      // 22d: fstore 23
      // 22f: iload 45
      // 231: istore 39
      // 233: dload 46
      // 235: aload 0
      // 236: dload 41
      // 238: dload 46
      // 23a: invokevirtual net/minecraft/world/level/levelgen/synth/SmearedPerlinNoise.computeFudgeY (DD)D
      // 23d: dsub
      // 23e: d2f
      // 23f: fstore 49
      // 241: aload 1
      // 242: iload 24
      // 244: fload 7
      // 246: fload 32
      // 248: fload 48
      // 24a: fload 38
      // 24c: fload 8
      // 24e: fload 16
      // 250: fload 49
      // 252: fmul
      // 253: fadd
      // 254: fload 9
      // 256: fload 17
      // 258: fload 49
      // 25a: fmul
      // 25b: fadd
      // 25c: fload 10
      // 25e: fload 18
      // 260: fload 49
      // 262: fconst_1
      // 263: fsub
      // 264: fmul
      // 265: fadd
      // 266: fload 11
      // 268: fload 19
      // 26a: fload 49
      // 26c: fconst_1
      // 26d: fsub
      // 26e: fmul
      // 26f: fadd
      // 270: fload 12
      // 272: fload 20
      // 274: fload 49
      // 276: fmul
      // 277: fadd
      // 278: fload 13
      // 27a: fload 21
      // 27c: fload 49
      // 27e: fmul
      // 27f: fadd
      // 280: fload 14
      // 282: fload 22
      // 284: fload 49
      // 286: fconst_1
      // 287: fsub
      // 288: fmul
      // 289: fadd
      // 28a: fload 15
      // 28c: fload 23
      // 28e: fload 49
      // 290: fconst_1
      // 291: fsub
      // 292: fmul
      // 293: fadd
      // 294: invokestatic net/minecraft/util/Mth.lerp3 (FFFFFFFFFFF)F
      // 297: fmul
      // 298: invokevirtual net/minecraft/world/level/levelgen/densityfunction/DensityBuffer.addTo (IF)V
      // 29b: iinc 24 1
      // 29e: iinc 40 1
      // 2a1: goto 0b8
      // 2a4: iinc 33 1
      // 2a7: goto 07e
      // 2aa: iinc 25 1
      // 2ad: goto 036
      // 2b0: return
   }
}
