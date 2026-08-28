public class gtw extends gtj {
   private static final float n = 1.0F;
   private static final float o = 1.0F;
   private final chv p;

   public gtw(chv $$0) {
      super(avp.yu, avq.g, gua.t());
      this.p = $$0;
      this.k = gua.a.b;
      this.i = false;
      this.j = 0;
   }

   @Override
   public boolean s() {
      return !this.p.aX();
   }

   @Override
   public void q() {
      if (!this.p.dJ() && this.p.p() == null && this.p.gl()) {
         this.f = (double)((float)this.p.dt());
         this.g = (double)((float)this.p.dv());
         this.h = (double)((float)this.p.dz());
         this.d = 1.0F;
         this.e = 1.0F;
      } else {
         this.n();
      }
   }
}
