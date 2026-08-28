import io.netty.buffer.ByteBuf;
import java.util.function.Function;

public class wt extends wf {
   private final ke d;

   public wt(ByteBuf $$0, ke $$1) {
      super($$0);
      this.d = $$1;
   }

   public ke H() {
      return this.d;
   }

   public static Function<ByteBuf, wt> a(ke $$0) {
      return $$1 -> new wt($$1, $$0);
   }
}
