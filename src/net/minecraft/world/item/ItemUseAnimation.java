package net.minecraft.world.item;

import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.util.StringRepresentable;

public enum ItemUseAnimation implements StringRepresentable {
   NONE(0, "none"),
   EAT(1, "eat", true),
   DRINK(2, "drink", true),
   BLOCK(3, "block"),
   BOW(4, "bow"),
   TRIDENT(5, "trident"),
   CROSSBOW(6, "crossbow"),
   SPYGLASS(7, "spyglass"),
   TOOT_HORN(8, "toot_horn"),
   BRUSH(9, "brush"),
   BUNDLE(10, "bundle"),
   SPEAR(11, "spear", true);

   public static final Codec<ItemUseAnimation> CODEC = StringRepresentable.fromEnum(ItemUseAnimation::values);
   public static final StreamCodec<ByteBuf, ItemUseAnimation> STREAM_CODEC = ByteBufCodecs.enumCodec(ItemUseAnimation.class, ItemUseAnimation::getId);
   private final int id;
   private final String name;
   private final boolean customArmTransform;

   ItemUseAnimation(final int id, final String name) {
      this(id, name, false);
   }

   ItemUseAnimation(final int id, final String name, final boolean customArmTransform) {
      this.id = id;
      this.name = name;
      this.customArmTransform = customArmTransform;
   }

   public int getId() {
      return this.id;
   }

   @Override
   public String getSerializedName() {
      return this.name;
   }

   public boolean hasCustomArmTransform() {
      return this.customArmTransform;
   }
}
