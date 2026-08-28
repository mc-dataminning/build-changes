public abstract class gsp extends gsl {
   private static final float o = 0.0F;
   private static final float p = 1.2F;
   private static final float q = 0.0F;
   protected final ces n;
   private boolean r;

   public gsp(ces $$0, avg $$1, avi $$2) {
      super($$1, $$2, gtc.t());
      this.n = $$0;
      this.f = (double)((float)$$0.dv());
      this.g = (double)((float)$$0.dx());
      this.h = (double)((float)$$0.dB());
      this.i = true;
      this.j = 0;
      this.d = 0.0F;
   }

   @Override
   public void q() {
      boolean $$0 = this.p();
      if ($$0 && !this.m()) {
         fft.Q().aj().a((gtd)this.o());
         this.r = true;
      }

      if (!this.n.dL() && !this.r) {
         this.f = (double)((float)this.n.dv());
         this.g = (double)((float)this.n.dx());
         this.h = (double)((float)this.n.dB());
         float $$1 = (float)this.n.dt().h();
         if ($$1 >= 0.01F) {
            this.e = ayg.i(ayg.a($$1, this.u(), this.v()), this.u(), this.v());
            this.d = ayg.i(ayg.a($$1, 0.0F, 0.5F), 0.0F, 1.2F);
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
      return !this.n.aX();
   }

   protected abstract gsl o();

   protected abstract boolean p();
}
