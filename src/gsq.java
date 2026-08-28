public class gsq {
   public static class a extends grw {
      private final gcq n;

      protected a(gcq $$0, avz $$1) {
         super($$1, awb.i, gsn.t());
         this.n = $$0;
         this.i = false;
         this.j = 0;
         this.d = 1.0F;
         this.l = true;
      }

      @Override
      public void q() {
         if (this.n.dK() || !this.n.bj()) {
            this.n();
         }
      }
   }

   public static class b extends grw {
      public static final int n = 40;
      private final gcq o;
      private int p;

      public b(gcq $$0) {
         super(awa.z, awb.i, gsn.t());
         this.o = $$0;
         this.i = true;
         this.j = 0;
         this.d = 1.0F;
         this.l = true;
      }

      @Override
      public void q() {
         if (!this.o.dK() && this.p >= 0) {
            if (this.o.bj()) {
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
