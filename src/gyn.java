import com.google.common.collect.Maps;
import java.util.Map;

public class gyn extends gye<cju, hep, ghq> {
   private final Map<cjv.a, gfb<ghq>> a;

   public gyn(gwy.a $$0) {
      super($$0, new ghq($$0.a(gjs.cd)), 0.7F);
      this.a = a($$0);
      this.a(new hbp<>(this, $$0.h(), hlw.d.g, $$0x -> $$0x.a, new ghq($$0.a(gjs.cq)), new ghq($$0.a(gjs.cp))));
   }

   private static Map<cjv.a, gfb<ghq>> a(gwy.a $$0) {
      return Maps.newEnumMap(
         Map.of(cjv.a.a, new gfb<>(new ghq($$0.a(gjs.cd)), new ghq($$0.a(gjs.co))), cjv.a.b, new gfb<>(new gge($$0.a(gjs.ag)), new gge($$0.a(gjs.ah))))
      );
   }

   public void a(hep $$0, fkd $$1, gqr $$2, int $$3) {
      if ($$0.b != null) {
         this.g = this.a.get($$0.b.b().a()).a($$0.aj);
         super.a($$0, $$1, $$2, $$3);
      }
   }

   public alg a(hep $$0) {
      return $$0.b == null ? hjf.c() : $$0.b.b().b().b();
   }

   public hep b() {
      return new hep();
   }

   public void a(cju $$0, hep $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.a(bws.h).v();
      $$1.b = $$0.t().a();
   }
}
