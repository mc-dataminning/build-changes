public class gbu extends gaj {
   gbu(fxu $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, gbw $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      this.u = 0.5F;
   }

   public static class a implements gbe<lm> {
      private final gbw a;

      public a(gbw $$0) {
         this.a = $$0;
      }

      public gbb a(lm $$0, fxu $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gbu($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
      }
   }
}
