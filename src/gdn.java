public class gdn extends gcc {
   gdn(fzn $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, gdp $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      this.u = 0.5F;
   }

   public static class a implements gcx<le> {
      private final gdp a;

      public a(gdp $$0) {
         this.a = $$0;
      }

      public gcu a(le $$0, fzn $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gdn($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
      }
   }
}
