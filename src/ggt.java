import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;

public class ggt extends giz<cfq, fry<cfq>> {
   private static final Map<cfq.d, akm> a = ac.a(Maps.newHashMap(), $$0 -> {
      for (cfq.d $$1 : cfq.d.values()) {
         $$0.put($$1, new akm(String.format(Locale.ROOT, "textures/entity/axolotl/axolotl_%s.png", $$1.b())));
      }
   });

   public ggt(ght.a $$0) {
      super($$0, new fry<>($$0.a(fvv.f)), 0.5F);
   }

   public akm a(cfq $$0) {
      return a.get($$0.gp());
   }
}
