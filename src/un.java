import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import java.util.zip.Deflater;

public class un extends MessageToByteEncoder<ByteBuf> {
   private final byte[] a = new byte[8192];
   private final Deflater b;
   private int c;

   public un(int $$0) {
      this.c = $$0;
      this.b = new Deflater();
   }

   protected void a(ChannelHandlerContext $$0, ByteBuf $$1, ByteBuf $$2) {
      int $$3 = $$1.readableBytes();
      if ($$3 < this.c) {
         vh.a($$2, 0);
         $$2.writeBytes($$1);
      } else {
         byte[] $$4 = new byte[$$3];
         $$1.readBytes($$4);
         vh.a($$2, $$4.length);
         this.b.setInput($$4, 0, $$3);
         this.b.finish();

         while (!this.b.finished()) {
            int $$5 = this.b.deflate(this.a);
            $$2.writeBytes(this.a, 0, $$5);
         }

         this.b.reset();
      }
   }

   public int a() {
      return this.c;
   }

   public void a(int $$0) {
      this.c = $$0;
   }
}
