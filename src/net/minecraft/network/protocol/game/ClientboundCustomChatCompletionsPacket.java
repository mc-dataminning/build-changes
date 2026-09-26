package net.minecraft.network.protocol.game;

import io.netty.buffer.ByteBuf;
import java.util.List;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.PacketType;

public record ClientboundCustomChatCompletionsPacket(ClientboundCustomChatCompletionsPacket.Action action, List<String> entries)
   implements Packet<ClientGamePacketListener> {
   public static final StreamCodec<ByteBuf, ClientboundCustomChatCompletionsPacket> STREAM_CODEC = StreamCodec.composite(
      ClientboundCustomChatCompletionsPacket.Action.STREAM_CODEC,
      ClientboundCustomChatCompletionsPacket::action,
      ByteBufCodecs.STRING_UTF8.apply(ByteBufCodecs.list()),
      ClientboundCustomChatCompletionsPacket::entries,
      ClientboundCustomChatCompletionsPacket::new
   );

   @Override
   public PacketType<ClientboundCustomChatCompletionsPacket> type() {
      return GamePacketTypes.CLIENTBOUND_CUSTOM_CHAT_COMPLETIONS;
   }

   public void handle(final ClientGamePacketListener listener) {
      listener.handleCustomChatCompletions(this);
   }

   public enum Action {
      ADD(0),
      REMOVE(1),
      SET(2);

      public static final StreamCodec<ByteBuf, ClientboundCustomChatCompletionsPacket.Action> STREAM_CODEC = ByteBufCodecs.enumCodec(
         ClientboundCustomChatCompletionsPacket.Action.class, a -> a.id
      );
      private final int id;

      Action(final int id) {
         this.id = id;
      }
   }
}
