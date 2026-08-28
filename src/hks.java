public class hks {
   public static class a extends hjy {
      private final gmw n;

      protected a(gmw $$0, awj $$1) {
         super($$1, awl.i, hkp.t());
         this.n = $$0;
         this.i = false;
         this.j = 0;
         this.d = 1.0F;
         this.l = true;
      }

      @Override
      public void q() {
         if (this.n.dQ() || !this.n.bn()) {
            this.n();
         }
      }
   }

   public static class b extends hjy {
      public static final int n = 40;
      private final gmw o;
      private int p;

      public b(gmw $$0) {
         super(awk.z, awl.i, hkp.t());
         this.o = $$0;
         this.i = true;
         this.j = 0;
         this.d = 1.0F;
         this.l = true;
      }

      @Override
      public void q() {
         if (!this.o.dQ() && this.p >= 0) {
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
