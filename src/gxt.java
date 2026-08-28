import com.google.common.collect.Maps;
import java.util.Map;

public class gxt extends gzo<cju, heg, ghq> {
   private final Map<cjv.a, ggm<ghq>> a;

   public gxt(gyi.a $$0) {
      super($$0, new ghq($$0.a(gld.an)), 0.7F);
      this.a = a($$0);
   }

   private static Map<cjv.a, ggm<ghq>> a(gyi.a $$0) {
      return Maps.newEnumMap(
         Map.of(
            cjv.a.a,
            new ggm<>(new ghq($$0.a(gld.an)), new ghq($$0.a(gld.ao))),
            cjv.a.c,
            new ggm<>(new ghq($$0.a(gld.dQ)), new ghq($$0.a(gld.dR))),
            cjv.a.b,
            new ggm<>(new ghq($$0.a(gld.ae)), new ghq($$0.a(gld.af)))
         )
      );
   }

   public ali a(heg $$0) {
      return $$0.a == null ? hkp.c() : $$0.a.b().b().b();
   }

   public heg a() {
      return new heg();
   }

   public void a(cju $$0, heg $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.t().a();
   }

   public void a(heg $$0, flo $$1, gsa $$2, int $$3) {
      if ($$0.a != null) {
         this.g = this.a.get($$0.a.b().a()).a($$0.aj);
         super.a($$0, $$1, $$2, $$3);
      }
   }
}
