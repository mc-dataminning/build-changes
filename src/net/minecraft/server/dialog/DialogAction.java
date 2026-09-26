package net.minecraft.server.dialog;

import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.util.StringRepresentable;

public enum DialogAction implements StringRepresentable {
   CLOSE(0, "close"),
   NONE(1, "none"),
   WAIT_FOR_RESPONSE(2, "wait_for_response");

   public static final Codec<DialogAction> CODEC = StringRepresentable.fromEnum(DialogAction::values);
   public static final StreamCodec<ByteBuf, DialogAction> STREAM_CODEC = ByteBufCodecs.enumCodec(DialogAction.class, s -> s.id);
   private final int id;
   private final String name;

   DialogAction(final int id, final String name) {
      this.id = id;
      this.name = name;
   }

   @Override
   public String getSerializedName() {
      return this.name;
   }

   public boolean willUnpause() {
      return this == CLOSE || this == WAIT_FOR_RESPONSE;
   }
}
