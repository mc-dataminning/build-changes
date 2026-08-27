import io.netty.buffer.ByteBuf;
import java.util.function.Function;

public class vf extends uu {
   private final iz d;

   public vf(ByteBuf $$0, iz $$1) {
      super($$0);
      this.d = $$1;
   }

   public iz J() {
      return this.d;
   }

   public static Function<ByteBuf, vf> a(iz $$0) {
      return $$1 -> new vf($$1, $$0);
   }
}
