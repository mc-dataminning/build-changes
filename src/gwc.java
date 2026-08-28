import com.google.common.collect.Maps;
import java.util.Map;

public class gwc extends gxz<cjf, hcp, gfv> {
   private final Map<cjg.a, gew<gfv>> a;

   public gwc(gwt.a $$0) {
      super($$0, new gfv($$0.a(gjn.Z)), 0.3F);
      this.a = a($$0);
   }

   private static Map<cjg.a, gew<gfv>> a(gwt.a $$0) {
      return Maps.newEnumMap(
         Map.of(cjg.a.a, new gew<>(new gfv($$0.a(gjn.Z)), new gfv($$0.a(gjn.aa))), cjg.a.b, new gew<>(new gfx($$0.a(gjn.ac)), new gfx($$0.a(gjn.ad))))
      );
   }

   public void a(hcp $$0, fjy $$1, gqm $$2, int $$3) {
      if ($$0.c != null) {
         this.g = this.a.get($$0.c.b().a()).a($$0.aj);
         super.a($$0, $$1, $$2, $$3);
      }
   }

   public alg a(hcp $$0) {
      return $$0.c == null ? hiz.c() : $$0.c.b().b().b();
   }

   public hcp a() {
      return new hcp();
   }

   public void a(cjf $$0, hcp $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = azm.h($$2, $$0.bK, $$0.bG);
      $$1.b = azm.h($$2, $$0.bI, $$0.bH);
      $$1.c = $$0.t().a();
   }
}
