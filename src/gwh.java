import com.google.common.collect.Maps;
import java.util.Map;

public class gwh extends gye<cjf, hcv, gga> {
   private final Map<cjg.a, gfb<gga>> a;

   public gwh(gwy.a $$0) {
      super($$0, new gga($$0.a(gjs.Z)), 0.3F);
      this.a = a($$0);
   }

   private static Map<cjg.a, gfb<gga>> a(gwy.a $$0) {
      return Maps.newEnumMap(
         Map.of(cjg.a.a, new gfb<>(new gga($$0.a(gjs.Z)), new gga($$0.a(gjs.aa))), cjg.a.b, new gfb<>(new ggc($$0.a(gjs.ac)), new ggc($$0.a(gjs.ad))))
      );
   }

   public void a(hcv $$0, fkd $$1, gqr $$2, int $$3) {
      if ($$0.c != null) {
         this.g = this.a.get($$0.c.b().a()).a($$0.aj);
         super.a($$0, $$1, $$2, $$3);
      }
   }

   public alg a(hcv $$0) {
      return $$0.c == null ? hjf.c() : $$0.c.b().b().b();
   }

   public hcv a() {
      return new hcv();
   }

   public void a(cjf $$0, hcv $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = azm.h($$2, $$0.bK, $$0.bG);
      $$1.b = azm.h($$2, $$0.bI, $$0.bH);
      $$1.c = $$0.t().a();
   }
}
