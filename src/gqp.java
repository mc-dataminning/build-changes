import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;

public class gqp extends gqk<cjj, gxd, gam> {
   private static final Map<cjj.e, alz> a = ae.a(Maps.newHashMap(), $$0 -> {
      for (cjj.e $$1 : cjj.e.values()) {
         $$0.put($$1, alz.b(String.format(Locale.ROOT, "textures/entity/axolotl/axolotl_%s.png", $$1.b())));
      }
   });

   public gqp(grq.a $$0) {
      super($$0, new gam($$0.a(gen.m)), new gam($$0.a(gen.n)), 0.5F);
   }

   public alz a(gxd $$0) {
      return a.get($$0.a);
   }

   public gxd a() {
      return new gxd();
   }

   public void a(cjj $$0, gxd $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.go();
      $$1.b = $$0.cg.a($$2);
      $$1.d = $$0.ch.a($$2);
      $$1.e = $$0.ci.a($$2);
      $$1.c = $$0.cj.a($$2);
   }
}
