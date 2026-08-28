public class gsd extends gru {
   private static final float n = 0.0F;
   private static final float o = 1.0F;
   private static final float p = 0.7F;
   private static final float q = 0.5F;
   private final cjx r;

   public gsd(cjx $$0) {
      super(avz.ls, awa.f, gsl.t());
      this.r = $$0;
      this.k = gsl.a.a;
      this.i = true;
      this.j = 0;
   }

   @Override
   public boolean s() {
      return !this.r.aW();
   }

   @Override
   public void q() {
      if (!this.r.dK() && this.r.p() == null) {
         this.f = (double)((float)this.r.du());
         this.g = (double)((float)this.r.dw());
         this.h = (double)((float)this.r.dA());
         float $$0 = this.r.I(0.0F);
         this.d = 0.0F + 1.0F * $$0 * $$0;
         this.e = 0.7F + 0.5F * $$0;
      } else {
         this.n();
      }
   }
}
