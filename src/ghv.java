import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;

public class ghv extends gkb<cgp, fta<cgp>> {
   private static final Map<cgp.d, ale> a = ac.a(Maps.newHashMap(), $$0 -> {
      for (cgp.d $$1 : cgp.d.values()) {
         $$0.put($$1, new ale(String.format(Locale.ROOT, "textures/entity/axolotl/axolotl_%s.png", $$1.b())));
      }
   });

   public ghv(giv.a $$0) {
      super($$0, new fta<>($$0.a(fwx.f)), 0.5F);
   }

   public ale a(cgp $$0) {
      return a.get($$0.gq());
   }
}
