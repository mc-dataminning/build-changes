public class gtm extends gtc {
   private static final float n = 0.0F;
   private static final float o = 0.7F;
   private static final float p = 0.0F;
   private static final float q = 1.0F;
   private static final float r = 0.0025F;
   private final cor s;
   private float t = 0.0F;

   public gtm(cor $$0) {
      super(avo.oN, avp.g, gtt.t());
      this.s = $$0;
      this.i = true;
      this.j = 0;
      this.d = 0.0F;
      this.f = (double)((float)$$0.dv());
      this.g = (double)((float)$$0.dx());
      this.h = (double)((float)$$0.dB());
   }

   @Override
   public boolean s() {
      return !this.s.aX();
   }

   @Override
   public boolean r() {
      return true;
   }

   @Override
   public void q() {
      if (this.s.dL()) {
         this.n();
      } else {
         this.f = (double)((float)this.s.dv());
         this.g = (double)((float)this.s.dx());
         this.h = (double)((float)this.s.dB());
         float $$0 = (float)this.s.dt().h();
         if ($$0 >= 0.01F && this.s.dQ().s().i()) {
            this.t = ayn.a(this.t + 0.0025F, 0.0F, 1.0F);
            this.d = ayn.i(ayn.a($$0, 0.0F, 0.5F), 0.0F, 0.7F);
         } else {
            this.t = 0.0F;
            this.d = 0.0F;
         }
      }
   }
}
