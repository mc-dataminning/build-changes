package net.minecraft.world.level.levelgen.feature;

import com.mojang.serialization.MapCodec;
import java.util.List;
import net.minecraft.core.BlockPos;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.chunk.ChunkGenerator;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;

public class OreFeature extends AbstractOreFeature {
   public static final MapCodec<OreFeature> CODEC = makeCodec(OreFeature::new);
   private static final int STRIDE = 4;
   private static final int X_INDEX = 0;
   private static final int Y_INDEX = 1;
   private static final int Z_INDEX = 2;
   private static final int RADIUS_INDEX = 3;

   public OreFeature(final List<BlockReplacement> targetStates, final int size, final float discardChanceOnAirExposure) {
      super(targetStates, size, discardChanceOnAirExposure);
   }

   public OreFeature(final List<BlockReplacement> targetStates, final int size) {
      this(targetStates, size, 0.0F);
   }

   public OreFeature(final RuleTest target, final BlockState state, final int size) {
      this(List.of(new BlockReplacement(target, state)), size, 0.0F);
   }

   @Override
   public MapCodec<OreFeature> codec() {
      return CODEC;
   }

   @Override
   public boolean place(final WorldGenLevel level, final ChunkGenerator chunkGenerator, final RandomSource random, final BlockPos origin) {
      float dir = random.nextFloat() * (float) Math.PI;
      float spreadXY = this.size / 8.0F;
      int maxRadius = Mth.ceil((this.size / 16.0F * 2.0F + 1.0F) / 2.0F);
      double x0 = origin.getX() + Math.sin(dir) * spreadXY;
      double x1 = origin.getX() - Math.sin(dir) * spreadXY;
      double z0 = origin.getZ() + Math.cos(dir) * spreadXY;
      double z1 = origin.getZ() - Math.cos(dir) * spreadXY;
      int spreadY = 2;
      double y0 = origin.getY() + random.nextInt(3) - 2;
      double y1 = origin.getY() + random.nextInt(3) - 2;
      int xStart = origin.getX() - Mth.ceil(spreadXY) - maxRadius;
      int yStart = origin.getY() - 2 - maxRadius;
      int zStart = origin.getZ() - Mth.ceil(spreadXY) - maxRadius;
      int sizeXZ = 2 * (Mth.ceil(spreadXY) + maxRadius);
      return level.anyHeightMatches(Heightmap.Types.OCEAN_FLOOR_WG, xStart, zStart, xStart + sizeXZ - 1, zStart + sizeXZ - 1, yStart, Integer.MAX_VALUE)
         ? this.doPlace(level, random, x0, x1, z0, z1, y0, y1, xStart, zStart, sizeXZ)
         : false;
   }

