package net.minecraft.client.renderer.entity.state;

import net.minecraft.client.renderer.block.BlockModelRenderState;
import net.minecraft.world.phys.Vec3;
import org.jspecify.annotations.Nullable;

public class MinecartRenderState extends EntityRenderState {
   public float xRot;
   public float yRot;
   public long offsetSeed;
   public int hurtDir;
   public float hurtTime;
   public float damageTime;
   public int displayOffset;
   public BlockModelRenderState displayBlockModel = new BlockModelRenderState();
   public boolean isNewRender;
   @Nullable
   public Vec3 renderPos;
   @Nullable
   public Vec3 posOnRail;
   @Nullable
   public Vec3 frontPos;
   @Nullable
   public Vec3 backPos;
}
