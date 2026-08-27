import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.EncoderException;
import io.netty.handler.codec.MessageToMessageEncoder;
import io.netty.util.AttributeKey;
import java.util.List;

public class tw extends MessageToMessageEncoder<wk<?>> {
   private final AttributeKey<? extends wj.b> a;

   public tw(AttributeKey<? extends wj.b> $$0) {
      this.a = $$0;
   }

   protected void a(ChannelHandlerContext $$0, wk<?> $$1, List<Object> $$2) throws Exception {
      wj.b $$3 = (wj.b)$$0.channel().attr(this.a).get();
      if ($$3 == null) {
         throw new EncoderException("Bundler not configured: " + $$1);
      } else {
         $$3.c().a($$1, $$2::add);
      }
   }
}
