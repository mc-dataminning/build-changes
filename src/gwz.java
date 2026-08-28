import com.google.common.collect.Maps;
import java.util.Map;

public class gwz extends gwq<cjf, hcz, gge> {
   private final Map<cjg.a, gdr<gge>> a;

   public gwz(gvk.a $$0) {
      super($$0, new gge($$0.a(gif.bZ)), 0.7F);
      this.a = a($$0);
      this.a(new haa<>(this, $$0.h(), hkf.d.g, $$0x -> $$0x.a, new gge($$0.a(gif.cm)), new gge($$0.a(gif.cl))));
   }

   private static Map<cjg.a, gdr<gge>> a(gvk.a $$0) {
      return Maps.newEnumMap(
         Map.of(cjg.a.a, new gdr<>(new gge($$0.a(gif.bZ)), new gge($$0.a(gif.ck))), cjg.a.b, new gdr<>(new ges($$0.a(gif.ac)), new ges($$0.a(gif.ad))))
      );
   }

   public void a(hcz $$0, fiq $$1, gpd $$2, int $$3) {
      if ($$0.b != null) {
         this.g = this.a.get($$0.b.b().a()).a($$0.aj);
         super.a($$0, $$1, $$2, $$3);
      }
   }

   public ale a(hcz $$0) {
      return $$0.b == null ? hho.c() : $$0.b.b().b().b();
   }

   public hcz b() {
      return new hcz();
   }

   public void a(cjf $$0, hcz $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.a(bwk.h).v();
      $$1.b = $$0.t().a();
   }
}
