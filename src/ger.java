import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;

public class ger extends ggx<cdu, fpx<cdu>> {
   private static final Map<cdu.d, ajv> a = ac.a(Maps.newHashMap(), $$0 -> {
      for (cdu.d $$1 : cdu.d.values()) {
         $$0.put($$1, new ajv(String.format(Locale.ROOT, "textures/entity/axolotl/axolotl_%s.png", $$1.b())));
      }
   });

   public ger(gfr.a $$0) {
      super($$0, new fpx<>($$0.a(ftu.f)), 0.5F);
   }

   public ajv a(cdu $$0) {
      return a.get($$0.gn());
   }
}
