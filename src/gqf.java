public class gqf extends gpv {
   private static final float n = 0.0F;
   private static final float o = 0.7F;
   private static final float p = 0.0F;
   private static final float q = 1.0F;
   private static final float r = 0.0025F;
   private final cnc s;
   private float t = 0.0F;

   public gqf(cnc $$0) {
      super(avc.oD, avd.g, gqm.t());
      this.s = $$0;
      this.i = true;
      this.j = 0;
      this.d = 0.0F;
      this.f = (double)((float)$$0.ds());
      this.g = (double)((float)$$0.du());
      this.h = (double)((float)$$0.dy());
   }

   @Override
   public boolean s() {
      return !this.s.aU();
   }

   @Override
   public boolean r() {
      return true;
   }

   @Override
   public void q() {
      if (this.s.dI()) {
         this.n();
      } else {
         this.f = (double)((float)this.s.ds());
         this.g = (double)((float)this.s.du());
         this.h = (double)((float)this.s.dy());
         float $$0 = (float)this.s.dq().h();
         if ($$0 >= 0.01F && this.s.dN().s().i()) {
            this.t = axz.a(this.t + 0.0025F, 0.0F, 1.0F);
            this.d = axz.i(axz.a($$0, 0.0F, 0.5F), 0.0F, 0.7F);
         } else {
            this.t = 0.0F;
            this.d = 0.0F;
         }
      }
   }
}
