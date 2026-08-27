import io.netty.buffer.ByteBuf;
import java.util.function.Function;

public class wp extends we {
   private final jo d;

   public wp(ByteBuf $$0, jo $$1) {
      super($$0);
      this.d = $$1;
   }

   public jo G() {
      return this.d;
   }

   public static Function<ByteBuf, wp> a(jo $$0) {
      return $$1 -> new wp($$1, $$0);
   }
}
