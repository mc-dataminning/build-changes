import io.netty.channel.ChannelHandlerContext;

public interface wh {
   static void a(ChannelHandlerContext $$0, zf<?> $$1) {
      if ($$1.d()) {
         $$0.channel().config().setAutoRead(false);
         $$0.pipeline().addBefore($$0.name(), "inbound_config", new wn.a());
         $$0.pipeline().remove($$0.name());
      }
   }

   static void b(ChannelHandlerContext $$0, zf<?> $$1) {
      if ($$1.d()) {
         $$0.pipeline().addAfter($$0.name(), "outbound_config", new wn.c());
         $$0.pipeline().remove($$0.name());
      }
   }
}
