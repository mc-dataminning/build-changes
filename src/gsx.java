public class gsx extends gsn {
   private static final float n = 0.0F;
   private static final float o = 0.7F;
   private static final float p = 0.0F;
   private static final float q = 1.0F;
   private static final float r = 0.0025F;
   private final cog s;
   private float t = 0.0F;

   public gsx(cog $$0) {
      super(avh.oN, avi.g, gte.t());
      this.s = $$0;
      this.i = true;
      this.j = 0;
      this.d = 0.0F;
      this.f = (double)((float)$$0.dw());
      this.g = (double)((float)$$0.dy());
      this.h = (double)((float)$$0.dC());
   }

   @Override
   public boolean s() {
      return !this.s.aY();
   }

   @Override
   public boolean r() {
      return true;
   }

   @Override
   public void q() {
      if (this.s.dM()) {
         this.n();
      } else {
         this.f = (double)((float)this.s.dw());
         this.g = (double)((float)this.s.dy());
         this.h = (double)((float)this.s.dC());
         float $$0 = (float)this.s.du().h();
         if ($$0 >= 0.01F && this.s.dR().s().i()) {
            this.t = ayg.a(this.t + 0.0025F, 0.0F, 1.0F);
            this.d = ayg.i(ayg.a($$0, 0.0F, 0.5F), 0.0F, 0.7F);
         } else {
            this.t = 0.0F;
            this.d = 0.0F;
         }
      }
   }
}
