public class gsk extends grx {
   private static final float n = 1.0F;
   private static final float o = 1.0F;
   private final chx p;

   public gsk(chx $$0) {
      super(awa.yr, awb.g, gso.t());
      this.p = $$0;
      this.k = gso.a.b;
      this.i = false;
      this.j = 0;
   }

   @Override
   public boolean s() {
      return !this.p.aW();
   }

   @Override
   public void q() {
      if (!this.p.dK() && this.p.p() == null && this.p.gw()) {
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
