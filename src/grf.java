public class grf extends gqs {
   private static final float n = 1.0F;
   private static final float o = 1.0F;
   private final cgx p;

   public grf(cgx $$0) {
      super(avi.yr, avj.g, grj.t());
      this.p = $$0;
      this.k = grj.a.b;
      this.i = false;
      this.j = 0;
   }

   @Override
   public boolean s() {
      return !this.p.aW();
   }

   @Override
   public void q() {
      if (!this.p.dK() && this.p.p() == null && this.p.gv()) {
         this.f = (double)((float)this.p.du());
         this.g = (double)((float)this.p.dw());
         this.h = (double)((float)this.p.dA());
         this.d = 1.0F;
         this.e = 1.0F;
      } else {
         this.n();
      }
   }
}
