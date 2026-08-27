import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.DecoderException;
import io.netty.handler.codec.MessageToMessageDecoder;
import java.util.List;
import javax.annotation.Nullable;

public class sg extends MessageToMessageDecoder<uo<?>> {
   @Nullable
   private un.a a;
   @Nullable
   private un b;
   private final up c;

   public sg(up $$0) {
      this.c = $$0;
   }

   protected void a(ChannelHandlerContext $$0, uo<?> $$1, List<Object> $$2) throws Exception {
      un.b $$3 = (un.b)$$0.channel().attr(un.a).get();
      if ($$3 == null) {
         throw new DecoderException("Bundler not configured: " + $$1);
      } else {
         un $$4 = $$3.a(this.c);
         if (this.a != null) {
            if (this.b != $$4) {
               throw new DecoderException("Bundler handler changed during bundling");
            }

            uo<?> $$5 = this.a.a($$1);
            if ($$5 != null) {
               this.b = null;
               this.a = null;
               $$2.add($$5);
            }
         } else {
            un.a $$6 = $$4.a($$1);
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
