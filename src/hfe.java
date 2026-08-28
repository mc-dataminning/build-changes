public class hfe {
   public static class a extends hek {
      private final gka n;

      protected a(gka $$0, axe $$1) {
         super($$1, axg.i, hfb.t());
         this.n = $$0;
         this.i = false;
         this.j = 0;
         this.d = 1.0F;
         this.l = true;
      }

      @Override
      public void q() {
         if (this.n.dQ() || !this.n.bo()) {
            this.n();
         }
      }
   }

   public static class b extends hek {
      public static final int n = 40;
      private final gka o;
      private int p;

      public b(gka $$0) {
         super(axf.z, axg.i, hfb.t());
         this.o = $$0;
         this.i = true;
         this.j = 0;
         this.d = 1.0F;
         this.l = true;
      }

      @Override
      public void q() {
         if (!this.o.dQ() && this.p >= 0) {
            if (this.o.bo()) {
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
