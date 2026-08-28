public class hik extends hhz {
   private static final float n = 0.0F;
   private static final float o = 0.75F;
   private final coy p;
   private final cqx q;
   private final boolean r;

   public hik(coy $$0, cqx $$1, boolean $$2) {
      super($$2 ? awa.pj : awa.pk, awb.g, hiq.t());
      this.p = $$0;
      this.q = $$1;
      this.r = $$2;
      this.k = hiq.a.a;
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
      } else if (this.r != this.p.bo()) {
         this.d = 0.0F;
      } else {
         float $$0 = (float)this.q.dy().i();
         boolean $$1 = !this.q.cq() && this.q.l() instanceof crm;
         if ($$0 >= 0.01F && !$$1) {
            this.d = ayz.b(0.0F, 0.75F, $$0);
         } else {
            this.d = 0.0F;
         }
      }
   }
}
