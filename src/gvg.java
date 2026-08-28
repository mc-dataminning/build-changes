import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;

public class gvg extends gvb<ckn, hbu, ges> {
   private static final Map<ckn.e, alg> a = af.a(Maps.newHashMap(), $$0 -> {
      for (ckn.e $$1 : ckn.e.values()) {
         $$0.put($$1, alg.b(String.format(Locale.ROOT, "textures/entity/axolotl/axolotl_%s.png", $$1.b())));
      }
   });

   public gvg(gwh.a $$0) {
      super($$0, new ges($$0.a(gjb.m)), new ges($$0.a(gjb.n)), 0.5F);
   }

   public alg a(hbu $$0) {
      return a.get($$0.a);
   }

   public hbu a() {
      return new hbu();
   }

   public void a(ckn $$0, hbu $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.t();
      $$1.b = $$0.bN.a($$2);
      $$1.d = $$0.bO.a($$2);
      $$1.e = $$0.bP.a($$2);
      $$1.c = $$0.bQ.a($$2);
   }
}
