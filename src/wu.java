import io.netty.buffer.ByteBuf;
import java.util.function.Function;

public class wu extends wg {
   private final ke d;

   public wu(ByteBuf $$0, ke $$1) {
      super($$0);
      this.d = $$1;
   }

   public ke H() {
      return this.d;
   }

   public static Function<ByteBuf, wu> a(ke $$0) {
      return $$1 -> new wu($$1, $$0);
   }
}
