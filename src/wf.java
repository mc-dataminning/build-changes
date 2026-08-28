import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

public class wf extends ChannelInboundHandlerAdapter {
   private final vo a;

   public wf(vo $$0) {
      this.a = $$0;
   }

   public void channelRead(ChannelHandlerContext $$0, Object $$1) {
      $$1 = wc.b($$1);
      if ($$1 instanceof ByteBuf $$2) {
         this.a.a($$2.readableBytes());
      }

      $$0.fireChannelRead($$1);
   }
}
