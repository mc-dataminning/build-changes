public class hna extends hmq {
   private static final float n = 0.0F;
   private static final float o = 0.7F;
   private static final float p = 0.0F;
   private static final float q = 1.0F;
   private static final float r = 0.0025F;
   private final ctw s;
   private float t = 0.0F;

   public hna(ctw $$0) {
      super(awn.pz, awo.g, hnh.t());
      this.s = $$0;
      this.i = true;
      this.j = 0;
      this.d = 0.0F;
      this.f = (double)((float)$$0.dz());
      this.g = (double)((float)$$0.dB());
      this.h = (double)((float)$$0.dF());
   }

   @Override
   public boolean s() {
      return !this.s.aZ();
   }

   @Override
   public boolean r() {
      return true;
   }

   @Override
   public void q() {
      if (this.s.dP()) {
         this.n();
      } else {
         this.f = (double)((float)this.s.dz());
         this.g = (double)((float)this.s.dB());
         this.h = (double)((float)this.s.dF());
         float $$0 = (float)this.s.dx().i();
         boolean $$1 = !this.s.co() && this.s.f() instanceof cul;
         if ($$0 >= 0.01F && this.s.dU().u().i() && !$$1) {
            this.t = azm.a(this.t + 0.0025F, 0.0F, 1.0F);
            this.d = azm.h(azm.a($$0, 0.0F, 0.5F), 0.0F, 0.7F);
         } else {
            this.t = 0.0F;
            this.d = 0.0F;
         }
      }
   }
}
