public class gbn extends gae {
   private final dji u;

   public gbn(dji $$0) {
      this.u = $$0;
   }

   @Override
   public dji m() {
      return this.u;
   }

   @Override
   int E() {
      return 150;
   }

   @Override
   protected void aT_() {
      super.aT_();
      this.a.a(this.m().m());
   }

   @Override
   protected void a(dji $$0) {
      if ($$0 instanceof cvf.a $$1) {
         this.m.L().b(new ait($$1.h().ao(), this.a.a(), $$0.p()));
      }
   }
}
