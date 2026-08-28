import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;

public class ghz extends gkf<cgt, fte<cgt>> {
   private static final Map<cgt.d, alf> a = ac.a(Maps.newHashMap(), $$0 -> {
      for (cgt.d $$1 : cgt.d.values()) {
         $$0.put($$1, new alf(String.format(Locale.ROOT, "textures/entity/axolotl/axolotl_%s.png", $$1.b())));
      }
   });

   public ghz(giz.a $$0) {
      super($$0, new fte<>($$0.a(fxb.f)), 0.5F);
   }

   public alf a(cgt $$0) {
      return a.get($$0.gq());
   }
}
