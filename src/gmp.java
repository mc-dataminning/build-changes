public class gmp {
   public static class a extends glv {
      private final fws n;

      protected a(fws $$0, atx $$1) {
         super($$1, atz.i, gmm.t());
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

   public static class b extends glv {
      public static final int n = 40;
      private final fws o;
      private int p;

      public b(fws $$0) {
         super(aty.z, atz.i, gmm.t());
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
