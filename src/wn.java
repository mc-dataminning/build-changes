import io.netty.buffer.ByteBuf;
import java.util.function.Function;

public class wn extends vy {
   private final ju d;

   public wn(ByteBuf $$0, ju $$1) {
      super($$0);
      this.d = $$1;
   }

   public ju H() {
      return this.d;
   }

   public static Function<ByteBuf, wn> a(ju $$0) {
      return $$1 -> new wn($$1, $$0);
   }
}
