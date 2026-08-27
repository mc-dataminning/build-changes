public abstract class gbz extends gbv {
   private static final float o = 0.0F;
   private static final float p = 1.2F;
   private static final float q = 0.0F;
   protected final bus n;
   private boolean r;

   public gbz(bus $$0, apd $$1, apf $$2) {
      super($$1, $$2, gcm.t());
      this.n = $$0;
      this.f = (double)((float)$$0.dq());
      this.g = (double)((float)$$0.ds());
      this.h = (double)((float)$$0.dw());
      this.i = true;
      this.j = 0;
      this.d = 0.0F;
   }

   @Override
   public void q() {
      boolean $$0 = this.p();
      if ($$0 && !this.m()) {
         eqv.O().ai().a((gcn)this.o());
         this.r = true;
      }

      if (!this.n.dG() && !this.r) {
         this.f = (double)((float)this.n.dq());
         this.g = (double)((float)this.n.ds());
         this.h = (double)((float)this.n.dw());
         float $$1 = (float)this.n.do().h();
         if ($$1 >= 0.01F) {
            this.e = arx.i(arx.a($$1, this.u(), this.v()), this.u(), this.v());
            this.d = arx.i(arx.a($$1, 0.0F, 0.5F), 0.0F, 1.2F);
         } else {
            this.e = 0.0F;
            this.d = 0.0F;
         }
      } else {
         this.n();
      }
   }

   private float u() {
      return this.n.m_() ? 1.1F : 0.7F;
   }

   private float v() {
      return this.n.m_() ? 1.5F : 1.1F;
   }

   @Override
   public boolean r() {
      return true;
   }

   @Override
   public boolean s() {
      return !this.n.aT();
   }

   protected abstract gbv o();

   protected abstract boolean p();
}
