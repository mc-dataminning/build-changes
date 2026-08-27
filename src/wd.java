import io.netty.buffer.ByteBuf;
import java.util.function.Function;

public class wd extends vs {
   private final jj d;

   public wd(ByteBuf $$0, jj $$1) {
      super($$0);
      this.d = $$1;
   }

   public jj G() {
      return this.d;
   }

   public static Function<ByteBuf, wd> a(jj $$0) {
      return $$1 -> new wd($$1, $$0);
   }
}
