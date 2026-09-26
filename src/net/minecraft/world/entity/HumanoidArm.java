package net.minecraft.world.entity;

import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import net.minecraft.network.chat.Component;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.util.StringRepresentable;

public enum HumanoidArm implements StringRepresentable {
   LEFT(0, "left", "options.mainHand.left"),
   RIGHT(1, "right", "options.mainHand.right");

   public static final Codec<HumanoidArm> CODEC = StringRepresentable.fromEnum(HumanoidArm::values);
   public static final StreamCodec<ByteBuf, HumanoidArm> STREAM_CODEC = ByteBufCodecs.enumCodec(HumanoidArm.class, a -> a.id);
   private final int id;
   private final String name;
   private final Component caption;

   HumanoidArm(final int id, final String name, final String translationKey) {
      this.id = id;
      this.name = name;
      this.caption = Component.translatable(translationKey);
   }

   public HumanoidArm getOpposite() {
      return switch (this) {
         case LEFT -> RIGHT;
         case RIGHT -> LEFT;
      };
   }

   public Component caption() {
      return this.caption;
   }

   @Override
   public String getSerializedName() {
      return this.name;
   }
}
