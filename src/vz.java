import io.netty.buffer.ByteBuf;
import java.util.function.Function;

public class vz extends vl {
   private final kf d;

   public vz(ByteBuf $$0, kf $$1) {
      super($$0);
      this.d = $$1;
   }

   public kf H() {
      return this.d;
   }

   public static Function<ByteBuf, vz> a(kf $$0) {
      return $$1 -> new vz($$1, $$0);
   }
}
