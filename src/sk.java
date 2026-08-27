import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import io.netty.handler.codec.DecoderException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

public class sk extends ByteToMessageDecoder {
   public static final int a = 2097152;
   public static final int b = 8388608;
   private final Inflater c;
   private int d;
   private boolean e;

   public sk(int $$0, boolean $$1) {
      this.d = $$0;
      this.e = $$1;
      this.c = new Inflater();
   }

   protected void decode(ChannelHandlerContext $$0, ByteBuf $$1, List<Object> $$2) throws Exception {
      if ($$1.readableBytes() != 0) {
         int $$3 = tc.a($$1);
         if ($$3 == 0) {
            $$2.add($$1.readBytes($$1.readableBytes()));
         } else {
            if (this.e) {
               if ($$3 < this.d) {
                  throw new DecoderException("Badly compressed packet - size of " + $$3 + " is below server threshold of " + this.d);
               }

               if ($$3 > 8388608) {
                  throw new DecoderException("Badly compressed packet - size of " + $$3 + " is larger than protocol maximum of 8388608");
               }
            }

            this.a($$1);
            ByteBuf $$4 = this.a($$0, $$3);
            this.c.reset();
            $$2.add($$4);
         }
      }
   }

   private void a(ByteBuf $$0) {
      ByteBuffer $$1;
      if ($$0.nioBufferCount() > 0) {
         $$1 = $$0.nioBuffer();
         $$0.skipBytes($$0.readableBytes());
      } else {
         $$1 = ByteBuffer.allocateDirect($$0.readableBytes());
         $$0.readBytes($$1);
         $$1.flip();
      }

      this.c.setInput($$1);
   }

   private ByteBuf a(ChannelHandlerContext $$0, int $$1) throws DataFormatException {
      ByteBuf $$2 = $$0.alloc().directBuffer($$1);

      try {
         ByteBuffer $$3 = $$2.internalNioBuffer(0, $$1);
         int $$4 = $$3.position();
         this.c.inflate($$3);
         int $$5 = $$3.position() - $$4;
         if ($$5 != $$1) {
            throw new DecoderException("Badly compressed packet - actual length of uncompressed payload " + $$5 + " is does not match declared size " + $$1);
         } else {
            $$2.writerIndex($$2.writerIndex() + $$5);
            return $$2;
         }
      } catch (Exception var7) {
         $$2.release();
         throw var7;
      }
   }

   public void a(int $$0, boolean $$1) {
      this.d = $$0;
      this.e = $$1;
   }
}
