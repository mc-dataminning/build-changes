public class gju extends ghd {
   private static final int a = 12235202;

   protected gju(gfd $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, float $$7, gjg $$8) {
      super($$0, $$1, $$2, $$3, 0.1F, -0.1F, 0.1F, $$4, $$5, $$6, $$7, $$8, 0.0F, 20, 0.0125F, false);
      this.v = (float)ayp.b(12235202) / 255.0F;
      this.w = (float)ayp.c(12235202) / 255.0F;
      this.x = (float)ayp.d(12235202) / 255.0F;
   }

   public static class a implements gio<lw> {
      private final gjg a;

      public a(gjg $$0) {
         this.a = $$0;
      }

      public gil a(lw $$0, gfd $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         bam $$8 = $$1.A;
         double $$9 = (double)$$8.i() * -1.9 * (double)$$8.i() * 0.1;
         double $$10 = (double)$$8.i() * -0.5 * (double)$$8.i() * 0.1 * 5.0;
         double $$11 = (double)$$8.i() * -1.9 * (double)$$8.i() * 0.1;
         return new gju($$1, $$2, $$3, $$4, $$9, $$10, $$11, 1.0F, this.a);
      }
   }
}
