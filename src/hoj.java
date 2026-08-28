public class hoj extends hnw {
   private static final float n = 1.0F;
   private static final float o = 1.0F;
   private final cmu p;

   public hoj(cmu $$0) {
      super(awy.zy, awz.g, hon.t());
      this.p = $$0;
      this.k = hon.a.b;
      this.i = false;
      this.j = 0;
   }

   @Override
   public boolean s() {
      return !this.p.ba();
   }

   @Override
   public void q() {
      if (!this.p.dQ() && this.p.f() == null && this.p.gv()) {
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
