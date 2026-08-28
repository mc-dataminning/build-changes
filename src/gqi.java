import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;

public class gqi extends gqd<cje, gww, gaf> {
   private static final Map<cje.e, alz> a = ae.a(Maps.newHashMap(), $$0 -> {
      for (cje.e $$1 : cje.e.values()) {
         $$0.put($$1, alz.b(String.format(Locale.ROOT, "textures/entity/axolotl/axolotl_%s.png", $$1.b())));
      }
   });

   public gqi(grj.a $$0) {
      super($$0, new gaf($$0.a(geg.m)), new gaf($$0.a(geg.n)), 0.5F);
   }

   public alz a(gww $$0) {
      return a.get($$0.a);
   }

   public gww a() {
      return new gww();
   }

   public void a(cje $$0, gww $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gm();
      $$1.b = $$0.cg.a($$2);
      $$1.d = $$0.ch.a($$2);
      $$1.e = $$0.ci.a($$2);
      $$1.c = $$0.cj.a($$2);
   }
}
