public class glm extends gkc<cpf> {
   private final gei f;

   public glm(gix.a $$0) {
      super($$0, fwz.bG);
      this.f = $$0.c();
   }

   protected void a(cpf $$0, float $$1, dsc $$2, ezy $$3, gdo $$4, int $$5) {
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

   public static void a(gei $$0, dsc $$1, ezy $$2, gdo $$3, int $$4, boolean $$5) {
      int $$6;
      if ($$5) {
         $$6 = goq.a(goq.a(1.0F), 10);
      } else {
         $$6 = goq.d;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6);
   }
}
