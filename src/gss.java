public class gss extends gsl {
   public static final int n = 20;
   private final gdf o;
   private int p;

   public gss(gdf $$0) {
      super(avh.hW, avi.h, gtc.t());
      this.o = $$0;
      this.i = true;
      this.j = 0;
      this.d = 0.1F;
   }

   @Override
   public void q() {
      this.p++;
      if (!this.o.dL() && (this.p <= 20 || this.o.fB())) {
         this.f = (double)((float)this.o.dv());
         this.g = (double)((float)this.o.dx());
         this.h = (double)((float)this.o.dB());
         float $$0 = (float)this.o.dt().g();
         if ((double)$$0 >= 1.0E-7) {
            this.d = ayg.a($$0 / 4.0F, 0.0F, 1.0F);
         } else {
            this.d = 0.0F;
         }

         if (this.p < 20) {
            this.d = 0.0F;
         } else if (this.p < 40) {
            this.d = this.d * ((float)(this.p - 20) / 20.0F);
         }

         float $$1 = 0.8F;
         if (this.d > 0.8F) {
            this.e = 1.0F + (this.d - 0.8F);
         } else {
            this.e = 1.0F;
         }
      } else {
         this.n();
      }
   }
}
