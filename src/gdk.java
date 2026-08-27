public class gdk extends gcm {
   protected gdk(fzn $$0, double $$1, double $$2, double $$3, double $$4, gdp $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.t = 16;
      this.D = 1.5F;
      this.b($$5);
   }

   public static class a implements gcx<le> {
      private final gdp a;

      public a(gdp $$0) {
         this.a = $$0;
      }

      public gcu a(le $$0, fzn $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gdk($$1, $$2, $$3, $$4, $$5, this.a);
      }
   }
}
