public abstract class fxl extends fxh {
   private static final float o = 0.0F;
   private static final float p = 1.2F;
   private static final float q = 0.0F;
   protected final brm n;
   private boolean r;

   public fxl(brm $$0, amg $$1, ami $$2) {
      super($$1, $$2, fxy.t());
      this.n = $$0;
      this.f = (double)((float)$$0.dn());
      this.g = (double)((float)$$0.dp());
      this.h = (double)((float)$$0.dt());
      this.i = true;
      this.j = 0;
      this.d = 0.0F;
   }

   @Override
   public void q() {
      boolean $$0 = this.p();
      if ($$0 && !this.m()) {
         enn.N().ah().a((fxz)this.o());
         this.r = true;
      }

      if (!this.n.dD() && !this.r) {
         this.f = (double)((float)this.n.dn());
         this.g = (double)((float)this.n.dp());
         this.h = (double)((float)this.n.dt());
         float $$1 = (float)this.n.dl().h();
         if ($$1 >= 0.01F) {
            this.e = apa.i(apa.a($$1, this.u(), this.v()), this.u(), this.v());
            this.d = apa.i(apa.a($$1, 0.0F, 0.5F), 0.0F, 1.2F);
         } else {
            this.e = 0.0F;
            this.d = 0.0F;
         }
      } else {
         this.n();
      }
   }

   private float u() {
      return this.n.h_() ? 1.1F : 0.7F;
   }

   private float v() {
      return this.n.h_() ? 1.5F : 1.1F;
   }

   @Override
   public boolean r() {
      return true;
   }

   @Override
   public boolean s() {
      return !this.n.aQ();
   }

   protected abstract fxh o();

   protected abstract boolean p();
}
