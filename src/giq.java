import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class giq {
   public static final giq a = new giq(Map.of());
   private final Map<gis, gja> b;

   public giq(Map<gis, gja> $$0) {
      this.b = $$0;
   }

   public giu a(gis $$0) {
      gja $$1 = this.b.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("No model for layer " + $$0);
      } else {
         return $$1.a();
      }
   }

   public static giq a() {
      return new giq(ImmutableMap.copyOf(gir.a()));
   }
}
