public class gpb extends goo {
   private static final float n = 1.0F;
   private static final float o = 1.0F;
   private final cez p;

   public gpb(cez $$0) {
      super(auo.xY, aup.g, gpf.t());
      this.p = $$0;
      this.k = gpf.a.b;
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
