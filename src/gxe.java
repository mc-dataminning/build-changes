import com.google.common.collect.Maps;
import java.util.Map;

public class gxe extends gzb<ckb, hds, ggy> {
   private final Map<ckc.a, gfz<ggy>> a;

   public gxe(gxv.a $$0) {
      super($$0, new ggy($$0.a(gkq.Z)), 0.3F);
      this.a = a($$0);
   }

   private static Map<ckc.a, gfz<ggy>> a(gxv.a $$0) {
      return Maps.newEnumMap(
         Map.of(ckc.a.a, new gfz<>(new ggy($$0.a(gkq.Z)), new ggy($$0.a(gkq.aa))), ckc.a.b, new gfz<>(new gha($$0.a(gkq.ac)), new gha($$0.a(gkq.ad))))
      );
   }

   public void a(hds $$0, fld $$1, grn $$2, int $$3) {
      if ($$0.c != null) {
         this.g = this.a.get($$0.c.b().a()).a($$0.am);
         super.a($$0, $$1, $$2, $$3);
      }
   }

   public alr a(hds $$0) {
      return $$0.c == null ? hkf.c() : $$0.c.b().b().b();
   }

   public hds a() {
      return new hds();
   }

   public void a(ckb $$0, hds $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = azz.h($$2, $$0.bM, $$0.bI);
      $$1.b = azz.h($$2, $$0.bK, $$0.bJ);
      $$1.c = $$0.t().a();
   }
}
