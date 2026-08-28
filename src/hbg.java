public class hbg extends hay {
   private final btz n;

   public hbg(awj $$0, awl $$1, float $$2, float $$3, btz $$4, long $$5) {
      super($$0, $$1, azr.a($$5));
      this.d = $$2;
      this.e = $$3;
      this.n = $$4;
      this.f = (double)((float)this.n.dC());
      this.g = (double)((float)this.n.dE());
      this.h = (double)((float)this.n.dI());
   }

   @Override
   public boolean s() {
      return !this.n.bc();
   }

   @Override
   public void q() {
      if (this.n.dS()) {
         this.n();
      } else {
         this.f = (double)((float)this.n.dC());
         this.g = (double)((float)this.n.dE());
         this.h = (double)((float)this.n.dI());
      }
   }
}
