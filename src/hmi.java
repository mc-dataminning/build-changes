public class hmi extends hlv {
   private static final float n = 1.0F;
   private static final float o = 1.0F;
   private final clq p;

   public hmi(clq $$0) {
      super(awn.zv, awo.g, hmm.t());
      this.p = $$0;
      this.k = hmm.a.b;
      this.i = false;
      this.j = 0;
   }

   @Override
   public boolean s() {
      return !this.p.bb();
   }

   @Override
   public void q() {
      if (!this.p.dQ() && this.p.f() == null && this.p.gr()) {
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
