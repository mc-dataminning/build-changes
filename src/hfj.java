public class hfj {
   public static class a extends hep {
      private final gkf n;

      protected a(gkf $$0, axe $$1) {
         super($$1, axg.i, hfg.t());
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

   public static class b extends hep {
      public static final int n = 40;
      private final gkf o;
      private int p;

      public b(gkf $$0) {
         super(axf.z, axg.i, hfg.t());
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
