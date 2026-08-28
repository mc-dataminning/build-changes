public class gtn extends gtc {
   private static final float n = 0.0F;
   private static final float o = 0.75F;
   private final cmv p;
   private final cor q;
   private final boolean r;

   public gtn(cmv $$0, cor $$1, boolean $$2) {
      super($$2 ? avo.oL : avo.oM, avp.g, gtt.t());
      this.p = $$0;
      this.q = $$1;
      this.r = $$2;
      this.k = gtt.a.a;
      this.i = true;
      this.j = 0;
      this.d = 0.0F;
   }

   @Override
   public boolean s() {
      return !this.q.aX();
   }

   @Override
   public boolean r() {
      return true;
   }

   @Override
   public void q() {
      if (this.q.dL() || !this.p.bS() || this.p.dd() != this.q) {
         this.n();
      } else if (this.r != this.p.bk()) {
         this.d = 0.0F;
      } else {
         float $$0 = (float)this.q.dt().h();
         if ($$0 >= 0.01F) {
            this.d = ayn.b(0.0F, 0.75F, $$0);
         } else {
            this.d = 0.0F;
         }
      }
   }
}
