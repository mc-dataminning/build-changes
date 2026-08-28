public class haw extends haj {
   private static final float n = 1.0F;
   private static final float o = 1.0F;
   private final ciu p;

   public haw(ciu $$0) {
      super(awg.yA, awh.g, hba.t());
      this.p = $$0;
      this.k = hba.a.b;
      this.i = false;
      this.j = 0;
   }

   @Override
   public boolean s() {
      return !this.p.ba();
   }

   @Override
   public void q() {
      if (!this.p.dN() && this.p.m() == null && this.p.gp()) {
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
