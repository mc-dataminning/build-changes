public abstract class gpo extends gpk {
   private static final float o = 0.0F;
   private static final float p = 1.2F;
   private static final float q = 0.0F;
   protected final ccu n;
   private boolean r;

   public gpo(ccu $$0, auy $$1, ava $$2) {
      super($$1, $$2, gqb.t());
      this.n = $$0;
      this.f = (double)((float)$$0.ds());
      this.g = (double)((float)$$0.du());
      this.h = (double)((float)$$0.dy());
      this.i = true;
      this.j = 0;
      this.d = 0.0F;
   }

   @Override
   public void q() {
      boolean $$0 = this.p();
      if ($$0 && !this.m()) {
         fcu.Q().ak().a((gqc)this.o());
         this.r = true;
      }

      if (!this.n.dI() && !this.r) {
         this.f = (double)((float)this.n.ds());
         this.g = (double)((float)this.n.du());
         this.h = (double)((float)this.n.dy());
         float $$1 = (float)this.n.dq().h();
         if ($$1 >= 0.01F) {
            this.e = axw.i(axw.a($$1, this.u(), this.v()), this.u(), this.v());
            this.d = axw.i(axw.a($$1, 0.0F, 0.5F), 0.0F, 1.2F);
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
      return !this.n.aU();
   }

   protected abstract gpk o();

   protected abstract boolean p();
}
