public abstract class hjb extends hix {
   private static final float o = 0.0F;
   private static final float p = 1.2F;
   private static final float q = 0.0F;
   protected final chq n;
   private boolean r;

   public hjb(chq $$0, avz $$1, awb $$2) {
      super($$1, $$2, hjo.t());
      this.n = $$0;
      this.f = (double)((float)$$0.dz());
      this.g = (double)((float)$$0.dB());
      this.h = (double)((float)$$0.dF());
      this.i = true;
      this.j = 0;
      this.d = 0.0F;
   }

   @Override
   public void q() {
      boolean $$0 = this.p();
      if ($$0 && !this.m()) {
         fmg.Q().ak().a((hjp)this.o());
         this.r = true;
      }

      if (!this.n.dP() && !this.r) {
         this.f = (double)((float)this.n.dz());
         this.g = (double)((float)this.n.dB());
         this.h = (double)((float)this.n.dF());
         float $$1 = (float)this.n.dx().i();
         if ($$1 >= 0.01F) {
            this.e = ayz.h(ayz.a($$1, this.u(), this.v()), this.u(), this.v());
            this.d = ayz.h(ayz.a($$1, 0.0F, 0.5F), 0.0F, 1.2F);
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
      return !this.n.bb();
   }

   protected abstract hix o();

   protected abstract boolean p();
}
