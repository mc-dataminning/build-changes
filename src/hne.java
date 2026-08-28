public class hne extends hmx {
   public static final int n = 20;
   private final gpo o;
   private int p;

   public hne(gpo $$0) {
      super(awn.iu, awo.h, hno.t());
      this.o = $$0;
      this.i = true;
      this.j = 0;
      this.d = 0.1F;
   }

   @Override
   public void q() {
      this.p++;
      if (!this.o.dP() && (this.p <= 20 || this.o.fI())) {
         this.f = (double)((float)this.o.dz());
         this.g = (double)((float)this.o.dB());
         this.h = (double)((float)this.o.dF());
         float $$0 = (float)this.o.dx().h();
         if ((double)$$0 >= 1.0E-7) {
            this.d = azm.a($$0 / 4.0F, 0.0F, 1.0F);
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
