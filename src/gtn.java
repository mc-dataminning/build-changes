public abstract class gtn extends gtj {
   private static final float o = 0.0F;
   private static final float p = 1.2F;
   private static final float q = 0.0F;
   protected final cff n;
   private boolean r;

   public gtn(cff $$0, avo $$1, avq $$2) {
      super($$1, $$2, gua.t());
      this.n = $$0;
      this.f = (double)((float)$$0.dt());
      this.g = (double)((float)$$0.dv());
      this.h = (double)((float)$$0.dz());
      this.i = true;
      this.j = 0;
      this.d = 0.0F;
   }

   @Override
   public void q() {
      boolean $$0 = this.p();
      if ($$0 && !this.m()) {
         fgo.Q().aj().a((gub)this.o());
         this.r = true;
      }

      if (!this.n.dJ() && !this.r) {
         this.f = (double)((float)this.n.dt());
         this.g = (double)((float)this.n.dv());
         this.h = (double)((float)this.n.dz());
         float $$1 = (float)this.n.dr().h();
         if ($$1 >= 0.01F) {
            this.e = ayo.i(ayo.a($$1, this.u(), this.v()), this.u(), this.v());
            this.d = ayo.i(ayo.a($$1, 0.0F, 0.5F), 0.0F, 1.2F);
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
      return !this.n.aX();
   }

   protected abstract gtj o();

   protected abstract boolean p();
}
