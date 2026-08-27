public class gqp {
   public static class a extends gpv {
      private final gaq n;

      protected a(gaq $$0, avb $$1) {
         super($$1, avd.i, gqm.t());
         this.n = $$0;
         this.i = false;
         this.j = 0;
         this.d = 1.0F;
         this.l = true;
      }

      @Override
      public void q() {
         if (this.n.dI() || !this.n.bh()) {
            this.n();
         }
      }
   }

   public static class b extends gpv {
      public static final int n = 40;
      private final gaq o;
      private int p;

      public b(gaq $$0) {
         super(avc.z, avd.i, gqm.t());
         this.o = $$0;
         this.i = true;
         this.j = 0;
         this.d = 1.0F;
         this.l = true;
      }

      @Override
      public void q() {
         if (!this.o.dI() && this.p >= 0) {
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
