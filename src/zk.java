import io.netty.buffer.ByteBuf;
import java.util.HashMap;
import java.util.Map;

public record zk(Map<String, String> b) implements zc<zi> {
   private static final int c = 128;
   private static final int d = 4096;
   private static final int e = 32;
   private static final yt<ByteBuf, Map<String, String>> f = yr.a(HashMap::new, yr.b(128), yr.b(4096), 32);
   public static final yt<ByteBuf, zk> a = yt.a(f, zk::b, zk::new);

   @Override
   public ze<zk> a() {
      return zu.b;
   }

   public void a(zi $$0) {
      $$0.a(this);
   }
}
