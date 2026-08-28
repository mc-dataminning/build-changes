import io.netty.buffer.ByteBuf;
import java.util.function.Function;

public class xa extends wm {
   private final jw d;

   public xa(ByteBuf $$0, jw $$1) {
      super($$0);
      this.d = $$1;
   }

   public jw G() {
      return this.d;
   }

   public static Function<ByteBuf, xa> a(jw $$0) {
      return $$1 -> new xa($$1, $$0);
   }
}
