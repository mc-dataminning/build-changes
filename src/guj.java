import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;

public class guj extends gue<ckd, hax, gdz> {
   private static final Map<ckd.e, ale> a = af.a(Maps.newHashMap(), $$0 -> {
      for (ckd.e $$1 : ckd.e.values()) {
         $$0.put($$1, ale.b(String.format(Locale.ROOT, "textures/entity/axolotl/axolotl_%s.png", $$1.b())));
      }
   });

   public guj(gvk.a $$0) {
      super($$0, new gdz($$0.a(gif.m)), new gdz($$0.a(gif.n)), 0.5F);
   }

   public ale a(hax $$0) {
      return a.get($$0.a);
   }

   public hax a() {
      return new hax();
   }

   public void a(ckd $$0, hax $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.t();
      $$1.b = $$0.bM.a($$2);
      $$1.d = $$0.bN.a($$2);
      $$1.e = $$0.bO.a($$2);
      $$1.c = $$0.bP.a($$2);
   }
}
