public class gub {
   public static class a extends gth {
      private final gdz n;

      protected a(gdz $$0, avo $$1) {
         super($$1, avq.i, gty.t());
         this.n = $$0;
         this.i = false;
         this.j = 0;
         this.d = 1.0F;
         this.l = true;
      }

      @Override
      public void q() {
         if (this.n.dK() || !this.n.bk()) {
            this.n();
         }
      }
   }

   public static class b extends gth {
      public static final int n = 40;
      private final gdz o;
      private int p;

      public b(gdz $$0) {
         super(avp.z, avq.i, gty.t());
         this.o = $$0;
         this.i = true;
         this.j = 0;
         this.d = 1.0F;
         this.l = true;
      }

      @Override
      public void q() {
         if (!this.o.dK() && this.p >= 0) {
            if (this.o.bk()) {
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
