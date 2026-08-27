public class fvq extends fuh<cds> {
   private final fot f;

   public fvq(ftc.a $$0) {
      super($$0, fhw.bA);
      this.f = $$0.c();
   }

   protected void a(cds $$0, float $$1, dfe $$2, elk $$3, fnz $$4, int $$5) {
      int $$6 = $$0.B();
      if ($$6 > -1 && (float)$$6 - $$1 + 1.0F < 10.0F) {
         float $$7 = 1.0F - ((float)$$6 - $$1 + 1.0F) / 10.0F;
         $$7 = ars.a($$7, 0.0F, 1.0F);
         $$7 *= $$7;
         $$7 *= $$7;
         float $$8 = 1.0F + $$7 * 0.3F;
         $$3.b($$8, $$8, $$8);
      }

      a(this.f, $$2, $$3, $$4, $$5, $$6 > -1 && $$6 / 5 % 2 == 0);
   }

   public static void a(fot $$0, dfe $$1, elk $$2, fnz $$3, int $$4, boolean $$5) {
      int $$6;
      if ($$5) {
         $$6 = fyq.a(fyq.a(1.0F), 10);
      } else {
         $$6 = fyq.d;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6);
   }
}
