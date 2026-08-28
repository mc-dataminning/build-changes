import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;

public class ghs extends gjy<cgm, fsx<cgm>> {
   private static final Map<cgm.d, alb> a = ac.a(Maps.newHashMap(), $$0 -> {
      for (cgm.d $$1 : cgm.d.values()) {
         $$0.put($$1, new alb(String.format(Locale.ROOT, "textures/entity/axolotl/axolotl_%s.png", $$1.b())));
      }
   });

   public ghs(gis.a $$0) {
      super($$0, new fsx<>($$0.a(fwu.f)), 0.5F);
   }

   public alb a(cgm $$0) {
      return a.get($$0.gq());
   }
}
