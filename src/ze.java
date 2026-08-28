import io.netty.buffer.ByteBuf;
import java.util.HashMap;
import java.util.Map;

public record ze(Map<String, String> b) implements yw<zc> {
   private static final int c = 128;
   private static final int d = 4096;
   private static final int e = 32;
   private static final yn<ByteBuf, Map<String, String>> f = yl.a(HashMap::new, yl.b(128), yl.b(4096), 32);
   public static final yn<ByteBuf, ze> a = yn.a(f, ze::b, ze::new);

   @Override
   public yy<ze> a() {
      return zo.b;
   }

   public void a(zc $$0) {
      $$0.a(this);
   }
}
