import com.google.common.base.Splitter;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import java.util.List;

public class fwy extends SimpleChannelInboundHandler<ByteBuf> {
   private static final Splitter a = Splitter.on('\u0000').limit(6);
   private final fyi b;
   private final fwy.a c;

   public fwy(fyi $$0, fwy.a $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public void channelActive(ChannelHandlerContext $$0) throws Exception {
      super.channelActive($$0);
      ByteBuf $$1 = $$0.alloc().buffer();

      try {
         $$1.writeByte(254);
         $$1.writeByte(1);
         $$1.writeByte(250);
         arg.a($$1, "MC|PingHost");
         int $$2 = $$1.writerIndex();
         $$1.writeShort(0);
         int $$3 = $$1.writerIndex();
         $$1.writeByte(127);
         arg.a($$1, this.b.a());
         $$1.writeInt(this.b.b());
         int $$4 = $$1.writerIndex() - $$3;
         $$1.setShort($$2, $$4);
         $$0.channel().writeAndFlush($$1).addListener(ChannelFutureListener.CLOSE_ON_FAILURE);
      } catch (Exception var6) {
         $$1.release();
         throw var6;
      }
   }

   protected void a(ChannelHandlerContext $$0, ByteBuf $$1) {
      short $$2 = $$1.readUnsignedByte();
      if ($$2 == 255) {
         String $$3 = arg.a($$1);
         List<String> $$4 = a.splitToList($$3);
         if ("§1".equals($$4.get(0))) {
            int $$5 = ayf.a($$4.get(1), 0);
            String $$6 = $$4.get(2);
            String $$7 = $$4.get(3);
            int $$8 = ayf.a($$4.get(4), -1);
            int $$9 = ayf.a($$4.get(5), -1);
            this.c.handleResponse($$5, $$6, $$7, $$8, $$9);
         }
      }

      $$0.close();
   }

   public void exceptionCaught(ChannelHandlerContext $$0, Throwable $$1) {
      $$0.close();
   }

   @FunctionalInterface
   public interface a {
      void handleResponse(int var1, String var2, String var3, int var4, int var5);
   }
}
