public class gtl extends gtc {
   private static final float n = 0.0F;
   private static final float o = 1.0F;
   private static final float p = 0.7F;
   private static final float q = 0.5F;
   private final cjx r;

   public gtl(cjx $$0) {
      super(avo.ls, avp.f, gtt.t());
      this.r = $$0;
      this.k = gtt.a.a;
      this.i = true;
      this.j = 0;
   }

   @Override
   public boolean s() {
      return !this.r.aX();
   }

   @Override
   public void q() {
      if (!this.r.dL() && this.r.p() == null) {
         this.f = (double)((float)this.r.dv());
         this.g = (double)((float)this.r.dx());
         this.h = (double)((float)this.r.dB());
         float $$0 = this.r.J(0.0F);
         this.d = 0.0F + 1.0F * $$0 * $$0;
         this.e = 0.7F + 0.5F * $$0;
      } else {
         this.n();
      }
   }
}
