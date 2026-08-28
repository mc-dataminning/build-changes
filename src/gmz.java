import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;

public class gmz extends gmu<chy, gtl, fxa> {
   private static final Map<chy.e, alh> a = ad.a(Maps.newHashMap(), $$0 -> {
      for (chy.e $$1 : chy.e.values()) {
         $$0.put($$1, alh.b(String.format(Locale.ROOT, "textures/entity/axolotl/axolotl_%s.png", $$1.b())));
      }
   });

   public gmz(gnz.a $$0) {
      super($$0, new fxa($$0.a(gba.k)), new fxa($$0.a(gba.l)), 0.5F);
   }

   public alh a(gtl $$0) {
      return a.get($$0.a);
   }

   public gtl a() {
      return new gtl();
   }

   public void a(chy $$0, gtl $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gv();
      $$1.b = $$0.cf.a($$2);
      $$1.d = $$0.cg.a($$2);
      $$1.e = $$0.ch.a($$2);
      $$1.c = $$0.ci.a($$2);
   }
}
