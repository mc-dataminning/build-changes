public abstract class ggj extends ggf {
   private static final float o = 0.0F;
   private static final float p = 1.2F;
   private static final float q = 0.0F;
   protected final bxj n;
   private boolean r;

   public ggj(bxj $$0, arb $$1, ard $$2) {
      super($$1, $$2, ggw.t());
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
         euk.N().ah().a((ggx)this.o());
         this.r = true;
      }

      if (!this.n.dH() && !this.r) {
         this.f = (double)((float)this.n.dr());
         this.g = (double)((float)this.n.dt());
         this.h = (double)((float)this.n.dx());
         float $$1 = (float)this.n.dp().h();
         if ($$1 >= 0.01F) {
            this.e = aty.i(aty.a($$1, this.u(), this.v()), this.u(), this.v());
            this.d = aty.i(aty.a($$1, 0.0F, 0.5F), 0.0F, 1.2F);
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

   protected abstract ggf o();

   protected abstract boolean p();
}
