public class gdh extends gar<cdt> {
   private final fwf a;

   public gdh(gas.a $$0) {
      super($$0);
      this.d = 0.5F;
      this.a = $$0.c();
   }

   public void a(cdt $$0, float $$1, float $$2, esa $$3, fvl $$4, int $$5) {
      $$3.a();
      $$3.a(0.0F, 0.5F, 0.0F);
      int $$6 = $$0.s();
      if ((float)$$6 - $$2 + 1.0F < 10.0F) {
         float $$7 = 1.0F - ((float)$$6 - $$2 + 1.0F) / 10.0F;
         $$7 = awh.a($$7, 0.0F, 1.0F);
         $$7 *= $$7;
         $$7 *= $$7;
         float $$8 = 1.0F + $$7 * 0.3F;
         $$3.b($$8, $$8, $$8);
      }

      $$3.a(a.d.rotationDegrees(-90.0F));
      $$3.a(-0.5F, -0.5F, 0.5F);
      $$3.a(a.d.rotationDegrees(90.0F));
      gdg.a(this.a, $$0.u(), $$3, $$4, $$5, $$6 / 5 % 2 == 0);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public aiy a(cdt $$0) {
      return ggs.e;
   }
}
