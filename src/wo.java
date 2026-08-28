import io.netty.buffer.ByteBuf;
import java.util.function.Function;

public class wo extends wa {
   private final kb d;

   public wo(ByteBuf $$0, kb $$1) {
      super($$0);
      this.d = $$1;
   }

   public kb H() {
      return this.d;
   }

   public static Function<ByteBuf, wo> a(kb $$0) {
      return $$1 -> new wo($$1, $$0);
   }
}
