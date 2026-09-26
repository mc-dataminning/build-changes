package net.minecraft.network.protocol.handshake;

import io.netty.buffer.ByteBuf;
import io.netty.handler.codec.DecoderException;
import net.minecraft.network.codec.EnumStreamCodec;
import net.minecraft.network.codec.StreamCodec;

public enum ClientIntent {
   STATUS,
   LOGIN,
   TRANSFER;

   public static final StreamCodec<ByteBuf, ClientIntent> STREAM_CODEC = EnumStreamCodec.custom(ClientIntent::id, ClientIntent::byId);
   private static final int STATUS_ID = 1;
   private static final int LOGIN_ID = 2;
   private static final int TRANSFER_ID = 3;

   private static ClientIntent byId(final int id) {
      return switch (id) {
         case 1 -> STATUS;
         case 2 -> LOGIN;
         case 3 -> TRANSFER;
         default -> throw new DecoderException("Unknown connection intent: " + id);
      };
   }

   private int id() {
      return switch (this) {
         case STATUS -> 1;
         case LOGIN -> 2;
         case TRANSFER -> 3;
      };
   }
}
