public class haa extends gzn {
   private static final float n = 1.0F;
   private static final float o = 1.0F;
   private final cim p;

   public haa(cim $$0) {
      super(awd.yA, awe.g, hae.t());
      this.p = $$0;
      this.k = hae.a.b;
      this.i = false;
      this.j = 0;
   }

   @Override
   public boolean s() {
      return !this.p.ba();
   }

   @Override
   public void q() {
      if (!this.p.dN() && this.p.m() == null && this.p.gp()) {
         this.f = (double)((float)this.p.dx());
         this.g = (double)((float)this.p.dz());
         this.h = (double)((float)this.p.dD());
         this.d = 1.0F;
         this.e = 1.0F;
      } else {
         this.n();
      }
   }
}
