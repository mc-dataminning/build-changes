public class ghu extends ghj {
   private static final float n = 0.0F;
   private static final float o = 0.75F;
   private final cfi p;
   private final cha q;
   private final boolean r;

   public ghu(cfi $$0, cha $$1, boolean $$2) {
      super($$2 ? ars.nU : ars.nV, art.g, gia.t());
      this.p = $$0;
      this.q = $$1;
      this.r = $$2;
      this.k = gia.a.a;
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
      } else if (this.r != this.p.be()) {
         this.d = 0.0F;
      } else {
         float $$0 = (float)this.q.dp().h();
         if ($$0 >= 0.01F) {
            this.d = auo.b(0.0F, 0.75F, $$0);
         } else {
            this.d = 0.0F;
         }
      }
   }
}
