public abstract class gzr extends gzn {
   private static final float o = 0.0F;
   private static final float p = 1.2F;
   private static final float q = 0.0F;
   protected final cfw n;
   private boolean r;

   public gzr(cfw $$0, awc $$1, awe $$2) {
      super($$1, $$2, hae.t());
      this.n = $$0;
      this.f = (double)((float)$$0.dx());
      this.g = (double)((float)$$0.dz());
      this.h = (double)((float)$$0.dD());
      this.i = true;
      this.j = 0;
      this.d = 0.0F;
   }

   @Override
   public void q() {
      boolean $$0 = this.p();
      if ($$0 && !this.m()) {
         fib.Q().aj().a((haf)this.o());
         this.r = true;
      }

      if (!this.n.dN() && !this.r) {
         this.f = (double)((float)this.n.dx());
         this.g = (double)((float)this.n.dz());
         this.h = (double)((float)this.n.dD());
         float $$1 = (float)this.n.dv().i();
         if ($$1 >= 0.01F) {
            this.e = azc.h(azc.a($$1, this.u(), this.v()), this.u(), this.v());
            this.d = azc.h(azc.a($$1, 0.0F, 0.5F), 0.0F, 1.2F);
         } else {
            this.e = 0.0F;
            this.d = 0.0F;
         }
      } else {
         this.n();
      }
   }

   private float u() {
      return this.n.o_() ? 1.1F : 0.7F;
   }

   private float v() {
      return this.n.o_() ? 1.5F : 1.1F;
   }

   @Override
   public boolean r() {
      return true;
   }

   @Override
   public boolean s() {
      return !this.n.ba();
   }

   protected abstract gzn o();

   protected abstract boolean p();
}
