public class hcx extends hck {
   private static final float n = 1.0F;
   private static final float o = 1.0F;
   private final cjp p;

   public hcx(cjp $$0) {
      super(awn.yy, awo.g, hdb.t());
      this.p = $$0;
      this.k = hdb.a.b;
      this.i = false;
      this.j = 0;
   }

   @Override
   public boolean s() {
      return !this.p.bb();
   }

   @Override
   public void q() {
      if (!this.p.dQ() && this.p.aa_() == null && this.p.gn()) {
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
