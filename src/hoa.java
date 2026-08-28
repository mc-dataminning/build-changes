public abstract class hoa extends hnw {
   private static final float o = 0.0F;
   private static final float p = 1.2F;
   private static final float q = 0.0F;
   protected final cjw n;
   private boolean r;

   public hoa(cjw $$0, awx $$1, awz $$2) {
      super($$1, $$2, hon.t());
      this.n = $$0;
      this.f = (double)((float)$$0.dA());
      this.g = (double)((float)$$0.dC());
      this.h = (double)((float)$$0.dG());
      this.i = true;
      this.j = 0;
      this.d = 0.0F;
   }

   @Override
   public void q() {
      boolean $$0 = this.p();
      if ($$0 && !this.m()) {
         fqq.Q().ak().a((hoo)this.o());
         this.r = true;
      }

      if (!this.n.dQ() && !this.r) {
         this.f = (double)((float)this.n.dA());
         this.g = (double)((float)this.n.dC());
         this.h = (double)((float)this.n.dG());
         float $$1 = (float)this.n.dy().i();
         if ($$1 >= 0.01F) {
            this.e = azz.h(azz.a($$1, this.u(), this.v()), this.u(), this.v());
            this.d = azz.h(azz.a($$1, 0.0F, 0.5F), 0.0F, 1.2F);
         } else {
            this.e = 0.0F;
            this.d = 0.0F;
         }
      } else {
         this.n();
      }
   }

   private float u() {
      return this.n.n_() ? 1.1F : 0.7F;
   }

   private float v() {
      return this.n.n_() ? 1.5F : 1.1F;
   }

   @Override
   public boolean r() {
      return true;
   }

   @Override
   public boolean s() {
      return !this.n.ba();
   }

   protected abstract hnw o();

   protected abstract boolean p();
}
