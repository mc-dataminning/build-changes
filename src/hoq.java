public class hoq extends hoi {
   private final bwv n;

   public hoq(awq $$0, aws $$1, float $$2, float $$3, bwv $$4, long $$5) {
      super($$0, $$1, azz.a($$5));
      this.d = $$2;
      this.e = $$3;
      this.n = $$4;
      this.f = (double)((float)this.n.dA());
      this.g = (double)((float)this.n.dC());
      this.h = (double)((float)this.n.dG());
   }

   @Override
   public boolean s() {
      return !this.n.ba();
   }

   @Override
   public void q() {
      if (this.n.dQ()) {
         this.n();
      } else {
         this.f = (double)((float)this.n.dA());
         this.g = (double)((float)this.n.dC());
         this.h = (double)((float)this.n.dG());
      }
   }
}
