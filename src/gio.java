import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;

public class gio extends gku<cge, fts<cge>> {
   private static final Map<cge.d, akk> a = ac.a(Maps.newHashMap(), $$0 -> {
      for (cge.d $$1 : cge.d.values()) {
         $$0.put($$1, new akk(String.format(Locale.ROOT, "textures/entity/axolotl/axolotl_%s.png", $$1.b())));
      }
   });

   public gio(gjo.a $$0) {
      super($$0, new fts<>($$0.a(fxp.f)), 0.5F);
   }

   public akk a(cge $$0) {
      return a.get($$0.gn());
   }
}
