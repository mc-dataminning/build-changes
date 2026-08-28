import io.netty.buffer.ByteBuf;
import java.util.function.Function;

public class wl extends vw {
   private final jt d;

   public wl(ByteBuf $$0, jt $$1) {
      super($$0);
      this.d = $$1;
   }

   public jt H() {
      return this.d;
   }

   public static Function<ByteBuf, wl> a(jt $$0) {
      return $$1 -> new wl($$1, $$0);
   }
}
