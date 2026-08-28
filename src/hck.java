public class hck extends hbz {
   private static final float n = 0.0F;
   private static final float o = 0.75F;
   private final cor p;
   private final cqo q;
   private final boolean r;

   public hck(cor $$0, cqo $$1, boolean $$2) {
      super($$2 ? awo.oK : awo.oL, awp.g, hcq.t());
      this.p = $$0;
      this.q = $$1;
      this.r = $$2;
      this.k = hcq.a.a;
      this.i = true;
      this.j = 0;
      this.d = 0.0F;
   }

   @Override
   public boolean s() {
      return !this.q.bd();
   }

   @Override
   public boolean r() {
      return true;
   }

   @Override
   public void q() {
      if (this.q.dT() || !this.p.cb() || this.p.dm() != this.q) {
         this.n();
      } else if (this.r != this.p.bq()) {
         this.d = 0.0F;
      } else {
         float $$0 = (float)this.q.dB().i();
         boolean $$1 = !this.q.cs() && this.q.m() instanceof crc;
         if ($$0 >= 0.01F && !$$1) {
            this.d = azn.b(0.0F, 0.75F, $$0);
         } else {
            this.d = 0.0F;
         }
      }
   }
}
