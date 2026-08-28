import io.netty.buffer.ByteBuf;
import java.util.HashMap;
import java.util.Map;

public record zy(Map<String, String> b) implements zq<zw> {
   private static final int c = 128;
   private static final int d = 4096;
   private static final int e = 32;
   private static final zh<ByteBuf, Map<String, String>> f = zf.a(HashMap::new, zf.b(128), zf.b(4096), 32);
   public static final zh<ByteBuf, zy> a = zh.a(f, zy::b, zy::new);

   @Override
   public zs<zy> a() {
      return aai.b;
   }

   public void a(zw $$0) {
      $$0.a(this);
   }
}
