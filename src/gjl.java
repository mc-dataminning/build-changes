public class gjl extends gic<cno> {
   private final gci f;

   public gjl(ggx.a $$0) {
      super($$0, fva.bG);
      this.f = $$0.c();
   }

   protected void a(cno $$0, float $$1, dqh $$2, exx $$3, gbo $$4, int $$5) {
      int $$6 = $$0.C();
      if ($$6 > -1 && (float)$$6 - $$1 + 1.0F < 10.0F) {
         float $$7 = 1.0F - ((float)$$6 - $$1 + 1.0F) / 10.0F;
         $$7 = axz.a($$7, 0.0F, 1.0F);
         $$7 *= $$7;
         $$7 *= $$7;
         float $$8 = 1.0F + $$7 * 0.3F;
         $$3.b($$8, $$8, $$8);
      }

      a(this.f, $$2, $$3, $$4, $$5, $$6 > -1 && $$6 / 5 % 2 == 0);
   }

   public static void a(gci $$0, dqh $$1, exx $$2, gbo $$3, int $$4, boolean $$5) {
      int $$6;
      if ($$5) {
         $$6 = gmp.a(gmp.a(1.0F), 10);
      } else {
         $$6 = gmp.d;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6);
   }
}
