public class hfk {
   public static class a extends heq {
      private final gkg n;

      protected a(gkg $$0, axe $$1) {
         super($$1, axg.i, hfh.t());
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

   public static class b extends heq {
      public static final int n = 40;
      private final gkg o;
      private int p;

      public b(gkg $$0) {
         super(axf.z, axg.i, hfh.t());
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
