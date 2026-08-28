public class gpz extends gni<ckf, gvp> {
   private final gij a;

   public gpz(gnj.a $$0) {
      super($$0);
      this.f = 0.5F;
      this.a = $$0.d();
   }

   public void a(gvp $$0, fde $$1, ghg $$2, int $$3) {
      $$1.a();
      $$1.a(0.0F, 0.5F, 0.0F);
      float $$4 = $$0.a;
      if ($$0.a < 10.0F) {
         float $$5 = 1.0F - $$0.a / 10.0F;
         $$5 = azd.a($$5, 0.0F, 1.0F);
         $$5 *= $$5;
         $$5 *= $$5;
         float $$6 = 1.0F + $$5 * 0.3F;
         $$1.b($$6, $$6, $$6);
      }

      $$1.a(a.d.rotationDegrees(-90.0F));
      $$1.a(-0.5F, -0.5F, 0.5F);
      $$1.a(a.d.rotationDegrees(90.0F));
      if ($$0.b != null) {
         gpy.a(this.a, $$0.b, $$1, $$2, $$3, (int)$$4 / 5 % 2 == 0);
      }

      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public alc a(gvp $$0) {
      return gxa.d;
   }

   public gvp a() {
      return new gvp();
   }

   public void a(ckf $$0, gvp $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = (float)$$0.o() - $$2 + 1.0F;
      $$1.b = $$0.q();
   }
}
