public class gif extends ghx {
   private final blw n;

   public gif(ars $$0, aru $$1, float $$2, float $$3, blw $$4, long $$5) {
      super($$0, $$1, auw.a($$5));
      this.d = $$2;
      this.e = $$3;
      this.n = $$4;
      this.f = (double)((float)this.n.dq());
      this.g = (double)((float)this.n.ds());
      this.h = (double)((float)this.n.dw());
   }

   @Override
   public boolean s() {
      return !this.n.aU();
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
