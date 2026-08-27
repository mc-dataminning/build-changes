import io.netty.buffer.ByteBuf;
import java.util.function.Function;

public class wf extends vu {
   private final jk d;

   public wf(ByteBuf $$0, jk $$1) {
      super($$0);
      this.d = $$1;
   }

   public jk G() {
      return this.d;
   }

   public static Function<ByteBuf, wf> a(jk $$0) {
      return $$1 -> new wf($$1, $$0);
   }
}
