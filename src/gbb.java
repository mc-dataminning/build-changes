public class gbb extends fzs<chm> {
   private final fub f;

   public gbb(fyn.a $$0) {
      super($$0, fmw.bD);
      this.f = $$0.c();
   }

   protected void a(chm $$0, float $$1, djh $$2, eqb $$3, fth $$4, int $$5) {
      int $$6 = $$0.D();
      if ($$6 > -1 && (float)$$6 - $$1 + 1.0F < 10.0F) {
         float $$7 = 1.0F - ((float)$$6 - $$1 + 1.0F) / 10.0F;
         $$7 = auo.a($$7, 0.0F, 1.0F);
         $$7 *= $$7;
         $$7 *= $$7;
         float $$8 = 1.0F + $$7 * 0.3F;
         $$3.b($$8, $$8, $$8);
      }

      a(this.f, $$2, $$3, $$4, $$5, $$6 > -1 && $$6 / 5 % 2 == 0);
   }

   public static void a(fub $$0, djh $$1, eqb $$2, fth $$3, int $$4, boolean $$5) {
      int $$6;
      if ($$5) {
         $$6 = gee.a(gee.a(1.0F), 10);
      } else {
         $$6 = gee.d;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6);
   }
}
