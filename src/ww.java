import io.netty.buffer.ByteBuf;
import java.util.function.Function;

public class ww extends wl {
   private final jw d;

   public ww(ByteBuf $$0, jw $$1) {
      super($$0);
      this.d = $$1;
   }

   public jw G() {
      return this.d;
   }

   public static Function<ByteBuf, ww> a(jw $$0) {
      return $$1 -> new ww($$1, $$0);
   }
}
