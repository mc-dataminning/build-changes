import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.EncoderException;
import io.netty.handler.codec.MessageToMessageEncoder;
import io.netty.util.AttributeKey;
import java.util.List;

public class ss extends MessageToMessageEncoder<vf<?>> {
   private final AttributeKey<? extends ve.b> a;

   public ss(AttributeKey<? extends ve.b> $$0) {
      this.a = $$0;
   }

   protected void a(ChannelHandlerContext $$0, vf<?> $$1, List<Object> $$2) throws Exception {
      ve.b $$3 = (ve.b)$$0.channel().attr(this.a).get();
      if ($$3 == null) {
         throw new EncoderException("Bundler not configured: " + $$1);
      } else {
         $$3.c().a($$1, $$2::add);
      }
   }
}
