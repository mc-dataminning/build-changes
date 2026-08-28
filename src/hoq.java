public class hoq {
   public static class a extends hnw {
      private final gqm n;

      protected a(gqm $$0, awx $$1) {
         super($$1, awz.i, hon.t());
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

   public static class b extends hnw {
      public static final int n = 40;
      private final gqm o;
      private int p;

      public b(gqm $$0) {
         super(awy.z, awz.i, hon.t());
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
