public class hah {
   public static class a extends gzn {
      private final gfs n;

      protected a(gfs $$0, awc $$1) {
         super($$1, awe.i, hae.t());
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

   public static class b extends gzn {
      public static final int n = 40;
      private final gfs o;
      private int p;

      public b(gfs $$0) {
         super(awd.z, awe.i, hae.t());
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
