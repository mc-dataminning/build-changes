import io.netty.buffer.ByteBuf;
import java.util.HashMap;
import java.util.Map;

public record zt(Map<String, String> b) implements zl<zr> {
   private static final int c = 128;
   private static final int d = 4096;
   private static final int e = 32;
   private static final zc<ByteBuf, Map<String, String>> f = za.a(HashMap::new, za.b(128), za.b(4096), 32);
   public static final zc<ByteBuf, zt> a = zc.a(f, zt::b, zt::new);

   @Override
   public zn<zt> a() {
      return aad.b;
   }

   public void a(zr $$0) {
      $$0.a(this);
   }
}
