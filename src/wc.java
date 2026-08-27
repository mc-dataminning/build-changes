import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelHandler.Sharable;
import io.netty.handler.codec.EncoderException;
import io.netty.handler.codec.MessageToByteEncoder;

@Sharable
public class wc extends MessageToByteEncoder<ByteBuf> {
   public static final int a = 3;

   protected void a(ChannelHandlerContext $$0, ByteBuf $$1, ByteBuf $$2) {
      int $$3 = $$1.readableBytes();
      int $$4 = vz.a($$3);
      if ($$4 > 3) {
         throw new EncoderException("unable to fit " + $$3 + " into 3");
      } else {
         $$2.ensureWritable($$4 + $$3);
         vz.a($$2, $$3);
         $$2.writeBytes($$1, $$1.readerIndex(), $$3);
      }
   }
}
