public class hfc extends hep {
   private static final float n = 1.0F;
   private static final float o = 1.0F;
   private final ckn p;

   public hfc(ckn $$0) {
      super(axf.yT, axg.g, hfg.t());
      this.p = $$0;
      this.k = hfg.a.b;
      this.i = false;
      this.j = 0;
   }

   @Override
   public boolean s() {
      return !this.p.bb();
   }

   @Override
   public void q() {
      if (!this.p.dQ() && this.p.O_() == null && this.p.gn()) {
         this.f = (double)((float)this.p.dA());
         this.g = (double)((float)this.p.dC());
         this.h = (double)((float)this.p.dG());
         this.d = 1.0F;
         this.e = 1.0F;
      } else {
         this.n();
      }
   }
}
