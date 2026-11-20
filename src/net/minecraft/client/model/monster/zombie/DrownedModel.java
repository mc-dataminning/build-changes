package net.minecraft.client.model.monster.zombie;

import net.minecraft.client.model.AnimationUtils;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.renderer.entity.state.ZombieRenderState;
import net.minecraft.util.Mth;

public class DrownedModel extends ZombieModel<ZombieRenderState> {
   public DrownedModel(final ModelPart root) {
      super(root);
   }

   @Override
   protected void setupAttackAnimation(final ZombieRenderState state) {
      super.setupAttackAnimation(state);
      AnimationUtils.animateZombieArms(this.leftArm, this.rightArm, state.isAggressive, state);
   }

   protected void setupSwimAnimation(final ZombieRenderState state, final float animationPos, final float swimAmount) {
      this.rightArm.xRot = Mth.rotLerpRad(swimAmount, this.rightArm.xRot, (float) (-Math.PI * 4.0 / 5.0))
         + swimAmount * 0.35F * Mth.sin(0.1F * state.ageInTicks);
      this.leftArm.xRot = Mth.rotLerpRad(swimAmount, this.leftArm.xRot, (float) (-Math.PI * 4.0 / 5.0)) - swimAmount * 0.35F * Mth.sin(0.1F * state.ageInTicks);
      this.rightArm.zRot = Mth.rotLerpRad(swimAmount, this.rightArm.zRot, -0.15F);
      this.leftArm.zRot = Mth.rotLerpRad(swimAmount, this.leftArm.zRot, 0.15F);
      this.leftLeg.xRot = this.leftLeg.xRot - swimAmount * 0.55F * Mth.sin(0.1F * state.ageInTicks);
      this.rightLeg.xRot = this.rightLeg.xRot + swimAmount * 0.55F * Mth.sin(0.1F * state.ageInTicks);
      this.head.xRot = 0.0F;
   }
}
