import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;

public class gvx extends gvs<cko, hcm, gfj> {
   private static final Map<cko.e, alg> a = ag.a(Maps.newHashMap(), $$0 -> {
      for (cko.e $$1 : cko.e.values()) {
         $$0.put($$1, alg.b(String.format(Locale.ROOT, "textures/entity/axolotl/axolotl_%s.png", $$1.b())));
      }
   });

   public gvx(gwy.a $$0) {
      super($$0, new gfj($$0.a(gjs.m)), new gfj($$0.a(gjs.n)), 0.5F);
   }

   public alg a(hcm $$0) {
      return a.get($$0.a);
   }

   public hcm a() {
      return new hcm();
   }

   public void a(cko $$0, hcm $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.t();
      $$1.b = $$0.bN.a($$2);
      $$1.d = $$0.bO.a($$2);
      $$1.e = $$0.bP.a($$2);
      $$1.c = $$0.bQ.a($$2);
   }
}
