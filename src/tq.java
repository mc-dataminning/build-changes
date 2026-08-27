import com.mojang.logging.LogUtils;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageCodec;
import io.netty.util.Attribute;
import io.netty.util.AttributeKey;
import io.netty.util.ReferenceCountUtil;
import java.util.List;
import org.slf4j.Logger;

public class tq extends MessageToMessageCodec<wb<?>, wb<?>> {
   private static final Logger a = LogUtils.getLogger();
   private final AttributeKey<tk.a<?>> b;
   private final AttributeKey<tk.a<?>> c;

   public tq(AttributeKey<tk.a<?>> $$0, AttributeKey<tk.a<?>> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private static void a(ChannelHandlerContext $$0, wb<?> $$1, List<Object> $$2, AttributeKey<tk.a<?>> $$3) {
      Attribute<tk.a<?>> $$4 = $$0.channel().attr($$3);
      tk.a<?> $$5 = (tk.a<?>)$$4.get();
      if (!$$5.b($$1)) {
         a.error("Unrecognized packet in pipeline {}:{} - {}", new Object[]{$$5.a().a(), $$5.b(), $$1});
      }

      ReferenceCountUtil.retain($$1);
      $$2.add($$1);
      tt.a($$4, $$1);
   }

   protected void a(ChannelHandlerContext $$0, wb<?> $$1, List<Object> $$2) throws Exception {
      a($$0, $$1, $$2, this.b);
   }

   protected void b(ChannelHandlerContext $$0, wb<?> $$1, List<Object> $$2) throws Exception {
      a($$0, $$1, $$2, this.c);
   }
}
