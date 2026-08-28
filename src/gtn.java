import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gtn extends gss {
   private static final float a = 0.6666667F;
   private static final fex b = new fex(0.0, 0.33333334F, 0.046666667F);
   private final Map<ecc, gtn.a> c;

   public gtn(gsz.a $$0) {
      super($$0);
      this.c = ecc.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new gtn.a(a($$0.f(), $$1, true), a($$0.f(), $$1, false))));
   }

   @Override
   protected ghg a(eao $$0, ecc $$1) {
      gtn.a $$2 = this.c.get($$1);
      return $$0.b() instanceof dur ? $$2.a() : $$2.b();
   }

   @Override
   protected hlq a(ecc $$0) {
      return grg.a($$0);
   }

   @Override
   protected float a() {
      return 0.6666667F;
   }

   @Override
   protected float b() {
      return 0.6666667F;
   }

   private static void a(fjy $$0, float $$1) {
      $$0.a(0.5F, 0.5F, 0.5F);
      $$0.a(a.d.rotationDegrees($$1));
   }

   @Override
   protected void a(fjy $$0, float $$1, eao $$2) {
      a($$0, $$1);
      if (!($$2.b() instanceof dur)) {
         $$0.a(0.0F, -0.3125F, -0.4375F);
      }
   }

   @Override
   protected fex c() {
      return b;
   }

   public static void a(fjy $$0, gqm $$1, int $$2, int $$3, ghg $$4, hlq $$5) {
      $$0.a();
      a($$0, 0.0F);
      $$0.b(0.6666667F, -0.6666667F, -0.6666667F);
      fkc $$6 = $$5.a($$1, $$4::a);
      $$4.a($$0, $$6, $$2, $$3);
      $$0.b();
   }

   public static ghg a(gjk $$0, ecc $$1, boolean $$2) {
      gjm $$3 = $$2 ? gjn.a($$1) : gjn.b($$1);
      return new ghg.a($$0.a($$3), gqx::g);
   }

   public static gju a(boolean $$0) {
      gjw $$1 = new gjw();
      gjy $$2 = $$1.a();
      $$2.a("sign", gjt.c().a(0, 0).a(-12.0F, -14.0F, -1.0F, 24.0F, 12.0F, 2.0F), gjq.a);
      if ($$0) {
         $$2.a("stick", gjt.c().a(0, 14).a(-1.0F, -2.0F, -1.0F, 2.0F, 14.0F, 2.0F), gjq.a);
      }

      return gju.a($$1, 64, 32);
   }

   static record a(ghg a, ghg b) {
   }
}
