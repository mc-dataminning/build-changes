public class gta extends gsn {
   private static final float n = 1.0F;
   private static final float o = 1.0F;
   private final chj p;

   public gta(chj $$0) {
      super(avh.yu, avi.g, gte.t());
      this.p = $$0;
      this.k = gte.a.b;
      this.i = false;
      this.j = 0;
   }

   @Override
   public boolean s() {
      return !this.p.aY();
   }

   @Override
   public void q() {
      if (!this.p.dM() && this.p.p() == null && this.p.gt()) {
         this.f = (double)((float)this.p.dw());
         this.g = (double)((float)this.p.dy());
         this.h = (double)((float)this.p.dC());
         this.d = 1.0F;
         this.e = 1.0F;
      } else {
         this.n();
      }
   }
}
