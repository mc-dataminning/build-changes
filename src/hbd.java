public class hbd {
   public static class a extends haj {
      private final ggh n;

      protected a(ggh $$0, awf $$1) {
         super($$1, awh.i, hba.t());
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

   public static class b extends haj {
      public static final int n = 40;
      private final ggh o;
      private int p;

      public b(ggh $$0) {
         super(awg.z, awh.i, hba.t());
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
