public class hib extends hhr {
   private static final float n = 0.0F;
   private static final float o = 0.7F;
   private static final float p = 0.0F;
   private static final float q = 1.0F;
   private static final float r = 0.0025F;
   private final cqw s;
   private float t = 0.0F;

   public hib(cqw $$0) {
      super(awa.pl, awb.g, hii.t());
      this.s = $$0;
      this.i = true;
      this.j = 0;
      this.d = 0.0F;
      this.f = (double)((float)$$0.dB());
      this.g = (double)((float)$$0.dD());
      this.h = (double)((float)$$0.dH());
   }

   @Override
   public boolean s() {
      return !this.s.bb();
   }

   @Override
   public boolean r() {
      return true;
   }

   @Override
   public void q() {
      if (this.s.dR()) {
         this.n();
      } else {
         this.f = (double)((float)this.s.dB());
         this.g = (double)((float)this.s.dD());
         this.h = (double)((float)this.s.dH());
         float $$0 = (float)this.s.dz().i();
         boolean $$1 = !this.s.cq() && this.s.l() instanceof crl;
         if ($$0 >= 0.01F && this.s.dW().u().i() && !$$1) {
            this.t = ayz.a(this.t + 0.0025F, 0.0F, 1.0F);
            this.d = ayz.h(ayz.a($$0, 0.0F, 0.5F), 0.0F, 0.7F);
         } else {
            this.t = 0.0F;
            this.d = 0.0F;
         }
      }
   }
}
