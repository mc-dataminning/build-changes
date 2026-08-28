import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;

public class gra extends gqv<cii, gxp, gaw> {
   private static final Map<cii.e, aku> a = af.a(Maps.newHashMap(), $$0 -> {
      for (cii.e $$1 : cii.e.values()) {
         $$0.put($$1, aku.b(String.format(Locale.ROOT, "textures/entity/axolotl/axolotl_%s.png", $$1.b())));
      }
   });

   public gra(gsb.a $$0) {
      super($$0, new gaw($$0.a(gez.m)), new gaw($$0.a(gez.n)), 0.5F);
   }

   public aku a(gxp $$0) {
      return a.get($$0.a);
   }

   public gxp a() {
      return new gxp();
   }

   public void a(cii $$0, gxp $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gp();
      $$1.b = $$0.cf.a($$2);
      $$1.d = $$0.cg.a($$2);
      $$1.e = $$0.ch.a($$2);
      $$1.c = $$0.ci.a($$2);
   }
}
