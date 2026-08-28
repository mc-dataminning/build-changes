public class hbj extends hay {
   private static final float n = 0.0F;
   private static final float o = 0.75F;
   private final coh p;
   private final cqf q;
   private final boolean r;

   public hbj(coh $$0, cqf $$1, boolean $$2) {
      super($$2 ? awk.oK : awk.oL, awl.g, hbp.t());
      this.p = $$0;
      this.q = $$1;
      this.r = $$2;
      this.k = hbp.a.a;
      this.i = true;
      this.j = 0;
      this.d = 0.0F;
   }

   @Override
   public boolean s() {
      return !this.q.bc();
   }

   @Override
   public boolean r() {
      return true;
   }

   @Override
   public void q() {
      if (this.q.dS() || !this.p.ca() || this.p.dl() != this.q) {
         this.n();
      } else if (this.r != this.p.bp()) {
         this.d = 0.0F;
      } else {
         float $$0 = (float)this.q.dA().i();
         boolean $$1 = !this.q.cr() && this.q.m() instanceof cqt;
         if ($$0 >= 0.01F && !$$1) {
            this.d = azj.b(0.0F, 0.75F, $$0);
         } else {
            this.d = 0.0F;
         }
      }
   }
}
