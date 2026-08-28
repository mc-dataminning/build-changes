public class gsg extends gry {
   private final bsw n;

   public gsg(avz $$0, awb $$1, float $$2, float $$3, bsw $$4, long $$5) {
      super($$0, $$1, azh.a($$5));
      this.d = $$2;
      this.e = $$3;
      this.n = $$4;
      this.f = (double)((float)this.n.du());
      this.g = (double)((float)this.n.dw());
      this.h = (double)((float)this.n.dA());
   }

   @Override
   public boolean s() {
      return !this.n.aW();
   }

   @Override
   public void q() {
      if (this.n.dK()) {
         this.n();
      } else {
         this.f = (double)((float)this.n.du());
         this.g = (double)((float)this.n.dw());
         this.h = (double)((float)this.n.dA());
      }
   }
}
