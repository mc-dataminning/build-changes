public class gld extends gkv {
   private final bof n;

   public gld(ato $$0, atq $$1, float $$2, float $$3, bof $$4, long $$5) {
      super($$0, $$1, awt.a($$5));
      this.d = $$2;
      this.e = $$3;
      this.n = $$4;
      this.f = (double)((float)this.n.do());
      this.g = (double)((float)this.n.dq());
      this.h = (double)((float)this.n.du());
   }

   @Override
   public boolean s() {
      return !this.n.aU();
   }

   @Override
   public void q() {
      if (this.n.dE()) {
         this.n();
      } else {
         this.f = (double)((float)this.n.do());
         this.g = (double)((float)this.n.dq());
         this.h = (double)((float)this.n.du());
      }
   }
}
