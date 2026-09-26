package net.minecraft.world;

import io.netty.buffer.ByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.HumanoidArm;

public enum InteractionHand {
   MAIN_HAND(0),
   OFF_HAND(1);

   public static final StreamCodec<ByteBuf, InteractionHand> STREAM_CODEC = ByteBufCodecs.enumCodec(InteractionHand.class, h -> h.id);
   private final int id;

   InteractionHand(final int id) {
      this.id = id;
   }

   public HumanoidArm asArm(final HumanoidArm mainArm) {
      return switch (this) {
         case MAIN_HAND -> mainArm;
         case OFF_HAND -> mainArm.getOpposite();
      };
   }

   public EquipmentSlot asEquipmentSlot() {
      return this == MAIN_HAND ? EquipmentSlot.MAINHAND : EquipmentSlot.OFFHAND;
   }
}
