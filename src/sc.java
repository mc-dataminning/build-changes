import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import java.util.zip.Deflater;

public class sc extends MessageToByteEncoder<ByteBuf> {
   private final byte[] a = new byte[8192];
   private final Deflater b;
   private int c;

   public sc(int $$0) {
      this.c = $$0;
      this.b = new Deflater();
   }

   protected void a(ChannelHandlerContext $$0, ByteBuf $$1, ByteBuf $$2) {
      int $$3 = $$1.readableBytes();
      sf $$4 = new sf($$2);
      if ($$3 < this.c) {
         $$4.d(0);
         $$4.writeBytes($$1);
      } else {
         byte[] $$5 = new byte[$$3];
         $$1.readBytes($$5);
         $$4.d($$5.length);
         this.b.setInput($$5, 0, $$3);
         this.b.finish();

         while (!this.b.finished()) {
            int $$6 = this.b.deflate(this.a);
            $$4.writeBytes(this.a, 0, $$6);
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
