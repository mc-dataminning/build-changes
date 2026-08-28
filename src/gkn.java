public class gkn extends ghw {
   private static final int a = 12235202;

   protected gkn(gfw $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, float $$7, gjz $$8) {
      super($$0, $$1, $$2, $$3, 0.1F, -0.1F, 0.1F, $$4, $$5, $$6, $$7, $$8, 0.0F, 20, 0.0125F, false);
      this.v = (float)axj.b(12235202) / 255.0F;
      this.w = (float)axj.c(12235202) / 255.0F;
      this.x = (float)axj.d(12235202) / 255.0F;
   }

   public static class a implements gjh<lx> {
      private final gjz a;

      public a(gjz $$0) {
         this.a = $$0;
      }

      public gje a(lx $$0, gfw $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         azg $$8 = $$1.A;
         double $$9 = (double)$$8.i() * -1.9 * (double)$$8.i() * 0.1;
         double $$10 = (double)$$8.i() * -0.5 * (double)$$8.i() * 0.1 * 5.0;
         double $$11 = (double)$$8.i() * -1.9 * (double)$$8.i() * 0.1;
         return new gkn($$1, $$2, $$3, $$4, $$9, $$10, $$11, 1.0F, this.a);
      }
   }
}
