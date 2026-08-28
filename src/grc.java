import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;

public class grc extends gqx<cij, gxr, gay> {
   private static final Map<cij.e, akv> a = af.a(Maps.newHashMap(), $$0 -> {
      for (cij.e $$1 : cij.e.values()) {
         $$0.put($$1, akv.b(String.format(Locale.ROOT, "textures/entity/axolotl/axolotl_%s.png", $$1.b())));
      }
   });

   public grc(gsd.a $$0) {
      super($$0, new gay($$0.a(gfb.m)), new gay($$0.a(gfb.n)), 0.5F);
   }

   public akv a(gxr $$0) {
      return a.get($$0.a);
   }

   public gxr a() {
      return new gxr();
   }

   public void a(cij $$0, gxr $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gs();
      $$1.b = $$0.cf.a($$2);
      $$1.d = $$0.cg.a($$2);
      $$1.e = $$0.ch.a($$2);
      $$1.c = $$0.ci.a($$2);
   }
}
