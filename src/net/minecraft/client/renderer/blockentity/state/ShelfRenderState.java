package net.minecraft.client.renderer.blockentity.state;

import net.minecraft.client.renderer.item.ItemStackRenderState;
import net.minecraft.core.Direction;

public class ShelfRenderState extends BlockEntityRenderState {
   public final ItemStackRenderState[] items = new ItemStackRenderState[3];
   public boolean alignToBottom;
   public Direction facing = Direction.NORTH;
}
