import io.netty.buffer.ByteBuf;
import java.util.function.Function;

public class wg extends vr {
   private final kg d;

   public wg(ByteBuf $$0, kg $$1) {
      super($$0);
      this.d = $$1;
   }

   public kg H() {
      return this.d;
   }

   public static Function<ByteBuf, wg> a(kg $$0) {
      return $$1 -> new wg($$1, $$0);
   }
}
