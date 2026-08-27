public class gpi {
   public static class a extends goo {
      private final fzk n;

      protected a(fzk $$0, aun $$1) {
         super($$1, aup.i, gpf.t());
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

   public static class b extends goo {
      public static final int n = 40;
      private final fzk o;
      private int p;

      public b(fzk $$0) {
         super(auo.z, aup.i, gpf.t());
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
