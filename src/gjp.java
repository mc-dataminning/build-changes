import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;

public class gjp extends glz<cfq, fur<cfq>> {
   private static final Map<cfq.d, akt> a = ad.a(Maps.newHashMap(), $$0 -> {
      for (cfq.d $$1 : cfq.d.values()) {
         $$0.put($$1, new akt(String.format(Locale.ROOT, "textures/entity/axolotl/axolotl_%s.png", $$1.b())));
      }
   });

   public gjp(gkq.a $$0) {
      super($$0, new fur<>($$0.a(fyr.f)), 0.5F);
   }

   public akt a(cfq $$0) {
      return a.get($$0.gy());
   }
}
