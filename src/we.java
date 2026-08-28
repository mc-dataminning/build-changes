import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelOutboundHandlerAdapter;
import io.netty.channel.ChannelPromise;

public class we extends ChannelOutboundHandlerAdapter {
   public void write(ChannelHandlerContext $$0, Object $$1, ChannelPromise $$2) {
      $$0.write(wc.a($$1), $$2);
   }
}
