public class hap extends hae {
   private static final float n = 0.0F;
   private static final float o = 0.75F;
   private final cnu p;
   private final cps q;
   private final boolean r;

   public hap(cnu $$0, cps $$1, boolean $$2) {
      super($$2 ? awe.oM : awe.oN, awf.g, hav.t());
      this.p = $$0;
      this.q = $$1;
      this.r = $$2;
      this.k = hav.a.a;
      this.i = true;
      this.j = 0;
      this.d = 0.0F;
   }

   @Override
   public boolean s() {
      return !this.q.ba();
   }

   @Override
   public boolean r() {
      return true;
   }

   @Override
   public void q() {
      if (this.q.dN() || !this.p.bW() || this.p.dg() != this.q) {
         this.n();
      } else if (this.r != this.p.bn()) {
         this.d = 0.0F;
      } else {
         float $$0 = (float)this.q.dv().i();
         boolean $$1 = !this.q.cn() && this.q.m() instanceof cqg;
         if ($$0 >= 0.01F && !$$1) {
            this.d = azd.b(0.0F, 0.75F, $$0);
         } else {
            this.d = 0.0F;
         }
      }
   }
}
