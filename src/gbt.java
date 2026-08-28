public class gbt extends gai {
   gbt(fxt $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, gbv $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      this.u = 0.5F;
   }

   public static class a implements gbd<lm> {
      private final gbv a;

      public a(gbv $$0) {
         this.a = $$0;
      }

      public gba a(lm $$0, fxt $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gbt($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
      }
   }
}
