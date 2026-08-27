import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import javax.crypto.Cipher;

public class tn extends MessageToByteEncoder<ByteBuf> {
   private final tl a;

   public tn(Cipher $$0) {
      this.a = new tl($$0);
   }

   protected void a(ChannelHandlerContext $$0, ByteBuf $$1, ByteBuf $$2) throws Exception {
      this.a.a($$1, $$2);
   }
}
