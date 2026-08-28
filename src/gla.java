import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gla {
   public static final gla a = new gla(Map.of());
   private final Map<glc, glk> b;

   public gla(Map<glc, glk> $$0) {
      this.b = $$0;
   }

   public gle a(glc $$0) {
      glk $$1 = this.b.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("No model for layer " + $$0);
      } else {
         return $$1.a();
      }
   }

   public static gla a() {
      return new gla(ImmutableMap.copyOf(glb.a()));
   }
}
