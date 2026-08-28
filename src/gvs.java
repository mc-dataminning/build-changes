import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;

public class gvs extends gvn<ckr, hcg, gfe> {
   private static final Map<ckr.e, alg> a = ag.a(Maps.newHashMap(), $$0 -> {
      for (ckr.e $$1 : ckr.e.values()) {
         $$0.put($$1, alg.b(String.format(Locale.ROOT, "textures/entity/axolotl/axolotl_%s.png", $$1.b())));
      }
   });

   public gvs(gwt.a $$0) {
      super($$0, new gfe($$0.a(gjn.m)), new gfe($$0.a(gjn.n)), 0.5F);
   }

   public alg a(hcg $$0) {
      return a.get($$0.a);
   }

   public hcg a() {
      return new hcg();
   }

   public void a(ckr $$0, hcg $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.t();
      $$1.b = $$0.bN.a($$2);
      $$1.d = $$0.bO.a($$2);
      $$1.e = $$0.bP.a($$2);
      $$1.c = $$0.bQ.a($$2);
   }
}
