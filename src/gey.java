public class gey extends geq {
   private final bkv n;

   public gey(aqu $$0, aqw $$1, float $$2, float $$3, bkv $$4, long $$5) {
      super($$0, $$1, atw.a($$5));
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
