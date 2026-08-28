public class gms extends gli<cpd> {
   private final gfn f;

   public gms(gkd.a $$0) {
      super($$0, fyd.bH);
      this.f = $$0.c();
   }

   protected void a(cpd $$0, float $$1, dta $$2, fbc $$3, get $$4, int $$5) {
      int $$6 = $$0.C();
      if ($$6 > -1 && (float)$$6 - $$1 + 1.0F < 10.0F) {
         float $$7 = 1.0F - ((float)$$6 - $$1 + 1.0F) / 10.0F;
         $$7 = ayn.a($$7, 0.0F, 1.0F);
         $$7 *= $$7;
         $$7 *= $$7;
         float $$8 = 1.0F + $$7 * 0.3F;
         $$3.b($$8, $$8, $$8);
      }

      a(this.f, $$2, $$3, $$4, $$5, $$6 > -1 && $$6 / 5 % 2 == 0);
   }

   public static void a(gfn $$0, dta $$1, fbc $$2, get $$3, int $$4, boolean $$5) {
      int $$6;
      if ($$5) {
         $$6 = gpw.a(gpw.a(1.0F), 10);
      } else {
         $$6 = gpw.d;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6);
   }
}
