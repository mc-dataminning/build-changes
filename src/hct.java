public class hct {
   public static class a extends hbz {
      private final ght n;

      protected a(ght $$0, awn $$1) {
         super($$1, awp.i, hcq.t());
         this.n = $$0;
         this.i = false;
         this.j = 0;
         this.d = 1.0F;
         this.l = true;
      }

      @Override
      public void q() {
         if (this.n.dT() || !this.n.bq()) {
            this.n();
         }
      }
   }

   public static class b extends hbz {
      public static final int n = 40;
      private final ght o;
      private int p;

      public b(ght $$0) {
         super(awo.z, awp.i, hcq.t());
         this.o = $$0;
         this.i = true;
         this.j = 0;
         this.d = 1.0F;
         this.l = true;
      }

      @Override
      public void q() {
         if (!this.o.dT() && this.p >= 0) {
            if (this.o.bq()) {
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
