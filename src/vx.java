import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

public class vx extends ChannelInboundHandlerAdapter {
   public void channelRead(ChannelHandlerContext $$0, Object $$1) {
      $$0.fireChannelRead(vw.b($$1));
   }
}
