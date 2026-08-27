import io.netty.buffer.ByteBuf;
import java.util.function.Function;

public class vd extends us {
   private final iy d;

   public vd(ByteBuf $$0, iy $$1) {
      super($$0);
      this.d = $$1;
   }

   public iy J() {
      return this.d;
   }

   public static Function<ByteBuf, vd> a(iy $$0) {
      return $$1 -> new vd($$1, $$0);
   }
}
