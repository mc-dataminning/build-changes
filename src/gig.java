import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;

public class gig extends gkm<cga, ftk<cga>> {
   private static final Map<cga.d, akk> a = ac.a(Maps.newHashMap(), $$0 -> {
      for (cga.d $$1 : cga.d.values()) {
         $$0.put($$1, new akk(String.format(Locale.ROOT, "textures/entity/axolotl/axolotl_%s.png", $$1.b())));
      }
   });

   public gig(gjg.a $$0) {
      super($$0, new ftk<>($$0.a(fxh.f)), 0.5F);
   }

   public akk a(cga $$0) {
      return a.get($$0.gn());
   }
}
