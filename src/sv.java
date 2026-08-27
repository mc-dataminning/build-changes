import com.mojang.logging.LogUtils;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageCodec;
import io.netty.util.Attribute;
import io.netty.util.AttributeKey;
import io.netty.util.ReferenceCountUtil;
import java.util.List;
import org.slf4j.Logger;

public class sv extends MessageToMessageCodec<vf<?>, vf<?>> {
   private static final Logger a = LogUtils.getLogger();
   private final AttributeKey<sp.a<?>> b;
   private final AttributeKey<sp.a<?>> c;

   public sv(AttributeKey<sp.a<?>> $$0, AttributeKey<sp.a<?>> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private static void a(ChannelHandlerContext $$0, vf<?> $$1, List<Object> $$2, AttributeKey<sp.a<?>> $$3) {
      Attribute<sp.a<?>> $$4 = $$0.channel().attr($$3);
      sp.a<?> $$5 = (sp.a<?>)$$4.get();
      if (!$$5.b($$1)) {
         a.error("Unrecognized packet in pipeline {}:{} - {}", new Object[]{$$5.a().a(), $$5.b(), $$1});
      }

      ReferenceCountUtil.retain($$1);
      $$2.add($$1);
      sy.a($$4, $$1);
   }

   protected void a(ChannelHandlerContext $$0, vf<?> $$1, List<Object> $$2) throws Exception {
      a($$0, $$1, $$2, this.b);
   }

   protected void b(ChannelHandlerContext $$0, vf<?> $$1, List<Object> $$2) throws Exception {
      a($$0, $$1, $$2, this.c);
   }
}
