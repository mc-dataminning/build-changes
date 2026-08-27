public class gmg extends glv {
   private static final float n = 0.0F;
   private static final float o = 0.75F;
   private final cis p;
   private final ckn q;
   private final boolean r;

   public gmg(cis $$0, ckn $$1, boolean $$2) {
      super($$2 ? aty.on : aty.oo, atz.g, gmm.t());
      this.p = $$0;
      this.q = $$1;
      this.r = $$2;
      this.k = gmm.a.a;
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
      if (this.q.dH() || !this.p.bO() || this.p.cZ() != this.q) {
         this.n();
      } else if (this.r != this.p.bh()) {
         this.d = 0.0F;
      } else {
         float $$0 = (float)this.q.dp().h();
         if ($$0 >= 0.01F) {
            this.d = aww.b(0.0F, 0.75F, $$0);
         } else {
            this.d = 0.0F;
         }
      }
   }
}
