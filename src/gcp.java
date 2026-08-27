public class gcp {
   public static class a extends gbv {
      private final fng n;

      protected a(fng $$0, apd $$1) {
         super($$1, apf.i, gcm.t());
         this.n = $$0;
         this.i = false;
         this.j = 0;
         this.d = 1.0F;
         this.l = true;
      }

      @Override
      public void q() {
         if (this.n.dG() || !this.n.bd()) {
            this.n();
         }
      }
   }

   public static class b extends gbv {
      public static final int n = 40;
      private final fng o;
      private int p;

      public b(fng $$0) {
         super(ape.z, apf.i, gcm.t());
         this.o = $$0;
         this.i = true;
         this.j = 0;
         this.d = 1.0F;
         this.l = true;
      }

      @Override
      public void q() {
         if (!this.o.dG() && this.p >= 0) {
            if (this.o.bd()) {
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
