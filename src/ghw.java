public class ghw extends ghj {
   private static final float n = 1.0F;
   private static final float o = 1.0F;
   private final cak p;

   public ghw(cak $$0) {
      super(ars.xx, art.g, gia.t());
      this.p = $$0;
      this.k = gia.a.b;
      this.i = false;
      this.j = 0;
   }

   @Override
   public boolean s() {
      return !this.p.aU();
   }

   @Override
   public void q() {
      if (!this.p.dH() && this.p.q() == null && this.p.gk()) {
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
