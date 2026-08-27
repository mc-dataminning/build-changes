public class gkh extends gjx {
   private static final float n = 0.0F;
   private static final float o = 0.7F;
   private static final float p = 0.0F;
   private static final float q = 1.0F;
   private static final float r = 0.0025F;
   private final cje s;
   private float t = 0.0F;

   public gkh(cje $$0) {
      super(atl.om, atm.g, gko.t());
      this.s = $$0;
      this.i = true;
      this.j = 0;
      this.d = 0.0F;
      this.f = (double)((float)$$0.dr());
      this.g = (double)((float)$$0.dt());
      this.h = (double)((float)$$0.dx());
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
      if (this.s.dH()) {
         this.n();
      } else {
         this.f = (double)((float)this.s.dr());
         this.g = (double)((float)this.s.dt());
         this.h = (double)((float)this.s.dx());
         float $$0 = (float)this.s.dp().h();
         if ($$0 >= 0.01F && this.s.dM().s().i()) {
            this.t = awi.a(this.t + 0.0025F, 0.0F, 1.0F);
            this.d = awi.i(awi.a($$0, 0.0F, 0.5F), 0.0F, 0.7F);
         } else {
            this.t = 0.0F;
            this.d = 0.0F;
         }
      }
   }
}
