import io.netty.buffer.ByteBuf;
import java.util.HashMap;
import java.util.Map;

public record zn(Map<String, String> b) implements zf<zl> {
   private static final int c = 128;
   private static final int d = 4096;
   private static final int e = 32;
   private static final yw<ByteBuf, Map<String, String>> f = yu.a(HashMap::new, yu.b(128), yu.b(4096), 32);
   public static final yw<ByteBuf, zn> a = yw.a(f, zn::b, zn::new);

   @Override
   public zh<zn> a() {
      return zx.b;
   }

   public void a(zl $$0) {
      $$0.a(this);
   }
}
