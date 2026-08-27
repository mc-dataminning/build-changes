public class glp {
   public static class a extends gkv {
      private final fvs n;

      protected a(fvs $$0, ato $$1) {
         super($$1, atq.i, glm.t());
         this.n = $$0;
         this.i = false;
         this.j = 0;
         this.d = 1.0F;
         this.l = true;
      }

      @Override
      public void q() {
         if (this.n.dE() || !this.n.be()) {
            this.n();
         }
      }
   }

   public static class b extends gkv {
      public static final int n = 40;
      private final fvs o;
      private int p;

      public b(fvs $$0) {
         super(atp.z, atq.i, glm.t());
         this.o = $$0;
         this.i = true;
         this.j = 0;
         this.d = 1.0F;
         this.l = true;
      }

      @Override
      public void q() {
         if (!this.o.dE() && this.p >= 0) {
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
