public class hot extends hog {
   private static final float n = 1.0F;
   private static final float o = 1.0F;
   private final cmj p;

   public hot(cmj $$0) {
      super(awp.zy, awq.g, hox.t());
      this.p = $$0;
      this.k = hox.a.b;
      this.i = false;
      this.j = 0;
   }

   @Override
   public boolean s() {
      return !this.p.ba();
   }

   @Override
   public void q() {
      if (!this.p.dQ() && this.p.f() == null && this.p.gv()) {
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
