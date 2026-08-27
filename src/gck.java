public class gck extends gbx {
   private static final float n = 1.0F;
   private static final float o = 1.0F;
   private final bxf p;

   public gck(bxf $$0) {
      super(apf.wH, apg.g, gco.t());
      this.p = $$0;
      this.k = gco.a.b;
      this.i = false;
      this.j = 0;
   }

   @Override
   public boolean s() {
      return !this.p.aS();
   }

   @Override
   public void q() {
      if (!this.p.dG() && this.p.q() == null && this.p.gj()) {
         this.f = (double)((float)this.p.dq());
         this.g = (double)((float)this.p.ds());
         this.h = (double)((float)this.p.dw());
         this.d = 1.0F;
         this.e = 1.0F;
      } else {
         this.n();
      }
   }
}
