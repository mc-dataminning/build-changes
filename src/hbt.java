public class hbt extends hbj {
   private static final float n = 0.0F;
   private static final float o = 0.7F;
   private static final float p = 0.0F;
   private static final float q = 1.0F;
   private static final float r = 0.0025F;
   private final cqk s;
   private float t = 0.0F;

   public hbt(cqk $$0) {
      super(awl.oM, awm.g, hca.t());
      this.s = $$0;
      this.i = true;
      this.j = 0;
      this.d = 0.0F;
      this.f = (double)((float)$$0.dC());
      this.g = (double)((float)$$0.dE());
      this.h = (double)((float)$$0.dI());
   }

   @Override
   public boolean s() {
      return !this.s.bc();
   }

   @Override
   public boolean r() {
      return true;
   }

   @Override
   public void q() {
      if (this.s.dS()) {
         this.n();
      } else {
         this.f = (double)((float)this.s.dC());
         this.g = (double)((float)this.s.dE());
         this.h = (double)((float)this.s.dI());
         float $$0 = (float)this.s.dA().i();
         boolean $$1 = !this.s.cr() && this.s.m() instanceof cqy;
         if ($$0 >= 0.01F && this.s.dX().s().i() && !$$1) {
            this.t = azk.a(this.t + 0.0025F, 0.0F, 1.0F);
            this.d = azk.h(azk.a($$0, 0.0F, 0.5F), 0.0F, 0.7F);
         } else {
            this.t = 0.0F;
            this.d = 0.0F;
         }
      }
   }
}
