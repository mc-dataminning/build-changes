public class gzy extends gzn {
   private static final float n = 0.0F;
   private static final float o = 0.75F;
   private final cnp p;
   private final cpm q;
   private final boolean r;

   public gzy(cnp $$0, cpm $$1, boolean $$2) {
      super($$2 ? awd.oM : awd.oN, awe.g, hae.t());
      this.p = $$0;
      this.q = $$1;
      this.r = $$2;
      this.k = hae.a.a;
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
      boolean $$0 = !this.q.cn() && this.q.m() instanceof cqa;
      if (this.q.dN() || !this.p.bW() || this.p.dg() != this.q || $$0) {
         this.n();
      } else if (this.r != this.p.bn()) {
         this.d = 0.0F;
      } else {
         float $$1 = (float)this.q.dv().i();
         if ($$1 >= 0.01F) {
            this.d = azc.b(0.0F, 0.75F, $$1);
         } else {
            this.d = 0.0F;
         }
      }
   }
}
