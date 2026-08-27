public abstract class gbg extends gbc {
   private static final float o = 0.0F;
   private static final float p = 1.2F;
   private static final float q = 0.0F;
   protected final bul n;
   private boolean r;

   public gbg(bul $$0, aov $$1, aox $$2) {
      super($$1, $$2, gbt.t());
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
         eqm.O().ai().a((gbu)this.o());
         this.r = true;
      }

      if (!this.n.dF() && !this.r) {
         this.f = (double)((float)this.n.dp());
         this.g = (double)((float)this.n.dr());
         this.h = (double)((float)this.n.dv());
         float $$1 = (float)this.n.dn().h();
         if ($$1 >= 0.01F) {
            this.e = arp.i(arp.a($$1, this.u(), this.v()), this.u(), this.v());
            this.d = arp.i(arp.a($$1, 0.0F, 0.5F), 0.0F, 1.2F);
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

   protected abstract gbc o();

   protected abstract boolean p();
}
