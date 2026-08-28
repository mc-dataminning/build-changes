public class hjr {
   public static class a extends hix {
      private final glv n;

      protected a(glv $$0, avz $$1) {
         super($$1, awb.i, hjo.t());
         this.n = $$0;
         this.i = false;
         this.j = 0;
         this.d = 1.0F;
         this.l = true;
      }

      @Override
      public void q() {
         if (this.n.dP() || !this.n.bm()) {
            this.n();
         }
      }
   }

   public static class b extends hix {
      public static final int n = 40;
      private final glv o;
      private int p;

      public b(glv $$0) {
         super(awa.z, awb.i, hjo.t());
         this.o = $$0;
         this.i = true;
         this.j = 0;
         this.d = 1.0F;
         this.l = true;
      }

      @Override
      public void q() {
         if (!this.o.dP() && this.p >= 0) {
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
