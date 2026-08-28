import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class glc {
   public static final glc a = new glc(Map.of());
   private final Map<gle, glm> b;

   public glc(Map<gle, glm> $$0) {
      this.b = $$0;
   }

   public glg a(gle $$0) {
      glm $$1 = this.b.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("No model for layer " + $$0);
      } else {
         return $$1.a();
      }
   }

   public static glc a() {
      return new glc(ImmutableMap.copyOf(gld.a()));
   }
}
