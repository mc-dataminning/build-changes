import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.EncoderException;
import io.netty.handler.codec.MessageToMessageEncoder;
import io.netty.util.AttributeKey;
import java.util.List;

public class sn extends MessageToMessageEncoder<va<?>> {
   private final AttributeKey<? extends uz.b> a;

   public sn(AttributeKey<? extends uz.b> $$0) {
      this.a = $$0;
   }

   protected void a(ChannelHandlerContext $$0, va<?> $$1, List<Object> $$2) throws Exception {
      uz.b $$3 = (uz.b)$$0.channel().attr(this.a).get();
      if ($$3 == null) {
         throw new EncoderException("Bundler not configured: " + $$1);
      } else {
         $$3.c().a($$1, $$2::add);
      }
   }
}
