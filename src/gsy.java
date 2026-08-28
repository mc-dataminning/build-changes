public class gsy extends gsn {
   private static final float n = 0.0F;
   private static final float o = 0.75F;
   private final cml p;
   private final cog q;
   private final boolean r;

   public gsy(cml $$0, cog $$1, boolean $$2) {
      super($$2 ? avh.oL : avh.oM, avi.g, gte.t());
      this.p = $$0;
      this.q = $$1;
      this.r = $$2;
      this.k = gte.a.a;
      this.i = true;
      this.j = 0;
      this.d = 0.0F;
   }

   @Override
   public boolean s() {
      return !this.q.aY();
   }

   @Override
   public boolean r() {
      return true;
   }

   @Override
   public void q() {
      if (this.q.dM() || !this.p.bT() || this.p.de() != this.q) {
         this.n();
      } else if (this.r != this.p.bl()) {
         this.d = 0.0F;
      } else {
         float $$0 = (float)this.q.du().h();
         if ($$0 >= 0.01F) {
            this.d = ayg.b(0.0F, 0.75F, $$0);
         } else {
            this.d = 0.0F;
         }
      }
   }
}
