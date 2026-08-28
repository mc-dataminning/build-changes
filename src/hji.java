public class hji extends hix {
   private static final float n = 0.0F;
   private static final float o = 0.75F;
   private final cpr p;
   private final crq q;
   private final boolean r;

   public hji(cpr $$0, crq $$1, boolean $$2) {
      super($$2 ? awa.pt : awa.pu, awb.g, hjo.t());
      this.p = $$0;
      this.q = $$1;
      this.r = $$2;
      this.k = hjo.a.a;
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
      if (this.q.dP() || !this.p.bY() || this.p.dj() != this.q) {
         this.n();
      } else if (this.r != this.p.bm()) {
         this.d = 0.0F;
      } else {
         float $$0 = (float)this.q.dx().i();
         boolean $$1 = !this.q.cp() && this.q.f() instanceof csf;
         if ($$0 >= 0.01F && !$$1) {
            this.d = ayz.b(0.0F, 0.75F, $$0);
         } else {
            this.d = 0.0F;
         }
      }
   }
}
