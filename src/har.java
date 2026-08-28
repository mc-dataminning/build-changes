public class har extends hae {
   private static final float n = 1.0F;
   private static final float o = 1.0F;
   private final cir p;

   public har(cir $$0) {
      super(awe.yA, awf.g, hav.t());
      this.p = $$0;
      this.k = hav.a.b;
      this.i = false;
      this.j = 0;
   }

   @Override
   public boolean s() {
      return !this.p.ba();
   }

   @Override
   public void q() {
      if (!this.p.dN() && this.p.m() == null && this.p.gq()) {
         this.f = (double)((float)this.p.dx());
         this.g = (double)((float)this.p.dz());
         this.h = (double)((float)this.p.dD());
         this.d = 1.0F;
         this.e = 1.0F;
      } else {
         this.n();
      }
   }
}
