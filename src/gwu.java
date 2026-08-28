import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;

public class gwu extends gwp<clk, hdj, ggh> {
   private static final Map<clk.e, alr> a = ag.a(Maps.newHashMap(), $$0 -> {
      for (clk.e $$1 : clk.e.values()) {
         $$0.put($$1, alr.b(String.format(Locale.ROOT, "textures/entity/axolotl/axolotl_%s.png", $$1.b())));
      }
   });

   public gwu(gxv.a $$0) {
      super($$0, new ggh($$0.a(gkq.m)), new ggh($$0.a(gkq.n)), 0.5F);
   }

   public alr a(hdj $$0) {
      return a.get($$0.a);
   }

   public hdj a() {
      return new hdj();
   }

   public void a(clk $$0, hdj $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.t();
      $$1.b = $$0.bP.a($$2);
      $$1.d = $$0.bQ.a($$2);
      $$1.e = $$0.bR.a($$2);
      $$1.c = $$0.bS.a($$2);
   }
}
