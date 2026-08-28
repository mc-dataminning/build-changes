public class hil extends hhy {
   private static final float n = 1.0F;
   private static final float o = 1.0F;
   private final cjp p;

   public hil(cjp $$0) {
      super(awa.zi, awb.g, hip.t());
      this.p = $$0;
      this.k = hip.a.b;
      this.i = false;
      this.j = 0;
   }

   @Override
   public boolean s() {
      return !this.p.bb();
   }

   @Override
   public void q() {
      if (!this.p.dQ() && this.p.O_() == null && this.p.gt()) {
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
