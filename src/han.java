public class han extends hae {
   private static final float n = 0.0F;
   private static final float o = 1.0F;
   private static final float p = 0.7F;
   private static final float q = 0.5F;
   private final ckw r;

   public han(ckw $$0) {
      super(awe.lt, awf.f, hav.t());
      this.r = $$0;
      this.k = hav.a.a;
      this.i = true;
      this.j = 0;
   }

   @Override
   public boolean s() {
      return !this.r.ba();
   }

   @Override
   public void q() {
      if (!this.r.dN() && this.r.m() == null) {
         this.f = (double)((float)this.r.dx());
         this.g = (double)((float)this.r.dz());
         this.h = (double)((float)this.r.dD());
         float $$0 = this.r.L(0.0F);
         this.d = 0.0F + 1.0F * $$0 * $$0;
         this.e = 0.7F + 0.5F * $$0;
      } else {
         this.n();
      }
   }
}
