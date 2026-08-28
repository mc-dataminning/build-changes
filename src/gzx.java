import com.google.common.collect.Maps;
import java.util.Map;

public class gzx extends gzo<ckf, hfz, gjb> {
   private final Map<ckg.a, ggm<gjb>> a;

   public gzx(gyi.a $$0) {
      super($$0, new gjb($$0.a(gld.cd)), 0.7F);
      this.a = a($$0);
      this.a(new hcz<>(this, $$0.h(), hng.d.g, $$0x -> $$0x.a, new gjb($$0.a(gld.cq)), new gjb($$0.a(gld.cp))));
   }

   private static Map<ckg.a, ggm<gjb>> a(gyi.a $$0) {
      return Maps.newEnumMap(
         Map.of(ckg.a.a, new ggm<>(new gjb($$0.a(gld.cd)), new gjb($$0.a(gld.co))), ckg.a.b, new ggm<>(new ghp($$0.a(gld.ag)), new ghp($$0.a(gld.ah))))
      );
   }

   public void a(hfz $$0, flo $$1, gsa $$2, int $$3) {
      if ($$0.b != null) {
         this.g = this.a.get($$0.b.b().a()).a($$0.aj);
         super.a($$0, $$1, $$2, $$3);
      }
   }

   public ali a(hfz $$0) {
      return $$0.b == null ? hkp.c() : $$0.b.b().b().b();
   }

   public hfz b() {
      return new hfz();
   }

   public void a(ckf $$0, hfz $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.a(bxd.h).v();
      $$1.b = $$0.t().a();
   }
}
