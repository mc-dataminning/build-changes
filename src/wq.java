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
      if (a.isDebugEnabled()) {
         a.debug(wj.d, "OUT: [{}:{}] {}", new Object[]{this.b.a().a(), $$3, $$1.getClass().getName()});
      }

      try {
         int $$4 = $$2.writerIndex();
         this.b.c().encode($$2, $$1);
         int $$5 = $$2.writerIndex() - $$4;
         if ($$5 > 8388608) {
            throw new IllegalArgumentException("Packet too big (is " + $$5 + ", should be less than 8388608): " + $$1);
         }

         bnj.f.b(this.b.a(), $$3, $$0.channel().remoteAddress(), $$5);
      } catch (Throwable var10) {
         a.error("Error sending packet {}", $$3, var10);
         if ($$1.c()) {
            throw new wy(var10);
         }

         throw var10;
      } finally {
         wu.b($$0, $$1);
      }
   }
}
