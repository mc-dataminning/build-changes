public class gbw {
   public static class a extends gbc {
      private final fmn n;

      protected a(fmn $$0, aov $$1) {
         super($$1, aox.i, gbt.t());
         this.n = $$0;
         this.i = false;
         this.j = 0;
         this.d = 1.0F;
         this.l = true;
      }

      @Override
      public void q() {
         if (this.n.dF() || !this.n.bc()) {
            this.n();
         }
      }
   }

   public static class b extends gbc {
      public static final int n = 40;
      private final fmn o;
      private int p;

      public b(fmn $$0) {
         super(aow.z, aox.i, gbt.t());
         this.o = $$0;
         this.i = true;
         this.j = 0;
         this.d = 1.0F;
         this.l = true;
      }

      @Override
      public void q() {
         if (!this.o.dF() && this.p >= 0) {
            if (this.o.bc()) {
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
