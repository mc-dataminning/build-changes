public class hog extends hnw {
   private static final float n = 0.0F;
   private static final float o = 0.7F;
   private static final float p = 0.0F;
   private static final float q = 1.0F;
   private static final float r = 0.0025F;
   private final cuv s;
   private float t = 0.0F;

   public hog(cuv $$0) {
      super(awy.pz, awz.g, hon.t());
      this.s = $$0;
      this.i = true;
      this.j = 0;
      this.d = 0.0F;
      this.f = (double)((float)$$0.dA());
      this.g = (double)((float)$$0.dC());
      this.h = (double)((float)$$0.dG());
   }

   @Override
   public boolean s() {
      return !this.s.ba();
   }

   @Override
   public boolean r() {
      return true;
   }

   @Override
   public void q() {
      if (this.s.dQ()) {
         this.n();
      } else {
         this.f = (double)((float)this.s.dA());
         this.g = (double)((float)this.s.dC());
         this.h = (double)((float)this.s.dG());
         float $$0 = (float)this.s.dy().i();
         boolean $$1 = !this.s.cp() && this.s.f() instanceof cvk;
         if ($$0 >= 0.01F && this.s.dV().u().i() && !$$1) {
            this.t = azz.a(this.t + 0.0025F, 0.0F, 1.0F);
            this.d = azz.h(azz.a($$0, 0.0F, 0.5F), 0.0F, 0.7F);
         } else {
            this.t = 0.0F;
            this.d = 0.0F;
         }
      }
   }
}
