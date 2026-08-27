public class fxp extends fxh {
   private final bfj n;

   public fxp(amg $$0, ami $$1, float $$2, float $$3, bfj $$4, long $$5) {
      super($$0, $$1, apf.a($$5));
      this.d = $$2;
      this.e = $$3;
      this.n = $$4;
      this.f = (double)((float)this.n.dn());
      this.g = (double)((float)this.n.dp());
      this.h = (double)((float)this.n.dt());
   }

   @Override
   public boolean s() {
      return !this.n.aQ();
   }

   @Override
   public void q() {
      if (this.n.dD()) {
         this.n();
      } else {
         this.f = (double)((float)this.n.dn());
         this.g = (double)((float)this.n.dp());
         this.h = (double)((float)this.n.dt());
      }
   }
}
