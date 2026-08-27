package net.minecraft.client.renderer.blockentity.state;

import net.minecraft.world.level.block.entity.BoundingBoxRenderable;
import org.jspecify.annotations.Nullable;

public class BlockEntityWithBoundingBoxRenderState extends BlockEntityRenderState {
   public boolean isVisible;
   public BoundingBoxRenderable.Mode mode;
   public BoundingBoxRenderable.RenderableBox box;
   @Nullable
   public BlockEntityWithBoundingBoxRenderState.InvisibleBlockType[] invisibleBlocks;
   @Nullable
   public boolean[] structureVoids;

   public static enum InvisibleBlockType {
      AIR,
      BARRIER,
      LIGHT,
      STRUCTURE_VOID;
   }
}
