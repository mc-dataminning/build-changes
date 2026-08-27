public class gem extends gdd<ckf> {
   private final fxk f;

   public gem(gby.a $$0) {
      super($$0, fqe.bC);
      this.f = $$0.c();
   }

   protected void a(ckf $$0, float $$1, dme $$2, etd $$3, fwq $$4, int $$5) {
      int $$6 = $$0.D();
      if ($$6 > -1 && (float)$$6 - $$1 + 1.0F < 10.0F) {
         float $$7 = 1.0F - ((float)$$6 - $$1 + 1.0F) / 10.0F;
         $$7 = awm.a($$7, 0.0F, 1.0F);
         $$7 *= $$7;
         $$7 *= $$7;
         float $$8 = 1.0F + $$7 * 0.3F;
         $$3.b($$8, $$8, $$8);
      }

      a(this.f, $$2, $$3, $$4, $$5, $$6 > -1 && $$6 / 5 % 2 == 0);
   }

   public static void a(fxk $$0, dme $$1, etd $$2, fwq $$3, int $$4, boolean $$5) {
      int $$6;
      if ($$5) {
         $$6 = ghq.a(ghq.a(1.0F), 10);
      } else {
         $$6 = ghq.d;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6);
   }
}
