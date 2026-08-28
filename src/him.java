public class him {
   public static class a extends hhs {
      private final gkt n;

      protected a(gkt $$0, avy $$1) {
         super($$1, awa.i, hij.t());
         this.n = $$0;
         this.i = false;
         this.j = 0;
         this.d = 1.0F;
         this.l = true;
      }

      @Override
      public void q() {
         if (this.n.dR() || !this.n.bo()) {
            this.n();
         }
      }
   }

   public static class b extends hhs {
      public static final int n = 40;
      private final gkt o;
      private int p;

      public b(gkt $$0) {
         super(avz.z, awa.i, hij.t());
         this.o = $$0;
         this.i = true;
         this.j = 0;
         this.d = 1.0F;
         this.l = true;
      }

      @Override
      public void q() {
         if (!this.o.dR() && this.p >= 0) {
            if (this.o.bo()) {
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
