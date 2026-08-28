import com.mojang.logging.LogUtils;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import java.io.IOException;
import java.util.List;
import org.slf4j.Logger;

public class wa<T extends wc> extends ByteToMessageDecoder implements wf {
   private static final Logger a = LogUtils.getLogger();
   private final we<T> b;

   public wa(we<T> $$0) {
      this.b = $$0;
   }

   protected void decode(ChannelHandlerContext $$0, ByteBuf $$1, List<Object> $$2) throws Exception {
      int $$3 = $$1.readableBytes();
      if ($$3 != 0) {
         zd<? super T> $$4 = this.b.c().decode($$1);
         zf<? extends zd<? super T>> $$5 = $$4.a();
         bqr.f.a(this.b.a(), $$5, $$0.channel().remoteAddress(), $$3);
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
               a.debug(vp.c, " IN: [{}:{}] {} -> {} bytes", new Object[]{this.b.a().a(), $$5, $$4.getClass().getName(), $$3});
            }

            wf.a($$0, $$4);
         }
      }
   }
}
