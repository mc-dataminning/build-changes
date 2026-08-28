public class gln extends gkd<cpg> {
   private final gej f;

   public gln(giy.a $$0) {
      super($$0, fxa.bG);
      this.f = $$0.c();
   }

   protected void a(cpg $$0, float $$1, dsd $$2, ezz $$3, gdp $$4, int $$5) {
      int $$6 = $$0.C();
      if ($$6 > -1 && (float)$$6 - $$1 + 1.0F < 10.0F) {
         float $$7 = 1.0F - ((float)$$6 - $$1 + 1.0F) / 10.0F;
         $$7 = ayz.a($$7, 0.0F, 1.0F);
         $$7 *= $$7;
         $$7 *= $$7;
         float $$8 = 1.0F + $$7 * 0.3F;
         $$3.b($$8, $$8, $$8);
      }

      a(this.f, $$2, $$3, $$4, $$5, $$6 > -1 && $$6 / 5 % 2 == 0);
   }

   public static void a(gej $$0, dsd $$1, ezz $$2, gdp $$3, int $$4, boolean $$5) {
      int $$6;
      if ($$5) {
         $$6 = gor.a(gor.a(1.0F), 10);
      } else {
         $$6 = gor.d;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6);
   }
}
