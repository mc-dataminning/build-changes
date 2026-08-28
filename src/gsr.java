public abstract class gsr extends gsn {
   private static final float o = 0.0F;
   private static final float p = 1.2F;
   private static final float q = 0.0F;
   protected final cet n;
   private boolean r;

   public gsr(cet $$0, avg $$1, avi $$2) {
      super($$1, $$2, gte.t());
      this.n = $$0;
      this.f = (double)((float)$$0.dw());
      this.g = (double)((float)$$0.dy());
      this.h = (double)((float)$$0.dC());
      this.i = true;
      this.j = 0;
      this.d = 0.0F;
   }

   @Override
   public void q() {
      boolean $$0 = this.p();
      if ($$0 && !this.m()) {
         ffw.Q().aj().a((gtf)this.o());
         this.r = true;
      }

      if (!this.n.dM() && !this.r) {
         this.f = (double)((float)this.n.dw());
         this.g = (double)((float)this.n.dy());
         this.h = (double)((float)this.n.dC());
         float $$1 = (float)this.n.du().h();
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
      return !this.n.aY();
   }

   protected abstract gsn o();

   protected abstract boolean p();
}
