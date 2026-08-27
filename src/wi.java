import io.netty.buffer.ByteBuf;
import java.util.function.Function;

public class wi extends vx {
   private final jl d;

   public wi(ByteBuf $$0, jl $$1) {
      super($$0);
      this.d = $$1;
   }

   public jl G() {
      return this.d;
   }

   public static Function<ByteBuf, wi> a(jl $$0) {
      return $$1 -> new wi($$1, $$0);
   }
}
