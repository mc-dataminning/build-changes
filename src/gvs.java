import com.google.common.collect.Maps;
import java.util.Map;

public class gvs extends gxn<cje, hce, gfo> {
   private final Map<cjf.a, gek<gfo>> a;

   public gvs(gwh.a $$0) {
      super($$0, new gfo($$0.a(gjb.an)), 0.7F);
      this.a = a($$0);
   }

   private static Map<cjf.a, gek<gfo>> a(gwh.a $$0) {
      return Maps.newEnumMap(
         Map.of(
            cjf.a.a,
            new gek<>(new gfo($$0.a(gjb.an)), new gfo($$0.a(gjb.ao))),
            cjf.a.c,
            new gek<>(new gfo($$0.a(gjb.dO)), new gfo($$0.a(gjb.dP))),
            cjf.a.b,
            new gek<>(new gfo($$0.a(gjb.ae)), new gfo($$0.a(gjb.af)))
         )
      );
   }

   public alg a(hce $$0) {
      return $$0.a == null ? him.c() : $$0.a.b().b().b();
   }

   public hce a() {
      return new hce();
   }

   public void a(cje $$0, hce $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.t().a();
   }

   public void a(hce $$0, fjj $$1, gqa $$2, int $$3) {
      if ($$0.a != null) {
         this.g = this.a.get($$0.a.b().a()).a($$0.aj);
         super.a($$0, $$1, $$2, $$3);
      }
   }
}
