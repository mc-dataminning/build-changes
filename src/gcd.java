public class gcd extends gbv {
   private final biq n;

   public gcd(apc $$0, ape $$1, float $$2, float $$3, biq $$4, long $$5) {
      super($$0, $$1, asc.a($$5));
      this.d = $$2;
      this.e = $$3;
      this.n = $$4;
      this.f = (double)((float)this.n.dq());
      this.g = (double)((float)this.n.ds());
      this.h = (double)((float)this.n.dw());
   }

   @Override
   public boolean s() {
      return !this.n.aS();
   }

   @Override
   public void q() {
      if (this.n.dG()) {
         this.n();
      } else {
         this.f = (double)((float)this.n.dq());
         this.g = (double)((float)this.n.ds());
         this.h = (double)((float)this.n.dw());
      }
   }
}
