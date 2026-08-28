import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;

public class gqo extends gqj<cji, gxc, gal> {
   private static final Map<cji.e, alz> a = ae.a(Maps.newHashMap(), $$0 -> {
      for (cji.e $$1 : cji.e.values()) {
         $$0.put($$1, alz.b(String.format(Locale.ROOT, "textures/entity/axolotl/axolotl_%s.png", $$1.b())));
      }
   });

   public gqo(grp.a $$0) {
      super($$0, new gal($$0.a(gem.m)), new gal($$0.a(gem.n)), 0.5F);
   }

   public alz a(gxc $$0) {
      return a.get($$0.a);
   }

   public gxc a() {
      return new gxc();
   }

   public void a(cji $$0, gxc $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.go();
      $$1.b = $$0.cg.a($$2);
      $$1.d = $$0.ch.a($$2);
      $$1.e = $$0.ci.a($$2);
      $$1.c = $$0.cj.a($$2);
   }
}
