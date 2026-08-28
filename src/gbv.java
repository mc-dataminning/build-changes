public class gbv extends gak {
   gbv(fxv $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, gbx $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      this.u = 0.5F;
   }

   public static class a implements gbf<lm> {
      private final gbx a;

      public a(gbx $$0) {
         this.a = $$0;
      }

      public gbc a(lm $$0, fxv $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gbv($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
      }
   }
}
