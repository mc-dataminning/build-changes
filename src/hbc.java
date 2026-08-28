public abstract class hbc extends hay {
   private static final float o = 0.0F;
   private static final float p = 1.2F;
   private static final float q = 0.0F;
   protected final cgn n;
   private boolean r;

   public hbc(cgn $$0, awj $$1, awl $$2) {
      super($$1, $$2, hbp.t());
      this.n = $$0;
      this.f = (double)((float)$$0.dC());
      this.g = (double)((float)$$0.dE());
      this.h = (double)((float)$$0.dI());
      this.i = true;
      this.j = 0;
      this.d = 0.0F;
   }

   @Override
   public void q() {
      boolean $$0 = this.p();
      if ($$0 && !this.m()) {
         fja.Q().ak().a((hbq)this.o());
         this.r = true;
      }

      if (!this.n.dS() && !this.r) {
         this.f = (double)((float)this.n.dC());
         this.g = (double)((float)this.n.dE());
         this.h = (double)((float)this.n.dI());
         float $$1 = (float)this.n.dA().i();
         if ($$1 >= 0.01F) {
            this.e = azj.h(azj.a($$1, this.u(), this.v()), this.u(), this.v());
            this.d = azj.h(azj.a($$1, 0.0F, 0.5F), 0.0F, 1.2F);
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
      return !this.n.bc();
   }

   protected abstract hay o();

   protected abstract boolean p();
}
