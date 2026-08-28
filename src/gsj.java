public class gsj extends gry {
   private static final float n = 0.0F;
   private static final float o = 0.75F;
   private final cmz p;
   private final cov q;
   private final boolean r;

   public gsj(cmz $$0, cov $$1, boolean $$2) {
      super($$2 ? awa.oL : awa.oM, awb.g, gsp.t());
      this.p = $$0;
      this.q = $$1;
      this.r = $$2;
      this.k = gsp.a.a;
      this.i = true;
      this.j = 0;
      this.d = 0.0F;
   }

   @Override
   public boolean s() {
      return !this.q.aW();
   }

   @Override
   public boolean r() {
      return true;
   }

   @Override
   public void q() {
      if (this.q.dK() || !this.p.bR() || this.p.dc() != this.q) {
         this.n();
      } else if (this.r != this.p.bj()) {
         this.d = 0.0F;
      } else {
         float $$0 = (float)this.q.ds().h();
         if ($$0 >= 0.01F) {
            this.d = ayz.b(0.0F, 0.75F, $$0);
         } else {
            this.d = 0.0F;
         }
      }
   }
}
