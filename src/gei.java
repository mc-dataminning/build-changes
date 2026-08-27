import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;

public class gei extends ggo<cdn, fpo<cdn>> {
   private static final Map<cdn.d, ajt> a = ac.a(Maps.newHashMap(), $$0 -> {
      for (cdn.d $$1 : cdn.d.values()) {
         $$0.put($$1, new ajt(String.format(Locale.ROOT, "textures/entity/axolotl/axolotl_%s.png", $$1.b())));
      }
   });

   public gei(gfi.a $$0) {
      super($$0, new fpo<>($$0.a(ftl.f)), 0.5F);
   }

   public ajt a(cdn $$0) {
      return a.get($$0.gn());
   }
}
