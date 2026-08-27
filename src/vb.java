import io.netty.buffer.ByteBuf;
import java.util.function.Function;

public class vb extends uq {
   private final iw d;

   public vb(ByteBuf $$0, iw $$1) {
      super($$0);
      this.d = $$1;
   }

   public iw L() {
      return this.d;
   }

   public static Function<ByteBuf, vb> a(iw $$0) {
      return $$1 -> new vb($$1, $$0);
   }
}
