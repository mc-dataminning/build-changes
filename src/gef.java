public class gef extends geh {
   protected gef(gci $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, float $$7, ggk $$8) {
      super($$0, $$1, $$2, $$3, 0.1F, -0.1F, 0.1F, $$4, $$5, $$6, $$7, $$8, 0.5F, 20, 0.1F, false);
   }

   public static class a implements gfs<lv> {
      private final ggk a;

      public a(ggk $$0) {
         this.a = $$0;
      }

      public gfp a(lv $$0, gci $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gef($$1, $$2, $$3, $$4, 0.0, 0.0, 0.0, 1.0F, this.a);
      }
   }
}
