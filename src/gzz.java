import com.google.common.collect.Maps;
import java.util.Map;

public class gzz extends gzq<ckh, hgb, gjd> {
   private final Map<cki.a, ggo<gjd>> a;

   public gzz(gyk.a $$0) {
      super($$0, new gjd($$0.a(glf.cd)), 0.7F);
      this.a = a($$0);
      this.a(new hdb<>(this, $$0.h(), hni.d.g, $$0x -> $$0x.a, new gjd($$0.a(glf.cq)), new gjd($$0.a(glf.cp))));
   }

   private static Map<cki.a, ggo<gjd>> a(gyk.a $$0) {
      return Maps.newEnumMap(
         Map.of(cki.a.a, new ggo<>(new gjd($$0.a(glf.cd)), new gjd($$0.a(glf.co))), cki.a.b, new ggo<>(new ghr($$0.a(glf.ag)), new ghr($$0.a(glf.ah))))
      );
   }

   public void a(hgb $$0, flq $$1, gsc $$2, int $$3) {
      if ($$0.b != null) {
         this.g = this.a.get($$0.b.b().a()).a($$0.aj);
         super.a($$0, $$1, $$2, $$3);
      }
   }

   public alk a(hgb $$0) {
      return $$0.b == null ? hkr.c() : $$0.b.b().b().b();
   }

   public hgb b() {
      return new hgb();
   }

   public void a(ckh $$0, hgb $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.a(bxf.h).v();
      $$1.b = $$0.t().a();
   }
}
