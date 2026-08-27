import io.netty.buffer.ByteBuf;
import java.util.function.Function;

public class vr extends vg {
   private final iz d;

   public vr(ByteBuf $$0, iz $$1) {
      super($$0);
      this.d = $$1;
   }

   public iz G() {
      return this.d;
   }

   public static Function<ByteBuf, vr> a(iz $$0) {
      return $$1 -> new vr($$1, $$0);
   }
}
