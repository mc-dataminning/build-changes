public class ggf extends gfh {
   protected ggf(gci $$0, double $$1, double $$2, double $$3, double $$4, ggk $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.t = 16;
      this.D = 1.5F;
      this.b($$5);
   }

   public static class a implements gfs<lv> {
      private final ggk a;

      public a(ggk $$0) {
         this.a = $$0;
      }

      public gfp a(lv $$0, gci $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new ggf($$1, $$2, $$3, $$4, $$5, this.a);
      }
   }
}
