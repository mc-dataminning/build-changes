import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.DecoderException;
import io.netty.handler.codec.MessageToMessageDecoder;
import java.util.List;
import javax.annotation.Nullable;

public class vu extends MessageToMessageDecoder<yz<?>> {
   private final yy a;
   @Nullable
   private yy.a b;

   public vu(yy $$0) {
      this.a = $$0;
   }

   protected void a(ChannelHandlerContext $$0, yz<?> $$1, List<Object> $$2) throws Exception {
      if (this.b != null) {
         a($$1);
         yz<?> $$3 = this.b.a($$1);
         if ($$3 != null) {
            this.b = null;
            $$2.add($$3);
         }
      } else {
         yy.a $$4 = this.a.a($$1);
         if ($$4 != null) {
            a($$1);
            this.b = $$4;
         } else {
            $$2.add($$1);
            if ($$1.d()) {
               $$0.pipeline().remove($$0.name());
            }
         }
      }
   }

   private static void a(yz<?> $$0) {
      if ($$0.d()) {
         throw new DecoderException("Terminal message received in bundle");
      }
   }
}
