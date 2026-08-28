import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;

public class gxj extends gxe<clb, hdy, ggw> {
   private static final Map<clb.e, alk> a = ag.a(Maps.newHashMap(), $$0 -> {
      for (clb.e $$1 : clb.e.values()) {
         $$0.put($$1, alk.b(String.format(Locale.ROOT, "textures/entity/axolotl/axolotl_%s.png", $$1.b())));
      }
   });

   public gxj(gyk.a $$0) {
      super($$0, new ggw($$0.a(glf.m)), new ggw($$0.a(glf.n)), 0.5F);
   }

   public alk a(hdy $$0) {
      return a.get($$0.a);
   }

   public hdy a() {
      return new hdy();
   }

   public void a(clb $$0, hdy $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.t();
      $$1.b = $$0.bP.a($$2);
      $$1.d = $$0.bQ.a($$2);
      $$1.e = $$0.bR.a($$2);
      $$1.c = $$0.bS.a($$2);
   }
}
