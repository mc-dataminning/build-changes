public class gbq extends gaf {
   gbq(fxq $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, gbs $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      this.u = 0.5F;
   }

   public static class a implements gba<lm> {
      private final gbs a;

      public a(gbs $$0) {
         this.a = $$0;
      }

      public gax a(lm $$0, fxq $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gbq($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
      }
   }
}
