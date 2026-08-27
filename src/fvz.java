public class fvz extends fup {
   fvz(fsa $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, fwb $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      this.u = 0.5F;
   }

   public static class a implements fvj<kf> {
      private final fwb a;

      public a(fwb $$0) {
         this.a = $$0;
      }

      public fvg a(kf $$0, fsa $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new fvz($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
      }
   }
}
