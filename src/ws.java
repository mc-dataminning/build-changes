import io.netty.buffer.ByteBuf;
import java.util.function.Function;

public class ws extends we {
   private final kd d;

   public ws(ByteBuf $$0, kd $$1) {
      super($$0);
      this.d = $$1;
   }

   public kd H() {
      return this.d;
   }

   public static Function<ByteBuf, ws> a(kd $$0) {
      return $$1 -> new ws($$1, $$0);
   }
}
