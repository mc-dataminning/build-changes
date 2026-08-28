import io.netty.buffer.ByteBuf;
import java.util.function.Function;

public class wf extends vr {
   private final jx d;

   public wf(ByteBuf $$0, jx $$1) {
      super($$0);
      this.d = $$1;
   }

   public jx G() {
      return this.d;
   }

   public static Function<ByteBuf, wf> a(jx $$0) {
      return $$1 -> new wf($$1, $$0);
   }
}
