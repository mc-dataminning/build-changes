package net.minecraft.world.level.levelgen.feature;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.chunk.ChunkGenerator;

public record VoidStartPlatformFeature() implements Feature {
   private static final BlockPos PLATFORM_OFFSET = new BlockPos(8, 3, 8);
   private static final ChunkPos PLATFORM_ORIGIN_CHUNK = ChunkPos.containing(PLATFORM_OFFSET);
   private static final int PLATFORM_RADIUS = 16;
   private static final int PLATFORM_RADIUS_CHUNKS = 1;
   public static final MapCodec<VoidStartPlatformFeature> CODEC = MapCodec.unit(VoidStartPlatformFeature::new);

   @Override
   public MapCodec<VoidStartPlatformFeature> codec() {
      return CODEC;
   }

   private static int checkerboardDistance(final int xa, final int za, final int xb, final int zb) {
      return Math.max(Math.abs(xa - xb), Math.abs(za - zb));
   }

   @Override
   public boolean place(final WorldGenLevel level, final ChunkGenerator chunkGenerator, final RandomSource random, final BlockPos origin) {
      ChunkPos currentChunkPos = ChunkPos.containing(origin);
      if (checkerboardDistance(currentChunkPos.x(), currentChunkPos.z(), PLATFORM_ORIGIN_CHUNK.x(), PLATFORM_ORIGIN_CHUNK.z()) > 1) {
         return true;
      } else {
         BlockPos platformOrigin = PLATFORM_OFFSET.atY(origin.getY() + PLATFORM_OFFSET.getY());
         BlockPos.MutableBlockPos blockPos = new BlockPos.MutableBlockPos();

         for (int z = currentChunkPos.getMinBlockZ(); z <= currentChunkPos.getMaxBlockZ(); z++) {
            for (int x = currentChunkPos.getMinBlockX(); x <= currentChunkPos.getMaxBlockX(); x++) {
               if (checkerboardDistance(platformOrigin.getX(), platformOrigin.getZ(), x, z) <= 16) {
                  blockPos.set(x, platformOrigin.getY(), z);
                  if (blockPos.equals(platformOrigin)) {
                     level.setBlock(blockPos, Blocks.COBBLESTONE.defaultBlockState(), 2);
                  } else {
                     level.setBlock(blockPos, Blocks.STONE.defaultBlockState(), 2);
                  }
               }
            }
         }

         return true;
      }
   }

   @Override
   public final int hashCode() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.OutOfMemoryError: Java heap space
      //   at java.base/java.util.HashMap.resize(HashMap.java:711)
      //   at java.base/java.util.HashMap.putVal(HashMap.java:636)
      //   at java.base/java.util.HashMap.put(HashMap.java:619)
      //   at org.jetbrains.java.decompiler.util.collections.PackedMap.putWithKey(PackedMap.java:41)
      //   at org.jetbrains.java.decompiler.util.collections.PackedMap.putWithKey(PackedMap.java:22)
      //   at org.jetbrains.java.decompiler.util.collections.FastSparseSetFactory.<init>(FastSparseSetFactory.java:30)
      //   at org.jetbrains.java.decompiler.modules.decompiler.sforms.SFormsConstructor.splitVariables(SFormsConstructor.java:84)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:52)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:40)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:292)
      //
      // Bytecode:
      // 0: aload 0
      // 1: invokedynamic hashCode (Lnet/minecraft/world/level/levelgen/feature/VoidStartPlatformFeature;)I bsm=java/lang/runtime/ObjectMethods.bootstrap (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object; args=[ net/minecraft/world/level/levelgen/feature/VoidStartPlatformFeature, "" ]
      // 6: ireturn
   }
}
