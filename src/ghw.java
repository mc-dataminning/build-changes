public class ghw extends ggn<cma> {
   private final gat f;

   public ghw(gfi.a $$0) {
      super($$0, ftl.bG);
      this.f = $$0.c();
   }

   protected void a(cma $$0, float $$1, doz $$2, ewi $$3, fzz $$4, int $$5) {
      int $$6 = $$0.C();
      if ($$6 > -1 && (float)$$6 - $$1 + 1.0F < 10.0F) {
         float $$7 = 1.0F - ((float)$$6 - $$1 + 1.0F) / 10.0F;
         $$7 = axk.a($$7, 0.0F, 1.0F);
         $$7 *= $$7;
         $$7 *= $$7;
         float $$8 = 1.0F + $$7 * 0.3F;
         $$3.b($$8, $$8, $$8);
      }

      a(this.f, $$2, $$3, $$4, $$5, $$6 > -1 && $$6 / 5 % 2 == 0);
   }

   public static void a(gat $$0, doz $$1, ewi $$2, fzz $$3, int $$4, boolean $$5) {
      int $$6;
      if ($$5) {
         $$6 = gla.a(gla.a(1.0F), 10);
      } else {
         $$6 = gla.d;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6);
   }
}
