import com.mojang.logging.LogUtils;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import io.netty.util.Attribute;
import io.netty.util.AttributeKey;
import java.io.IOException;
import java.util.List;
import org.slf4j.Logger;

public class uh extends ByteToMessageDecoder implements um {
   private static final Logger a = LogUtils.getLogger();
   private final AttributeKey<ud.a<?>> b;

   public uh(AttributeKey<ud.a<?>> $$0) {
      this.b = $$0;
   }

   protected void decode(ChannelHandlerContext $$0, ByteBuf $$1, List<Object> $$2) throws Exception {
      int $$3 = $$1.readableBytes();
      if ($$3 != 0) {
         Attribute<ud.a<?>> $$4 = $$0.channel().attr(this.b);
         ud.a<?> $$5 = (ud.a<?>)$$4.get();
         ue $$6 = new ue($$1);
         int $$7 = $$6.n();
         wu<?> $$8 = $$5.a($$7, $$6);
         if ($$8 == null) {
            throw new IOException("Bad packet id " + $$7);
         } else {
            bgi.e.a($$5.a(), $$7, $$0.channel().remoteAddress(), $$3);
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
                  a.debug(uc.c, " IN: [{}:{}] {}", new Object[]{$$5.a().a(), $$7, $$8.getClass().getName()});
               }

               um.a($$4, $$8);
            }
         }
      }
   }
}
