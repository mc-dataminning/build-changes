public abstract class hhv extends hhr {
   private static final float o = 0.0F;
   private static final float p = 1.2F;
   private static final float q = 0.0F;
   protected final cgy n;
   private boolean r;

   public hhv(cgy $$0, avz $$1, awb $$2) {
      super($$1, $$2, hii.t());
      this.n = $$0;
      this.f = (double)((float)$$0.dB());
      this.g = (double)((float)$$0.dD());
      this.h = (double)((float)$$0.dH());
      this.i = true;
      this.j = 0;
      this.d = 0.0F;
   }

   @Override
   public void q() {
      boolean $$0 = this.p();
      if ($$0 && !this.m()) {
         flj.Q().ak().a((hij)this.o());
         this.r = true;
      }

      if (!this.n.dR() && !this.r) {
         this.f = (double)((float)this.n.dB());
         this.g = (double)((float)this.n.dD());
         this.h = (double)((float)this.n.dH());
         float $$1 = (float)this.n.dz().i();
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
      return this.n.e_() ? 1.1F : 0.7F;
   }

   private float v() {
      return this.n.e_() ? 1.5F : 1.1F;
   }

   @Override
   public boolean r() {
      return true;
   }

   @Override
   public boolean s() {
      return !this.n.bb();
   }

   protected abstract hhr o();

   protected abstract boolean p();
}
