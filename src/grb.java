import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;

public class grb extends gqw<cij, gxq, gay> {
   private static final Map<cij.e, aku> a = af.a(Maps.newHashMap(), $$0 -> {
      for (cij.e $$1 : cij.e.values()) {
         $$0.put($$1, aku.b(String.format(Locale.ROOT, "textures/entity/axolotl/axolotl_%s.png", $$1.b())));
      }
   });

   public grb(gsc.a $$0) {
      super($$0, new gay($$0.a(gfb.m)), new gay($$0.a(gfb.n)), 0.5F);
   }

   public aku a(gxq $$0) {
      return a.get($$0.a);
   }

   public gxq a() {
      return new gxq();
   }

   public void a(cij $$0, gxq $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gp();
      $$1.b = $$0.cf.a($$2);
      $$1.d = $$0.cg.a($$2);
      $$1.e = $$0.ch.a($$2);
      $$1.c = $$0.ci.a($$2);
   }
}
