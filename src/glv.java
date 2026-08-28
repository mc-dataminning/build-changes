public class glv extends gkl<cop> {
   private final ger f;

   public glv(gjg.a $$0) {
      super($$0, fxh.bG);
      this.f = $$0.c();
   }

   protected void a(cop $$0, float $$1, dsh $$2, fag $$3, gdx $$4, int $$5) {
      int $$6 = $$0.C();
      if ($$6 > -1 && (float)$$6 - $$1 + 1.0F < 10.0F) {
         float $$7 = 1.0F - ((float)$$6 - $$1 + 1.0F) / 10.0F;
         $$7 = aye.a($$7, 0.0F, 1.0F);
         $$7 *= $$7;
         $$7 *= $$7;
         float $$8 = 1.0F + $$7 * 0.3F;
         $$3.b($$8, $$8, $$8);
      }

      a(this.f, $$2, $$3, $$4, $$5, $$6 > -1 && $$6 / 5 % 2 == 0);
   }

   public static void a(ger $$0, dsh $$1, fag $$2, gdx $$3, int $$4, boolean $$5) {
      int $$6;
      if ($$5) {
         $$6 = goz.a(goz.a(1.0F), 10);
      } else {
         $$6 = goz.d;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6);
   }
}
