import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;

public class gls extends gln<chh, gsd, fwb> {
   private static final Map<chh.e, alb> a = ad.a(Maps.newHashMap(), $$0 -> {
      for (chh.e $$1 : chh.e.values()) {
         $$0.put($$1, alb.b(String.format(Locale.ROOT, "textures/entity/axolotl/axolotl_%s.png", $$1.b())));
      }
   });

   public gls(gms.a $$0) {
      super($$0, new fwb($$0.a(gaa.k)), new fwb($$0.a(gaa.l)), 0.5F);
   }

   public alb a(gsd $$0) {
      return a.get($$0.a);
   }

   public gsd a() {
      return new gsd();
   }

   public void a(chh $$0, gsd $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.go();
      $$1.b = $$0.cg.a($$2);
      $$1.d = $$0.ch.a($$2);
      $$1.e = $$0.ci.a($$2);
      $$1.c = $$0.cj.a($$2);
   }
}
