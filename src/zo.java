import io.netty.buffer.ByteBuf;
import java.util.HashMap;
import java.util.Map;

public record zo(Map<String, String> b) implements zg<zm> {
   private static final int c = 128;
   private static final int d = 4096;
   private static final int e = 32;
   private static final yx<ByteBuf, Map<String, String>> f = yv.a(HashMap::new, yv.b(128), yv.b(4096), 32);
   public static final yx<ByteBuf, zo> a = yx.a(f, zo::b, zo::new);

   @Override
   public zi<zo> a() {
      return zy.b;
   }

   public void a(zm $$0) {
      $$0.a(this);
   }
}
