public class hev extends hem {
   private static final float n = 0.0F;
   private static final float o = 1.0F;
   private static final float p = 0.7F;
   private static final float q = 0.5F;
   private final cmk r;

   public hev(cmk $$0) {
      super(awv.lQ, aww.f, hfd.t());
      this.r = $$0;
      this.k = hfd.a.a;
      this.i = true;
      this.j = 0;
   }

   @Override
   public boolean s() {
      return !this.r.bb();
   }

   @Override
   public void q() {
      if (!this.r.dR() && this.r.O_() == null) {
         this.f = (double)((float)this.r.dB());
         this.g = (double)((float)this.r.dD());
         this.h = (double)((float)this.r.dH());
         float $$0 = this.r.L(0.0F);
         this.d = 0.0F + 1.0F * $$0 * $$0;
         this.e = 0.7F + 0.5F * $$0;
      } else {
         this.n();
      }
   }
}
