public class gbn extends gap {
   protected gbn(fxq $$0, double $$1, double $$2, double $$3, double $$4, gbs $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.t = 16;
      this.D = 1.5F;
      this.b($$5);
   }

   public static class a implements gba<lm> {
      private final gbs a;

      public a(gbs $$0) {
         this.a = $$0;
      }

      public gax a(lm $$0, fxq $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gbn($$1, $$2, $$3, $$4, $$5, this.a);
      }
   }
}
