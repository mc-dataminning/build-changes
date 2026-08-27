public class gdl {
   public static class a extends gcr {
      private final foc n;

      protected a(foc $$0, aqc $$1) {
         super($$1, aqe.i, gdi.t());
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

   public static class b extends gcr {
      public static final int n = 40;
      private final foc o;
      private int p;

      public b(foc $$0) {
         super(aqd.z, aqe.i, gdi.t());
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
