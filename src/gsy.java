public class gsy extends gsl {
   private static final float n = 1.0F;
   private static final float o = 1.0F;
   private final chi p;

   public gsy(chi $$0) {
      super(avh.yu, avi.g, gtc.t());
      this.p = $$0;
      this.k = gtc.a.b;
      this.i = false;
      this.j = 0;
   }

   @Override
   public boolean s() {
      return !this.p.aX();
   }

   @Override
   public void q() {
      if (!this.p.dL() && this.p.p() == null && this.p.gu()) {
         this.f = (double)((float)this.p.dv());
         this.g = (double)((float)this.p.dx());
         this.h = (double)((float)this.p.dB());
         this.d = 1.0F;
         this.e = 1.0F;
      } else {
         this.n();
      }
   }
}
