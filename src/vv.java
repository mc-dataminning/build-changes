import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelOutboundHandlerAdapter;
import io.netty.channel.ChannelPromise;

public class vv extends ChannelOutboundHandlerAdapter {
   public void write(ChannelHandlerContext $$0, Object $$1, ChannelPromise $$2) {
      $$0.write(vt.a($$1), $$2);
   }
}
