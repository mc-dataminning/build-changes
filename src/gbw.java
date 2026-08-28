public class gbw extends gal {
   gbw(fxw $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, gby $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      this.u = 0.5F;
   }

   public static class a implements gbg<lm> {
      private final gby a;

      public a(gby $$0) {
         this.a = $$0;
      }

      public gbd a(lm $$0, fxw $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gbw($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
      }
   }
}
