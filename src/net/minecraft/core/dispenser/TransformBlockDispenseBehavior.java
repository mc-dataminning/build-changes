package net.minecraft.core.dispenser;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.Holder;
import net.minecraft.core.component.BlockTransformer;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.block.DispenserBlock;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;

public record TransformBlockDispenseBehavior(Holder<BlockTransformer> transformer) implements DispenseBehavior {
   public static final MapCodec<TransformBlockDispenseBehavior> MAP_CODEC = RecordCodecBuilder.mapCodec(
      i -> i.group(BlockTransformer.CODEC.fieldOf("transformer").forGetter(TransformBlockDispenseBehavior::transformer))
         .apply(i, TransformBlockDispenseBehavior::new)
   );

   @Override
   public DispenseBehavior.DispenseResult execute(final BlockSource source, final ItemStack dispensed) {
      Direction direction = source.state().getValue(DispenserBlock.FACING);
      BlockPos pos = source.pos().relative(direction);
      Vec3 positionAtEdgeOfBlock = Vec3.atCenterOf(source.pos()).relative(direction, 0.5000099999997474);
      BlockHitResult hitResult = new BlockHitResult(positionAtEdgeOfBlock, direction, pos, false);
      UseOnContext context = UseOnContext.nonPlayer(source.level(), dispensed, hitResult);
      return this.transformer.value().transformBlock(context) instanceof InteractionResult.Success success
         ? DispenseBehavior.DispenseResult.success(Objects.requireNonNullElse(success.heldItemTransformedTo(), dispensed))
         : DispenseBehavior.DispenseResult.failure();
   }

   @Override
   public MapCodec<TransformBlockDispenseBehavior> codec() {
      return MAP_CODEC;
   }
}
