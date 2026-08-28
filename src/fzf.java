public class fzf extends fxw {
   private final dhq u;

   public fzf(dhq $$0) {
      this.u = $$0;
   }

   @Override
   public dhq m() {
      return this.u;
   }

   @Override
   int E() {
      return 150;
   }

   @Override
   protected void aN_() {
      super.aN_();
      this.a.a(this.m().m());
   }

   @Override
   protected void a(dhq $$0) {
      if ($$0 instanceof cto.a $$1) {
         this.m.L().b(new aig($$1.h().ar(), this.a.a(), $$0.p()));
      }
   }
}
