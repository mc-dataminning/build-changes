public class gtu extends gtj {
   private static final float n = 0.0F;
   private static final float o = 0.75F;
   private final cmx p;
   private final cot q;
   private final boolean r;

   public gtu(cmx $$0, cot $$1, boolean $$2) {
      super($$2 ? avp.oL : avp.oM, avq.g, gua.t());
      this.p = $$0;
      this.q = $$1;
      this.r = $$2;
      this.k = gua.a.a;
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
      if (this.q.dJ() || !this.p.bS() || this.p.dc() != this.q) {
         this.n();
      } else if (this.r != this.p.bk()) {
         this.d = 0.0F;
      } else {
         float $$0 = (float)this.q.dr().h();
         if ($$0 >= 0.01F) {
            this.d = ayo.b(0.0F, 0.75F, $$0);
         } else {
            this.d = 0.0F;
         }
      }
   }
}
