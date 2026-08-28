public class fvv extends fum {
   private final dgi u;

   public fvv(dgi $$0) {
      this.u = $$0;
   }

   @Override
   public dgi l() {
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
   protected void a(dgi $$0) {
      if ($$0 instanceof csg.a $$1) {
         this.m.L().b(new ajd($$1.h().ar(), this.a.a(), $$0.p()));
      }
   }
}
