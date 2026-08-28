import io.netty.buffer.ByteBuf;
import java.util.function.Function;

public class wh extends vs {
   private final js d;

   public wh(ByteBuf $$0, js $$1) {
      super($$0);
      this.d = $$1;
   }

   public js H() {
      return this.d;
   }

   public static Function<ByteBuf, wh> a(js $$0) {
      return $$1 -> new wh($$1, $$0);
   }
}
