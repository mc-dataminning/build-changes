public class hil {
   public static class a extends hhr {
      private final gkv n;

      protected a(gkv $$0, avz $$1) {
         super($$1, awb.i, hii.t());
         this.n = $$0;
         this.i = false;
         this.j = 0;
         this.d = 1.0F;
         this.l = true;
      }

      @Override
      public void q() {
         if (this.n.dR() || !this.n.bo()) {
            this.n();
         }
      }
   }

   public static class b extends hhr {
      public static final int n = 40;
      private final gkv o;
      private int p;

      public b(gkv $$0) {
         super(awa.z, awb.i, hii.t());
         this.o = $$0;
         this.i = true;
         this.j = 0;
         this.d = 1.0F;
         this.l = true;
      }

      @Override
      public void q() {
         if (!this.o.dR() && this.p >= 0) {
            if (this.o.bo()) {
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
