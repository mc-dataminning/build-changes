public class gso {
   public static class a extends gru {
      private final gco n;

      protected a(gco $$0, avy $$1) {
         super($$1, awa.i, gsl.t());
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

   public static class b extends gru {
      public static final int n = 40;
      private final gco o;
      private int p;

      public b(gco $$0) {
         super(avz.z, awa.i, gsl.t());
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
