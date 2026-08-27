import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;

public class fzu extends gbz<cbd, fle<cbd>> {
   private static final Map<cbd.d, aiy> a = ac.a(Maps.newHashMap(), $$0 -> {
      for (cbd.d $$1 : cbd.d.values()) {
         $$0.put($$1, new aiy(String.format(Locale.ROOT, "textures/entity/axolotl/axolotl_%s.png", $$1.b())));
      }
   });

   public fzu(gat.a $$0) {
      super($$0, new fle<>($$0.a(fpb.f)), 0.5F);
   }

   public aiy a(cbd $$0) {
      return a.get($$0.gg());
   }
}
