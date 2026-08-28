public class gsb extends grr {
   private static final float n = 0.0F;
   private static final float o = 0.7F;
   private static final float p = 0.0F;
   private static final float q = 1.0F;
   private static final float r = 0.0025F;
   private final coo s;
   private float t = 0.0F;

   public gsb(coo $$0) {
      super(avw.oN, avx.g, gsi.t());
      this.s = $$0;
      this.i = true;
      this.j = 0;
      this.d = 0.0F;
      this.f = (double)((float)$$0.du());
      this.g = (double)((float)$$0.dw());
      this.h = (double)((float)$$0.dA());
   }

   @Override
   public boolean s() {
      return !this.s.aW();
   }

   @Override
   public boolean r() {
      return true;
   }

   @Override
   public void q() {
      if (this.s.dK()) {
         this.n();
      } else {
         this.f = (double)((float)this.s.du());
         this.g = (double)((float)this.s.dw());
         this.h = (double)((float)this.s.dA());
         float $$0 = (float)this.s.ds().h();
         if ($$0 >= 0.01F && this.s.dP().s().i()) {
            this.t = ayu.a(this.t + 0.0025F, 0.0F, 1.0F);
            this.d = ayu.i(ayu.a($$0, 0.0F, 0.5F), 0.0F, 0.7F);
         } else {
            this.t = 0.0F;
            this.d = 0.0F;
         }
      }
   }
}
