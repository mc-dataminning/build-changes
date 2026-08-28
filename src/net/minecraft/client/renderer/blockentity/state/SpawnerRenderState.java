package net.minecraft.client.renderer.blockentity.state;

import net.minecraft.client.renderer.entity.state.EntityRenderState;
import org.jspecify.annotations.Nullable;

public class SpawnerRenderState extends BlockEntityRenderState {
   @Nullable
   public EntityRenderState displayEntity;
   public float spin;
   public float scale;
}
