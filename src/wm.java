import com.mojang.logging.LogUtils;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import org.slf4j.Logger;

public class wm<T extends wn> extends MessageToByteEncoder<zo<T>> {
   private static final Logger a = LogUtils.getLogger();
   private final wp<T> b;

   public wm(wp<T> $$0) {
      this.b = $$0;
   }

   protected void a(ChannelHandlerContext $$0, zo<T> $$1, ByteBuf $$2) throws Exception {
      zq<? extends zo<? super T>> $$3 = $$1.a();

      try {
         this.b.c().encode($$2, $$1);
         int $$4 = $$2.readableBytes();
         if (a.isDebugEnabled()) {
            a.debug(wb.d, "OUT: [{}:{}] {} -> {} bytes", new Object[]{this.b.a().a(), $$3, $$1.getClass().getName(), $$4});
         }

         boq.f.b(this.b.a(), $$3, $$0.channel().remoteAddress(), $$4);
      } catch (Throwable var9) {
         a.error("Error sending packet {}", $$3, var9);
         if ($$1.c()) {
            throw new wu(var9);
         }

         throw var9;
      } finally {
         wq.b($$0, $$1);
      }
   }
}
