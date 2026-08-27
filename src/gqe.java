public class gqe extends gpv {
   private static final float n = 0.0F;
   private static final float o = 1.0F;
   private static final float p = 0.7F;
   private static final float q = 0.5F;
   private final cij r;

   public gqe(cij $$0) {
      super(avc.ln, avd.f, gqm.t());
      this.r = $$0;
      this.k = gqm.a.a;
      this.i = true;
      this.j = 0;
   }

   @Override
   public boolean s() {
      return !this.r.aU();
   }

   @Override
   public void q() {
      if (!this.r.dI() && this.r.p() == null) {
         this.f = (double)((float)this.r.ds());
         this.g = (double)((float)this.r.du());
         this.h = (double)((float)this.r.dy());
         float $$0 = this.r.I(0.0F);
         this.d = 0.0F + 1.0F * $$0 * $$0;
         this.e = 0.7F + 0.5F * $$0;
      } else {
         this.n();
      }
   }
}
