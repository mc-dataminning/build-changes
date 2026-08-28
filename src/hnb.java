public class hnb extends hmq {
   private static final float n = 0.0F;
   private static final float o = 0.75F;
   private final crj p;
   private final ctw q;
   private final boolean r;

   public hnb(crj $$0, ctw $$1, boolean $$2) {
      super($$2 ? awn.px : awn.py, awo.g, hnh.t());
      this.p = $$0;
      this.q = $$1;
      this.r = $$2;
      this.k = hnh.a.a;
      this.i = true;
      this.j = 0;
      this.d = 0.0F;
   }

   @Override
   public boolean s() {
      return !this.q.aZ();
   }

   @Override
   public boolean r() {
      return true;
   }

   @Override
   public void q() {
      if (this.q.dP() || !this.p.bX() || this.p.dj() != this.q) {
         this.n();
      } else if (this.r != this.p.bl()) {
         this.d = 0.0F;
      } else {
         float $$0 = (float)this.q.dx().i();
         boolean $$1 = !this.q.co() && this.q.f() instanceof cul;
         if ($$0 >= 0.01F && !$$1) {
            this.d = azm.b(0.0F, 0.75F, $$0);
         } else {
            this.d = 0.0F;
         }
      }
   }
}
