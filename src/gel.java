public class gel extends gdy {
   private static final float n = 1.0F;
   private static final float o = 1.0F;
   private final byv p;

   public gel(byv $$0) {
      super(aqn.wL, aqo.g, gep.t());
      this.p = $$0;
      this.k = gep.a.b;
      this.i = false;
      this.j = 0;
   }

   @Override
   public boolean s() {
      return !this.p.aS();
   }

   @Override
   public void q() {
      if (!this.p.dG() && this.p.q() == null && this.p.gk()) {
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
