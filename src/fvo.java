public class fvo extends fuf {
   private final dfz u;

   public fvo(dfz $$0) {
      this.u = $$0;
   }

   @Override
   public dfz l() {
      return this.u;
   }

   @Override
   int E() {
      return 150;
   }

   @Override
   protected void aT_() {
      super.aT_();
      this.a.a(this.l().m());
   }

   @Override
   protected void a(dfz $$0) {
      if ($$0 instanceof crx.a $$1) {
         this.m.L().b(new ait($$1.h().ar(), this.a.a(), $$0.p()));
      }
   }
}
