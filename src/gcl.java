public class gcl {
   public static class a extends gbr {
      private final fnc n;

      protected a(fnc $$0, apf $$1) {
         super($$1, aph.i, gci.t());
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

   public static class b extends gbr {
      public static final int n = 40;
      private final fnc o;
      private int p;

      public b(fnc $$0) {
         super(apg.z, aph.i, gci.t());
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
