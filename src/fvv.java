public class fvv extends fum<cdx> {
   private final foy f;

   public fvv(fth.a $$0) {
      super($$0, fib.bA);
      this.f = $$0.c();
   }

   protected void a(cdx $$0, float $$1, dfj $$2, elp $$3, foe $$4, int $$5) {
      int $$6 = $$0.H();
      if ($$6 > -1 && (float)$$6 - $$1 + 1.0F < 10.0F) {
         float $$7 = 1.0F - ((float)$$6 - $$1 + 1.0F) / 10.0F;
         $$7 = arw.a($$7, 0.0F, 1.0F);
         $$7 *= $$7;
         $$7 *= $$7;
         float $$8 = 1.0F + $$7 * 0.3F;
         $$3.b($$8, $$8, $$8);
      }

      a(this.f, $$2, $$3, $$4, $$5, $$6 > -1 && $$6 / 5 % 2 == 0);
   }

   public static void a(foy $$0, dfj $$1, elp $$2, foe $$3, int $$4, boolean $$5) {
      int $$6;
      if ($$5) {
         $$6 = fyv.a(fyv.a(1.0F), 10);
      } else {
         $$6 = fyv.d;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6);
   }
}
