public class hif extends hhs {
   private static final float n = 1.0F;
   private static final float o = 1.0F;
   private final cjn p;

   public hif(cjn $$0) {
      super(avz.zi, awa.g, hij.t());
      this.p = $$0;
      this.k = hij.a.b;
      this.i = false;
      this.j = 0;
   }

   @Override
   public boolean s() {
      return !this.p.bb();
   }

   @Override
   public void q() {
      if (!this.p.dR() && this.p.O_() == null && this.p.gq()) {
         this.f = (double)((float)this.p.dB());
         this.g = (double)((float)this.p.dD());
         this.h = (double)((float)this.p.dH());
         this.d = 1.0F;
         this.e = 1.0F;
      } else {
         this.n();
      }
   }
}
