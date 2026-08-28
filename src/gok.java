import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;

public class gok extends gof<cik, gux, fyk> {
   private static final Map<cik.e, alj> a = ae.a(Maps.newHashMap(), $$0 -> {
      for (cik.e $$1 : cik.e.values()) {
         $$0.put($$1, alj.b(String.format(Locale.ROOT, "textures/entity/axolotl/axolotl_%s.png", $$1.b())));
      }
   });

   public gok(gpk.a $$0) {
      super($$0, new fyk($$0.a(gck.m)), new fyk($$0.a(gck.n)), 0.5F);
   }

   public alj a(gux $$0) {
      return a.get($$0.a);
   }

   public gux a() {
      return new gux();
   }

   public void a(cik $$0, gux $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gm();
      $$1.b = $$0.cf.a($$2);
      $$1.d = $$0.cg.a($$2);
      $$1.e = $$0.ch.a($$2);
      $$1.c = $$0.ci.a($$2);
   }
}
