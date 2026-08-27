import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.EncoderException;
import io.netty.handler.codec.MessageToMessageEncoder;
import io.netty.util.AttributeKey;
import java.util.List;

public class ug extends MessageToMessageEncoder<wu<?>> {
   private final AttributeKey<? extends wt.b> a;

   public ug(AttributeKey<? extends wt.b> $$0) {
      this.a = $$0;
   }

   protected void a(ChannelHandlerContext $$0, wu<?> $$1, List<Object> $$2) throws Exception {
      wt.b $$3 = (wt.b)$$0.channel().attr(this.a).get();
      if ($$3 == null) {
         throw new EncoderException("Bundler not configured: " + $$1);
      } else {
         $$3.c().a($$1, $$2::add);
      }
   }
}
