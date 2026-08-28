import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;

public class gjd extends glj<cgo, fug<cgo>> {
   private static final Map<cgo.d, akq> a = ad.a(Maps.newHashMap(), $$0 -> {
      for (cgo.d $$1 : cgo.d.values()) {
         $$0.put($$1, akq.b(String.format(Locale.ROOT, "textures/entity/axolotl/axolotl_%s.png", $$1.b())));
      }
   });

   public gjd(gkd.a $$0) {
      super($$0, new fug<>($$0.a(fyd.f)), 0.5F);
   }

   public akq a(cgo $$0) {
      return a.get($$0.gm());
   }
}
