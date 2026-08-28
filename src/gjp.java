import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gjp {
   public static final gjp a = new gjp(Map.of());
   private final Map<gjr, gjz> b;

   public gjp(Map<gjr, gjz> $$0) {
      this.b = $$0;
   }

   public gjt a(gjr $$0) {
      gjz $$1 = this.b.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("No model for layer " + $$0);
      } else {
         return $$1.a();
      }
   }

   public static gjp a() {
      return new gjp(ImmutableMap.copyOf(gjq.a()));
   }
}
