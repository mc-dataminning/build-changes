import com.mojang.logging.LogUtils;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import io.netty.util.Attribute;
import io.netty.util.AttributeKey;
import java.io.IOException;
import org.slf4j.Logger;

public class uk extends MessageToByteEncoder<xd<?>> {
   private static final Logger a = LogUtils.getLogger();
   private final AttributeKey<uf.a<?>> b;

   public uk(AttributeKey<uf.a<?>> $$0) {
      this.b = $$0;
   }

   protected void a(ChannelHandlerContext $$0, xd<?> $$1, ByteBuf $$2) throws Exception {
      Attribute<uf.a<?>> $$3 = $$0.channel().attr(this.b);
      uf.a<?> $$4 = (uf.a<?>)$$3.get();
      if ($$4 == null) {
         throw new RuntimeException("ConnectionProtocol unknown: " + $$1);
      } else {
         int $$5 = $$4.a($$1);
         if (a.isDebugEnabled()) {
            a.debug(ue.d, "OUT: [{}:{}] {}", new Object[]{$$4.a().a(), $$5, $$1.getClass().getName()});
         }

         if ($$5 == -1) {
            throw new IOException("Can't serialize unregistered packet");
         } else {
            ug $$6 = new ug($$2);
            $$6.c($$5);

            try {
               int $$7 = $$6.writerIndex();
               $$1.a($$6);
               int $$8 = $$6.writerIndex() - $$7;
               if ($$8 > 8388608) {
                  throw new IllegalArgumentException("Packet too big (is " + $$8 + ", should be less than 8388608): " + $$1);
               }

               bgs.e.b($$4.a(), $$5, $$0.channel().remoteAddress(), $$8);
            } catch (Throwable var13) {
               a.error("Error receiving packet {}", $$5, var13);
               if ($$1.b()) {
                  throw new ur(var13);
               }

               throw var13;
            } finally {
               uo.a($$3, $$1);
            }
         }
      }
   }
}
