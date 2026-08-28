public class ggi extends gex {
   ggi(gci $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, ggk $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      this.u = 0.5F;
   }

   public static class a implements gfs<lv> {
      private final ggk a;

      public a(ggk $$0) {
         this.a = $$0;
      }

      public gfp a(lv $$0, gci $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new ggi($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
      }
   }
}
