import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gjk {
   public static final gjk a = new gjk(Map.of());
   private final Map<gjm, gju> b;

   public gjk(Map<gjm, gju> $$0) {
      this.b = $$0;
   }

   public gjo a(gjm $$0) {
      gju $$1 = this.b.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("No model for layer " + $$0);
      } else {
         return $$1.a();
      }
   }

   public static gjk a() {
      return new gjk(ImmutableMap.copyOf(gjl.a()));
   }
}
