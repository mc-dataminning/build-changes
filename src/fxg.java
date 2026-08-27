import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;

public class fxg extends fzl<byz, fis<byz>> {
   private static final Map<byz.d, ahd> a = ac.a(Maps.newHashMap(), $$0 -> {
      for (byz.d $$1 : byz.d.values()) {
         $$0.put($$1, new ahd(String.format(Locale.ROOT, "textures/entity/axolotl/axolotl_%s.png", $$1.b())));
      }
   });

   public fxg(fyf.a $$0) {
      super($$0, new fis<>($$0.a(fmo.e)), 0.5F);
   }

   public ahd a(byz $$0) {
      return a.get($$0.ge());
   }
}
