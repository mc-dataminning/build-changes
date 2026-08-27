public class gms {
   public static class a extends gly {
      private final fwu n;

      protected a(fwu $$0, atx $$1) {
         super($$1, atz.i, gmp.t());
         this.n = $$0;
         this.i = false;
         this.j = 0;
         this.d = 1.0F;
         this.l = true;
      }

      @Override
      public void q() {
         if (this.n.dH() || !this.n.bh()) {
            this.n();
         }
      }
   }

   public static class b extends gly {
      public static final int n = 40;
      private final fwu o;
      private int p;

      public b(fwu $$0) {
         super(aty.z, atz.i, gmp.t());
         this.o = $$0;
         this.i = true;
         this.j = 0;
         this.d = 1.0F;
         this.l = true;
      }

      @Override
      public void q() {
         if (!this.o.dH() && this.p >= 0) {
            if (this.o.bh()) {
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
