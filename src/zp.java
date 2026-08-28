import io.netty.buffer.ByteBuf;
import java.util.HashMap;
import java.util.Map;

public record zp(Map<String, String> b) implements zh<zn> {
   private static final int c = 128;
   private static final int d = 4096;
   private static final int e = 32;
   private static final yy<ByteBuf, Map<String, String>> f = yw.a(HashMap::new, yw.b(128), yw.b(4096), 32);
   public static final yy<ByteBuf, zp> a = yy.a(f, zp::b, zp::new);

   @Override
   public zj<zp> a() {
      return zz.b;
   }

   public void a(zn $$0) {
      $$0.a(this);
   }
}
