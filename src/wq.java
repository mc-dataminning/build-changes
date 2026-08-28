import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelHandler.Sharable;
import io.netty.handler.codec.EncoderException;
import io.netty.handler.codec.MessageToByteEncoder;

@Sharable
public class wq extends MessageToByteEncoder<ByteBuf> {
   public static final int a = 3;

   protected void a(ChannelHandlerContext $$0, ByteBuf $$1, ByteBuf $$2) {
      int $$3 = $$1.readableBytes();
      int $$4 = wn.a($$3);
      if ($$4 > 3) {
         throw new EncoderException("Packet too large: size " + $$3 + " is over 8");
      } else {
         $$2.ensureWritable($$4 + $$3);
         wn.a($$2, $$3);
         $$2.writeBytes($$1, $$1.readerIndex(), $$3);
      }
   }
}
