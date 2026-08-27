import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;

public class fyb extends gag<bzm, fjm<bzm>> {
   private static final Map<bzm.d, ahh> a = ac.a(Maps.newHashMap(), $$0 -> {
      for (bzm.d $$1 : bzm.d.values()) {
         $$0.put($$1, new ahh(String.format(Locale.ROOT, "textures/entity/axolotl/axolotl_%s.png", $$1.b())));
      }
   });

   public fyb(fza.a $$0) {
      super($$0, new fjm<>($$0.a(fni.f)), 0.5F);
   }

   public ahh a(bzm $$0) {
      return a.get($$0.gf());
   }
}
