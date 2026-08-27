import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;

public class fve extends fxi<byd, fgy<byd>> {
   private static final Map<byd.d, agm> a = ac.a(Maps.newHashMap(), $$0 -> {
      for (byd.d $$1 : byd.d.values()) {
         $$0.put($$1, new agm(String.format(Locale.ROOT, "textures/entity/axolotl/axolotl_%s.png", $$1.b())));
      }
   });

   public fve(fwc.a $$0) {
      super($$0, new fgy<>($$0.a(fks.e)), 0.5F);
   }

   public agm a(byd $$0) {
      return a.get($$0.gf());
   }
}
