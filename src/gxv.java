import com.google.common.collect.Maps;
import java.util.Map;

public class gxv extends gzq<cjw, hei, ghs> {
   private final Map<cjx.a, ggo<ghs>> a;

   public gxv(gyk.a $$0) {
      super($$0, new ghs($$0.a(glf.an)), 0.7F);
      this.a = a($$0);
   }

   private static Map<cjx.a, ggo<ghs>> a(gyk.a $$0) {
      return Maps.newEnumMap(
         Map.of(
            cjx.a.a,
            new ggo<>(new ghs($$0.a(glf.an)), new ghs($$0.a(glf.ao))),
            cjx.a.c,
            new ggo<>(new ghs($$0.a(glf.dQ)), new ghs($$0.a(glf.dR))),
            cjx.a.b,
            new ggo<>(new ghs($$0.a(glf.ae)), new ghs($$0.a(glf.af)))
         )
      );
   }

   public alk a(hei $$0) {
      return $$0.a == null ? hkr.c() : $$0.a.b().b().b();
   }

   public hei a() {
      return new hei();
   }

   public void a(cjw $$0, hei $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.t().a();
   }

   public void a(hei $$0, flq $$1, gsc $$2, int $$3) {
      if ($$0.a != null) {
         this.g = this.a.get($$0.a.b().a()).a($$0.aj);
         super.a($$0, $$1, $$2, $$3);
      }
   }
}
