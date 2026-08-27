public class gcr {
   public static class a extends gbx {
      private final fni n;

      protected a(fni $$0, ape $$1) {
         super($$1, apg.i, gco.t());
         this.n = $$0;
         this.i = false;
         this.j = 0;
         this.d = 1.0F;
         this.l = true;
      }

      @Override
      public void q() {
         if (this.n.dG() || !this.n.bc()) {
            this.n();
         }
      }
   }

   public static class b extends gbx {
      public static final int n = 40;
      private final fni o;
      private int p;

      public b(fni $$0) {
         super(apf.z, apg.i, gco.t());
         this.o = $$0;
         this.i = true;
         this.j = 0;
         this.d = 1.0F;
         this.l = true;
      }

      @Override
      public void q() {
         if (!this.o.dG() && this.p >= 0) {
            if (this.o.bc()) {
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
