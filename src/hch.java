public class hch extends hbz {
   private final bui n;

   public hch(awn $$0, awp $$1, float $$2, float $$3, bui $$4, long $$5) {
      super($$0, $$1, azv.a($$5));
      this.d = $$2;
      this.e = $$3;
      this.n = $$4;
      this.f = (double)((float)this.n.dD());
      this.g = (double)((float)this.n.dF());
      this.h = (double)((float)this.n.dJ());
   }

   @Override
   public boolean s() {
      return !this.n.bd();
   }

   @Override
   public void q() {
      if (this.n.dT()) {
         this.n();
      } else {
         this.f = (double)((float)this.n.dD());
         this.g = (double)((float)this.n.dF());
         this.h = (double)((float)this.n.dJ());
      }
   }
}
