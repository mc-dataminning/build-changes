public class fzv extends gcc {
   fzv(fxv $$0, double $$1, double $$2, double $$3, dsc $$4) {
      super($$0, $$1, $$2, $$3);
      this.a(fff.Q().ao().a().a($$4));
      this.u = 0.0F;
      this.t = 80;
      this.n = false;
   }

   @Override
   public gbg b() {
      return gbg.a;
   }

   @Override
   public float b(float $$0) {
      return 0.5F;
   }

   public static class a implements gbf<la> {
      public gbc a(la $$0, fxv $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new fzv($$1, $$2, $$3, $$4, $$0.b());
      }
   }
}
