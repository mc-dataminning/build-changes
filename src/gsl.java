public class gsl {
   public static class a extends grr {
      private final gcl n;

      protected a(gcl $$0, avv $$1) {
         super($$1, avx.i, gsi.t());
         this.n = $$0;
         this.i = false;
         this.j = 0;
         this.d = 1.0F;
         this.l = true;
      }

      @Override
      public void q() {
         if (this.n.dK() || !this.n.bj()) {
            this.n();
         }
      }
   }

   public static class b extends grr {
      public static final int n = 40;
      private final gcl o;
      private int p;

      public b(gcl $$0) {
         super(avw.z, avx.i, gsi.t());
         this.o = $$0;
         this.i = true;
         this.j = 0;
         this.d = 1.0F;
         this.l = true;
      }

      @Override
      public void q() {
         if (!this.o.dK() && this.p >= 0) {
            if (this.o.bj()) {
               this.p++;
            } else {
               this.p -= 2;
            }

            this.p = Math.min(this.p, 40);
            this.d = Math.max(0.0F, Math.min((float)this.p / 40.0F, 1.0F));
         } else {
            this.n();
         }
      }
   }
}
