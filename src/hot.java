public class hot extends hoi {
   private static final float n = 0.0F;
   private static final float o = 0.75F;
   private final crz p;
   private final cum q;
   private final boolean r;

   public hot(crz $$0, cum $$1, boolean $$2) {
      super($$2 ? awr.px : awr.py, aws.g, hoz.t());
      this.p = $$0;
      this.q = $$1;
      this.r = $$2;
      this.k = hoz.a.a;
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
      if (this.q.dQ() || !this.p.bY() || this.p.dk() != this.q) {
         this.n();
      } else if (this.r != this.p.bm()) {
         this.d = 0.0F;
      } else {
         float $$0 = (float)this.q.dy().i();
         boolean $$1 = !this.q.cp() && this.q.f() instanceof cvb;
         if ($$0 >= 0.01F && !$$1) {
            this.d = azq.b(0.0F, 0.75F, $$0);
         } else {
            this.d = 0.0F;
         }
      }
   }
}
