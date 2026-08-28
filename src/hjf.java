public class hjf extends hix {
   private final bva n;

   public hjf(avz $$0, awb $$1, float $$2, float $$3, bva $$4, long $$5) {
      super($$0, $$1, azh.a($$5));
      this.d = $$2;
      this.e = $$3;
      this.n = $$4;
      this.f = (double)((float)this.n.dz());
      this.g = (double)((float)this.n.dB());
      this.h = (double)((float)this.n.dF());
   }

   @Override
   public boolean s() {
      return !this.n.bb();
   }

   @Override
   public void q() {
      if (this.n.dP()) {
         this.n();
      } else {
         this.f = (double)((float)this.n.dz());
         this.g = (double)((float)this.n.dB());
         this.h = (double)((float)this.n.dF());
      }
   }
}
