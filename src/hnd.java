public class hnd extends hmq {
   private static final float n = 1.0F;
   private static final float o = 1.0F;
   private final cmb p;

   public hnd(cmb $$0) {
      super(awn.zy, awo.g, hnh.t());
      this.p = $$0;
      this.k = hnh.a.b;
      this.i = false;
      this.j = 0;
   }

   @Override
   public boolean s() {
      return !this.p.aZ();
   }

   @Override
   public void q() {
      if (!this.p.dP() && this.p.f() == null && this.p.gu()) {
         this.f = (double)((float)this.p.dz());
         this.g = (double)((float)this.p.dB());
         this.h = (double)((float)this.p.dF());
         this.d = 1.0F;
         this.e = 1.0F;
      } else {
         this.n();
      }
   }
}
