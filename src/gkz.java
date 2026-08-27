public abstract class gkz extends gkv {
   private static final float o = 0.0F;
   private static final float p = 1.2F;
   private static final float q = 0.0F;
   protected final can n;
   private boolean r;

   public gkz(can $$0, ato $$1, atq $$2) {
      super($$1, $$2, glm.t());
      this.n = $$0;
      this.f = (double)((float)$$0.do());
      this.g = (double)((float)$$0.dq());
      this.h = (double)((float)$$0.du());
      this.i = true;
      this.j = 0;
      this.d = 0.0F;
   }

   @Override
   public void q() {
      boolean $$0 = this.p();
      if ($$0 && !this.m()) {
         eyk.P().aj().a((gln)this.o());
         this.r = true;
      }

      if (!this.n.dE() && !this.r) {
         this.f = (double)((float)this.n.do());
         this.g = (double)((float)this.n.dq());
         this.h = (double)((float)this.n.du());
         float $$1 = (float)this.n.dm().h();
         if ($$1 >= 0.01F) {
            this.e = awm.i(awm.a($$1, this.u(), this.v()), this.u(), this.v());
            this.d = awm.i(awm.a($$1, 0.0F, 0.5F), 0.0F, 1.2F);
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

   protected abstract gkv o();

   protected abstract boolean p();
}
