import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gey {
   public static final gey a = new gey(Map.of());
   private final Map<gfa, gfi> b;

   public gey(Map<gfa, gfi> $$0) {
      this.b = $$0;
   }

   public gfc a(gfa $$0) {
      gfi $$1 = this.b.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("No model for layer " + $$0);
      } else {
         return $$1.a();
      }
   }

   public static gey a() {
      return new gey(ImmutableMap.copyOf(gez.a()));
   }
}
