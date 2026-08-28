import com.google.common.collect.Maps;
import java.util.Map;

public class gxg extends gzb<ckf, hdt, ghd> {
   private final Map<ckg.a, gfz<ghd>> a;

   public gxg(gxv.a $$0) {
      super($$0, new ghd($$0.a(gkq.an)), 0.7F);
      this.a = a($$0);
   }

   private static Map<ckg.a, gfz<ghd>> a(gxv.a $$0) {
      return Maps.newEnumMap(
         Map.of(
            ckg.a.a,
            new gfz<>(new ghd($$0.a(gkq.an)), new ghd($$0.a(gkq.ao))),
            ckg.a.c,
            new gfz<>(new ghd($$0.a(gkq.dQ)), new ghd($$0.a(gkq.dR))),
            ckg.a.b,
            new gfz<>(new ghd($$0.a(gkq.ae)), new ghd($$0.a(gkq.af)))
         )
      );
   }

   public alr a(hdt $$0) {
      return $$0.a == null ? hkf.c() : $$0.a.b().b().b();
   }

   public hdt a() {
      return new hdt();
   }

   public void a(ckf $$0, hdt $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.t().a();
   }

   public void a(hdt $$0, fld $$1, grn $$2, int $$3) {
      if ($$0.a != null) {
         this.g = this.a.get($$0.a.b().a()).a($$0.am);
         super.a($$0, $$1, $$2, $$3);
      }
   }
}
