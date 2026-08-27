public class ggz {
   public static class a extends ggf {
      private final frk n;

      protected a(frk $$0, arb $$1) {
         super($$1, ard.i, ggw.t());
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

   public static class b extends ggf {
      public static final int n = 40;
      private final frk o;
      private int p;

      public b(frk $$0) {
         super(arc.z, ard.i, ggw.t());
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
