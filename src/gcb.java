public class gcb extends gbq {
   private static final float n = 0.0F;
   private static final float o = 0.75F;
   private final cbp p;
   private final cdg q;
   private final boolean r;

   public gcb(cbp $$0, cdg $$1, boolean $$2) {
      super($$2 ? aoz.ng : aoz.nh, apa.g, gch.t());
      this.p = $$0;
      this.q = $$1;
      this.r = $$2;
      this.k = gch.a.a;
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
      if (this.q.dF() || !this.p.bN() || this.p.cY() != this.q) {
         this.n();
      } else if (this.r != this.p.bc()) {
         this.d = 0.0F;
      } else {
         float $$0 = (float)this.q.dn().h();
         if ($$0 >= 0.01F) {
            this.d = ars.b(0.0F, 0.75F, $$0);
         } else {
            this.d = 0.0F;
         }
      }
   }
}
