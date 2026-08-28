import io.netty.buffer.ByteBuf;
import java.util.function.Function;

public class wj extends vu {
   private final jt d;

   public wj(ByteBuf $$0, jt $$1) {
      super($$0);
      this.d = $$1;
   }

   public jt H() {
      return this.d;
   }

   public static Function<ByteBuf, wj> a(jt $$0) {
      return $$1 -> new wj($$1, $$0);
   }
}
