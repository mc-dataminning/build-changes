package net.minecraft.world.level.levelgen.feature;

import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Util;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EntityTypes;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.chunk.ChunkGenerator;
import org.slf4j.Logger;

public record MonsterRoomFeature() implements Feature {
   private static final Logger LOGGER = LogUtils.getLogger();
   private static final EntityType<?>[] MOBS = new EntityType[]{EntityTypes.SKELETON, EntityTypes.ZOMBIE, EntityTypes.ZOMBIE, EntityTypes.SPIDER};
   private static final BlockState AIR = Blocks.CAVE_AIR.defaultBlockState();
   public static final MapCodec<MonsterRoomFeature> CODEC = MapCodec.unit(MonsterRoomFeature::new);

   @Override
   public MapCodec<MonsterRoomFeature> codec() {
      return CODEC;
   }

   @Override
   public boolean place(final WorldGenLevel level, final ChunkGenerator chunkGenerator, final RandomSource random, final BlockPos origin) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.OutOfMemoryError: Java heap space
      //   at java.base/java.util.HashMap.resize(HashMap.java:711)
      //   at java.base/java.util.HashMap.putVal(HashMap.java:636)
      //   at java.base/java.util.HashMap.putMapEntries(HashMap.java:523)
      //   at java.base/java.util.HashMap.<init>(HashMap.java:493)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.iterateStatements(StackVarsProcessor.java:218)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:74)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:43)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:238)
      //
      // Bytecode:
      // 000: invokedynamic test ()Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, net/minecraft/world/level/levelgen/feature/MonsterRoomFeature.lambda$place$0 (Lnet/minecraft/world/level/block/state/BlockState;)Z, (Lnet/minecraft/world/level/block/state/BlockState;)Z ]
      // 005: astore 5
      // 007: bipush 3
      // 008: istore 6
      // 00a: aload 3
      // 00b: bipush 2
      // 00c: invokeinterface net/minecraft/util/RandomSource.nextInt (I)I 2
      // 011: bipush 2
      // 012: iadd
      // 013: istore 7
      // 015: iload 7
      // 017: ineg
      // 018: bipush 1
      // 019: isub
      // 01a: istore 8
      // 01c: iload 7
      // 01e: bipush 1
      // 01f: iadd
      // 020: istore 9
      // 022: bipush -1
      // 023: istore 10
      // 025: bipush 4
      // 026: istore 11
      // 028: aload 3
      // 029: bipush 2
      // 02a: invokeinterface net/minecraft/util/RandomSource.nextInt (I)I 2
      // 02f: bipush 2
      // 030: iadd
      // 031: istore 12
      // 033: iload 12
      // 035: ineg
      // 036: bipush 1
      // 037: isub
      // 038: istore 13
      // 03a: iload 12
      // 03c: bipush 1
      // 03d: iadd
      // 03e: istore 14
      // 040: bipush 0
      // 041: istore 15
      // 043: iload 8
      // 045: istore 16
      // 047: iload 16
      // 049: iload 9
      // 04b: if_icmpgt 0e5
      // 04e: bipush -1
      // 04f: istore 17
      // 051: iload 17
      // 053: bipush 4
      // 054: if_icmpgt 0df
      // 057: iload 13
      // 059: istore 18
      // 05b: iload 18
      // 05d: iload 14
      // 05f: if_icmpgt 0d9
      // 062: aload 4
      // 064: iload 16
      // 066: iload 17
      // 068: iload 18
      // 06a: invokevirtual net/minecraft/core/BlockPos.offset (III)Lnet/minecraft/core/BlockPos;
      // 06d: astore 19
      // 06f: aload 1
      // 070: aload 19
      // 072: invokeinterface net/minecraft/world/level/WorldGenLevel.getBlockState (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState; 2
      // 077: invokevirtual net/minecraft/world/level/block/state/BlockState.isSolid ()Z
      // 07a: istore 20
      // 07c: iload 17
      // 07e: bipush -1
      // 07f: if_icmpne 089
      // 082: iload 20
      // 084: ifne 089
      // 087: bipush 0
      // 088: ireturn
      // 089: iload 17
      // 08b: bipush 4
      // 08c: if_icmpne 096
      // 08f: iload 20
      // 091: ifne 096
      // 094: bipush 0
      // 095: ireturn
      // 096: iload 16
      // 098: iload 8
      // 09a: if_icmpeq 0b2
      // 09d: iload 16
      // 09f: iload 9
      // 0a1: if_icmpeq 0b2
      // 0a4: iload 18
      // 0a6: iload 13
      // 0a8: if_icmpeq 0b2
      // 0ab: iload 18
      // 0ad: iload 14
      // 0af: if_icmpne 0d3
      // 0b2: iload 17
      // 0b4: ifne 0d3
      // 0b7: aload 1
      // 0b8: aload 19
      // 0ba: invokeinterface net/minecraft/world/level/WorldGenLevel.isEmptyBlock (Lnet/minecraft/core/BlockPos;)Z 2
      // 0bf: ifeq 0d3
      // 0c2: aload 1
      // 0c3: aload 19
      // 0c5: invokevirtual net/minecraft/core/BlockPos.above ()Lnet/minecraft/core/BlockPos;
      // 0c8: invokeinterface net/minecraft/world/level/WorldGenLevel.isEmptyBlock (Lnet/minecraft/core/BlockPos;)Z 2
      // 0cd: ifeq 0d3
      // 0d0: iinc 15 1
      // 0d3: iinc 18 1
      // 0d6: goto 05b
      // 0d9: iinc 17 1
      // 0dc: goto 051
      // 0df: iinc 16 1
      // 0e2: goto 047
      // 0e5: iload 15
      // 0e7: bipush 1
      // 0e8: if_icmplt 0f1
      // 0eb: iload 15
      // 0ed: bipush 5
      // 0ee: if_icmple 0f3
      // 0f1: bipush 0
      // 0f2: ireturn
      // 0f3: iload 8
      // 0f5: istore 16
      // 0f7: iload 16
      // 0f9: iload 9
      // 0fb: if_icmpgt 1fb
      // 0fe: bipush 3
      // 0ff: istore 17
      // 101: iload 17
      // 103: bipush -1
      // 104: if_icmplt 1f5
      // 107: iload 13
      // 109: istore 18
      // 10b: iload 18
      // 10d: iload 14
      // 10f: if_icmpgt 1ef
      // 112: aload 4
      // 114: iload 16
      // 116: iload 17
      // 118: iload 18
      // 11a: invokevirtual net/minecraft/core/BlockPos.offset (III)Lnet/minecraft/core/BlockPos;
      // 11d: astore 19
      // 11f: aload 1
      // 120: aload 19
      // 122: invokeinterface net/minecraft/world/level/WorldGenLevel.getBlockState (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState; 2
      // 127: astore 20
      // 129: iload 16
      // 12b: iload 8
      // 12d: if_icmpeq 151
      // 130: iload 17
      // 132: bipush -1
      // 133: if_icmpeq 151
      // 136: iload 18
      // 138: iload 13
      // 13a: if_icmpeq 151
      // 13d: iload 16
      // 13f: iload 9
      // 141: if_icmpeq 151
      // 144: iload 17
      // 146: bipush 4
      // 147: if_icmpeq 151
      // 14a: iload 18
      // 14c: iload 14
      // 14e: if_icmpne 1c7
      // 151: aload 19
      // 153: invokevirtual net/minecraft/core/BlockPos.getY ()I
      // 156: aload 1
      // 157: invokeinterface net/minecraft/world/level/WorldGenLevel.getMinY ()I 1
      // 15c: if_icmplt 180
      // 15f: aload 1
      // 160: aload 19
      // 162: invokevirtual net/minecraft/core/BlockPos.below ()Lnet/minecraft/core/BlockPos;
      // 165: invokeinterface net/minecraft/world/level/WorldGenLevel.getBlockState (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState; 2
      // 16a: invokevirtual net/minecraft/world/level/block/state/BlockState.isSolid ()Z
      // 16d: ifne 180
      // 170: aload 1
      // 171: aload 19
      // 173: getstatic net/minecraft/world/level/levelgen/feature/MonsterRoomFeature.AIR Lnet/minecraft/world/level/block/state/BlockState;
      // 176: bipush 2
      // 177: invokeinterface net/minecraft/world/level/WorldGenLevel.setBlock (Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;I)Z 4
      // 17c: pop
      // 17d: goto 1e9
      // 180: aload 20
      // 182: invokevirtual net/minecraft/world/level/block/state/BlockState.isSolid ()Z
      // 185: ifeq 1e9
      // 188: aload 20
      // 18a: getstatic net/minecraft/world/level/block/Blocks.CHEST Lnet/minecraft/world/level/block/Block;
      // 18d: invokevirtual net/minecraft/world/level/block/state/BlockState.is (Ljava/lang/Object;)Z
      // 190: ifne 1e9
      // 193: iload 17
      // 195: bipush -1
      // 196: if_icmpne 1b5
      // 199: aload 3
      // 19a: bipush 4
      // 19b: invokeinterface net/minecraft/util/RandomSource.nextInt (I)I 2
      // 1a0: ifeq 1b5
      // 1a3: aload 0
      // 1a4: aload 1
      // 1a5: aload 19
      // 1a7: getstatic net/minecraft/world/level/block/Blocks.MOSSY_COBBLESTONE Lnet/minecraft/world/level/block/Block;
      // 1aa: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
      // 1ad: aload 5
      // 1af: invokevirtual net/minecraft/world/level/levelgen/feature/MonsterRoomFeature.safeSetBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Ljava/util/function/Predicate;)V
      // 1b2: goto 1e9
      // 1b5: aload 0
      // 1b6: aload 1
      // 1b7: aload 19
      // 1b9: getstatic net/minecraft/world/level/block/Blocks.COBBLESTONE Lnet/minecraft/world/level/block/Block;
      // 1bc: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
      // 1bf: aload 5
      // 1c1: invokevirtual net/minecraft/world/level/levelgen/feature/MonsterRoomFeature.safeSetBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Ljava/util/function/Predicate;)V
      // 1c4: goto 1e9
      // 1c7: aload 20
      // 1c9: getstatic net/minecraft/world/level/block/Blocks.CHEST Lnet/minecraft/world/level/block/Block;
      // 1cc: invokevirtual net/minecraft/world/level/block/state/BlockState.is (Ljava/lang/Object;)Z
      // 1cf: ifne 1e9
      // 1d2: aload 20
      // 1d4: getstatic net/minecraft/world/level/block/Blocks.SPAWNER Lnet/minecraft/world/level/block/Block;
      // 1d7: invokevirtual net/minecraft/world/level/block/state/BlockState.is (Ljava/lang/Object;)Z
      // 1da: ifne 1e9
      // 1dd: aload 0
      // 1de: aload 1
      // 1df: aload 19
      // 1e1: getstatic net/minecraft/world/level/levelgen/feature/MonsterRoomFeature.AIR Lnet/minecraft/world/level/block/state/BlockState;
      // 1e4: aload 5
      // 1e6: invokevirtual net/minecraft/world/level/levelgen/feature/MonsterRoomFeature.safeSetBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Ljava/util/function/Predicate;)V
      // 1e9: iinc 18 1
      // 1ec: goto 10b
      // 1ef: iinc 17 -1
      // 1f2: goto 101
      // 1f5: iinc 16 1
      // 1f8: goto 0f7
      // 1fb: bipush 0
      // 1fc: istore 16
      // 1fe: iload 16
      // 200: bipush 2
      // 201: if_icmpge 2d0
      // 204: bipush 0
      // 205: istore 17
      // 207: iload 17
      // 209: bipush 3
      // 20a: if_icmpge 2ca
      // 20d: aload 4
      // 20f: invokevirtual net/minecraft/core/BlockPos.getX ()I
      // 212: aload 3
      // 213: iload 7
      // 215: bipush 2
      // 216: imul
      // 217: bipush 1
      // 218: iadd
      // 219: invokeinterface net/minecraft/util/RandomSource.nextInt (I)I 2
      // 21e: iadd
      // 21f: iload 7
      // 221: isub
      // 222: istore 18
      // 224: aload 4
      // 226: invokevirtual net/minecraft/core/BlockPos.getY ()I
      // 229: istore 19
      // 22b: aload 4
      // 22d: invokevirtual net/minecraft/core/BlockPos.getZ ()I
      // 230: aload 3
      // 231: iload 12
      // 233: bipush 2
      // 234: imul
      // 235: bipush 1
      // 236: iadd
      // 237: invokeinterface net/minecraft/util/RandomSource.nextInt (I)I 2
      // 23c: iadd
      // 23d: iload 12
      // 23f: isub
      // 240: istore 20
      // 242: new net/minecraft/core/BlockPos
      // 245: dup
      // 246: iload 18
      // 248: iload 19
      // 24a: iload 20
      // 24c: invokespecial net/minecraft/core/BlockPos.<init> (III)V
      // 24f: astore 21
      // 251: aload 1
      // 252: aload 21
      // 254: invokeinterface net/minecraft/world/level/WorldGenLevel.isEmptyBlock (Lnet/minecraft/core/BlockPos;)Z 2
      // 259: ifne 25f
      // 25c: goto 2c4
      // 25f: bipush 0
      // 260: istore 22
      // 262: getstatic net/minecraft/core/Direction$Plane.HORIZONTAL Lnet/minecraft/core/Direction$Plane;
      // 265: invokevirtual net/minecraft/core/Direction$Plane.iterator ()Ljava/util/Iterator;
      // 268: astore 23
      // 26a: aload 23
      // 26c: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 271: ifeq 299
      // 274: aload 23
      // 276: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 27b: checkcast net/minecraft/core/Direction
      // 27e: astore 24
      // 280: aload 1
      // 281: aload 21
      // 283: aload 24
      // 285: invokevirtual net/minecraft/core/BlockPos.relative (Lnet/minecraft/core/Direction;)Lnet/minecraft/core/BlockPos;
      // 288: invokeinterface net/minecraft/world/level/WorldGenLevel.getBlockState (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState; 2
      // 28d: invokevirtual net/minecraft/world/level/block/state/BlockState.isSolid ()Z
      // 290: ifeq 296
      // 293: iinc 22 1
      // 296: goto 26a
      // 299: iload 22
      // 29b: bipush 1
      // 29c: if_icmpeq 2a2
      // 29f: goto 2c4
      // 2a2: aload 0
      // 2a3: aload 1
      // 2a4: aload 21
      // 2a6: aload 1
      // 2a7: aload 21
      // 2a9: getstatic net/minecraft/world/level/block/Blocks.CHEST Lnet/minecraft/world/level/block/Block;
      // 2ac: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
      // 2af: invokestatic net/minecraft/world/level/levelgen/structure/StructurePiece.reorient (Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/block/state/BlockState;
      // 2b2: aload 5
      // 2b4: invokevirtual net/minecraft/world/level/levelgen/feature/MonsterRoomFeature.safeSetBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Ljava/util/function/Predicate;)V
      // 2b7: aload 1
      // 2b8: aload 3
      // 2b9: aload 21
      // 2bb: getstatic net/minecraft/world/level/storage/loot/BuiltInLootTables.SIMPLE_DUNGEON Lnet/minecraft/resources/ResourceKey;
      // 2be: invokestatic net/minecraft/world/RandomizableContainer.setBlockEntityLootTable (Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;Lnet/minecraft/resources/ResourceKey;)V
      // 2c1: goto 2ca
      // 2c4: iinc 17 1
      // 2c7: goto 207
      // 2ca: iinc 16 1
      // 2cd: goto 1fe
      // 2d0: aload 0
      // 2d1: aload 1
      // 2d2: aload 4
      // 2d4: getstatic net/minecraft/world/level/block/Blocks.SPAWNER Lnet/minecraft/world/level/block/Block;
      // 2d7: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
      // 2da: aload 5
      // 2dc: invokevirtual net/minecraft/world/level/levelgen/feature/MonsterRoomFeature.safeSetBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Ljava/util/function/Predicate;)V
      // 2df: aload 1
      // 2e0: aload 4
      // 2e2: invokeinterface net/minecraft/world/level/WorldGenLevel.getBlockEntity (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/entity/BlockEntity; 2
      // 2e7: astore 16
      // 2e9: aload 16
      // 2eb: instanceof net/minecraft/world/level/block/entity/SpawnerBlockEntity
      // 2ee: ifeq 306
      // 2f1: aload 16
      // 2f3: checkcast net/minecraft/world/level/block/entity/SpawnerBlockEntity
      // 2f6: astore 17
      // 2f8: aload 17
      // 2fa: aload 0
      // 2fb: aload 3
      // 2fc: invokevirtual net/minecraft/world/level/levelgen/feature/MonsterRoomFeature.randomEntityId (Lnet/minecraft/util/RandomSource;)Lnet/minecraft/world/entity/EntityType;
      // 2ff: aload 3
      // 300: invokevirtual net/minecraft/world/level/block/entity/SpawnerBlockEntity.setEntityId (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/util/RandomSource;)V
      // 303: goto 335
      // 306: getstatic net/minecraft/world/level/levelgen/feature/MonsterRoomFeature.LOGGER Lorg/slf4j/Logger;
      // 309: ldc "Failed to fetch mob spawner entity at ({}, {}, {})"
      // 30b: bipush 3
      // 30c: anewarray 168
      // 30f: dup
      // 310: bipush 0
      // 311: aload 4
      // 313: invokevirtual net/minecraft/core/BlockPos.getX ()I
      // 316: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 319: aastore
      // 31a: dup
      // 31b: bipush 1
      // 31c: aload 4
      // 31e: invokevirtual net/minecraft/core/BlockPos.getY ()I
      // 321: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 324: aastore
      // 325: dup
      // 326: bipush 2
      // 327: aload 4
      // 329: invokevirtual net/minecraft/core/BlockPos.getZ ()I
      // 32c: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 32f: aastore
      // 330: invokeinterface org/slf4j/Logger.error (Ljava/lang/String;[Ljava/lang/Object;)V 3
      // 335: bipush 1
      // 336: ireturn
   }

   private EntityType<?> randomEntityId(final RandomSource random) {
      return Util.getRandom(MOBS, random);
   }
}
