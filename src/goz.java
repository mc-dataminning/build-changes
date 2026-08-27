public class goz {
   public static class a extends gof {
      private final fzb n;

      protected a(fzb $$0, aul $$1) {
         super($$1, aun.i, gow.t());
         this.n = $$0;
         this.i = false;
         this.j = 0;
         this.d = 1.0F;
         this.l = true;
      }

      @Override
      public void q() {
         if (this.n.dH() || !this.n.bh()) {
            this.n();
         }
      }
   }

   public static class b extends gof {
      public static final int n = 40;
      private final fzb o;
      private int p;

      public b(fzb $$0) {
         super(aum.z, aun.i, gow.t());
         this.o = $$0;
         this.i = true;
         this.j = 0;
         this.d = 1.0F;
         this.l = true;
      }

      @Override
      public void q() {
         if (!this.o.dH() && this.p >= 0) {
            if (this.o.bh()) {
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
