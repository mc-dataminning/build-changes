import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageEncoder;
import java.util.List;

public class wh extends MessageToMessageEncoder<zo<?>> {
   private final zm a;

   public wh(zm $$0) {
      this.a = $$0;
   }

   protected void a(ChannelHandlerContext $$0, zo<?> $$1, List<Object> $$2) throws Exception {
      this.a.a($$1, $$2::add);
      if ($$1.d()) {
         $$0.pipeline().remove($$0.name());
      }
   }
}
