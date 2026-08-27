import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import javax.crypto.Cipher;

public class tz extends MessageToByteEncoder<ByteBuf> {
   private final tx a;

   public tz(Cipher $$0) {
      this.a = new tx($$0);
   }

   protected void a(ChannelHandlerContext $$0, ByteBuf $$1, ByteBuf $$2) throws Exception {
      this.a.a($$1, $$2);
   }
}
