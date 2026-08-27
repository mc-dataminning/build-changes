public class gey extends gel {
   private static final float n = 1.0F;
   private static final float o = 1.0F;
   private final bzd p;

   public gey(bzd $$0) {
      super(aqr.xc, aqs.g, gfc.t());
      this.p = $$0;
      this.k = gfc.a.b;
      this.i = false;
      this.j = 0;
   }

   @Override
   public boolean s() {
      return !this.p.aU();
   }

   @Override
   public void q() {
      if (!this.p.dI() && this.p.q() == null && this.p.gl()) {
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
