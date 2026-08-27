public class gcf {
   public static class a extends gbl {
      private final fmw n;

      protected a(fmw $$0, aov $$1) {
         super($$1, aox.i, gcc.t());
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

   public static class b extends gbl {
      public static final int n = 40;
      private final fmw o;
      private int p;

      public b(fmw $$0) {
         super(aow.z, aox.i, gcc.t());
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
