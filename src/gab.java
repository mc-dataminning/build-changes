import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;

public class gab extends gcg<cbh, fll<cbh>> {
   private static final Map<cbh.d, aiy> a = ac.a(Maps.newHashMap(), $$0 -> {
      for (cbh.d $$1 : cbh.d.values()) {
         $$0.put($$1, new aiy(String.format(Locale.ROOT, "textures/entity/axolotl/axolotl_%s.png", $$1.b())));
      }
   });

   public gab(gba.a $$0) {
      super($$0, new fll<>($$0.a(fpi.f)), 0.5F);
   }

   public aiy a(cbh $$0) {
      return a.get($$0.gg());
   }
}
