import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;

public class ghx extends gkd<cgr, ftc<cgr>> {
   private static final Map<cgr.d, alf> a = ac.a(Maps.newHashMap(), $$0 -> {
      for (cgr.d $$1 : cgr.d.values()) {
         $$0.put($$1, new alf(String.format(Locale.ROOT, "textures/entity/axolotl/axolotl_%s.png", $$1.b())));
      }
   });

   public ghx(gix.a $$0) {
      super($$0, new ftc<>($$0.a(fwz.f)), 0.5F);
   }

   public alf a(cgr $$0) {
      return a.get($$0.gq());
   }
}
