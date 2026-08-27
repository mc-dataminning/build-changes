import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.EncoderException;
import io.netty.handler.codec.MessageToMessageEncoder;
import io.netty.util.AttributeKey;
import java.util.List;

public class ul extends MessageToMessageEncoder<xg<?>> {
   private final AttributeKey<? extends xf.b> a;

   public ul(AttributeKey<? extends xf.b> $$0) {
      this.a = $$0;
   }

   protected void a(ChannelHandlerContext $$0, xg<?> $$1, List<Object> $$2) throws Exception {
      xf.b $$3 = (xf.b)$$0.channel().attr(this.a).get();
      if ($$3 == null) {
         throw new EncoderException("Bundler not configured: " + $$1);
      } else {
         $$3.c().a($$1, $$2::add);
      }
   }
}
