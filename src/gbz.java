import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;

public class gbz extends gee<ccn, fnf<ccn>> {
   private static final Map<ccn.d, ajh> a = ac.a(Maps.newHashMap(), $$0 -> {
      for (ccn.d $$1 : ccn.d.values()) {
         $$0.put($$1, new ajh(String.format(Locale.ROOT, "textures/entity/axolotl/axolotl_%s.png", $$1.b())));
      }
   });

   public gbz(gcy.a $$0) {
      super($$0, new fnf<>($$0.a(frc.f)), 0.5F);
   }

   public ajh a(ccn $$0) {
      return a.get($$0.gn());
   }
}
