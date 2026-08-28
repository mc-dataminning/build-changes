import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.DecoderException;
import io.netty.handler.codec.MessageToMessageDecoder;
import java.util.List;
import javax.annotation.Nullable;

public class wa extends MessageToMessageDecoder<zf<?>> {
   private final ze a;
   @Nullable
   private ze.a b;

   public wa(ze $$0) {
      this.a = $$0;
   }

   protected void a(ChannelHandlerContext $$0, zf<?> $$1, List<Object> $$2) throws Exception {
      if (this.b != null) {
         a($$1);
         zf<?> $$3 = this.b.a($$1);
         if ($$3 != null) {
            this.b = null;
            $$2.add($$3);
         }
      } else {
         ze.a $$4 = this.a.a($$1);
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

   private static void a(zf<?> $$0) {
      if ($$0.d()) {
         throw new DecoderException("Terminal message received in bundle");
      }
   }
}
