import io.netty.buffer.ByteBuf;
import java.util.function.Function;

public class wj extends vu {
   private final js d;

   public wj(ByteBuf $$0, js $$1) {
      super($$0);
      this.d = $$1;
   }

   public js H() {
      return this.d;
   }

   public static Function<ByteBuf, wj> a(js $$0) {
      return $$1 -> new wj($$1, $$0);
   }
}
