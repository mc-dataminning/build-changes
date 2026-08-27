import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.DecoderException;
import io.netty.handler.codec.MessageToMessageDecoder;
import io.netty.util.AttributeKey;
import java.util.List;
import javax.annotation.Nullable;

public class uh extends MessageToMessageDecoder<xd<?>> {
   @Nullable
   private xc.a a;
   @Nullable
   private xc b;
   private final AttributeKey<? extends xc.b> c;

   public uh(AttributeKey<? extends xc.b> $$0) {
      this.c = $$0;
   }

   protected void a(ChannelHandlerContext $$0, xd<?> $$1, List<Object> $$2) throws Exception {
      xc.b $$3 = (xc.b)$$0.channel().attr(this.c).get();
      if ($$3 == null) {
         throw new DecoderException("Bundler not configured: " + $$1);
      } else {
         xc $$4 = $$3.c();
         if (this.a != null) {
            if (this.b != $$4) {
               throw new DecoderException("Bundler handler changed during bundling");
            }

            xd<?> $$5 = this.a.a($$1);
            if ($$5 != null) {
               this.b = null;
               this.a = null;
               $$2.add($$5);
            }
         } else {
            xc.a $$6 = $$4.a($$1);
            if ($$6 != null) {
               this.a = $$6;
               this.b = $$4;
            } else {
               $$2.add($$1);
            }
         }
      }
   }
}
