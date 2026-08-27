import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import io.netty.handler.codec.CorruptedFrameException;
import java.util.List;

public class sp extends ByteToMessageDecoder {
   protected void decode(ChannelHandlerContext $$0, ByteBuf $$1, List<Object> $$2) {
      $$1.markReaderIndex();
      byte[] $$3 = new byte[3];

      for (int $$4 = 0; $$4 < $$3.length; $$4++) {
         if (!$$1.isReadable()) {
            $$1.resetReaderIndex();
            return;
         }

         $$3[$$4] = $$1.readByte();
         if ($$3[$$4] >= 0) {
            sf $$5 = new sf(Unpooled.wrappedBuffer($$3));

            try {
               int $$6 = $$5.m();
               if ($$1.readableBytes() >= $$6) {
                  $$2.add($$1.readBytes($$6));
                  return;
               }

               $$1.resetReaderIndex();
            } finally {
               $$5.release();
            }

            return;
         }
      }

      throw new CorruptedFrameException("length wider than 21-bit");
   }
}
