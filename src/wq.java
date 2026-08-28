import com.mojang.logging.LogUtils;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import org.slf4j.Logger;

public class wq<T extends wr> extends MessageToByteEncoder<zs<T>> {
   private static final Logger a = LogUtils.getLogger();
   private final wt<T> b;

   public wq(wt<T> $$0) {
      this.b = $$0;
   }

   protected void a(ChannelHandlerContext $$0, zs<T> $$1, ByteBuf $$2) throws Exception {
      zu<? extends zs<? super T>> $$3 = $$1.a();

      try {
         this.b.c().encode($$2, $$1);
         int $$4 = $$2.readableBytes();
         if (a.isDebugEnabled()) {
            a.debug(wf.d, "OUT: [{}:{}] {} -> {} bytes", new Object[]{this.b.a().a(), $$3, $$1.getClass().getName(), $$4});
         }

         boz.f.b(this.b.a(), $$3, $$0.channel().remoteAddress(), $$4);
      } catch (Throwable var9) {
         a.error("Error sending packet {}", $$3, var9);
         if ($$1.c()) {
            throw new wy(var9);
         }

         throw var9;
      } finally {
         wu.b($$0, $$1);
      }
   }
}
