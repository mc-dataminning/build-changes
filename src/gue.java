public class gue extends gtv {
   private static final float n = 0.0F;
   private static final float o = 1.0F;
   private static final float p = 0.7F;
   private static final float q = 0.5F;
   private final ciy r;

   public gue(ciy $$0) {
      super($$0.gz() ? avo.lI : avo.lH, avq.f, gum.t());
      this.r = $$0;
      this.k = gum.a.a;
      this.i = true;
      this.j = 0;
   }

   @Override
   public boolean s() {
      return !this.r.ba();
   }

   @Override
   public void q() {
      if (!this.r.dP() && this.r.p() == null) {
         this.f = (double)((float)this.r.dz());
         this.g = (double)((float)this.r.dB());
         this.h = (double)((float)this.r.dF());
         float $$0 = this.r.I(0.0F);
         this.d = 0.0F + 1.0F * $$0 * $$0;
         this.e = 0.7F + 0.5F * $$0;
      } else {
         this.n();
      }
   }
}
