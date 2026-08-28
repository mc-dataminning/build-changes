import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;

public class gqk extends gqf<cja, gwy, gaf> {
   private static final Map<cja.e, alp> a = ae.a(Maps.newHashMap(), $$0 -> {
      for (cja.e $$1 : cja.e.values()) {
         $$0.put($$1, alp.b(String.format(Locale.ROOT, "textures/entity/axolotl/axolotl_%s.png", $$1.b())));
      }
   });

   public gqk(grl.a $$0) {
      super($$0, new gaf($$0.a(gei.m)), new gaf($$0.a(gei.n)), 0.5F);
   }

   public alp a(gwy $$0) {
      return a.get($$0.a);
   }

   public gwy a() {
      return new gwy();
   }

   public void a(cja $$0, gwy $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.go();
      $$1.b = $$0.cg.a($$2);
      $$1.d = $$0.ch.a($$2);
      $$1.e = $$0.ci.a($$2);
      $$1.c = $$0.cj.a($$2);
   }
}
