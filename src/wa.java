import io.netty.buffer.ByteBuf;
import java.util.function.Function;

public class wa extends vl {
   private final kf d;

   public wa(ByteBuf $$0, kf $$1) {
      super($$0);
      this.d = $$1;
   }

   public kf H() {
      return this.d;
   }

   public static Function<ByteBuf, wa> a(kf $$0) {
      return $$1 -> new wa($$1, $$0);
   }
}
