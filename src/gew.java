import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gew {
   public static final gew a = new gew(Map.of());
   private final Map<gey, gfg> b;

   public gew(Map<gey, gfg> $$0) {
      this.b = $$0;
   }

   public gfa a(gey $$0) {
      gfg $$1 = this.b.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("No model for layer " + $$0);
      } else {
         return $$1.a();
      }
   }

   public static gew a() {
      return new gew(ImmutableMap.copyOf(gex.a()));
   }
}
