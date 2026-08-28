public class gtw {
   public static class a extends gtc {
      private final gdv n;

      protected a(gdv $$0, avn $$1) {
         super($$1, avp.i, gtt.t());
         this.n = $$0;
         this.i = false;
         this.j = 0;
         this.d = 1.0F;
         this.l = true;
      }

      @Override
      public void q() {
         if (this.n.dL() || !this.n.bk()) {
            this.n();
         }
      }
   }

   public static class b extends gtc {
      public static final int n = 40;
      private final gdv o;
      private int p;

      public b(gdv $$0) {
         super(avo.z, avp.i, gtt.t());
         this.o = $$0;
         this.i = true;
         this.j = 0;
         this.d = 1.0F;
         this.l = true;
      }

      @Override
      public void q() {
         if (!this.o.dL() && this.p >= 0) {
            if (this.o.bk()) {
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
