public class hpa {
   public static class a extends hog {
      private final gqz n;

      protected a(gqz $$0, awo $$1) {
         super($$1, awq.i, hox.t());
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

   public static class b extends hog {
      public static final int n = 40;
      private final gqz o;
      private int p;

      public b(gqz $$0) {
         super(awp.z, awq.i, hox.t());
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
