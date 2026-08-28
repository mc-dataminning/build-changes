public class hkg extends hjy {
   private final bvs n;

   public hkg(awj $$0, awl $$1, float $$2, float $$3, bvs $$4, long $$5) {
      super($$0, $$1, azs.a($$5));
      this.d = $$2;
      this.e = $$3;
      this.n = $$4;
      this.f = (double)((float)this.n.dA());
      this.g = (double)((float)this.n.dC());
      this.h = (double)((float)this.n.dG());
   }

   @Override
   public boolean s() {
      return !this.n.bb();
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
