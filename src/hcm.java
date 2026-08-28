public class hcm extends hbz {
   private static final float n = 1.0F;
   private static final float o = 1.0F;
   private final cjm p;

   public hcm(cjm $$0) {
      super(awo.yy, awp.g, hcq.t());
      this.p = $$0;
      this.k = hcq.a.b;
      this.i = false;
      this.j = 0;
   }

   @Override
   public boolean s() {
      return !this.p.bd();
   }

   @Override
   public void q() {
      if (!this.p.dT() && this.p.m() == null && this.p.gw()) {
         this.f = (double)((float)this.p.dD());
         this.g = (double)((float)this.p.dF());
         this.h = (double)((float)this.p.dJ());
         this.d = 1.0F;
         this.e = 1.0F;
      } else {
         this.n();
      }
   }
}
