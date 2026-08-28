public class gto extends gth {
   public static final int n = 20;
   private final gdz o;
   private int p;

   public gto(gdz $$0) {
      super(avp.hW, avq.h, gty.t());
      this.o = $$0;
      this.i = true;
      this.j = 0;
      this.d = 0.1F;
   }

   @Override
   public void q() {
      this.p++;
      if (!this.o.dK() && (this.p <= 20 || this.o.fB())) {
         this.f = (double)((float)this.o.du());
         this.g = (double)((float)this.o.dw());
         this.h = (double)((float)this.o.dA());
         float $$0 = (float)this.o.ds().g();
         if ((double)$$0 >= 1.0E-7) {
            this.d = ayo.a($$0 / 4.0F, 0.0F, 1.0F);
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
