import com.google.common.collect.Maps;
import java.util.Map;

public class gwe extends gxz<cjj, hcq, gga> {
   private final Map<cjk.a, gew<gga>> a;

   public gwe(gwt.a $$0) {
      super($$0, new gga($$0.a(gjn.an)), 0.7F);
      this.a = a($$0);
   }

   private static Map<cjk.a, gew<gga>> a(gwt.a $$0) {
      return Maps.newEnumMap(
         Map.of(
            cjk.a.a,
            new gew<>(new gga($$0.a(gjn.an)), new gga($$0.a(gjn.ao))),
            cjk.a.c,
            new gew<>(new gga($$0.a(gjn.dO)), new gga($$0.a(gjn.dP))),
            cjk.a.b,
            new gew<>(new gga($$0.a(gjn.ae)), new gga($$0.a(gjn.af)))
         )
      );
   }

   public alg a(hcq $$0) {
      return $$0.a == null ? hiz.c() : $$0.a.b().b().b();
   }

   public hcq a() {
      return new hcq();
   }

   public void a(cjj $$0, hcq $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.t().a();
   }

   public void a(hcq $$0, fjy $$1, gqm $$2, int $$3) {
      if ($$0.a != null) {
         this.g = this.a.get($$0.a.b().a()).a($$0.aj);
         super.a($$0, $$1, $$2, $$3);
      }
   }
}
