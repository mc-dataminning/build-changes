public class gml extends gly {
   private static final float n = 1.0F;
   private static final float o = 1.0F;
   private final cdt p;

   public gml(cdt $$0) {
      super(aty.xV, atz.g, gmp.t());
      this.p = $$0;
      this.k = gmp.a.b;
      this.i = false;
      this.j = 0;
   }

   @Override
   public boolean s() {
      return !this.p.aU();
   }

   @Override
   public void q() {
      if (!this.p.dH() && this.p.p() == null && this.p.gt()) {
         this.f = (double)((float)this.p.dr());
         this.g = (double)((float)this.p.dt());
         this.h = (double)((float)this.p.dx());
         this.d = 1.0F;
         this.e = 1.0F;
      } else {
         this.n();
      }
   }
}
