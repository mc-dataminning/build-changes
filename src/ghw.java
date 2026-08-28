import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;

public class ghw extends gkc<cgq, ftb<cgq>> {
   private static final Map<cgq.d, ale> a = ac.a(Maps.newHashMap(), $$0 -> {
      for (cgq.d $$1 : cgq.d.values()) {
         $$0.put($$1, new ale(String.format(Locale.ROOT, "textures/entity/axolotl/axolotl_%s.png", $$1.b())));
      }
   });

   public ghw(giw.a $$0) {
      super($$0, new ftb<>($$0.a(fwy.f)), 0.5F);
   }

   public ale a(cgq $$0) {
      return a.get($$0.gq());
   }
}
