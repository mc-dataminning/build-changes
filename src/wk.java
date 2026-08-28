import io.netty.buffer.ByteBuf;
import java.util.function.Function;

public class wk extends vw {
   private final ka d;

   public wk(ByteBuf $$0, ka $$1) {
      super($$0);
      this.d = $$1;
   }

   public ka G() {
      return this.d;
   }

   public static Function<ByteBuf, wk> a(ka $$0) {
      return $$1 -> new wk($$1, $$0);
   }
}
