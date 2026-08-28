public class hfb extends heq {
   private static final float n = 0.0F;
   private static final float o = 0.75F;
   private final cpw p;
   private final crv q;
   private final boolean r;

   public hfb(cpw $$0, crv $$1, boolean $$2) {
      super($$2 ? axf.pd : axf.pe, axg.g, hfh.t());
      this.p = $$0;
      this.q = $$1;
      this.r = $$2;
      this.k = hfh.a.a;
      this.i = true;
      this.j = 0;
      this.d = 0.0F;
   }

   @Override
   public boolean s() {
      return !this.q.bb();
   }

   @Override
   public boolean r() {
      return true;
   }

   @Override
   public void q() {
      if (this.q.dR() || !this.p.bZ() || this.p.dl() != this.q) {
         this.n();
      } else if (this.r != this.p.bo()) {
         this.d = 0.0F;
      } else {
         float $$0 = (float)this.q.dz().i();
         boolean $$1 = !this.q.cq() && this.q.l() instanceof csk;
         if ($$0 >= 0.01F && !$$1) {
            this.d = bae.b(0.0F, 0.75F, $$0);
         } else {
            this.d = 0.0F;
         }
      }
   }
}
