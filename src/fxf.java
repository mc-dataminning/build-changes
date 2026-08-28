public class fxf extends fvw {
   private final dga u;

   public fxf(dga $$0) {
      this.u = $$0;
   }

   @Override
   public dga m() {
      return this.u;
   }

   @Override
   int E() {
      return 150;
   }

   @Override
   protected void aR_() {
      super.aR_();
      this.a.a(this.m().m());
   }

   @Override
   protected void a(dga $$0) {
      if ($$0 instanceof csa.a $$1) {
         this.m.L().b(new ahy($$1.h().ar(), this.a.a(), $$0.p()));
      }
   }
}
