public class gtu extends gth {
   private static final float n = 1.0F;
   private static final float o = 1.0F;
   private final chv p;

   public gtu(chv $$0) {
      super(avp.yu, avq.g, gty.t());
      this.p = $$0;
      this.k = gty.a.b;
      this.i = false;
      this.j = 0;
   }

   @Override
   public boolean s() {
      return !this.p.aX();
   }

   @Override
   public void q() {
      if (!this.p.dK() && this.p.p() == null && this.p.gm()) {
         this.f = (double)((float)this.p.du());
         this.g = (double)((float)this.p.dw());
         this.h = (double)((float)this.p.dA());
         this.d = 1.0F;
         this.e = 1.0F;
      } else {
         this.n();
      }
   }
}
