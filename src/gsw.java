public class gsw extends gsl {
   private static final float n = 0.0F;
   private static final float o = 0.75F;
   private final cmk p;
   private final cof q;
   private final boolean r;

   public gsw(cmk $$0, cof $$1, boolean $$2) {
      super($$2 ? avh.oL : avh.oM, avi.g, gtc.t());
      this.p = $$0;
      this.q = $$1;
      this.r = $$2;
      this.k = gtc.a.a;
      this.i = true;
      this.j = 0;
      this.d = 0.0F;
   }

   @Override
   public boolean s() {
      return !this.q.aX();
   }

   @Override
   public boolean r() {
      return true;
   }

   @Override
   public void q() {
      if (this.q.dL() || !this.p.bS() || this.p.dd() != this.q) {
         this.n();
      } else if (this.r != this.p.bk()) {
         this.d = 0.0F;
      } else {
         float $$0 = (float)this.q.dt().h();
         if ($$0 >= 0.01F) {
            this.d = ayg.b(0.0F, 0.75F, $$0);
         } else {
            this.d = 0.0F;
         }
      }
   }
}
