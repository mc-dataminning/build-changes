public class gth {
   public static class a extends gsn {
      private final gdh n;

      protected a(gdh $$0, avg $$1) {
         super($$1, avi.i, gte.t());
         this.n = $$0;
         this.i = false;
         this.j = 0;
         this.d = 1.0F;
         this.l = true;
      }

      @Override
      public void q() {
         if (this.n.dM() || !this.n.bl()) {
            this.n();
         }
      }
   }

   public static class b extends gsn {
      public static final int n = 40;
      private final gdh o;
      private int p;

      public b(gdh $$0) {
         super(avh.z, avi.i, gte.t());
         this.o = $$0;
         this.i = true;
         this.j = 0;
         this.d = 1.0F;
         this.l = true;
      }

      @Override
      public void q() {
         if (!this.o.dM() && this.p >= 0) {
            if (this.o.bl()) {
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
