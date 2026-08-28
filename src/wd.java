import com.mojang.logging.LogUtils;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import org.slf4j.Logger;

public class wd<T extends we> extends MessageToByteEncoder<zf<T>> {
   private static final Logger a = LogUtils.getLogger();
   private final wg<T> b;

   public wd(wg<T> $$0) {
      this.b = $$0;
   }

   protected void a(ChannelHandlerContext $$0, zf<T> $$1, ByteBuf $$2) throws Exception {
      zh<? extends zf<? super T>> $$3 = $$1.a();

      try {
         this.b.c().encode($$2, $$1);
         int $$4 = $$2.readableBytes();
         if (a.isDebugEnabled()) {
            a.debug(vs.d, "OUT: [{}:{}] {} -> {} bytes", new Object[]{this.b.a().a(), $$3, $$1.getClass().getName(), $$4});
         }

         bnk.f.b(this.b.a(), $$3, $$0.channel().remoteAddress(), $$4);
      } catch (Throwable var9) {
         a.error("Error sending packet {}", $$3, var9);
         if ($$1.c()) {
            throw new wl(var9);
         }

         throw var9;
      } finally {
         wh.b($$0, $$1);
      }
   }
}
