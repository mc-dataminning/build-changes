public class hjk extends hix {
   private static final float n = 1.0F;
   private static final float o = 1.0F;
   private final ckj p;

   public hjk(ckj $$0) {
      super(awa.zs, awb.g, hjo.t());
      this.p = $$0;
      this.k = hjo.a.b;
      this.i = false;
      this.j = 0;
   }

   @Override
   public boolean s() {
      return !this.p.bb();
   }

   @Override
   public void q() {
      if (!this.p.dP() && this.p.f() == null && this.p.gt()) {
         this.f = (double)((float)this.p.dz());
         this.g = (double)((float)this.p.dB());
         this.h = (double)((float)this.p.dF());
         this.d = 1.0F;
         this.e = 1.0F;
      } else {
         this.n();
      }
   }
}
