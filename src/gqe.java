public class gqe {
   public static class a extends gpk {
      private final gag n;

      protected a(gag $$0, auy $$1) {
         super($$1, ava.i, gqb.t());
         this.n = $$0;
         this.i = false;
         this.j = 0;
         this.d = 1.0F;
         this.l = true;
      }

      @Override
      public void q() {
         if (this.n.dI() || !this.n.bh()) {
            this.n();
         }
      }
   }

   public static class b extends gpk {
      public static final int n = 40;
      private final gag o;
      private int p;

      public b(gag $$0) {
         super(auz.z, ava.i, gqb.t());
         this.o = $$0;
         this.i = true;
         this.j = 0;
         this.d = 1.0F;
         this.l = true;
      }

      @Override
      public void q() {
         if (!this.o.dI() && this.p >= 0) {
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
