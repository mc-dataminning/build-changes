import io.netty.buffer.ByteBuf;
import java.util.function.Function;

public class wj extends vv {
   private final ka d;

   public wj(ByteBuf $$0, ka $$1) {
      super($$0);
      this.d = $$1;
   }

   public ka G() {
      return this.d;
   }

   public static Function<ByteBuf, wj> a(ka $$0) {
      return $$1 -> new wj($$1, $$0);
   }
}
