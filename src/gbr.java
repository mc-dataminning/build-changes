public class gbr {
   public static class a extends gax {
      private final fmi n;

      protected a(fmi $$0, aot $$1) {
         super($$1, aov.i, gbo.t());
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

   public static class b extends gax {
      public static final int n = 40;
      private final fmi o;
      private int p;

      public b(fmi $$0) {
         super(aou.z, aov.i, gbo.t());
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
