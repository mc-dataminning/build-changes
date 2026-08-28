import io.netty.buffer.ByteBuf;
import java.util.function.Function;

public class wp extends wb {
   private final kc d;

   public wp(ByteBuf $$0, kc $$1) {
      super($$0);
      this.d = $$1;
   }

   public kc H() {
      return this.d;
   }

   public static Function<ByteBuf, wp> a(kc $$0) {
      return $$1 -> new wp($$1, $$0);
   }
}
