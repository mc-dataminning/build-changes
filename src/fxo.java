import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;

public class fxo extends fzt<bzf, fja<bzf>> {
   private static final Map<bzf.d, ahg> a = ac.a(Maps.newHashMap(), $$0 -> {
      for (bzf.d $$1 : bzf.d.values()) {
         $$0.put($$1, new ahg(String.format(Locale.ROOT, "textures/entity/axolotl/axolotl_%s.png", $$1.b())));
      }
   });

   public fxo(fyn.a $$0) {
      super($$0, new fja<>($$0.a(fmw.e)), 0.5F);
   }

   public ahg a(bzf $$0) {
      return a.get($$0.ge());
   }
}
