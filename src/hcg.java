public class hcg extends hbz {
   public static final int n = 20;
   private final ght o;
   private int p;

   public hcg(ght $$0) {
      super(awo.hX, awp.h, hcq.t());
      this.o = $$0;
      this.i = true;
      this.j = 0;
      this.d = 0.1F;
   }

   @Override
   public void q() {
      this.p++;
      if (!this.o.dT() && (this.p <= 20 || this.o.fM())) {
         this.f = (double)((float)this.o.dD());
         this.g = (double)((float)this.o.dF());
         this.h = (double)((float)this.o.dJ());
         float $$0 = (float)this.o.dB().h();
         if ((double)$$0 >= 1.0E-7) {
            this.d = azn.a($$0 / 4.0F, 0.0F, 1.0F);
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
