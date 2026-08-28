import com.google.common.collect.Maps;
import java.util.Map;

public class gzk extends gzb<ckq, hfo, gio> {
   private final Map<ckr.a, gfz<gio>> a;

   public gzk(gxv.a $$0) {
      super($$0, new gio($$0.a(gkq.cd)), 0.7F);
      this.a = a($$0);
      this.a(new hcm<>(this, $$0.h(), hmw.d.g, $$0x -> $$0x.a, new gio($$0.a(gkq.cq)), new gio($$0.a(gkq.cp))));
   }

   private static Map<ckr.a, gfz<gio>> a(gxv.a $$0) {
      return Maps.newEnumMap(
         Map.of(ckr.a.a, new gfz<>(new gio($$0.a(gkq.cd)), new gio($$0.a(gkq.co))), ckr.a.b, new gfz<>(new ghc($$0.a(gkq.ag)), new ghc($$0.a(gkq.ah))))
      );
   }

   public void a(hfo $$0, fld $$1, grn $$2, int $$3) {
      if ($$0.b != null) {
         this.g = this.a.get($$0.b.b().a()).a($$0.am);
         super.a($$0, $$1, $$2, $$3);
      }
   }

   public alr a(hfo $$0) {
      return $$0.b == null ? hkf.c() : $$0.b.b().b().b();
   }

   public hfo b() {
      return new hfo();
   }

   public void a(ckq $$0, hfo $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.a(bxo.h).v();
      $$1.b = $$0.p().a();
   }
}
