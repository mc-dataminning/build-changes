public class hor extends hoi {
   private static final float n = 0.0F;
   private static final float o = 1.0F;
   private static final float p = 0.7F;
   private static final float q = 0.5F;
   private final cox r;

   public hor(cox $$0) {
      super(awr.lU, aws.f, hoz.t());
      this.r = $$0;
      this.k = hoz.a.a;
      this.i = true;
      this.j = 0;
   }

   @Override
   public boolean s() {
      return !this.r.ba();
   }

   @Override
   public void q() {
      if (!this.r.dQ() && this.r.f() == null) {
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
