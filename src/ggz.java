import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class ggz {
   public static final ggz a = new ggz(Map.of());
   private final Map<ghb, ghj> b;

   public ggz(Map<ghb, ghj> $$0) {
      this.b = $$0;
   }

   public ghd a(ghb $$0) {
      ghj $$1 = this.b.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("No model for layer " + $$0);
      } else {
         return $$1.a();
      }
   }

   public static ggz a() {
      return new ggz(ImmutableMap.copyOf(gha.a()));
   }
}
