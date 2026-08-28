import io.netty.buffer.ByteBuf;
import java.util.HashMap;
import java.util.Map;

public record zr(Map<String, String> b) implements zj<zp> {
   private static final int c = 128;
   private static final int d = 4096;
   private static final int e = 32;
   private static final za<ByteBuf, Map<String, String>> f = yy.a(HashMap::new, yy.b(128), yy.b(4096), 32);
   public static final za<ByteBuf, zr> a = za.a(f, zr::b, zr::new);

   @Override
   public zl<zr> a() {
      return aab.b;
   }

   public void a(zp $$0) {
      $$0.a(this);
   }
}
