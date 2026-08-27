public class gci extends gbv {
   private static final float n = 1.0F;
   private static final float o = 1.0F;
   private final bxd p;

   public gci(bxd $$0) {
      super(ape.wH, apf.g, gcm.t());
      this.p = $$0;
      this.k = gcm.a.b;
      this.i = false;
      this.j = 0;
   }

   @Override
   public boolean s() {
      return !this.p.aT();
   }

   @Override
   public void q() {
      if (!this.p.dG() && this.p.q() == null && this.p.gj()) {
         this.f = (double)((float)this.p.dq());
         this.g = (double)((float)this.p.ds());
         this.h = (double)((float)this.p.dw());
         this.d = 1.0F;
         this.e = 1.0F;
      } else {
         this.n();
      }
   }
}
