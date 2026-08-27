public class gki extends giy<cof> {
   private final gde f;

   public gki(ght.a $$0) {
      super($$0, fvv.bG);
      this.f = $$0.c();
   }

   protected void a(cof $$0, float $$1, drd $$2, eyu $$3, gck $$4, int $$5) {
      int $$6 = $$0.C();
      if ($$6 > -1 && (float)$$6 - $$1 + 1.0F < 10.0F) {
         float $$7 = 1.0F - ((float)$$6 - $$1 + 1.0F) / 10.0F;
         $$7 = ayf.a($$7, 0.0F, 1.0F);
         $$7 *= $$7;
         $$7 *= $$7;
         float $$8 = 1.0F + $$7 * 0.3F;
         $$3.b($$8, $$8, $$8);
      }

      a(this.f, $$2, $$3, $$4, $$5, $$6 > -1 && $$6 / 5 % 2 == 0);
   }

   public static void a(gde $$0, drd $$1, eyu $$2, gck $$3, int $$4, boolean $$5) {
      int $$6;
      if ($$5) {
         $$6 = gnm.a(gnm.a(1.0F), 10);
      } else {
         $$6 = gnm.d;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6);
   }
}
