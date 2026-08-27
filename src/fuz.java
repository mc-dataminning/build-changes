import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;

public class fuz extends fxd<bxy, fgt<bxy>> {
   private static final Map<bxy.d, agi> a = ac.a(Maps.newHashMap(), $$0 -> {
      for (bxy.d $$1 : bxy.d.values()) {
         $$0.put($$1, new agi(String.format(Locale.ROOT, "textures/entity/axolotl/axolotl_%s.png", $$1.b())));
      }
   });

   public fuz(fvx.a $$0) {
      super($$0, new fgt<>($$0.a(fkn.e)), 0.5F);
   }

   public agi a(bxy $$0) {
      return a.get($$0.gf());
   }
}
