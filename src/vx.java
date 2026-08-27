import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageEncoder;
import java.util.List;

public class vx extends MessageToMessageEncoder<zb<?>> {
   private final za a;

   public vx(za $$0) {
      this.a = $$0;
   }

   protected void a(ChannelHandlerContext $$0, zb<?> $$1, List<Object> $$2) throws Exception {
      this.a.a($$1, $$2::add);
      if ($$1.d()) {
         $$0.pipeline().remove($$0.name());
      }
   }
}
