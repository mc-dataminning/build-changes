import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;

public class gjh extends gln<cgq, fuk<cgq>> {
   private static final Map<cgq.d, akr> a = ad.a(Maps.newHashMap(), $$0 -> {
      for (cgq.d $$1 : cgq.d.values()) {
         $$0.put($$1, akr.b(String.format(Locale.ROOT, "textures/entity/axolotl/axolotl_%s.png", $$1.b())));
      }
   });

   public gjh(gkh.a $$0) {
      super($$0, new fuk<>($$0.a(fyh.f)), 0.5F);
   }

   public akr a(cgq $$0) {
      return a.get($$0.gl());
   }
}
