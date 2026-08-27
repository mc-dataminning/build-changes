public abstract class ghm extends ghi {
   private static final float o = 0.0F;
   private static final float p = 1.2F;
   private static final float q = 0.0F;
   protected final bxy n;
   private boolean r;

   public ghm(bxy $$0, arq $$1, ars $$2) {
      super($$1, $$2, ghz.t());
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
         evh.O().ai().a((gia)this.o());
         this.r = true;
      }

      if (!this.n.dH() && !this.r) {
         this.f = (double)((float)this.n.dr());
         this.g = (double)((float)this.n.dt());
         this.h = (double)((float)this.n.dx());
         float $$1 = (float)this.n.dp().h();
         if ($$1 >= 0.01F) {
            this.e = aun.i(aun.a($$1, this.u(), this.v()), this.u(), this.v());
            this.d = aun.i(aun.a($$1, 0.0F, 0.5F), 0.0F, 1.2F);
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

   protected abstract ghi o();

   protected abstract boolean p();
}
