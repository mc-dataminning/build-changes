import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;

public class gfx extends gid<cfb, frd<cfb>> {
   private static final Map<cfb.d, akh> a = ac.a(Maps.newHashMap(), $$0 -> {
      for (cfb.d $$1 : cfb.d.values()) {
         $$0.put($$1, new akh(String.format(Locale.ROOT, "textures/entity/axolotl/axolotl_%s.png", $$1.b())));
      }
   });

   public gfx(ggx.a $$0) {
      super($$0, new frd<>($$0.a(fva.f)), 0.5F);
   }

   public akh a(cfb $$0) {
      return a.get($$0.gp());
   }
}
