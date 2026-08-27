import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;

public class gfn extends ght<cef, fqt<cef>> {
   private static final Map<cef.d, akf> a = ac.a(Maps.newHashMap(), $$0 -> {
      for (cef.d $$1 : cef.d.values()) {
         $$0.put($$1, new akf(String.format(Locale.ROOT, "textures/entity/axolotl/axolotl_%s.png", $$1.b())));
      }
   });

   public gfn(ggn.a $$0) {
      super($$0, new fqt<>($$0.a(fuq.f)), 0.5F);
   }

   public akf a(cef $$0) {
      return a.get($$0.gp());
   }
}
