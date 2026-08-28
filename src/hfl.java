public class hfl {
   public static class a extends her {
      private final gkh n;

      protected a(gkh $$0, axe $$1) {
         super($$1, axg.i, hfi.t());
         this.n = $$0;
         this.i = false;
         this.j = 0;
         this.d = 1.0F;
         this.l = true;
      }

      @Override
      public void q() {
         if (this.n.dR() || !this.n.bo()) {
            this.n();
         }
      }
   }

   public static class b extends her {
      public static final int n = 40;
      private final gkh o;
      private int p;

      public b(gkh $$0) {
         super(axf.z, axg.i, hfi.t());
         this.o = $$0;
         this.i = true;
         this.j = 0;
         this.d = 1.0F;
         this.l = true;
      }

      @Override
      public void q() {
         if (!this.o.dR() && this.p >= 0) {
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