   protected boolean doPlace(
      final WorldGenLevel level,
      final RandomSource random,
      final double x0,
      final double x1,
      final double z0,
      final double z1,
      final double y0,
      final double y1,
      final int xStart,
      final int zStart,
      final int sizeXZ
   ) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 000: bipush 0
      // 001: istore 18
      // 003: new net/minecraft/core/BlockPos$MutableBlockPos
      // 006: dup
      // 007: invokespecial net/minecraft/core/BlockPos$MutableBlockPos.<init> ()V
      // 00a: astore 19
      // 00c: aload 0
      // 00d: getfield net/minecraft/world/level/levelgen/feature/OreFeature.size I
      // 010: bipush 4
      // 011: imul
      // 012: newarray 7
      // 014: astore 20
      // 016: dconst_0
      // 017: dstore 21
      // 019: bipush 0
      // 01a: istore 23
      // 01c: iload 23
      // 01e: aload 0
      // 01f: getfield net/minecraft/world/level/levelgen/feature/OreFeature.size I
      // 022: if_icmpge 0b7
      // 025: iload 23
      // 027: i2f
      // 028: aload 0
      // 029: getfield net/minecraft/world/level/levelgen/feature/OreFeature.size I
      // 02c: i2f
      // 02d: fdiv
      // 02e: fstore 24
      // 030: fload 24
      // 032: f2d
      // 033: dload 3
      // 034: dload 5
      // 036: invokestatic net/minecraft/util/Mth.lerp (DDD)D
      // 039: dstore 25
      // 03b: fload 24
      // 03d: f2d
      // 03e: dload 11
      // 040: dload 13
      // 042: invokestatic net/minecraft/util/Mth.lerp (DDD)D
      // 045: dstore 27
      // 047: fload 24
      // 049: f2d
      // 04a: dload 7
      // 04c: dload 9
      // 04e: invokestatic net/minecraft/util/Mth.lerp (DDD)D
      // 051: dstore 29
      // 053: aload 2
      // 054: invokeinterface net/minecraft/util/RandomSource.nextDouble ()D 1
      // 059: aload 0
      // 05a: getfield net/minecraft/world/level/levelgen/feature/OreFeature.size I
      // 05d: i2d
      // 05e: dmul
      // 05f: ldc2_w 16.0
      // 062: ddiv
      // 063: dstore 31
      // 065: ldc 3.1415927
      // 067: fload 24
      // 069: fmul
      // 06a: f2d
      // 06b: invokestatic net/minecraft/util/Mth.sin (D)F
      // 06e: fconst_1
      // 06f: fadd
      // 070: f2d
      // 071: dload 31
      // 073: dmul
      // 074: dconst_1
      // 075: dadd
      // 076: ldc2_w 2.0
      // 079: ddiv
      // 07a: dstore 33
      // 07c: aload 20
      // 07e: iload 23
      // 080: bipush 4
      // 081: imul
      // 082: bipush 0
      // 083: iadd
      // 084: dload 25
      // 086: dastore
      // 087: aload 20
      // 089: iload 23
      // 08b: bipush 4
      // 08c: imul
      // 08d: bipush 1
      // 08e: iadd
      // 08f: dload 27
      // 091: dastore
      // 092: aload 20
      // 094: iload 23
      // 096: bipush 4
      // 097: imul
      // 098: bipush 2
      // 099: iadd
      // 09a: dload 29
      // 09c: dastore
      // 09d: aload 20
      // 09f: iload 23
      // 0a1: bipush 4
      // 0a2: imul
      // 0a3: bipush 3
      // 0a4: iadd
      // 0a5: dload 33
      // 0a7: dastore
      // 0a8: dload 21
      // 0aa: dload 33
      // 0ac: invokestatic java/lang/Math.max (DD)D
      // 0af: dstore 21
      // 0b1: iinc 23 1
      // 0b4: goto 01c
      // 0b7: dload 5
      // 0b9: dload 3
      // 0ba: dsub
      // 0bb: dload 13
      // 0bd: dload 11
      // 0bf: dsub
      // 0c0: dload 9
      // 0c2: dload 7
      // 0c4: dsub
      // 0c5: invokestatic net/minecraft/util/Mth.length (DDD)D
      // 0c8: aload 0
      // 0c9: getfield net/minecraft/world/level/levelgen/feature/OreFeature.size I
      // 0cc: i2d
      // 0cd: ddiv
      // 0ce: dstore 23
      // 0d0: bipush 0
      // 0d1: istore 25
      // 0d3: iload 25
      // 0d5: aload 0
      // 0d6: getfield net/minecraft/world/level/levelgen/feature/OreFeature.size I
      // 0d9: bipush 1
      // 0da: isub
      // 0db: if_icmpge 17a
      // 0de: aload 20
      // 0e0: iload 25
      // 0e2: bipush 4
      // 0e3: imul
      // 0e4: bipush 3
      // 0e5: iadd
      // 0e6: daload
      // 0e7: dconst_0
      // 0e8: dcmpg
      // 0e9: ifgt 0ef
      // 0ec: goto 174
      // 0ef: aload 20
      // 0f1: iload 25
      // 0f3: bipush 4
      // 0f4: imul
      // 0f5: bipush 3
      // 0f6: iadd
      // 0f7: daload
      // 0f8: dstore 26
      // 0fa: iload 25
      // 0fc: bipush 1
      // 0fd: iadd
      // 0fe: istore 28
      // 100: iload 28
      // 102: aload 0
      // 103: getfield net/minecraft/world/level/levelgen/feature/OreFeature.size I
      // 106: if_icmpge 174
      // 109: aload 20
      // 10b: iload 28
      // 10d: bipush 4
      // 10e: imul
      // 10f: bipush 3
      // 110: iadd
      // 111: daload
      // 112: dstore 29
      // 114: dload 29
      // 116: dconst_0
      // 117: dcmpg
      // 118: ifgt 11e
      // 11b: goto 16e
      // 11e: iload 28
      // 120: iload 25
      // 122: isub
      // 123: i2d
      // 124: dload 23
      // 126: dmul
      // 127: dstore 31
      // 129: dload 26
      // 12b: dload 29
      // 12d: dsub
      // 12e: dstore 33
      // 130: dload 33
      // 132: dload 33
      // 134: dmul
      // 135: dload 31
      // 137: dload 31
      // 139: dmul
      // 13a: dcmpl
      // 13b: ifle 163
      // 13e: dload 33
      // 140: dconst_0
      // 141: dcmpl
      // 142: ifle 154
      // 145: aload 20
      // 147: iload 28
      // 149: bipush 4
      // 14a: imul
      // 14b: bipush 3
      // 14c: iadd
      // 14d: ldc2_w -1.0
      // 150: dastore
      // 151: goto 163
      // 154: aload 20
      // 156: iload 25
      // 158: bipush 4
      // 159: imul
      // 15a: bipush 3
      // 15b: iadd
      // 15c: ldc2_w -1.0
      // 15f: dastore
      // 160: goto 174
      // 163: dload 31
      // 165: dload 21
      // 167: dcmpl
      // 168: ifle 16e
      // 16b: goto 174
      // 16e: iinc 28 1
      // 171: goto 100
      // 174: iinc 25 1
      // 177: goto 0d3
      // 17a: aload 1
      // 17b: invokeinterface net/minecraft/world/level/WorldGenLevel.getMinY ()I 1
      // 180: istore 25
      // 182: aload 1
      // 183: invokeinterface net/minecraft/world/level/WorldGenLevel.getMaxY ()I 1
      // 188: istore 26
      // 18a: iload 15
      // 18c: iload 17
      // 18e: iadd
      // 18f: bipush 1
      // 190: isub
      // 191: istore 27
      // 193: iload 16
      // 195: iload 17
      // 197: iadd
      // 198: bipush 1
      // 199: isub
      // 19a: istore 28
      // 19c: iload 17
      // 19e: iload 17
      // 1a0: imul
      // 1a1: newarray 10
      // 1a3: astore 29
      // 1a5: iload 17
      // 1a7: iload 17
      // 1a9: imul
      // 1aa: newarray 10
      // 1ac: astore 30
      // 1ae: aload 29
      // 1b0: ldc 2147483647
      // 1b2: invokestatic java/util/Arrays.fill ([II)V
      // 1b5: aload 30
      // 1b7: ldc -2147483648
      // 1b9: invokestatic java/util/Arrays.fill ([II)V
      // 1bc: iload 17
      // 1be: istore 31
      // 1c0: bipush -1
      // 1c1: istore 32
      // 1c3: iload 17
      // 1c5: istore 33
      // 1c7: bipush -1
      // 1c8: istore 34
      // 1ca: bipush 0
      // 1cb: istore 35
      // 1cd: iload 35
      // 1cf: aload 0
      // 1d0: getfield net/minecraft/world/level/levelgen/feature/OreFeature.size I
      // 1d3: if_icmpge 358
      // 1d6: aload 20
      // 1d8: iload 35
      // 1da: bipush 4
      // 1db: imul
      // 1dc: bipush 3
      // 1dd: iadd
      // 1de: daload
      // 1df: dstore 36
      // 1e1: dload 36
      // 1e3: dconst_0
      // 1e4: dcmpg
      // 1e5: ifge 1eb
      // 1e8: goto 352
      // 1eb: dload 36
      // 1ed: invokestatic net/minecraft/util/Mth.square (D)D
      // 1f0: dstore 38
      // 1f2: aload 20
      // 1f4: iload 35
      // 1f6: bipush 4
      // 1f7: imul
      // 1f8: bipush 0
      // 1f9: iadd
      // 1fa: daload
      // 1fb: dstore 40
      // 1fd: aload 20
      // 1ff: iload 35
      // 201: bipush 4
      // 202: imul
      // 203: bipush 1
      // 204: iadd
      // 205: daload
      // 206: dstore 42
      // 208: aload 20
      // 20a: iload 35
      // 20c: bipush 4
      // 20d: imul
      // 20e: bipush 2
      // 20f: iadd
      // 210: daload
      // 211: dstore 44
      // 213: dload 40
      // 215: dload 36
      // 217: dsub
      // 218: invokestatic net/minecraft/util/Mth.floor (D)I
      // 21b: iload 15
      // 21d: invokestatic java/lang/Math.max (II)I
      // 220: istore 46
      // 222: dload 44
      // 224: dload 36
      // 226: dsub
      // 227: invokestatic net/minecraft/util/Mth.floor (D)I
      // 22a: iload 16
      // 22c: invokestatic java/lang/Math.max (II)I
      // 22f: istore 47
      // 231: dload 40
      // 233: dload 36
      // 235: dadd
      // 236: invokestatic net/minecraft/util/Mth.floor (D)I
      // 239: iload 46
      // 23b: iload 27
      // 23d: invokestatic net/minecraft/util/Mth.clamp (III)I
      // 240: istore 48
      // 242: dload 44
      // 244: dload 36
      // 246: dadd
      // 247: invokestatic net/minecraft/util/Mth.floor (D)I
      // 24a: iload 47
      // 24c: iload 28
      // 24e: invokestatic net/minecraft/util/Mth.clamp (III)I
      // 251: istore 49
      // 253: iload 31
      // 255: iload 46
      // 257: iload 15
      // 259: isub
      // 25a: invokestatic java/lang/Math.min (II)I
      // 25d: istore 31
      // 25f: iload 32
      // 261: iload 48
      // 263: iload 15
      // 265: isub
      // 266: invokestatic java/lang/Math.max (II)I
      // 269: istore 32
      // 26b: iload 33
      // 26d: iload 47
      // 26f: iload 16
      // 271: isub
      // 272: invokestatic java/lang/Math.min (II)I
      // 275: istore 33
      // 277: iload 34
      // 279: iload 49
      // 27b: iload 16
      // 27d: isub
      // 27e: invokestatic java/lang/Math.max (II)I
      // 281: istore 34
      // 283: iload 46
      // 285: istore 50
      // 287: iload 50
      // 289: iload 48
      // 28b: if_icmpgt 352
      // 28e: iload 50
      // 290: i2d
      // 291: ldc2_w 0.5
      // 294: dadd
      // 295: dload 40
      // 297: dsub
      // 298: dstore 51
      // 29a: dload 38
      // 29c: dload 51
      // 29e: dload 51
      // 2a0: dmul
      // 2a1: dsub
      // 2a2: dstore 53
      // 2a4: dload 53
      // 2a6: dconst_0
      // 2a7: dcmpg
      // 2a8: ifgt 2ae
      // 2ab: goto 34c
      // 2ae: iload 50
      // 2b0: iload 15
      // 2b2: isub
      // 2b3: iload 17
      // 2b5: imul
      // 2b6: iload 16
      // 2b8: isub
      // 2b9: istore 55
      // 2bb: iload 47
      // 2bd: istore 56
      // 2bf: iload 56
      // 2c1: iload 49
      // 2c3: if_icmpgt 34c
      // 2c6: iload 56
      // 2c8: i2d
      // 2c9: ldc2_w 0.5
      // 2cc: dadd
      // 2cd: dload 44
      // 2cf: dsub
      // 2d0: dstore 57
      // 2d2: dload 53
      // 2d4: dload 57
      // 2d6: dload 57
      // 2d8: dmul
      // 2d9: dsub
      // 2da: dstore 59
      // 2dc: dload 59
      // 2de: dconst_0
      // 2df: dcmpg
      // 2e0: ifgt 2e6
      // 2e3: goto 346
      // 2e6: dload 59
      // 2e8: invokestatic java/lang/Math.sqrt (D)D
      // 2eb: dstore 61
      // 2ed: dload 42
      // 2ef: ldc2_w 0.5
      // 2f2: dsub
      // 2f3: dload 61
      // 2f5: dsub
      // 2f6: invokestatic net/minecraft/util/Mth.floor (D)I
      // 2f9: bipush 1
      // 2fa: iadd
      // 2fb: iload 25
      // 2fd: invokestatic java/lang/Math.max (II)I
      // 300: istore 63
      // 302: dload 42
      // 304: ldc2_w 0.5
      // 307: dsub
      // 308: dload 61
      // 30a: dadd
      // 30b: invokestatic net/minecraft/util/Mth.ceil (D)I
      // 30e: bipush 1
      // 30f: isub
      // 310: iload 26
      // 312: invokestatic java/lang/Math.min (II)I
      // 315: istore 64
      // 317: iload 63
      // 319: iload 64
      // 31b: if_icmple 321
      // 31e: goto 346
      // 321: iload 55
      // 323: iload 56
      // 325: iadd
      // 326: istore 65
      // 328: aload 29
      // 32a: iload 65
      // 32c: aload 29
      // 32e: iload 65
      // 330: iaload
      // 331: iload 63
      // 333: invokestatic java/lang/Math.min (II)I
      // 336: iastore
      // 337: aload 30
      // 339: iload 65
      // 33b: aload 30
      // 33d: iload 65
      // 33f: iaload
      // 340: iload 64
      // 342: invokestatic java/lang/Math.max (II)I
      // 345: iastore
      // 346: iinc 56 1
      // 349: goto 2bf
      // 34c: iinc 50 1
      // 34f: goto 287
      // 352: iinc 35 1
      // 355: goto 1cd
      // 358: new net/minecraft/world/level/chunk/BulkSectionAccess
      // 35b: dup
      // 35c: aload 1
      // 35d: invokespecial net/minecraft/world/level/chunk/BulkSectionAccess.<init> (Lnet/minecraft/world/level/LevelAccessor;)V
      // 360: astore 35
      // 362: aload 35
      // 364: dup
      // 365: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
      // 368: pop
      // 369: invokedynamic apply (Lnet/minecraft/world/level/chunk/BulkSectionAccess;)Ljava/util/function/Function; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, net/minecraft/world/level/chunk/BulkSectionAccess.getBlockState (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;, (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState; ]
      // 36e: astore 36
      // 370: aconst_null
      // 371: astore 37
      // 373: aconst_null
      // 374: astore 38
      // 376: iload 31
      // 378: istore 39
      // 37a: iload 39
      // 37c: iload 32
      // 37e: if_icmpgt 4f0
      // 381: iload 15
      // 383: iload 39
      // 385: iadd
      // 386: istore 40
      // 388: iload 40
      // 38a: invokestatic net/minecraft/core/SectionPos.sectionRelative (I)I
      // 38d: istore 41
      // 38f: iload 40
      // 391: invokestatic net/minecraft/core/SectionPos.blockToSectionCoord (I)I
      // 394: istore 42
      // 396: iload 39
      // 398: iload 17
      // 39a: imul
      // 39b: istore 43
      // 39d: iload 33
      // 39f: istore 44
      // 3a1: iload 44
      // 3a3: iload 34
      // 3a5: if_icmpgt 4ea
      // 3a8: iload 43
      // 3aa: iload 44
      // 3ac: iadd
      // 3ad: istore 45
      // 3af: aload 29
      // 3b1: iload 45
      // 3b3: iaload
      // 3b4: istore 46
      // 3b6: iload 46
      // 3b8: ldc 2147483647
      // 3ba: if_icmpne 3c0
      // 3bd: goto 4e4
      // 3c0: aload 30
      // 3c2: iload 45
      // 3c4: iaload
      // 3c5: istore 47
      // 3c7: iload 16
      // 3c9: iload 44
      // 3cb: iadd
      // 3cc: istore 48
      // 3ce: iload 48
      // 3d0: invokestatic net/minecraft/core/SectionPos.sectionRelative (I)I
      // 3d3: istore 49
      // 3d5: iload 48
      // 3d7: invokestatic net/minecraft/core/SectionPos.blockToSectionCoord (I)I
      // 3da: istore 50
      // 3dc: aload 1
      // 3dd: aload 19
      // 3df: iload 40
      // 3e1: iload 46
      // 3e3: iload 48
      // 3e5: invokevirtual net/minecraft/core/BlockPos$MutableBlockPos.set (III)Lnet/minecraft/core/BlockPos$MutableBlockPos;
      // 3e8: invokeinterface net/minecraft/world/level/WorldGenLevel.ensureCanWrite (Lnet/minecraft/core/BlockPos;)Z 2
      // 3ed: ifeq 40f
      // 3f0: iload 47
      // 3f2: iload 46
      // 3f4: if_icmpeq 40b
      // 3f7: aload 1
      // 3f8: aload 19
      // 3fa: iload 40
      // 3fc: iload 47
      // 3fe: iload 48
      // 400: invokevirtual net/minecraft/core/BlockPos$MutableBlockPos.set (III)Lnet/minecraft/core/BlockPos$MutableBlockPos;
      // 403: invokeinterface net/minecraft/world/level/WorldGenLevel.ensureCanWrite (Lnet/minecraft/core/BlockPos;)Z 2
      // 408: ifeq 40f
      // 40b: bipush 1
      // 40c: goto 410
      // 40f: bipush 0
      // 410: istore 51
      // 412: iload 46
      // 414: istore 52
      // 416: iload 52
      // 418: iload 47
      // 41a: if_icmpgt 4e4
      // 41d: aload 19
      // 41f: iload 52
      // 421: invokevirtual net/minecraft/core/BlockPos$MutableBlockPos.setY (I)Lnet/minecraft/core/BlockPos$MutableBlockPos;
      // 424: pop
      // 425: iload 51
      // 427: ifne 438
      // 42a: aload 1
      // 42b: aload 19
      // 42d: invokeinterface net/minecraft/world/level/WorldGenLevel.ensureCanWrite (Lnet/minecraft/core/BlockPos;)Z 2
      // 432: ifne 438
      // 435: goto 4de
      // 438: iload 52
      // 43a: invokestatic net/minecraft/core/SectionPos.blockToSectionCoord (I)I
      // 43d: istore 53
      // 43f: aload 37
      // 441: ifnull 462
      // 444: aload 37
      // 446: invokevirtual net/minecraft/core/SectionPos.getX ()I
      // 449: iload 42
      // 44b: if_icmpne 462
      // 44e: aload 37
      // 450: invokevirtual net/minecraft/core/SectionPos.getY ()I
      // 453: iload 53
      // 455: if_icmpne 462
      // 458: aload 37
      // 45a: invokevirtual net/minecraft/core/SectionPos.getZ ()I
      // 45d: iload 50
      // 45f: if_icmpeq 476
      // 462: aload 35
      // 464: aload 19
      // 466: invokevirtual net/minecraft/world/level/chunk/BulkSectionAccess.getSection (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/chunk/LevelChunkSection;
      // 469: astore 38
      // 46b: iload 42
      // 46d: iload 53
      // 46f: iload 50
      // 471: invokestatic net/minecraft/core/SectionPos.of (III)Lnet/minecraft/core/SectionPos;
      // 474: astore 37
      // 476: aload 38
      // 478: ifnonnull 47e
      // 47b: goto 4de
      // 47e: iload 52
      // 480: invokestatic net/minecraft/core/SectionPos.sectionRelative (I)I
      // 483: istore 54
      // 485: aload 38
      // 487: iload 41
      // 489: iload 54
      // 48b: iload 49
      // 48d: invokevirtual net/minecraft/world/level/chunk/LevelChunkSection.getBlockState (III)Lnet/minecraft/world/level/block/state/BlockState;
      // 490: astore 55
      // 492: aload 0
      // 493: getfield net/minecraft/world/level/levelgen/feature/OreFeature.targetStates Ljava/util/List;
      // 496: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 49b: astore 56
      // 49d: aload 56
      // 49f: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 4a4: ifeq 4de
      // 4a7: aload 56
      // 4a9: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 4ae: checkcast net/minecraft/world/level/levelgen/feature/BlockReplacement
      // 4b1: astore 57
      // 4b3: aload 0
      // 4b4: aload 55
      // 4b6: aload 36
      // 4b8: aload 2
      // 4b9: aload 57
      // 4bb: aload 19
      // 4bd: invokevirtual net/minecraft/world/level/levelgen/feature/OreFeature.canPlaceOre (Lnet/minecraft/world/level/block/state/BlockState;Ljava/util/function/Function;Lnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/feature/BlockReplacement;Lnet/minecraft/core/BlockPos$MutableBlockPos;)Z
      // 4c0: ifeq 4db
      // 4c3: aload 38
      // 4c5: iload 41
      // 4c7: iload 54
      // 4c9: iload 49
      // 4cb: aload 57
      // 4cd: invokevirtual net/minecraft/world/level/levelgen/feature/BlockReplacement.state ()Lnet/minecraft/world/level/block/state/BlockState;
      // 4d0: bipush 0
      // 4d1: invokevirtual net/minecraft/world/level/chunk/LevelChunkSection.setBlockState (IIILnet/minecraft/world/level/block/state/BlockState;Z)Lnet/minecraft/world/level/block/state/BlockState;
      // 4d4: pop
      // 4d5: iinc 18 1
      // 4d8: goto 4de
      // 4db: goto 49d
      // 4de: iinc 52 1
      // 4e1: goto 416
      // 4e4: iinc 44 1
      // 4e7: goto 3a1
      // 4ea: iinc 39 1
      // 4ed: goto 37a
      // 4f0: aload 35
      // 4f2: invokevirtual net/minecraft/world/level/chunk/BulkSectionAccess.close ()V
      // 4f5: goto 50e
      // 4f8: astore 36
      // 4fa: aload 35
      // 4fc: invokevirtual net/minecraft/world/level/chunk/BulkSectionAccess.close ()V
      // 4ff: goto 50b
      // 502: astore 37
      // 504: aload 36
      // 506: aload 37
      // 508: invokevirtual java/lang/Throwable.addSuppressed (Ljava/lang/Throwable;)V
      // 50b: aload 36
      // 50d: athrow
      // 50e: iload 18
      // 510: ifle 517
      // 513: bipush 1
      // 514: goto 518
      // 517: bipush 0
      // 518: ireturn
      // try (476 -> 650): 653 java/lang/Throwable
      // try (654 -> 656): 657 java/lang/Throwable
   }
}
