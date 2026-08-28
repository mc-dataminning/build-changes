import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;

public class gre extends gqz<cil, gxt, gba> {
   private static final Map<cil.e, akv> a = af.a(Maps.newHashMap(), $$0 -> {
      for (cil.e $$1 : cil.e.values()) {
         $$0.put($$1, akv.b(String.format(Locale.ROOT, "textures/entity/axolotl/axolotl_%s.png", $$1.b())));
      }
   });

   public gre(gsf.a $$0) {
      super($$0, new gba($$0.a(gfd.m)), new gba($$0.a(gfd.n)), 0.5F);
   }

   public akv a(gxt $$0) {
      return a.get($$0.a);
   }

   public gxt a() {
      return new gxt();
   }

   public void a(cil $$0, gxt $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gs();
      $$1.b = $$0.cf.a($$2);
      $$1.d = $$0.cg.a($$2);
      $$1.e = $$0.ch.a($$2);
      $$1.c = $$0.ci.a($$2);
   }
}
