import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gfy {
   public static final gfy a = new gfy(Map.of());
   private final Map<gga, ggi> b;

   public gfy(Map<gga, ggi> $$0) {
      this.b = $$0;
   }

   public ggc a(gga $$0) {
      ggi $$1 = this.b.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("No model for layer " + $$0);
      } else {
         return $$1.a();
      }
   }

   public static gfy a() {
      return new gfy(ImmutableMap.copyOf(gfz.a()));
   }
}
