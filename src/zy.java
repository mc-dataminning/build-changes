import io.netty.buffer.ByteBuf;
import java.util.HashMap;
import java.util.Map;

public record zy(Map<String, String> b) implements zo<zw> {
   private static final int c = 128;
   private static final int d = 4096;
   private static final int e = 32;
   private static final ze<ByteBuf, Map<String, String>> f = zc.a(HashMap::new, zc.b(128), zc.b(4096), 32);
   public static final ze<ByteBuf, zy> a = ze.a(f, zy::b, zy::new);

   @Override
   public zq<zy> a() {
      return aai.b;
   }

   public void a(zw $$0) {
      $$0.a(this);
   }
}
