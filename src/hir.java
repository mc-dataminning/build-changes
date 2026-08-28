public class hir {
   public static class a extends hhx {
      private final gkv n;

      protected a(gkv $$0, avz $$1) {
         super($$1, awb.i, hio.t());
         this.n = $$0;
         this.i = false;
         this.j = 0;
         this.d = 1.0F;
         this.l = true;
      }

      @Override
      public void q() {
         if (this.n.dQ() || !this.n.bo()) {
            this.n();
         }
      }
   }

   public static class b extends hhx {
      public static final int n = 40;
      private final gkv o;
      private int p;

      public b(gkv $$0) {
         super(awa.z, awb.i, hio.t());
         this.o = $$0;
         this.i = true;
         this.j = 0;
         this.d = 1.0F;
         this.l = true;
      }

      @Override
      public void q() {
         if (!this.o.dQ() && this.p >= 0) {
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
