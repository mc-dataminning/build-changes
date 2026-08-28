import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gts extends gsx {
   private static final float a = 0.6666667F;
   private static final ffc b = new ffc(0.0, 0.33333334F, 0.046666667F);
   private final Map<ech, gts.a> c;

   public gts(gte.a $$0) {
      super($$0);
      this.c = ech.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new gts.a(a($$0.f(), $$1, true), a($$0.f(), $$1, false))));
   }

   @Override
   protected ghl a(eat $$0, ech $$1) {
      gts.a $$2 = this.c.get($$1);
      return $$0.b() instanceof duw ? $$2.a() : $$2.b();
   }

   @Override
   protected hlx a(ech $$0) {
      return grl.a($$0);
   }

   @Override
   protected float a() {
      return 0.6666667F;
   }

   @Override
   protected float b() {
      return 0.6666667F;
   }

   private static void a(fkd $$0, float $$1) {
      $$0.a(0.5F, 0.5F, 0.5F);
      $$0.a(a.d.rotationDegrees($$1));
   }

   @Override
   protected void a(fkd $$0, float $$1, eat $$2) {
      a($$0, $$1);
      if (!($$2.b() instanceof duw)) {
         $$0.a(0.0F, -0.3125F, -0.4375F);
      }
   }

   @Override
   protected ffc c() {
      return b;
   }

   public static void a(fkd $$0, gqr $$1, int $$2, int $$3, ghl $$4, hlx $$5) {
      $$0.a();
      a($$0, 0.0F);
      $$0.b(0.6666667F, -0.6666667F, -0.6666667F);
      fkh $$6 = $$5.a($$1, $$4::a);
      $$4.a($$0, $$6, $$2, $$3);
      $$0.b();
   }

   public static ghl a(gjp $$0, ech $$1, boolean $$2) {
      gjr $$3 = $$2 ? gjs.a($$1) : gjs.b($$1);
      return new ghl.a($$0.a($$3), grc::g);
   }

   public static gjz a(boolean $$0) {
      gkb $$1 = new gkb();
      gkd $$2 = $$1.a();
      $$2.a("sign", gjy.c().a(0, 0).a(-12.0F, -14.0F, -1.0F, 24.0F, 12.0F, 2.0F), gjv.a);
      if ($$0) {
         $$2.a("stick", gjy.c().a(0, 14).a(-1.0F, -2.0F, -1.0F, 2.0F, 14.0F, 2.0F), gjv.a);
      }

      return gjz.a($$1, 64, 32);
   }

   static record a(ghl a, ghl b) {
   }
}
