import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageDecoder;
import java.util.List;
import javax.crypto.Cipher;

public class vj extends MessageToMessageDecoder<ByteBuf> {
   private final vi a;

   public vj(Cipher $$0) {
      this.a = new vi($$0);
   }

   protected void a(ChannelHandlerContext $$0, ByteBuf $$1, List<Object> $$2) throws Exception {
      $$2.add(this.a.a($$0, $$1));
   }
}
