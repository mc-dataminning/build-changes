public class fvw extends fuy {
   protected fvw(fsa $$0, double $$1, double $$2, double $$3, double $$4, fwb $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.t = 16;
      this.D = 1.5F;
      this.b($$5);
   }

   public static class a implements fvj<kf> {
      private final fwb a;

      public a(fwb $$0) {
         this.a = $$0;
      }

      public fvg a(kf $$0, fsa $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new fvw($$1, $$2, $$3, $$4, $$5, this.a);
      }
   }
}
