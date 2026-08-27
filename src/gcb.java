import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;

public class gcb extends geh<cco, fnh<cco>> {
   private static final Map<cco.d, ajh> a = ac.a(Maps.newHashMap(), $$0 -> {
      for (cco.d $$1 : cco.d.values()) {
         $$0.put($$1, new ajh(String.format(Locale.ROOT, "textures/entity/axolotl/axolotl_%s.png", $$1.b())));
      }
   });

   public gcb(gdb.a $$0) {
      super($$0, new fnh<>($$0.a(fre.f)), 0.5F);
   }

   public ajh a(cco $$0) {
      return a.get($$0.gn());
   }
}
