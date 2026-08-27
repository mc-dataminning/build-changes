public abstract class gbu extends gbq {
   private static final float o = 0.0F;
   private static final float p = 1.2F;
   private static final float q = 0.0F;
   protected final bun n;
   private boolean r;

   public gbu(bun $$0, aoy $$1, apa $$2) {
      super($$1, $$2, gch.t());
      this.n = $$0;
      this.f = (double)((float)$$0.dp());
      this.g = (double)((float)$$0.dr());
      this.h = (double)((float)$$0.dv());
      this.i = true;
      this.j = 0;
      this.d = 0.0F;
   }

   @Override
   public void q() {
      boolean $$0 = this.p();
      if ($$0 && !this.m()) {
         eqq.O().ai().a((gci)this.o());
         this.r = true;
      }

      if (!this.n.dF() && !this.r) {
         this.f = (double)((float)this.n.dp());
         this.g = (double)((float)this.n.dr());
         this.h = (double)((float)this.n.dv());
         float $$1 = (float)this.n.dn().h();
         if ($$1 >= 0.01F) {
            this.e = ars.i(ars.a($$1, this.u(), this.v()), this.u(), this.v());
            this.d = ars.i(ars.a($$1, 0.0F, 0.5F), 0.0F, 1.2F);
         } else {
            this.e = 0.0F;
            this.d = 0.0F;
         }
      } else {
         this.n();
      }
   }

   private float u() {
      return this.n.i_() ? 1.1F : 0.7F;
   }

   private float v() {
      return this.n.i_() ? 1.5F : 1.1F;
   }

   @Override
   public boolean r() {
      return true;
   }

   @Override
   public boolean s() {
      return !this.n.aS();
   }

   protected abstract gbq o();

   protected abstract boolean p();
}
