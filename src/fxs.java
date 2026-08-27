public class fxs extends fxh {
   private static final float n = 0.0F;
   private static final float o = 0.75F;
   private final byo p;
   private final caf q;
   private final boolean r;

   public fxs(byo $$0, caf $$1, boolean $$2) {
      super($$2 ? amh.ng : amh.nh, ami.g, fxy.t());
      this.p = $$0;
      this.q = $$1;
      this.r = $$2;
      this.k = fxy.a.a;
      this.i = true;
      this.j = 0;
      this.d = 0.0F;
   }

   @Override
   public boolean s() {
      return !this.q.aQ();
   }

   @Override
   public boolean r() {
      return true;
   }

   @Override
   public void q() {
      if (this.q.dD() || !this.p.bM() || this.p.cW() != this.q) {
         this.n();
      } else if (this.r != this.p.aZ()) {
         this.d = 0.0F;
      } else {
         float $$0 = (float)this.q.dl().h();
         if ($$0 >= 0.01F) {
            this.d = apa.b(0.0F, 0.75F, $$0);
         } else {
            this.d = 0.0F;
         }
      }
   }
}
