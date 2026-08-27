public class gbl extends gbc {
   private static final float n = 0.0F;
   private static final float o = 1.0F;
   private static final float p = 0.7F;
   private static final float q = 0.5F;
   private final byx r;

   public gbl(byx $$0) {
      super(aow.kl, aox.f, gbt.t());
      this.r = $$0;
      this.k = gbt.a.a;
      this.i = true;
      this.j = 0;
   }

   @Override
   public boolean s() {
      return !this.r.aS();
   }

   @Override
   public void q() {
      if (!this.r.dF() && this.r.j() == null) {
         this.f = (double)((float)this.r.dp());
         this.g = (double)((float)this.r.dr());
         this.h = (double)((float)this.r.dv());
         float $$0 = this.r.G(0.0F);
         this.d = 0.0F + 1.0F * $$0 * $$0;
         this.e = 0.7F + 0.5F * $$0;
      } else {
         this.n();
      }
   }
}
