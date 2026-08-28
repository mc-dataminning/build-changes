import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gfa {
   public static final gfa a = new gfa(Map.of());
   private final Map<gfc, gfk> b;

   public gfa(Map<gfc, gfk> $$0) {
      this.b = $$0;
   }

   public gfe a(gfc $$0) {
      gfk $$1 = this.b.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("No model for layer " + $$0);
      } else {
         return $$1.a();
      }
   }

   public static gfa a() {
      return new gfa(ImmutableMap.copyOf(gfb.a()));
   }
}
