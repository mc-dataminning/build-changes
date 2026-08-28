public class got extends gni<buq, gup> {
   private static final float a = 40.0F;
   private static final int b = 50;
   private final goh h;

   protected got(gnj.a $$0) {
      super($$0);
      this.h = $$0.b();
   }

   public alc a(gup $$0) {
      return gxa.d;
   }

   public gup a() {
      return new gup();
   }

   public void a(buq $$0, gup $$1, float $$2) {
      super.a($$0, $$1, $$2);
      cvp $$3 = $$0.o();
      $$1.b = $$3.u();
      $$1.a = !$$3.f() ? this.h.a($$3, $$0.dS(), null, 0) : null;
   }

   public void a(gup $$0, fde $$1, ghg $$2, int $$3) {
      gzd $$4 = $$0.a;
      if ($$4 != null) {
         $$1.a();
         if ($$0.p <= 50.0F) {
            float $$5 = Math.min($$0.p, 50.0F) / 50.0F;
            $$1.b($$5, $$5, $$5);
         }

         float $$6 = azd.g($$0.p * 40.0F);
         $$1.a(a.d.rotationDegrees($$6));
         gof.a(this.h, $$1, $$2, 15728880, $$0.b, $$4, $$4.b(), azl.a());
         $$1.b();
      }
   }
}
