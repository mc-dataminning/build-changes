public class gbk extends gax {
   private static final float n = 1.0F;
   private static final float o = 1.0F;
   private final bwu p;

   public gbk(bwu $$0) {
      super(aou.wH, aov.g, gbo.t());
      this.p = $$0;
      this.k = gbo.a.b;
      this.i = false;
      this.j = 0;
   }

   @Override
   public boolean s() {
      return !this.p.aS();
   }

   @Override
   public void q() {
      if (!this.p.dF() && this.p.j() == null && this.p.gf()) {
         this.f = (double)((float)this.p.dp());
         this.g = (double)((float)this.p.dr());
         this.h = (double)((float)this.p.dv());
         this.d = 1.0F;
         this.e = 1.0F;
      } else {
         this.n();
      }
   }
}
