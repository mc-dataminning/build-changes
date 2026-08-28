public class hlq extends hlf {
   private static final float n = 0.0F;
   private static final float o = 0.75F;
   private final cqs p;
   private final cte q;
   private final boolean r;

   public hlq(cqs $$0, cte $$1, boolean $$2) {
      super($$2 ? awl.pt : awl.pu, awm.g, hlw.t());
      this.p = $$0;
      this.q = $$1;
      this.r = $$2;
      this.k = hlw.a.a;
      this.i = true;
      this.j = 0;
      this.d = 0.0F;
   }

   @Override
   public boolean s() {
      return !this.q.bb();
   }

   @Override
   public boolean r() {
      return true;
   }

   @Override
   public void q() {
      if (this.q.dQ() || !this.p.bZ() || this.p.dk() != this.q) {
         this.n();
      } else if (this.r != this.p.bn()) {
         this.d = 0.0F;
      } else {
         float $$0 = (float)this.q.dy().i();
         boolean $$1 = !this.q.cq() && this.q.f() instanceof ctt;
         if ($$0 >= 0.01F && !$$1) {
            this.d = azk.b(0.0F, 0.75F, $$0);
         } else {
            this.d = 0.0F;
         }
      }
   }
}
