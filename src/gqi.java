public class gqi extends gpv {
   private static final float n = 1.0F;
   private static final float o = 1.0F;
   private final cgg p;

   public gqi(cgg $$0) {
      super(avc.yg, avd.g, gqm.t());
      this.p = $$0;
      this.k = gqm.a.b;
      this.i = false;
      this.j = 0;
   }

   @Override
   public boolean s() {
      return !this.p.aU();
   }

   @Override
   public void q() {
      if (!this.p.dI() && this.p.p() == null && this.p.gv()) {
         this.f = (double)((float)this.p.ds());
         this.g = (double)((float)this.p.du());
         this.h = (double)((float)this.p.dy());
         this.d = 1.0F;
         this.e = 1.0F;
      } else {
         this.n();
      }
   }
}
