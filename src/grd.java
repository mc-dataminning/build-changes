import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;

public class grd extends gqy<cik, gxs, gaz> {
   private static final Map<cik.e, akv> a = af.a(Maps.newHashMap(), $$0 -> {
      for (cik.e $$1 : cik.e.values()) {
         $$0.put($$1, akv.b(String.format(Locale.ROOT, "textures/entity/axolotl/axolotl_%s.png", $$1.b())));
      }
   });

   public grd(gse.a $$0) {
      super($$0, new gaz($$0.a(gfc.m)), new gaz($$0.a(gfc.n)), 0.5F);
   }

   public akv a(gxs $$0) {
      return a.get($$0.a);
   }

   public gxs a() {
      return new gxs();
   }

   public void a(cik $$0, gxs $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gs();
      $$1.b = $$0.cf.a($$2);
      $$1.d = $$0.cg.a($$2);
      $$1.e = $$0.ch.a($$2);
      $$1.c = $$0.ci.a($$2);
   }
}
