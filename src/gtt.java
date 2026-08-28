public class gtt extends gtj {
   private static final float n = 0.0F;
   private static final float o = 0.7F;
   private static final float p = 0.0F;
   private static final float q = 1.0F;
   private static final float r = 0.0025F;
   private final cot s;
   private float t = 0.0F;

   public gtt(cot $$0) {
      super(avp.oN, avq.g, gua.t());
      this.s = $$0;
      this.i = true;
      this.j = 0;
      this.d = 0.0F;
      this.f = (double)((float)$$0.dt());
      this.g = (double)((float)$$0.dv());
      this.h = (double)((float)$$0.dz());
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
      if (this.s.dJ()) {
         this.n();
      } else {
         this.f = (double)((float)this.s.dt());
         this.g = (double)((float)this.s.dv());
         this.h = (double)((float)this.s.dz());
         float $$0 = (float)this.s.dr().h();
         if ($$0 >= 0.01F && this.s.dO().s().i()) {
            this.t = ayo.a(this.t + 0.0025F, 0.0F, 1.0F);
            this.d = ayo.i(ayo.a($$0, 0.0F, 0.5F), 0.0F, 0.7F);
         } else {
            this.t = 0.0F;
            this.d = 0.0F;
         }
      }
   }
}
