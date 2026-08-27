public class fyl extends fxc<cfx> {
   private final fro f;

   public fyl(fvx.a $$0) {
      super($$0, fkn.bA);
      this.f = $$0.c();
   }

   protected void a(cfx $$0, float $$1, dhi $$2, enw $$3, fqu $$4, int $$5) {
      int $$6 = $$0.D();
      if ($$6 > -1 && (float)$$6 - $$1 + 1.0F < 10.0F) {
         float $$7 = 1.0F - ((float)$$6 - $$1 + 1.0F) / 10.0F;
         $$7 = atm.a($$7, 0.0F, 1.0F);
         $$7 *= $$7;
         $$7 *= $$7;
         float $$8 = 1.0F + $$7 * 0.3F;
         $$3.b($$8, $$8, $$8);
      }

      a(this.f, $$2, $$3, $$4, $$5, $$6 > -1 && $$6 / 5 % 2 == 0);
   }

   public static void a(fro $$0, dhi $$1, enw $$2, fqu $$3, int $$4, boolean $$5) {
      int $$6;
      if ($$5) {
         $$6 = gbl.a(gbl.a(1.0F), 10);
      } else {
         $$6 = gbl.d;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6);
   }
}
