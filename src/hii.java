public class hii extends hhz {
   private static final float n = 0.0F;
   private static final float o = 1.0F;
   private static final float p = 0.7F;
   private static final float q = 0.5F;
   private final clv r;

   public hii(clv $$0) {
      super(awa.lQ, awb.f, hiq.t());
      this.r = $$0;
      this.k = hiq.a.a;
      this.i = true;
      this.j = 0;
   }

   @Override
   public boolean s() {
      return !this.r.bb();
   }

   @Override
   public void q() {
      if (!this.r.dQ() && this.r.O_() == null) {
         this.f = (double)((float)this.r.dA());
         this.g = (double)((float)this.r.dC());
         this.h = (double)((float)this.r.dG());
         float $$0 = this.r.L(0.0F);
         this.d = 0.0F + 1.0F * $$0 * $$0;
         this.e = 0.7F + 0.5F * $$0;
      } else {
         this.n();
      }
   }
}
