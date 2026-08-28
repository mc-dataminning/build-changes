import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

public class wd extends ChannelInboundHandlerAdapter {
   private final vr a;

   public wd(vr $$0) {
      this.a = $$0;
   }

   public void channelRead(ChannelHandlerContext $$0, Object $$1) {
      if ($$1 instanceof ByteBuf $$2) {
         this.a.a($$2.readableBytes());
      }

      $$0.fireChannelRead($$1);
   }
}
