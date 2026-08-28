public class gsp {
   public static class a extends grv {
      private final gcp n;

      protected a(gcp $$0, avy $$1) {
         super($$1, awa.i, gsm.t());
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

   public static class b extends grv {
      public static final int n = 40;
      private final gcp o;
      private int p;

      public b(gcp $$0) {
         super(avz.z, awa.i, gsm.t());
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
