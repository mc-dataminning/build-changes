public class gbs extends gau {
   protected gbs(fxv $$0, double $$1, double $$2, double $$3, double $$4, gbx $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.t = 16;
      this.D = 1.5F;
      this.b($$5);
   }

   public static class a implements gbf<lm> {
      private final gbx a;

      public a(gbx $$0) {
         this.a = $$0;
      }

      public gbc a(lm $$0, fxv $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gbs($$1, $$2, $$3, $$4, $$5, this.a);
      }
   }
}
