public class gtp extends gtc {
   private static final float n = 1.0F;
   private static final float o = 1.0F;
   private final cht p;

   public gtp(cht $$0) {
      super(avo.yu, avp.g, gtt.t());
      this.p = $$0;
      this.k = gtt.a.b;
      this.i = false;
      this.j = 0;
   }

   @Override
   public boolean s() {
      return !this.p.aX();
   }

   @Override
   public void q() {
      if (!this.p.dL() && this.p.p() == null && this.p.gn()) {
         this.f = (double)((float)this.p.dv());
         this.g = (double)((float)this.p.dx());
         this.h = (double)((float)this.p.dB());
         this.d = 1.0F;
         this.e = 1.0F;
      } else {
         this.n();
      }
   }
}
