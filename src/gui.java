public class gui extends gtv {
   private static final float n = 1.0F;
   private static final float o = 1.0F;
   private final cgv p;

   public gui(cgv $$0) {
      super(avo.yP, avq.g, gum.t());
      this.p = $$0;
      this.k = gum.a.b;
      this.i = false;
      this.j = 0;
   }

   @Override
   public boolean s() {
      return !this.p.ba();
   }

   @Override
   public void q() {
      if (!this.p.dP() && this.p.p() == null && this.p.gE()) {
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
