public class gme extends glv {
   private static final float n = 0.0F;
   private static final float o = 1.0F;
   private static final float p = 0.7F;
   private static final float q = 0.5F;
   private final cfu r;

   public gme(cfu $$0) {
      super(aty.lh, atz.f, gmm.t());
      this.r = $$0;
      this.k = gmm.a.a;
      this.i = true;
      this.j = 0;
   }

   @Override
   public boolean s() {
      return !this.r.aU();
   }

   @Override
   public void q() {
      if (!this.r.dH() && this.r.p() == null) {
         this.f = (double)((float)this.r.dr());
         this.g = (double)((float)this.r.dt());
         this.h = (double)((float)this.r.dx());
         float $$0 = this.r.I(0.0F);
         this.d = 0.0F + 1.0F * $$0 * $$0;
         this.e = 0.7F + 0.5F * $$0;
      } else {
         this.n();
      }
   }
}
