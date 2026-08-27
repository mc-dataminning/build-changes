public class gcc extends gbr {
   private static final float n = 0.0F;
   private static final float o = 0.75F;
   private final cca p;
   private final cdr q;
   private final boolean r;

   public gcc(cca $$0, cdr $$1, boolean $$2) {
      super($$2 ? apg.ng : apg.nh, aph.g, gci.t());
      this.p = $$0;
      this.q = $$1;
      this.r = $$2;
      this.k = gci.a.a;
      this.i = true;
      this.j = 0;
      this.d = 0.0F;
   }

   @Override
   public boolean s() {
      return !this.q.aS();
   }

   @Override
   public boolean r() {
      return true;
   }

   @Override
   public void q() {
      if (this.q.dG() || !this.p.bN() || this.p.cY() != this.q) {
         this.n();
      } else if (this.r != this.p.bc()) {
         this.d = 0.0F;
      } else {
         float $$0 = (float)this.q.do().h();
         if ($$0 >= 0.01F) {
            this.d = asb.b(0.0F, 0.75F, $$0);
         } else {
            this.d = 0.0F;
         }
      }
   }
}
