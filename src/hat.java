public class hat extends haj {
   private static final float n = 0.0F;
   private static final float o = 0.7F;
   private static final float p = 0.0F;
   private static final float q = 1.0F;
   private static final float r = 0.0025F;
   private final cpv s;
   private float t = 0.0F;

   public hat(cpv $$0) {
      super(awg.oO, awh.g, hba.t());
      this.s = $$0;
      this.i = true;
      this.j = 0;
      this.d = 0.0F;
      this.f = (double)((float)$$0.dx());
      this.g = (double)((float)$$0.dz());
      this.h = (double)((float)$$0.dD());
   }

   @Override
   public boolean s() {
      return !this.s.ba();
   }

   @Override
   public boolean r() {
      return true;
   }

   @Override
   public void q() {
      if (this.s.dN()) {
         this.n();
      } else {
         this.f = (double)((float)this.s.dx());
         this.g = (double)((float)this.s.dz());
         this.h = (double)((float)this.s.dD());
         float $$0 = (float)this.s.dv().i();
         boolean $$1 = !this.s.cn() && this.s.m() instanceof cqj;
         if ($$0 >= 0.01F && this.s.dS().s().i() && !$$1) {
            this.t = azf.a(this.t + 0.0025F, 0.0F, 1.0F);
            this.d = azf.h(azf.a($$0, 0.0F, 0.5F), 0.0F, 0.7F);
         } else {
            this.t = 0.0F;
            this.d = 0.0F;
         }
      }
   }
}
