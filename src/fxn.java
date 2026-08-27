import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;

public class fxn extends fzs<bze, fiz<bze>> {
   private static final Map<bze.d, ahg> a = ac.a(Maps.newHashMap(), $$0 -> {
      for (bze.d $$1 : bze.d.values()) {
         $$0.put($$1, new ahg(String.format(Locale.ROOT, "textures/entity/axolotl/axolotl_%s.png", $$1.b())));
      }
   });

   public fxn(fym.a $$0) {
      super($$0, new fiz<>($$0.a(fmv.e)), 0.5F);
   }

   public ahg a(bze $$0) {
      return a.get($$0.ge());
   }
}
