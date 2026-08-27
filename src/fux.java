public class fux extends fto<cdo> {
   private final fnz f;

   public fux(fsj.a $$0) {
      super($$0, fhi.bA);
      this.f = $$0.c();
   }

   protected void a(cdo $$0, float $$1, dey $$2, elh $$3, fng $$4, int $$5) {
      int $$6 = $$0.B();
      if ($$6 > -1 && (float)$$6 - $$1 + 1.0F < 10.0F) {
         float $$7 = 1.0F - ((float)$$6 - $$1 + 1.0F) / 10.0F;
         $$7 = aro.a($$7, 0.0F, 1.0F);
         $$7 *= $$7;
         $$7 *= $$7;
         float $$8 = 1.0F + $$7 * 0.3F;
         $$3.b($$8, $$8, $$8);
      }

      a(this.f, $$2, $$3, $$4, $$5, $$6 > -1 && $$6 / 5 % 2 == 0);
   }

   public static void a(fnz $$0, dey $$1, elh $$2, fng $$3, int $$4, boolean $$5) {
      int $$6;
      if ($$5) {
         $$6 = fxx.a(fxx.a(1.0F), 10);
      } else {
         $$6 = fxx.d;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6);
   }
}
