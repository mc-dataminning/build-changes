public class hcj extends hbz {
   private static final float n = 0.0F;
   private static final float o = 0.7F;
   private static final float p = 0.0F;
   private static final float q = 1.0F;
   private static final float r = 0.0025F;
   private final cqo s;
   private float t = 0.0F;

   public hcj(cqo $$0) {
      super(awo.oM, awp.g, hcq.t());
      this.s = $$0;
      this.i = true;
      this.j = 0;
      this.d = 0.0F;
      this.f = (double)((float)$$0.dD());
      this.g = (double)((float)$$0.dF());
      this.h = (double)((float)$$0.dJ());
   }

   @Override
   public boolean s() {
      return !this.s.bd();
   }

   @Override
   public boolean r() {
      return true;
   }

   @Override
   public void q() {
      if (this.s.dT()) {
         this.n();
      } else {
         this.f = (double)((float)this.s.dD());
         this.g = (double)((float)this.s.dF());
         this.h = (double)((float)this.s.dJ());
         float $$0 = (float)this.s.dB().i();
         boolean $$1 = !this.s.cs() && this.s.m() instanceof crc;
         if ($$0 >= 0.01F && this.s.dY().s().i() && !$$1) {
            this.t = azn.a(this.t + 0.0025F, 0.0F, 1.0F);
            this.d = azn.h(azn.a($$0, 0.0F, 0.5F), 0.0F, 0.7F);
         } else {
            this.t = 0.0F;
            this.d = 0.0F;
         }
      }
   }
}
