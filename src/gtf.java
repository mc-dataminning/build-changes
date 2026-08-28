public class gtf {
   public static class a extends gsl {
      private final gdf n;

      protected a(gdf $$0, avg $$1) {
         super($$1, avi.i, gtc.t());
         this.n = $$0;
         this.i = false;
         this.j = 0;
         this.d = 1.0F;
         this.l = true;
      }

      @Override
      public void q() {
         if (this.n.dL() || !this.n.bk()) {
            this.n();
         }
      }
   }

   public static class b extends gsl {
      public static final int n = 40;
      private final gdf o;
      private int p;

      public b(gdf $$0) {
         super(avh.z, avi.i, gtc.t());
         this.o = $$0;
         this.i = true;
         this.j = 0;
         this.d = 1.0F;
         this.l = true;
      }

      @Override
      public void q() {
         if (!this.o.dL() && this.p >= 0) {
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
