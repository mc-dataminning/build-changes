public class hay {
   public static class a extends hae {
      private final ggc n;

      protected a(ggc $$0, awd $$1) {
         super($$1, awf.i, hav.t());
         this.n = $$0;
         this.i = false;
         this.j = 0;
         this.d = 1.0F;
         this.l = true;
      }

      @Override
      public void q() {
         if (this.n.dN() || !this.n.bn()) {
            this.n();
         }
      }
   }

   public static class b extends hae {
      public static final int n = 40;
      private final ggc o;
      private int p;

      public b(ggc $$0) {
         super(awe.z, awf.i, hav.t());
         this.o = $$0;
         this.i = true;
         this.j = 0;
         this.d = 1.0F;
         this.l = true;
      }

      @Override
      public void q() {
         if (!this.o.dN() && this.p >= 0) {
            if (this.o.bn()) {
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
