package net.minecraft.world.level.levelgen.feature.stateproviders;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.codec.RegistryCodecs;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import org.jspecify.annotations.Nullable;

public record RandomBlockProvider(HolderSet<Block> blocks) implements BlockStateProvider {
   public static final MapCodec<RandomBlockProvider> CODEC = RecordCodecBuilder.mapCodec(
      i -> i.group(RegistryCodecs.holderSet(Registries.BLOCK).fieldOf("blocks").forGetter(RandomBlockProvider::blocks)).apply(i, RandomBlockProvider::new)
   );

   public RandomBlockProvider(HolderSet<Block> blocks) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 0: aload 0
      // 1: invokespecial java/lang/Record.<init> ()V
      // 4: aload 0
      // 5: aload 1
      // 6: putfield net/minecraft/world/level/levelgen/feature/stateproviders/RandomBlockProvider.blocks Lnet/minecraft/core/HolderSet;
      // 9: return
   }

   @Override
   public MapCodec<RandomBlockProvider> codec() {
      return CODEC;
   }

   @Override
   public BlockState getState(final LevelAccessor level, final RandomSource random, final BlockPos pos) {
      return this.getState(random).orElseGet(() -> level.getBlockState(pos));
   }

   @Nullable
   @Override
   public BlockState getOptionalState(final LevelAccessor level, final RandomSource random, final BlockPos pos) {
      return this.getState(random).orElse(null);
   }

   private Optional<BlockState> getState(final RandomSource random) {
      return this.blocks.getRandomElement(random).map(Holder::value).map(Block::defaultBlockState);
   }
}
