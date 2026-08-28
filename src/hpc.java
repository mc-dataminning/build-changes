public class hpc {
   public static class a extends hoi {
      private final grb n;

      protected a(grb $$0, awq $$1) {
         super($$1, aws.i, hoz.t());
         this.n = $$0;
         this.i = false;
         this.j = 0;
         this.d = 1.0F;
         this.l = true;
      }

      @Override
      public void q() {
         if (this.n.dQ() || !this.n.bm()) {
            this.n();
         }
      }
   }

   public static class b extends hoi {
      public static final int n = 40;
      private final grb o;
      private int p;

      public b(grb $$0) {
         super(awr.z, aws.i, hoz.t());
         this.o = $$0;
         this.i = true;
         this.j = 0;
         this.d = 1.0F;
         this.l = true;
      }

      @Override
      public void q() {
         if (!this.o.dQ() && this.p >= 0) {
            if (this.o.bm()) {
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
