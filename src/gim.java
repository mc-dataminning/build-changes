import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;

public class gim extends gks<cgd, ftq<cgd>> {
   private static final Map<cgd.d, akk> a = ac.a(Maps.newHashMap(), $$0 -> {
      for (cgd.d $$1 : cgd.d.values()) {
         $$0.put($$1, new akk(String.format(Locale.ROOT, "textures/entity/axolotl/axolotl_%s.png", $$1.b())));
      }
   });

   public gim(gjm.a $$0) {
      super($$0, new ftq<>($$0.a(fxn.f)), 0.5F);
   }

   public akk a(cgd $$0) {
      return a.get($$0.go());
   }
}
