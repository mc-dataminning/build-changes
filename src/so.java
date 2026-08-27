import com.mojang.logging.LogUtils;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import io.netty.util.Attribute;
import io.netty.util.AttributeKey;
import java.io.IOException;
import java.util.List;
import org.slf4j.Logger;

public class so extends ByteToMessageDecoder implements st {
   private static final Logger a = LogUtils.getLogger();
   private final AttributeKey<sk.a<?>> b;

   public so(AttributeKey<sk.a<?>> $$0) {
      this.b = $$0;
   }

   protected void decode(ChannelHandlerContext $$0, ByteBuf $$1, List<Object> $$2) throws Exception {
      int $$3 = $$1.readableBytes();
      if ($$3 != 0) {
         Attribute<sk.a<?>> $$4 = $$0.channel().attr(this.b);
         sk.a<?> $$5 = (sk.a<?>)$$4.get();
         sl $$6 = new sl($$1);
         int $$7 = $$6.m();
         va<?> $$8 = $$5.a($$7, $$6);
         if ($$8 == null) {
            throw new IOException("Bad packet id " + $$7);
         } else {
            bdq.e.a($$5.a(), $$7, $$0.channel().remoteAddress(), $$3);
            if ($$6.readableBytes() > 0) {
               throw new IOException(
                  "Packet "
                     + $$5.a().a()
                     + "/"
                     + $$7
                     + " ("
                     + $$8.getClass().getSimpleName()
                     + ") was larger than I expected, found "
                     + $$6.readableBytes()
                     + " bytes extra whilst reading packet "
                     + $$7
               );
            } else {
               $$2.add($$8);
               if (a.isDebugEnabled()) {
                  a.debug(sj.c, " IN: [{}:{}] {}", new Object[]{$$5.a().a(), $$7, $$8.getClass().getName()});
               }

               st.a($$4, $$8);
            }
         }
      }
   }
}
