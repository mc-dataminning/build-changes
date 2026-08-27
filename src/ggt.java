import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;

public class ggt extends giz<cfs, fry<cfs>> {
   private static final Map<cfs.d, akn> a = ac.a(Maps.newHashMap(), $$0 -> {
      for (cfs.d $$1 : cfs.d.values()) {
         $$0.put($$1, new akn(String.format(Locale.ROOT, "textures/entity/axolotl/axolotl_%s.png", $$1.b())));
      }
   });

   public ggt(ght.a $$0) {
      super($$0, new fry<>($$0.a(fvv.f)), 0.5F);
   }

   public akn a(cfs $$0) {
      return a.get($$0.gp());
   }
}
