import io.netty.buffer.ByteBuf;
import java.util.function.Function;

public class vt extends vi {
   private final jb d;

   public vt(ByteBuf $$0, jb $$1) {
      super($$0);
      this.d = $$1;
   }

   public jb G() {
      return this.d;
   }

   public static Function<ByteBuf, vt> a(jb $$0) {
      return $$1 -> new vt($$1, $$0);
   }
}
