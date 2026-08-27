public class fxm extends fzs {
   fxm(fvm $$0, double $$1, double $$2, double $$3, dpy $$4) {
      super($$0, $$1, $$2, $$3);
      this.a(fcu.Q().ap().a().a($$4));
      this.u = 0.0F;
      this.t = 80;
      this.n = false;
   }

   @Override
   public fyw b() {
      return fyw.a;
   }

   @Override
   public float b(float $$0) {
      return 0.5F;
   }

   public static class a implements fyv<kn> {
      public fys a(kn $$0, fvm $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new fxm($$1, $$2, $$3, $$4, $$0.b());
      }
   }
}
