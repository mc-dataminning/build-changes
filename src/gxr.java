import com.google.common.collect.Maps;
import java.util.Map;

public class gxr extends gzo<cjq, hef, ghl> {
   private final Map<cjr.a, ggm<ghl>> a;

   public gxr(gyi.a $$0) {
      super($$0, new ghl($$0.a(gld.Z)), 0.3F);
      this.a = a($$0);
   }

   private static Map<cjr.a, ggm<ghl>> a(gyi.a $$0) {
      return Maps.newEnumMap(
         Map.of(cjr.a.a, new ggm<>(new ghl($$0.a(gld.Z)), new ghl($$0.a(gld.aa))), cjr.a.b, new ggm<>(new ghn($$0.a(gld.ac)), new ghn($$0.a(gld.ad))))
      );
   }

   public void a(hef $$0, flo $$1, gsa $$2, int $$3) {
      if ($$0.c != null) {
         this.g = this.a.get($$0.c.b().a()).a($$0.aj);
         super.a($$0, $$1, $$2, $$3);
      }
   }

   public ali a(hef $$0) {
      return $$0.c == null ? hkp.c() : $$0.c.b().b().b();
   }

   public hef a() {
      return new hef();
   }

   public void a(cjq $$0, hef $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = azo.h($$2, $$0.bM, $$0.bI);
      $$1.b = azo.h($$2, $$0.bK, $$0.bJ);
      $$1.c = $$0.t().a();
   }
}
