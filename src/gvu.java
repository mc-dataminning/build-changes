import com.google.common.collect.Maps;
import java.util.Map;

public class gvu extends gvl<cix, hbu, gfb> {
   private final Map<ciy.a, gco<gfb>> a;

   public gvu(guf.a $$0) {
      super($$0, new gfb($$0.a(ghc.bZ)), 0.7F);
      this.a = a($$0);
      this.a(new gyv<>(this, $$0.h(), hiy.d.g, $$0x -> $$0x.a, new gfb($$0.a(ghc.cm)), new gfb($$0.a(ghc.cl))));
   }

   private static Map<ciy.a, gco<gfb>> a(guf.a $$0) {
      return Maps.newEnumMap(
         Map.of(ciy.a.a, new gco<>(new gfb($$0.a(ghc.bZ)), new gfb($$0.a(ghc.ck))), ciy.a.b, new gco<>(new gdp($$0.a(ghc.ac)), new gdp($$0.a(ghc.ad))))
      );
   }

   public void a(hbu $$0, fho $$1, gny $$2, int $$3) {
      if ($$0.b != null) {
         this.g = this.a.get($$0.b.a()).a($$0.aj);
         super.a($$0, $$1, $$2, $$3);
      }
   }

   public ald a(hbu $$0) {
      return $$0.b == null ? hgh.c() : $$0.b.b();
   }

   public hbu b() {
      return new hbu();
   }

   public void a(cix $$0, hbu $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.a(bwc.h).v();
      $$1.b = $$0.t().a();
   }
}
