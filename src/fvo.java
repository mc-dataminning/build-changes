public class fvo extends fuf {
   private final dga u;

   public fvo(dga $$0) {
      this.u = $$0;
   }

   @Override
   public dga l() {
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
   protected void a(dga $$0) {
      if ($$0 instanceof csb.a $$1) {
         this.m.L().b(new ajd($$1.h().ar(), this.a.a(), $$0.p()));
      }
   }
}
