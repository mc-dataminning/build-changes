import io.netty.buffer.ByteBuf;
import java.util.HashMap;
import java.util.Map;

public record zs(Map<String, String> b) implements zk<zq> {
   private static final int c = 128;
   private static final int d = 4096;
   private static final int e = 32;
   private static final zb<ByteBuf, Map<String, String>> f = yz.a(HashMap::new, yz.b(128), yz.b(4096), 32);
   public static final zb<ByteBuf, zs> a = zb.a(f, zs::b, zs::new);

   @Override
   public zm<zs> a() {
      return aac.b;
   }

   public void a(zq $$0) {
      $$0.a(this);
   }
}
