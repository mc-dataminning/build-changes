public class gqd extends gpv {
   private final brh n;

   public gqd(avb $$0, avd $$1, float $$2, float $$3, brh $$4, long $$5) {
      super($$0, $$1, ayg.a($$5));
      this.d = $$2;
      this.e = $$3;
      this.n = $$4;
      this.f = (double)((float)this.n.ds());
      this.g = (double)((float)this.n.du());
      this.h = (double)((float)this.n.dy());
   }

   @Override
   public boolean s() {
      return !this.n.aU();
   }

   @Override
   public void q() {
      if (this.n.dI()) {
         this.n();
      } else {
         this.f = (double)((float)this.n.ds());
         this.g = (double)((float)this.n.du());
         this.h = (double)((float)this.n.dy());
      }
   }
}
