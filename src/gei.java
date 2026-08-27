public class gei extends gdy {
   private static final float n = 0.0F;
   private static final float o = 0.7F;
   private static final float p = 0.0F;
   private static final float q = 1.0F;
   private static final float r = 0.0025F;
   private final cfd s;
   private float t = 0.0F;

   public gei(cfd $$0) {
      super(aqn.nm, aqo.g, gep.t());
      this.s = $$0;
      this.i = true;
      this.j = 0;
      this.d = 0.0F;
      this.f = (double)((float)$$0.dq());
      this.g = (double)((float)$$0.ds());
      this.h = (double)((float)$$0.dw());
   }

   @Override
   public boolean s() {
      return !this.s.aS();
   }

   @Override
   public boolean r() {
      return true;
   }

   @Override
   public void q() {
      if (this.s.dG()) {
         this.n();
      } else {
         this.f = (double)((float)this.s.dq());
         this.g = (double)((float)this.s.ds());
         this.h = (double)((float)this.s.dw());
         float $$0 = (float)this.s.do().h();
         if ($$0 >= 0.01F) {
            this.t = ati.a(this.t + 0.0025F, 0.0F, 1.0F);
            this.d = ati.i(ati.a($$0, 0.0F, 0.5F), 0.0F, 0.7F);
         } else {
            this.t = 0.0F;
            this.d = 0.0F;
         }
      }
   }
}
