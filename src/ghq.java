public class ghq {
   public static class a extends ggw {
      private final fsb n;

      protected a(fsb $$0, arl $$1) {
         super($$1, arn.i, ghn.t());
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

   public static class b extends ggw {
      public static final int n = 40;
      private final fsb o;
      private int p;

      public b(fsb $$0) {
         super(arm.z, arn.i, ghn.t());
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
