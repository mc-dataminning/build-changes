public class gsw extends gsn {
   private static final float n = 0.0F;
   private static final float o = 1.0F;
   private static final float p = 0.7F;
   private static final float q = 0.5F;
   private final cjn r;

   public gsw(cjn $$0) {
      super(avh.ls, avi.f, gte.t());
      this.r = $$0;
      this.k = gte.a.a;
      this.i = true;
      this.j = 0;
   }

   @Override
   public boolean s() {
      return !this.r.aY();
   }

   @Override
   public void q() {
      if (!this.r.dM() && this.r.p() == null) {
         this.f = (double)((float)this.r.dw());
         this.g = (double)((float)this.r.dy());
         this.h = (double)((float)this.r.dC());
         float $$0 = this.r.J(0.0F);
         this.d = 0.0F + 1.0F * $$0 * $$0;
         this.e = 0.7F + 0.5F * $$0;
      } else {
         this.n();
      }
   }
}
