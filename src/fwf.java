public class fwf extends fuw {
   private final dfg u;

   public fwf(dfg $$0) {
      this.u = $$0;
   }

   @Override
   public dfg m() {
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
   protected void a(dfg $$0) {
      if ($$0 instanceof cre.a $$1) {
         this.m.L().b(new ahy($$1.h().ar(), this.a.a(), $$0.p()));
      }
   }
}
