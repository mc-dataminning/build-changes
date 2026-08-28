import io.netty.buffer.ByteBuf;
import java.util.HashMap;
import java.util.Map;

public record zd(Map<String, String> b) implements yv<zb> {
   private static final int c = 128;
   private static final int d = 4096;
   private static final int e = 32;
   private static final ym<ByteBuf, Map<String, String>> f = yk.a(HashMap::new, yk.b(128), yk.b(4096), 32);
   public static final ym<ByteBuf, zd> a = ym.a(f, zd::b, zd::new);

   @Override
   public yx<zd> a() {
      return zn.b;
   }

   public void a(zb $$0) {
      $$0.a(this);
   }
}
