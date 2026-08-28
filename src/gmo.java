import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;

public class gmo extends gmj<chp, gsz, fwp> {
   private static final Map<chp.e, ale> a = ad.a(Maps.newHashMap(), $$0 -> {
      for (chp.e $$1 : chp.e.values()) {
         $$0.put($$1, ale.b(String.format(Locale.ROOT, "textures/entity/axolotl/axolotl_%s.png", $$1.b())));
      }
   });

   public gmo(gno.a $$0) {
      super($$0, new fwp($$0.a(gap.k)), new fwp($$0.a(gap.l)), 0.5F);
   }

   public ale a(gsz $$0) {
      return a.get($$0.a);
   }

   public gsz a() {
      return new gsz();
   }

   public void a(chp $$0, gsz $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.go();
      $$1.b = $$0.cf.a($$2);
      $$1.d = $$0.cg.a($$2);
      $$1.e = $$0.ch.a($$2);
      $$1.c = $$0.ci.a($$2);
   }
}
