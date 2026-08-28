public class hnk {
   public static class a extends hmq {
      private final gpj n;

      protected a(gpj $$0, awm $$1) {
         super($$1, awo.i, hnh.t());
         this.n = $$0;
         this.i = false;
         this.j = 0;
         this.d = 1.0F;
         this.l = true;
      }

      @Override
      public void q() {
         if (this.n.dP() || !this.n.bl()) {
            this.n();
         }
      }
   }

   public static class b extends hmq {
      public static final int n = 40;
      private final gpj o;
      private int p;

      public b(gpj $$0) {
         super(awn.z, awo.i, hnh.t());
         this.o = $$0;
         this.i = true;
         this.j = 0;
         this.d = 1.0F;
         this.l = true;
      }

      @Override
      public void q() {
         if (!this.o.dP() && this.p >= 0) {
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
