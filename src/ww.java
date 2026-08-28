import io.netty.buffer.ByteBuf;
import java.util.function.Function;

public class ww extends wi {
   private final ke d;

   public ww(ByteBuf $$0, ke $$1) {
      super($$0);
      this.d = $$1;
   }

   public ke H() {
      return this.d;
   }

   public static Function<ByteBuf, ww> a(ke $$0) {
      return $$1 -> new ww($$1, $$0);
   }
}
