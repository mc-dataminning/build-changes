import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageEncoder;
import java.util.List;

public class ux extends MessageToMessageEncoder<yb<?>> {
   private final ya a;

   public ux(ya $$0) {
      this.a = $$0;
   }

   protected void a(ChannelHandlerContext $$0, yb<?> $$1, List<Object> $$2) throws Exception {
      this.a.a($$1, $$2::add);
      if ($$1.d()) {
         $$0.pipeline().remove($$0.name());
      }
   }
}
