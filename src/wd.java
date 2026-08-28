import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

public class wd extends ChannelInboundHandlerAdapter {
   public void channelRead(ChannelHandlerContext $$0, Object $$1) {
      $$0.fireChannelRead(wc.b($$1));
   }
}
