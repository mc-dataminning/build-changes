package net.minecraft.client.renderer.entity.state;

import net.minecraft.world.phys.Vec3;
import org.jspecify.annotations.Nullable;

public class GuardianRenderState extends LivingEntityRenderState {
   public float spikesAnimation;
   public float tailAnimation;
   public Vec3 eyePosition = Vec3.ZERO;
   @Nullable
   public Vec3 lookDirection;
   @Nullable
   public Vec3 lookAtPosition;
   @Nullable
   public Vec3 attackTargetPosition;
   public float attackTime;
   public float attackScale;
}
