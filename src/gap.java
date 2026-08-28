public class gap extends fzg {
   private final dil u;

   public gap(dil $$0) {
      this.u = $$0;
   }

   @Override
   public dil m() {
      return this.u;
   }

   @Override
   int E() {
      return 150;
   }

   @Override
   protected void aO_() {
      super.aO_();
      this.a.a(this.m().m());
   }

   @Override
   protected void a(dil $$0) {
      if ($$0 instanceof cuj.a $$1) {
         this.m.L().b(new aii($$1.h().ao(), this.a.a(), $$0.p()));
      }
   }
}
