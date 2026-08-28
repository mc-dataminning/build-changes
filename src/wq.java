import io.netty.channel.ChannelHandlerContext;

public interface wq {
   static void a(ChannelHandlerContext $$0, zo<?> $$1) {
      if ($$1.d()) {
         $$0.channel().config().setAutoRead(false);
         $$0.pipeline().addBefore($$0.name(), "inbound_config", new ww.a());
         $$0.pipeline().remove($$0.name());
      }
   }

   static void b(ChannelHandlerContext $$0, zo<?> $$1) {
      if ($$1.d()) {
         $$0.pipeline().addAfter($$0.name(), "outbound_config", new ww.c());
         $$0.pipeline().remove($$0.name());
      }
   }
}
