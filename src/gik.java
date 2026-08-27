public class gik extends ghx {
   private static final float n = 1.0F;
   private static final float o = 1.0F;
   private final car p;

   public gik(car $$0) {
      super(art.xM, aru.g, gio.t());
      this.p = $$0;
      this.k = gio.a.b;
      this.i = false;
      this.j = 0;
   }

   @Override
   public boolean s() {
      return !this.p.aU();
   }

   @Override
   public void q() {
      if (!this.p.dG() && this.p.q() == null && this.p.gl()) {
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
