public class hbl extends hay {
   private static final float n = 1.0F;
   private static final float o = 1.0F;
   private final cjd p;

   public hbl(cjd $$0) {
      super(awk.yy, awl.g, hbp.t());
      this.p = $$0;
      this.k = hbp.a.b;
      this.i = false;
      this.j = 0;
   }

   @Override
   public boolean s() {
      return !this.p.bc();
   }

   @Override
   public void q() {
      if (!this.p.dS() && this.p.m() == null && this.p.gw()) {
         this.f = (double)((float)this.p.dC());
         this.g = (double)((float)this.p.dE());
         this.h = (double)((float)this.p.dI());
         this.d = 1.0F;
         this.e = 1.0F;
      } else {
         this.n();
      }
   }
}
