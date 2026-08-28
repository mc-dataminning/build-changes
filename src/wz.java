import io.netty.buffer.ByteBuf;
import java.util.function.Function;

public class wz extends wl {
   private final jw d;

   public wz(ByteBuf $$0, jw $$1) {
      super($$0);
      this.d = $$1;
   }

   public jw G() {
      return this.d;
   }

   public static Function<ByteBuf, wz> a(jw $$0) {
      return $$1 -> new wz($$1, $$0);
   }
}
