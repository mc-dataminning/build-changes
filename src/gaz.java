import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;

public class gaz extends gde<cbw, fmh<cbw>> {
   private static final Map<cbw.d, ajc> a = ac.a(Maps.newHashMap(), $$0 -> {
      for (cbw.d $$1 : cbw.d.values()) {
         $$0.put($$1, new ajc(String.format(Locale.ROOT, "textures/entity/axolotl/axolotl_%s.png", $$1.b())));
      }
   });

   public gaz(gby.a $$0) {
      super($$0, new fmh<>($$0.a(fqe.f)), 0.5F);
   }

   public ajc a(cbw $$0) {
      return a.get($$0.gl());
   }
}
