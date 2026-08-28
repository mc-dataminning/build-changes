public class gmd extends gkt<cot> {
   private final gez f;

   public gmd(gjo.a $$0) {
      super($$0, fxp.bG);
      this.f = $$0.c();
   }

   protected void a(cot $$0, float $$1, dsl $$2, fao $$3, gef $$4, int $$5) {
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

   public static void a(gez $$0, dsl $$1, fao $$2, gef $$3, int $$4, boolean $$5) {
      int $$6;
      if ($$5) {
         $$6 = gph.a(gph.a(1.0F), 10);
      } else {
         $$6 = gph.d;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6);
   }
}
