import com.google.common.collect.Maps;
import java.util.Map;

public class gvq extends gxn<cja, hcd, gfj> {
   private final Map<cjb.a, gek<gfj>> a;

   public gvq(gwh.a $$0) {
      super($$0, new gfj($$0.a(gjb.Z)), 0.3F);
      this.a = a($$0);
   }

   private static Map<cjb.a, gek<gfj>> a(gwh.a $$0) {
      return Maps.newEnumMap(
         Map.of(cjb.a.a, new gek<>(new gfj($$0.a(gjb.Z)), new gfj($$0.a(gjb.aa))), cjb.a.b, new gek<>(new gfl($$0.a(gjb.ac)), new gfl($$0.a(gjb.ad))))
      );
   }

   public void a(hcd $$0, fjj $$1, gqa $$2, int $$3) {
      if ($$0.c != null) {
         this.g = this.a.get($$0.c.b().a()).a($$0.aj);
         super.a($$0, $$1, $$2, $$3);
      }
   }

   public alg a(hcd $$0) {
      return $$0.c == null ? him.c() : $$0.c.b().b().b();
   }

   public hcd a() {
      return new hcd();
   }

   public void a(cja $$0, hcd $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = azm.h($$2, $$0.bK, $$0.bG);
      $$1.b = azm.h($$2, $$0.bI, $$0.bH);
      $$1.c = $$0.t().a();
   }
}
