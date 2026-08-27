public class geh extends gdy {
   private static final float n = 0.0F;
   private static final float o = 1.0F;
   private static final float p = 0.7F;
   private static final float q = 0.5F;
   private final caw r;

   public geh(caw $$0) {
      super(aqn.kp, aqo.f, gep.t());
      this.r = $$0;
      this.k = gep.a.a;
      this.i = true;
      this.j = 0;
   }

   @Override
   public boolean s() {
      return !this.r.aS();
   }

   @Override
   public void q() {
      if (!this.r.dG() && this.r.q() == null) {
         this.f = (double)((float)this.r.dq());
         this.g = (double)((float)this.r.ds());
         this.h = (double)((float)this.r.dw());
         float $$0 = this.r.G(0.0F);
         this.d = 0.0F + 1.0F * $$0 * $$0;
         this.e = 0.7F + 0.5F * $$0;
      } else {
         this.n();
      }
   }
}
