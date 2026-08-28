import io.netty.buffer.ByteBuf;
import java.util.HashMap;
import java.util.Map;

public record zx(Map<String, String> b) implements zp<zv> {
   private static final int c = 128;
   private static final int d = 4096;
   private static final int e = 32;
   private static final zg<ByteBuf, Map<String, String>> f = ze.a(HashMap::new, ze.b(128), ze.b(4096), 32);
   public static final zg<ByteBuf, zx> a = zg.a(f, zx::b, zx::new);

   @Override
   public zr<zx> a() {
      return aah.b;
   }

   public void a(zv $$0) {
      $$0.a(this);
   }
}
