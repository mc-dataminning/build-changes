import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;

public class ghy extends gke<cgs, ftd<cgs>> {
   private static final Map<cgs.d, alf> a = ac.a(Maps.newHashMap(), $$0 -> {
      for (cgs.d $$1 : cgs.d.values()) {
         $$0.put($$1, new alf(String.format(Locale.ROOT, "textures/entity/axolotl/axolotl_%s.png", $$1.b())));
      }
   });

   public ghy(giy.a $$0) {
      super($$0, new ftd<>($$0.a(fxa.f)), 0.5F);
   }

   public alf a(cgs $$0) {
      return a.get($$0.gq());
   }
}
