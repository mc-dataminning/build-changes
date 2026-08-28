import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;

public class gnk extends gnf<cid, gtw, fxl> {
   private static final Map<cid.e, ali> a = ae.a(Maps.newHashMap(), $$0 -> {
      for (cid.e $$1 : cid.e.values()) {
         $$0.put($$1, ali.b(String.format(Locale.ROOT, "textures/entity/axolotl/axolotl_%s.png", $$1.b())));
      }
   });

   public gnk(gok.a $$0) {
      super($$0, new fxl($$0.a(gbl.k)), new fxl($$0.a(gbl.l)), 0.5F);
   }

   public ali a(gtw $$0) {
      return a.get($$0.a);
   }

   public gtw a() {
      return new gtw();
   }

   public void a(cid $$0, gtw $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gu();
      $$1.b = $$0.cf.a($$2);
      $$1.d = $$0.cg.a($$2);
      $$1.e = $$0.ch.a($$2);
      $$1.c = $$0.ci.a($$2);
   }
}
