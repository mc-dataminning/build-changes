public class gkj {
   public static class a extends gjp {
      private final fun n;

      protected a(fun $$0, atj $$1) {
         super($$1, atl.i, gkg.t());
         this.n = $$0;
         this.i = false;
         this.j = 0;
         this.d = 1.0F;
         this.l = true;
      }

      @Override
      public void q() {
         if (this.n.dH() || !this.n.be()) {
            this.n();
         }
      }
   }

   public static class b extends gjp {
      public static final int n = 40;
      private final fun o;
      private int p;

      public b(fun $$0) {
         super(atk.z, atl.i, gkg.t());
         this.o = $$0;
         this.i = true;
         this.j = 0;
         this.d = 1.0F;
         this.l = true;
      }

      @Override
      public void q() {
         if (!this.o.dH() && this.p >= 0) {
            if (this.o.be()) {
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
