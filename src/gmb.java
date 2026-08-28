public class gmb extends gkr<cos> {
   private final gex f;

   public gmb(gjm.a $$0) {
      super($$0, fxn.bG);
      this.f = $$0.c();
   }

   protected void a(cos $$0, float $$1, dsk $$2, fam $$3, ged $$4, int $$5) {
      int $$6 = $$0.C();
      if ($$6 > -1 && (float)$$6 - $$1 + 1.0F < 10.0F) {
         float $$7 = 1.0F - ((float)$$6 - $$1 + 1.0F) / 10.0F;
         $$7 = ayg.a($$7, 0.0F, 1.0F);
         $$7 *= $$7;
         $$7 *= $$7;
         float $$8 = 1.0F + $$7 * 0.3F;
         $$3.b($$8, $$8, $$8);
      }

      a(this.f, $$2, $$3, $$4, $$5, $$6 > -1 && $$6 / 5 % 2 == 0);
   }

   public static void a(gex $$0, dsk $$1, fam $$2, ged $$3, int $$4, boolean $$5) {
      int $$6;
      if ($$5) {
         $$6 = gpf.a(gpf.a(1.0F), 10);
      } else {
         $$6 = gpf.d;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6);
   }
}
