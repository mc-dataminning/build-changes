import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class giy {
   public static final giy a = new giy(Map.of());
   private final Map<gja, gji> b;

   public giy(Map<gja, gji> $$0) {
      this.b = $$0;
   }

   public gjc a(gja $$0) {
      gji $$1 = this.b.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("No model for layer " + $$0);
      } else {
         return $$1.a();
      }
   }

   public static giy a() {
      return new giy(ImmutableMap.copyOf(giz.a()));
   }
}
