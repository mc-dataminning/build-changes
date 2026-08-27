package net.minecraft.client.renderer.blockentity.state;

import net.minecraft.client.renderer.block.MovingBlockRenderState;
import org.jspecify.annotations.Nullable;

public class PistonHeadRenderState extends BlockEntityRenderState {
   @Nullable
   public MovingBlockRenderState block;
   @Nullable
   public MovingBlockRenderState base;
   public float xOffset;
   public float yOffset;
   public float zOffset;
}
