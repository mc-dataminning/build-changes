import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gez {
   public static final gez a = new gez(Map.of());
   private final Map<gfb, gfj> b;

   public gez(Map<gfb, gfj> $$0) {
      this.b = $$0;
   }

   public gfd a(gfb $$0) {
      gfj $$1 = this.b.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("No model for layer " + $$0);
      } else {
         return $$1.a();
      }
   }

   public static gez a() {
      return new gez(ImmutableMap.copyOf(gfa.a()));
   }
}
