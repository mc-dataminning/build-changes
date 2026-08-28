import io.netty.buffer.ByteBuf;
import java.util.function.Function;

public class xg extends ws {
   private final ke d;

   public xg(ByteBuf $$0, ke $$1) {
      super($$0);
      this.d = $$1;
   }

   public ke H() {
      return this.d;
   }

   public static Function<ByteBuf, xg> a(ke $$0) {
      return $$1 -> new xg($$1, $$0);
   }
}
