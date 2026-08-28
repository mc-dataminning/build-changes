public class hni extends hmx {
   private static final float n = 0.0F;
   private static final float o = 0.75F;
   private final crm p;
   private final ctz q;
   private final boolean r;

   public hni(crm $$0, ctz $$1, boolean $$2) {
      super($$2 ? awn.px : awn.py, awo.g, hno.t());
      this.p = $$0;
      this.q = $$1;
      this.r = $$2;
      this.k = hno.a.a;
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
         boolean $$1 = !this.q.co() && this.q.f() instanceof cuo;
         if ($$0 >= 0.01F && !$$1) {
            this.d = azm.b(0.0F, 0.75F, $$0);
         } else {
            this.d = 0.0F;
         }
      }
   }
}
