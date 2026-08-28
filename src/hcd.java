public abstract class hcd extends hbz {
   private static final float o = 0.0F;
   private static final float p = 1.2F;
   private static final float q = 0.0F;
   protected final cgw n;
   private boolean r;

   public hcd(cgw $$0, awn $$1, awp $$2) {
      super($$1, $$2, hcq.t());
      this.n = $$0;
      this.f = (double)((float)$$0.dD());
      this.g = (double)((float)$$0.dF());
      this.h = (double)((float)$$0.dJ());
      this.i = true;
      this.j = 0;
      this.d = 0.0F;
   }

   @Override
   public void q() {
      boolean $$0 = this.p();
      if ($$0 && !this.m()) {
         fjx.Q().ak().a((hcr)this.o());
         this.r = true;
      }

      if (!this.n.dT() && !this.r) {
         this.f = (double)((float)this.n.dD());
         this.g = (double)((float)this.n.dF());
         this.h = (double)((float)this.n.dJ());
         float $$1 = (float)this.n.dB().i();
         if ($$1 >= 0.01F) {
            this.e = azn.h(azn.a($$1, this.u(), this.v()), this.u(), this.v());
            this.d = azn.h(azn.a($$1, 0.0F, 0.5F), 0.0F, 1.2F);
         } else {
            this.e = 0.0F;
            this.d = 0.0F;
         }
      } else {
         this.n();
      }
   }

   private float u() {
      return this.n.p_() ? 1.1F : 0.7F;
   }

   private float v() {
      return this.n.p_() ? 1.5F : 1.1F;
   }

   @Override
   public boolean r() {
      return true;
   }

   @Override
   public boolean s() {
      return !this.n.bd();
   }

   protected abstract hbz o();

   protected abstract boolean p();
}
