public class him extends hhz {
   private static final float n = 1.0F;
   private static final float o = 1.0F;
   private final cjq p;

   public him(cjq $$0) {
      super(awa.zi, awb.g, hiq.t());
      this.p = $$0;
      this.k = hiq.a.b;
      this.i = false;
      this.j = 0;
   }

   @Override
   public boolean s() {
      return !this.p.bb();
   }

   @Override
   public void q() {
      if (!this.p.dQ() && this.p.O_() == null && this.p.gt()) {
         this.f = (double)((float)this.p.dA());
         this.g = (double)((float)this.p.dC());
         this.h = (double)((float)this.p.dG());
         this.d = 1.0F;
         this.e = 1.0F;
      } else {
         this.n();
      }
   }
}
