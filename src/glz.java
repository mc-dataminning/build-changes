public abstract class glz extends glv {
   private static final float o = 0.0F;
   private static final float p = 1.2F;
   private static final float q = 0.0F;
   protected final cbe n;
   private boolean r;

   public glz(cbe $$0, atx $$1, atz $$2) {
      super($$1, $$2, gmm.t());
      this.n = $$0;
      this.f = (double)((float)$$0.dr());
      this.g = (double)((float)$$0.dt());
      this.h = (double)((float)$$0.dx());
      this.i = true;
      this.j = 0;
      this.d = 0.0F;
   }

   @Override
   public void q() {
      boolean $$0 = this.p();
      if ($$0 && !this.m()) {
         ezg.Q().ak().a((gmn)this.o());
         this.r = true;
      }

      if (!this.n.dH() && !this.r) {
         this.f = (double)((float)this.n.dr());
         this.g = (double)((float)this.n.dt());
         this.h = (double)((float)this.n.dx());
         float $$1 = (float)this.n.dp().h();
         if ($$1 >= 0.01F) {
            this.e = aww.i(aww.a($$1, this.u(), this.v()), this.u(), this.v());
            this.d = aww.i(aww.a($$1, 0.0F, 0.5F), 0.0F, 1.2F);
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
      return !this.n.aU();
   }

   protected abstract glv o();

   protected abstract boolean p();
}
