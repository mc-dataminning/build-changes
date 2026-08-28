import io.netty.buffer.ByteBuf;
import java.util.HashMap;
import java.util.Map;

public record zl(Map<String, String> b) implements zd<zj> {
   private static final int c = 128;
   private static final int d = 4096;
   private static final int e = 32;
   private static final yu<ByteBuf, Map<String, String>> f = ys.a(HashMap::new, ys.b(128), ys.b(4096), 32);
   public static final yu<ByteBuf, zl> a = yu.a(f, zl::b, zl::new);

   @Override
   public zf<zl> a() {
      return zv.b;
   }

   public void a(zj $$0) {
      $$0.a(this);
   }
}
