import io.netty.buffer.ByteBuf;
import java.util.function.Function;

public class wv extends wh {
   private final ke d;

   public wv(ByteBuf $$0, ke $$1) {
      super($$0);
      this.d = $$1;
   }

   public ke H() {
      return this.d;
   }

   public static Function<ByteBuf, wv> a(ke $$0) {
      return $$1 -> new wv($$1, $$0);
   }
}
