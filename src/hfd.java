public class hfd extends heq {
   private static final float n = 1.0F;
   private static final float o = 1.0F;
   private final ckn p;

   public hfd(ckn $$0) {
      super(axf.yT, axg.g, hfh.t());
      this.p = $$0;
      this.k = hfh.a.b;
      this.i = false;
      this.j = 0;
   }

   @Override
   public boolean s() {
      return !this.p.bb();
   }

   @Override
   public void q() {
      if (!this.p.dR() && this.p.O_() == null && this.p.gp()) {
         this.f = (double)((float)this.p.dB());
         this.g = (double)((float)this.p.dD());
         this.h = (double)((float)this.p.dH());
         this.d = 1.0F;
         this.e = 1.0F;
      } else {
         this.n();
      }
   }
}
