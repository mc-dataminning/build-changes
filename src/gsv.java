public class gsv extends gsn {
   private final bsh n;

   public gsv(avg $$0, avi $$1, float $$2, float $$3, bsh $$4, long $$5) {
      super($$0, $$1, ayo.a($$5));
      this.d = $$2;
      this.e = $$3;
      this.n = $$4;
      this.f = (double)((float)this.n.dw());
      this.g = (double)((float)this.n.dy());
      this.h = (double)((float)this.n.dC());
   }

   @Override
   public boolean s() {
      return !this.n.aY();
   }

   @Override
   public void q() {
      if (this.n.dM()) {
         this.n();
      } else {
         this.f = (double)((float)this.n.dw());
         this.g = (double)((float)this.n.dy());
         this.h = (double)((float)this.n.dC());
      }
   }
}
