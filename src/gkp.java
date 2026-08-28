public class gkp extends ghy {
   private static final int a = 12235202;

   protected gkp(gfy $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, float $$7, gkb $$8) {
      super($$0, $$1, $$2, $$3, 0.1F, -0.1F, 0.1F, $$4, $$5, $$6, $$7, $$8, 0.0F, 20, 0.0125F, false);
      this.v = (float)axk.b(12235202) / 255.0F;
      this.w = (float)axk.c(12235202) / 255.0F;
      this.x = (float)axk.d(12235202) / 255.0F;
   }

   public static class a implements gjj<lx> {
      private final gkb a;

      public a(gkb $$0) {
         this.a = $$0;
      }

      public gjg a(lx $$0, gfy $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         azh $$8 = $$1.A;
         double $$9 = (double)$$8.i() * -1.9 * (double)$$8.i() * 0.1;
         double $$10 = (double)$$8.i() * -0.5 * (double)$$8.i() * 0.1 * 5.0;
         double $$11 = (double)$$8.i() * -1.9 * (double)$$8.i() * 0.1;
         return new gkp($$1, $$2, $$3, $$4, $$9, $$10, $$11, 1.0F, this.a);
      }
   }
}
