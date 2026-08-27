public class gnj extends gkp<cih> {
   private final gga a;

   public gnj(gkq.a $$0) {
      super($$0);
      this.e = 0.5F;
      this.a = $$0.c();
   }

   public void a(cih $$0, float $$1, float $$2, fbc $$3, gfg $$4, int $$5) {
      $$3.a();
      $$3.a(0.0F, 0.5F, 0.0F);
      int $$6 = $$0.r();
      if ((float)$$6 - $$2 + 1.0F < 10.0F) {
         float $$7 = 1.0F - ((float)$$6 - $$2 + 1.0F) / 10.0F;
         $$7 = aym.a($$7, 0.0F, 1.0F);
         $$7 *= $$7;
         $$7 *= $$7;
         float $$8 = 1.0F + $$7 * 0.3F;
         $$3.b($$8, $$8, $$8);
      }

      $$3.a(a.d.rotationDegrees(-90.0F));
      $$3.a(-0.5F, -0.5F, 0.5F);
      $$3.a(a.d.rotationDegrees(90.0F));
      gni.a(this.a, $$0.u(), $$3, $$4, $$5, $$6 / 5 % 2 == 0);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public akt a(cih $$0) {
      return gqx.e;
   }
}
