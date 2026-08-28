import com.mojang.logging.LogUtils;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import java.io.IOException;
import java.util.List;
import org.slf4j.Logger;

public class wi<T extends wk> extends ByteToMessageDecoder implements wn {
   private static final Logger a = LogUtils.getLogger();
   private final wm<T> b;

   public wi(wm<T> $$0) {
      this.b = $$0;
   }

   protected void decode(ChannelHandlerContext $$0, ByteBuf $$1, List<Object> $$2) throws Exception {
      int $$3 = $$1.readableBytes();
      if ($$3 != 0) {
         zo<? super T> $$4;
         try {
            $$4 = this.b.c().decode($$1);
         } catch (Exception var7) {
            if (var7 instanceof wt) {
               $$1.skipBytes($$1.readableBytes());
            }

            throw var7;
         }

         zq<? extends zo<? super T>> $$7 = $$4.a();
         bru.f.a(this.b.a(), $$7, $$0.channel().remoteAddress(), $$3);
         if ($$1.readableBytes() > 0) {
            throw new IOException(
               "Packet "
                  + this.b.a().a()
                  + "/"
                  + $$7
                  + " ("
                  + $$4.getClass().getSimpleName()
                  + ") was larger than I expected, found "
                  + $$1.readableBytes()
                  + " bytes extra whilst reading packet "
                  + $$7
            );
         } else {
            $$2.add($$4);
            if (a.isDebugEnabled()) {
               a.debug(vv.c, " IN: [{}:{}] {} -> {} bytes", new Object[]{this.b.a().a(), $$7, $$4.getClass().getName(), $$3});
            }

            wn.a($$0, $$4);
         }
      }
   }
}
