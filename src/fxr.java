public class fxr extends fxh {
   private static final float n = 0.0F;
   private static final float o = 0.7F;
   private static final float p = 0.0F;
   private static final float q = 1.0F;
   private static final float r = 0.0025F;
   private final caf s;
   private float t = 0.0F;

   public fxr(caf $$0) {
      super(amh.ni, ami.g, fxy.t());
      this.s = $$0;
      this.i = true;
      this.j = 0;
      this.d = 0.0F;
      this.f = (double)((float)$$0.dn());
      this.g = (double)((float)$$0.dp());
      this.h = (double)((float)$$0.dt());
   }

   @Override
   public boolean s() {
      return !this.s.aQ();
   }

   @Override
   public boolean r() {
      return true;
   }

   @Override
   public void q() {
      if (this.s.dD()) {
         this.n();
      } else {
         this.f = (double)((float)this.s.dn());
         this.g = (double)((float)this.s.dp());
         this.h = (double)((float)this.s.dt());
         float $$0 = (float)this.s.dl().h();
         if ($$0 >= 0.01F) {
            this.t = apa.a(this.t + 0.0025F, 0.0F, 1.0F);
            this.d = apa.i(apa.a($$0, 0.0F, 0.5F), 0.0F, 0.7F);
         } else {
            this.t = 0.0F;
            this.d = 0.0F;
         }
      }
   }
}
