public class gsc extends gru {
   private final bss n;

   public gsc(avy $$0, awa $$1, float $$2, float $$3, bss $$4, long $$5) {
      super($$0, $$1, azf.a($$5));
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
