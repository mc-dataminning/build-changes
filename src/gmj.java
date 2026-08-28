import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;

public class gmj extends gme<chm, gsu, fwl> {
   private static final Map<chm.e, alc> a = ad.a(Maps.newHashMap(), $$0 -> {
      for (chm.e $$1 : chm.e.values()) {
         $$0.put($$1, alc.b(String.format(Locale.ROOT, "textures/entity/axolotl/axolotl_%s.png", $$1.b())));
      }
   });

   public gmj(gnj.a $$0) {
      super($$0, new fwl($$0.a(gak.k)), new fwl($$0.a(gak.l)), 0.5F);
   }

   public alc a(gsu $$0) {
      return a.get($$0.a);
   }

   public gsu a() {
      return new gsu();
   }

   public void a(chm $$0, gsu $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gp();
      $$1.b = $$0.cf.a($$2);
      $$1.d = $$0.cg.a($$2);
      $$1.e = $$0.ch.a($$2);
      $$1.c = $$0.ci.a($$2);
   }
}
