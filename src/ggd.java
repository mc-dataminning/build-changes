public class ggd extends geh {
   protected ggd(gci $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, float $$7, ggk $$8) {
      super($$0, $$1, $$2, $$3, 0.1F, 0.1F, 0.1F, $$4, $$5, $$6, $$7, $$8, 0.3F, 8, -0.1F, true);
   }

   public static class a implements gfs<lv> {
      private final ggk a;

      public a(ggk $$0) {
         this.a = $$0;
      }

      public gfp a(lv $$0, gci $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new ggd($$1, $$2, $$3, $$4, $$5, $$6, $$7, 1.0F, this.a);
      }
   }
}
