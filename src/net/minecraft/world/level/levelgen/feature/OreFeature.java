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
      // 1d3: if_icmpge 35a
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
      // 1e8: goto 354
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
      // 239: i2l
      // 23a: iload 46
      // 23c: iload 27
      // 23e: invokestatic java/lang/Math.clamp (JII)I
      // 241: istore 48
      // 243: dload 44
      // 245: dload 36
      // 247: dadd
      // 248: invokestatic net/minecraft/util/Mth.floor (D)I
      // 24b: i2l
      // 24c: iload 47
      // 24e: iload 28
      // 250: invokestatic java/lang/Math.clamp (JII)I
      // 253: istore 49
      // 255: iload 31
      // 257: iload 46
      // 259: iload 15
      // 25b: isub
      // 25c: invokestatic java/lang/Math.min (II)I
      // 25f: istore 31
      // 261: iload 32
      // 263: iload 48
      // 265: iload 15
      // 267: isub
      // 268: invokestatic java/lang/Math.max (II)I
      // 26b: istore 32
      // 26d: iload 33
      // 26f: iload 47
      // 271: iload 16
      // 273: isub
      // 274: invokestatic java/lang/Math.min (II)I
      // 277: istore 33
      // 279: iload 34
      // 27b: iload 49
      // 27d: iload 16
      // 27f: isub
      // 280: invokestatic java/lang/Math.max (II)I
      // 283: istore 34
      // 285: iload 46
      // 287: istore 50
      // 289: iload 50
      // 28b: iload 48
      // 28d: if_icmpgt 354
      // 290: iload 50
      // 292: i2d
      // 293: ldc2_w 0.5
      // 296: dadd
      // 297: dload 40
      // 299: dsub
      // 29a: dstore 51
      // 29c: dload 38
      // 29e: dload 51
      // 2a0: dload 51
      // 2a2: dmul
      // 2a3: dsub
      // 2a4: dstore 53
      // 2a6: dload 53
      // 2a8: dconst_0
      // 2a9: dcmpg
      // 2aa: ifgt 2b0
      // 2ad: goto 34e
      // 2b0: iload 50
      // 2b2: iload 15
      // 2b4: isub
      // 2b5: iload 17
      // 2b7: imul
      // 2b8: iload 16
      // 2ba: isub
      // 2bb: istore 55
      // 2bd: iload 47
      // 2bf: istore 56
      // 2c1: iload 56
      // 2c3: iload 49
      // 2c5: if_icmpgt 34e
      // 2c8: iload 56
      // 2ca: i2d
      // 2cb: ldc2_w 0.5
      // 2ce: dadd
      // 2cf: dload 44
      // 2d1: dsub
      // 2d2: dstore 57
      // 2d4: dload 53
      // 2d6: dload 57
      // 2d8: dload 57
      // 2da: dmul
      // 2db: dsub
      // 2dc: dstore 59
      // 2de: dload 59
      // 2e0: dconst_0
      // 2e1: dcmpg
      // 2e2: ifgt 2e8
      // 2e5: goto 348
      // 2e8: dload 59
      // 2ea: invokestatic java/lang/Math.sqrt (D)D
      // 2ed: dstore 61
      // 2ef: dload 42
      // 2f1: ldc2_w 0.5
      // 2f4: dsub
      // 2f5: dload 61
      // 2f7: dsub
      // 2f8: invokestatic net/minecraft/util/Mth.floor (D)I
      // 2fb: bipush 1
      // 2fc: iadd
      // 2fd: iload 25
      // 2ff: invokestatic java/lang/Math.max (II)I
      // 302: istore 63
      // 304: dload 42
      // 306: ldc2_w 0.5
      // 309: dsub
      // 30a: dload 61
      // 30c: dadd
      // 30d: invokestatic net/minecraft/util/Mth.ceil (D)I
      // 310: bipush 1
      // 311: isub
      // 312: iload 26
      // 314: invokestatic java/lang/Math.min (II)I
      // 317: istore 64
      // 319: iload 63
      // 31b: iload 64
      // 31d: if_icmple 323
      // 320: goto 348
      // 323: iload 55
      // 325: iload 56
      // 327: iadd
      // 328: istore 65
      // 32a: aload 29
      // 32c: iload 65
      // 32e: aload 29
      // 330: iload 65
      // 332: iaload
      // 333: iload 63
      // 335: invokestatic java/lang/Math.min (II)I
      // 338: iastore
      // 339: aload 30
      // 33b: iload 65
      // 33d: aload 30
      // 33f: iload 65
      // 341: iaload
      // 342: iload 64
      // 344: invokestatic java/lang/Math.max (II)I
      // 347: iastore
      // 348: iinc 56 1
      // 34b: goto 2c1
      // 34e: iinc 50 1
      // 351: goto 289
      // 354: iinc 35 1
      // 357: goto 1cd
      // 35a: new net/minecraft/world/level/chunk/BulkSectionAccess
      // 35d: dup
      // 35e: aload 1
      // 35f: invokespecial net/minecraft/world/level/chunk/BulkSectionAccess.<init> (Lnet/minecraft/world/level/LevelAccessor;)V
      // 362: astore 35
      // 364: aload 35
      // 366: dup
      // 367: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
      // 36a: pop
      // 36b: invokedynamic apply (Lnet/minecraft/world/level/chunk/BulkSectionAccess;)Ljava/util/function/Function; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, net/minecraft/world/level/chunk/BulkSectionAccess.getBlockState (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;, (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState; ]
      // 370: astore 36
      // 372: aconst_null
      // 373: astore 37
      // 375: aconst_null
      // 376: astore 38
      // 378: iload 31
      // 37a: istore 39
      // 37c: iload 39
      // 37e: iload 32
      // 380: if_icmpgt 500
      // 383: iload 15
      // 385: iload 39
      // 387: iadd
      // 388: istore 40
      // 38a: iload 40
      // 38c: invokestatic net/minecraft/core/SectionPos.sectionRelative (I)I
      // 38f: istore 41
      // 391: iload 40
      // 393: invokestatic net/minecraft/core/SectionPos.blockToSectionCoord (I)I
      // 396: istore 42
      // 398: iload 39
      // 39a: iload 17
      // 39c: imul
      // 39d: istore 43
      // 39f: iload 33
      // 3a1: istore 44
      // 3a3: iload 44
      // 3a5: iload 34
      // 3a7: if_icmpgt 4fa
      // 3aa: iload 43
      // 3ac: iload 44
      // 3ae: iadd
      // 3af: istore 45
      // 3b1: aload 29
      // 3b3: iload 45
      // 3b5: iaload
      // 3b6: istore 46
      // 3b8: iload 46
      // 3ba: ldc 2147483647
      // 3bc: if_icmpne 3c2
      // 3bf: goto 4f4
      // 3c2: aload 30
      // 3c4: iload 45
      // 3c6: iaload
      // 3c7: istore 47
      // 3c9: iload 16
      // 3cb: iload 44
      // 3cd: iadd
      // 3ce: istore 48
      // 3d0: iload 48
      // 3d2: invokestatic net/minecraft/core/SectionPos.sectionRelative (I)I
      // 3d5: istore 49
      // 3d7: iload 48
      // 3d9: invokestatic net/minecraft/core/SectionPos.blockToSectionCoord (I)I
      // 3dc: istore 50
      // 3de: aload 1
      // 3df: aload 19
      // 3e1: iload 40
      // 3e3: iload 46
      // 3e5: iload 48
      // 3e7: invokevirtual net/minecraft/core/BlockPos$MutableBlockPos.set (III)Lnet/minecraft/core/BlockPos$MutableBlockPos;
      // 3ea: invokeinterface net/minecraft/world/level/WorldGenLevel.ensureCanWrite (Lnet/minecraft/core/BlockPos;)Z 2
      // 3ef: ifeq 411
      // 3f2: iload 47
      // 3f4: iload 46
      // 3f6: if_icmpeq 40d
      // 3f9: aload 1
      // 3fa: aload 19
      // 3fc: iload 40
      // 3fe: iload 47
      // 400: iload 48
      // 402: invokevirtual net/minecraft/core/BlockPos$MutableBlockPos.set (III)Lnet/minecraft/core/BlockPos$MutableBlockPos;
      // 405: invokeinterface net/minecraft/world/level/WorldGenLevel.ensureCanWrite (Lnet/minecraft/core/BlockPos;)Z 2
      // 40a: ifeq 411
      // 40d: bipush 1
      // 40e: goto 412
      // 411: bipush 0
      // 412: istore 51
      // 414: iload 46
      // 416: istore 52
      // 418: iload 52
      // 41a: iload 47
      // 41c: if_icmpgt 4f4
      // 41f: aload 19
      // 421: iload 52
      // 423: invokevirtual net/minecraft/core/BlockPos$MutableBlockPos.setY (I)Lnet/minecraft/core/BlockPos$MutableBlockPos;
      // 426: pop
      // 427: iload 51
      // 429: ifne 43a
      // 42c: aload 1
      // 42d: aload 19
      // 42f: invokeinterface net/minecraft/world/level/WorldGenLevel.ensureCanWrite (Lnet/minecraft/core/BlockPos;)Z 2
      // 434: ifne 43a
      // 437: goto 4ee
      // 43a: iload 52
      // 43c: invokestatic net/minecraft/core/SectionPos.blockToSectionCoord (I)I
      // 43f: istore 53
      // 441: aload 37
      // 443: ifnull 464
      // 446: aload 37
      // 448: invokevirtual net/minecraft/core/SectionPos.getX ()I
      // 44b: iload 42
      // 44d: if_icmpne 464
      // 450: aload 37
      // 452: invokevirtual net/minecraft/core/SectionPos.getY ()I
      // 455: iload 53
      // 457: if_icmpne 464
      // 45a: aload 37
      // 45c: invokevirtual net/minecraft/core/SectionPos.getZ ()I
      // 45f: iload 50
      // 461: if_icmpeq 478
      // 464: aload 35
      // 466: aload 19
      // 468: invokevirtual net/minecraft/world/level/chunk/BulkSectionAccess.getSection (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/chunk/LevelChunkSection;
      // 46b: astore 38
      // 46d: iload 42
      // 46f: iload 53
      // 471: iload 50
      // 473: invokestatic net/minecraft/core/SectionPos.of (III)Lnet/minecraft/core/SectionPos;
      // 476: astore 37
      // 478: aload 38
      // 47a: ifnonnull 480
      // 47d: goto 4ee
      // 480: iload 52
      // 482: invokestatic net/minecraft/core/SectionPos.sectionRelative (I)I
      // 485: istore 54
      // 487: aload 38
      // 489: iload 41
      // 48b: iload 54
      // 48d: iload 49
      // 48f: invokevirtual net/minecraft/world/level/chunk/LevelChunkSection.getBlockState (III)Lnet/minecraft/world/level/block/state/BlockState;
      // 492: astore 55
      // 494: aload 0
      // 495: getfield net/minecraft/world/level/levelgen/feature/OreFeature.targetStates Ljava/util/List;
      // 498: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 49d: astore 56
      // 49f: aload 56
      // 4a1: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 4a6: ifeq 4ee
      // 4a9: aload 56
      // 4ab: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 4b0: checkcast net/minecraft/world/level/levelgen/feature/BlockReplacement
      // 4b3: astore 57
      // 4b5: aload 57
      // 4b7: invokevirtual net/minecraft/world/level/levelgen/feature/BlockReplacement.target ()Lnet/minecraft/world/level/levelgen/structure/templatesystem/RuleTest;
      // 4ba: aload 55
      // 4bc: aload 19
      // 4be: aload 2
      // 4bf: invokeinterface net/minecraft/world/level/levelgen/structure/templatesystem/RuleTest.test (Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)Z 4
      // 4c4: ifne 4ca
      // 4c7: goto 49f
      // 4ca: aload 0
      // 4cb: aload 36
      // 4cd: aload 2
      // 4ce: aload 19
      // 4d0: invokevirtual net/minecraft/world/level/levelgen/feature/OreFeature.checkAirExposure (Ljava/util/function/Function;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos$MutableBlockPos;)Z
      // 4d3: ifeq 4ee
      // 4d6: aload 38
      // 4d8: iload 41
      // 4da: iload 54
      // 4dc: iload 49
      // 4de: aload 57
      // 4e0: invokevirtual net/minecraft/world/level/levelgen/feature/BlockReplacement.state ()Lnet/minecraft/world/level/block/state/BlockState;
      // 4e3: bipush 0
      // 4e4: invokevirtual net/minecraft/world/level/chunk/LevelChunkSection.setBlockState (IIILnet/minecraft/world/level/block/state/BlockState;Z)Lnet/minecraft/world/level/block/state/BlockState;
      // 4e7: pop
      // 4e8: iinc 18 1
      // 4eb: goto 4ee
      // 4ee: iinc 52 1
      // 4f1: goto 418
      // 4f4: iinc 44 1
      // 4f7: goto 3a3
      // 4fa: iinc 39 1
      // 4fd: goto 37c
      // 500: aload 35
      // 502: invokevirtual net/minecraft/world/level/chunk/BulkSectionAccess.close ()V
      // 505: goto 51e
      // 508: astore 36
      // 50a: aload 35
      // 50c: invokevirtual net/minecraft/world/level/chunk/BulkSectionAccess.close ()V
      // 50f: goto 51b
      // 512: astore 37
      // 514: aload 36
      // 516: aload 37
      // 518: invokevirtual java/lang/Throwable.addSuppressed (Ljava/lang/Throwable;)V
      // 51b: aload 36
      // 51d: athrow
      // 51e: iload 18
      // 520: ifle 527
      // 523: bipush 1
      // 524: goto 528
      // 527: bipush 0
      // 528: ireturn
      // try (478 -> 657): 660 java/lang/Throwable
      // try (661 -> 663): 664 java/lang/Throwable
   }
}
