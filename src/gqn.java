import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;

public class gqn extends gqi<cji, gxb, gak> {
   private static final Map<cji.e, alz> a = ae.a(Maps.newHashMap(), $$0 -> {
      for (cji.e $$1 : cji.e.values()) {
         $$0.put($$1, alz.b(String.format(Locale.ROOT, "textures/entity/axolotl/axolotl_%s.png", $$1.b())));
      }
   });

   public gqn(gro.a $$0) {
      super($$0, new gak($$0.a(gel.m)), new gak($$0.a(gel.n)), 0.5F);
   }

   public alz a(gxb $$0) {
      return a.get($$0.a);
   }

   public gxb a() {
      return new gxb();
   }

   public void a(cji $$0, gxb $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gm();
      $$1.b = $$0.cg.a($$2);
      $$1.d = $$0.ch.a($$2);
      $$1.e = $$0.ci.a($$2);
      $$1.c = $$0.cj.a($$2);
   }
}
