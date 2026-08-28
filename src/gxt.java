import com.google.common.collect.Maps;
import java.util.Map;

public class gxt extends gzq<cjs, heh, ghn> {
   private final Map<cjt.a, ggo<ghn>> a;

   public gxt(gyk.a $$0) {
      super($$0, new ghn($$0.a(glf.Z)), 0.3F);
      this.a = a($$0);
   }

   private static Map<cjt.a, ggo<ghn>> a(gyk.a $$0) {
      return Maps.newEnumMap(
         Map.of(cjt.a.a, new ggo<>(new ghn($$0.a(glf.Z)), new ghn($$0.a(glf.aa))), cjt.a.b, new ggo<>(new ghp($$0.a(glf.ac)), new ghp($$0.a(glf.ad))))
      );
   }

   public void a(heh $$0, flq $$1, gsc $$2, int $$3) {
      if ($$0.c != null) {
         this.g = this.a.get($$0.c.b().a()).a($$0.aj);
         super.a($$0, $$1, $$2, $$3);
      }
   }

   public alk a(heh $$0) {
      return $$0.c == null ? hkr.c() : $$0.c.b().b().b();
   }

   public heh a() {
      return new heh();
   }

   public void a(cjs $$0, heh $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = azq.h($$2, $$0.bM, $$0.bI);
      $$1.b = azq.h($$2, $$0.bK, $$0.bJ);
      $$1.c = $$0.t().a();
   }
}
