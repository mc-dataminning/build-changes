import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gkn {
   public static final gkn a = new gkn(Map.of());
   private final Map<gkp, gkx> b;

   public gkn(Map<gkp, gkx> $$0) {
      this.b = $$0;
   }

   public gkr a(gkp $$0) {
      gkx $$1 = this.b.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("No model for layer " + $$0);
      } else {
         return $$1.a();
      }
   }

   public static gkn a() {
      return new gkn(ImmutableMap.copyOf(gko.a()));
   }
}
