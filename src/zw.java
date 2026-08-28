import io.netty.buffer.ByteBuf;
import java.util.HashMap;
import java.util.Map;

public record zw(Map<String, String> b) implements zo<zu> {
   private static final int c = 128;
   private static final int d = 4096;
   private static final int e = 32;
   private static final zf<ByteBuf, Map<String, String>> f = zd.a(HashMap::new, zd.b(128), zd.b(4096), 32);
   public static final zf<ByteBuf, zw> a = zf.a(f, zw::b, zw::new);

   @Override
   public zq<zw> a() {
      return aag.b;
   }

   public void a(zu $$0) {
      $$0.a(this);
   }
}
