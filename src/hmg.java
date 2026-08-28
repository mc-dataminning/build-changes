public class hmg extends hlv {
   private static final float n = 0.0F;
   private static final float o = 0.75F;
   private final cqy p;
   private final ctk q;
   private final boolean r;

   public hmg(cqy $$0, ctk $$1, boolean $$2) {
      super($$2 ? awn.pu : awn.pv, awo.g, hmm.t());
      this.p = $$0;
      this.q = $$1;
      this.r = $$2;
      this.k = hmm.a.a;
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
         boolean $$1 = !this.q.cq() && this.q.f() instanceof ctz;
         if ($$0 >= 0.01F && !$$1) {
            this.d = azm.b(0.0F, 0.75F, $$0);
         } else {
            this.d = 0.0F;
         }
      }
   }
}
