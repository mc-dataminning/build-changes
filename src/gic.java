import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gic {
   public static final gic a = new gic(Map.of());
   private final Map<gie, gim> b;

   public gic(Map<gie, gim> $$0) {
      this.b = $$0;
   }

   public gig a(gie $$0) {
      gim $$1 = this.b.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("No model for layer " + $$0);
      } else {
         return $$1.a();
      }
   }

   public static gic a() {
      return new gic(ImmutableMap.copyOf(gid.a()));
   }
}
