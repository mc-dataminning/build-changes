import com.mojang.logging.LogUtils;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import java.io.IOException;
import java.util.List;
import org.slf4j.Logger;

public class wo<T extends wq> extends ByteToMessageDecoder implements wt {
   private static final Logger a = LogUtils.getLogger();
   private final ws<T> b;

   public wo(ws<T> $$0) {
      this.b = $$0;
   }

   protected void decode(ChannelHandlerContext $$0, ByteBuf $$1, List<Object> $$2) throws Exception {
      int $$3 = $$1.readableBytes();
      if ($$3 != 0) {
         zr<? super T> $$4 = this.b.c().decode($$1);
         zt<? extends zr<? super T>> $$5 = $$4.a();
         bpr.f.a(this.b.a(), $$5, $$0.channel().remoteAddress(), $$3);
         if ($$1.readableBytes() > 0) {
            throw new IOException(
               "Packet "
                  + this.b.a().a()
                  + "/"
                  + $$5
                  + " ("
                  + $$4.getClass().getSimpleName()
                  + ") was larger than I expected, found "
                  + $$1.readableBytes()
                  + " bytes extra whilst reading packet "
                  + $$5
            );
         } else {
            $$2.add($$4);
            if (a.isDebugEnabled()) {
               a.debug(we.c, " IN: [{}:{}] {} -> {} bytes", new Object[]{this.b.a().a(), $$5, $$4.getClass().getName(), $$3});
            }

            wt.a($$0, $$4);
         }
      }
   }
}
