public class gqg extends gpv {
   private static final float n = 0.0F;
   private static final float o = 0.75F;
   private final clh p;
   private final cnc q;
   private final boolean r;

   public gqg(clh $$0, cnc $$1, boolean $$2) {
      super($$2 ? avc.oB : avc.oC, avd.g, gqm.t());
      this.p = $$0;
      this.q = $$1;
      this.r = $$2;
      this.k = gqm.a.a;
      this.i = true;
      this.j = 0;
      this.d = 0.0F;
   }

   @Override
   public boolean s() {
      return !this.q.aU();
   }

   @Override
   public boolean r() {
      return true;
   }

   @Override
   public void q() {
      if (this.q.dI() || !this.p.bP() || this.p.da() != this.q) {
         this.n();
      } else if (this.r != this.p.bh()) {
         this.d = 0.0F;
      } else {
         float $$0 = (float)this.q.dq().h();
         if ($$0 >= 0.01F) {
            this.d = axz.b(0.0F, 0.75F, $$0);
         } else {
            this.d = 0.0F;
         }
      }
   }
}
