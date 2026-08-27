import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;

public class fum extends fwq<bxq, fgg<bxq>> {
   private static final Map<bxq.d, agg> a = ac.a(Maps.newHashMap(), $$0 -> {
      for (bxq.d $$1 : bxq.d.values()) {
         $$0.put($$1, new agg(String.format(Locale.ROOT, "textures/entity/axolotl/axolotl_%s.png", $$1.b())));
      }
   });

   public fum(fvk.a $$0) {
      super($$0, new fgg<>($$0.a(fka.e)), 0.5F);
   }

   public agg a(bxq $$0) {
      return a.get($$0.ge());
   }
}
