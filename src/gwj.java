import com.google.common.collect.Maps;
import java.util.Map;

public class gwj extends gye<cjj, hcw, ggf> {
   private final Map<cjk.a, gfb<ggf>> a;

   public gwj(gwy.a $$0) {
      super($$0, new ggf($$0.a(gjs.an)), 0.7F);
      this.a = a($$0);
   }

   private static Map<cjk.a, gfb<ggf>> a(gwy.a $$0) {
      return Maps.newEnumMap(
         Map.of(
            cjk.a.a,
            new gfb<>(new ggf($$0.a(gjs.an)), new ggf($$0.a(gjs.ao))),
            cjk.a.c,
            new gfb<>(new ggf($$0.a(gjs.dQ)), new ggf($$0.a(gjs.dR))),
            cjk.a.b,
            new gfb<>(new ggf($$0.a(gjs.ae)), new ggf($$0.a(gjs.af)))
         )
      );
   }

   public alg a(hcw $$0) {
      return $$0.a == null ? hjf.c() : $$0.a.b().b().b();
   }

   public hcw a() {
      return new hcw();
   }

   public void a(cjj $$0, hcw $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.t().a();
   }

   public void a(hcw $$0, fkd $$1, gqr $$2, int $$3) {
      if ($$0.a != null) {
         this.g = this.a.get($$0.a.b().a()).a($$0.aj);
         super.a($$0, $$1, $$2, $$3);
      }
   }
}
