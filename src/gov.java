import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gov extends gob {
   private static final float a = 0.6666667F;
   private static final fay b = new fay(0.0, 0.33333334F, 0.046666667F);
   private final Map<dyh, gov.a> c;

   public gov(goi.a $$0) {
      super($$0);
      this.c = dyh.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new gov.a(a($$0.f(), $$1, true), a($$0.f(), $$1, false))));
   }

   @Override
   protected gct a(dwv $$0, dyh $$1) {
      gov.a $$2 = this.c.get($$1);
      return $$0.b() instanceof drk ? $$2.a() : $$2.b();
   }

   @Override
   protected hgt a(dyh $$0) {
      return gmq.a($$0);
   }

   @Override
   protected float a() {
      return 0.6666667F;
   }

   @Override
   protected float b() {
      return 0.6666667F;
   }

   private static void a(ffs $$0, float $$1) {
      $$0.a(0.5F, 0.5F, 0.5F);
      $$0.a(a.d.rotationDegrees($$1));
   }

   @Override
   protected void a(ffs $$0, float $$1, dwv $$2) {
      a($$0, $$1);
      if (!($$2.b() instanceof drk)) {
         $$0.a(0.0F, -0.3125F, -0.4375F);
      }
   }

   @Override
   protected fay c() {
      return b;
   }

   public static void a(ffs $$0, glv $$1, int $$2, int $$3, gct $$4, hgt $$5) {
      $$0.a();
      a($$0, 0.0F);
      $$0.b(0.6666667F, -0.6666667F, -0.6666667F);
      ffw $$6 = $$5.a($$1, $$4::a);
      $$4.a($$0, $$6, $$2, $$3);
      $$0.b();
   }

   public static gct a(gew $$0, dyh $$1, boolean $$2) {
      gey $$3 = $$2 ? gez.a($$1) : gez.b($$1);
      return new gct.a($$0.a($$3), gmf::g);
   }

   public static gfg a(boolean $$0) {
      gfi $$1 = new gfi();
      gfk $$2 = $$1.a();
      $$2.a("sign", gff.c().a(0, 0).a(-12.0F, -14.0F, -1.0F, 24.0F, 12.0F, 2.0F), gfc.a);
      if ($$0) {
         $$2.a("stick", gff.c().a(0, 14).a(-1.0F, -2.0F, -1.0F, 2.0F, 14.0F, 2.0F), gfc.a);
      }

      return gfg.a($$1, 64, 32);
   }

   static record a(gct a, gct b) {
   }
}
