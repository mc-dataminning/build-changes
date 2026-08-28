import io.netty.buffer.ByteBuf;
import java.util.HashMap;
import java.util.Map;

public record zz(Map<String, String> b) implements zr<zx> {
   private static final int c = 128;
   private static final int d = 4096;
   private static final int e = 32;
   private static final zi<ByteBuf, Map<String, String>> f = zg.a(HashMap::new, zg.b(128), zg.b(4096), 32);
   public static final zi<ByteBuf, zz> a = zi.a(f, zz::b, zz::new);

   @Override
   public zt<zz> a() {
      return aaj.b;
   }

   public void a(zx $$0) {
      $$0.a(this);
   }
}
