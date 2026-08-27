package net.minecraft.client.renderer.blockentity.state;

import net.minecraft.core.Direction;
import org.jspecify.annotations.Nullable;

public class BellRenderState extends BlockEntityRenderState {
   @Nullable
   public Direction shakeDirection;
   public float ticks;
}
