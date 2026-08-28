import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;

public class gte extends gsz<cjv, gzs, gcw> {
   private static final Map<cjv.e, ald> a = af.a(Maps.newHashMap(), $$0 -> {
      for (cjv.e $$1 : cjv.e.values()) {
         $$0.put($$1, ald.b(String.format(Locale.ROOT, "textures/entity/axolotl/axolotl_%s.png", $$1.b())));
      }
   });

   public gte(guf.a $$0) {
      super($$0, new gcw($$0.a(ghc.m)), new gcw($$0.a(ghc.n)), 0.5F);
   }

   public ald a(gzs $$0) {
      return a.get($$0.a);
   }

   public gzs a() {
      return new gzs();
   }

   public void a(cjv $$0, gzs $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.t();
      $$1.b = $$0.bL.a($$2);
      $$1.d = $$0.bM.a($$2);
      $$1.e = $$0.bN.a($$2);
      $$1.c = $$0.bO.a($$2);
   }
}
