import io.netty.buffer.ByteBuf;
import java.util.function.Function;

public class wp extends vy {
   private final ju d;

   public wp(ByteBuf $$0, ju $$1) {
      super($$0);
      this.d = $$1;
   }

   public ju H() {
      return this.d;
   }

   public static Function<ByteBuf, wp> a(ju $$0) {
      return $$1 -> new wp($$1, $$0);
   }
}
