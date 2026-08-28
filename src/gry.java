public abstract class gry extends gru {
   private static final float o = 0.0F;
   private static final float p = 1.2F;
   private static final float q = 0.0F;
   protected final cfe n;
   private boolean r;

   public gry(cfe $$0, avy $$1, awa $$2) {
      super($$1, $$2, gsl.t());
      this.n = $$0;
      this.f = (double)((float)$$0.du());
      this.g = (double)((float)$$0.dw());
      this.h = (double)((float)$$0.dA());
      this.i = true;
      this.j = 0;
      this.d = 0.0F;
   }

   @Override
   public void q() {
      boolean $$0 = this.p();
      if ($$0 && !this.m()) {
         ffd.Q().aj().a((gsm)this.o());
         this.r = true;
      }

      if (!this.n.dK() && !this.r) {
         this.f = (double)((float)this.n.du());
         this.g = (double)((float)this.n.dw());
         this.h = (double)((float)this.n.dA());
         float $$1 = (float)this.n.ds().h();
         if ($$1 >= 0.01F) {
            this.e = ayx.i(ayx.a($$1, this.u(), this.v()), this.u(), this.v());
            this.d = ayx.i(ayx.a($$1, 0.0F, 0.5F), 0.0F, 1.2F);
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
      return !this.n.aW();
   }

   protected abstract gru o();

   protected abstract boolean p();
}
