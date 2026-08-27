import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import io.netty.handler.codec.CorruptedFrameException;
import java.util.List;
import javax.annotation.Nullable;

public class uo extends ByteToMessageDecoder {
   private static final int a = 3;
   private final ByteBuf b = Unpooled.directBuffer(3);
   @Nullable
   private final to c;

   public uo(@Nullable to $$0) {
      this.c = $$0;
   }

   protected void handlerRemoved0(ChannelHandlerContext $$0) {
      this.b.release();
   }

   private static boolean a(ByteBuf $$0, ByteBuf $$1) {
      for (int $$2 = 0; $$2 < 3; $$2++) {
         if (!$$0.isReadable()) {
            return false;
         }

         byte $$3 = $$0.readByte();
         $$1.writeByte($$3);
         if (!um.a($$3)) {
            return true;
         }
      }

      throw new CorruptedFrameException("length wider than 21-bit");
   }

   protected void decode(ChannelHandlerContext $$0, ByteBuf $$1, List<Object> $$2) {
      $$1.markReaderIndex();
      this.b.clear();
      if (!a($$1, this.b)) {
         $$1.resetReaderIndex();
      } else {
         int $$3 = um.a(this.b);
         if ($$1.readableBytes() < $$3) {
            $$1.resetReaderIndex();
         } else {
            if (this.c != null) {
               this.c.a($$3 + um.a($$3));
            }

            $$2.add($$1.readBytes($$3));
         }
      }
   }
}
