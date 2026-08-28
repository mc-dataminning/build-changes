public class hmx {
   public static class a extends hmd {
      private final gox n;

      protected a(gox $$0, awm $$1) {
         super($$1, awo.i, hmu.t());
         this.n = $$0;
         this.i = false;
         this.j = 0;
         this.d = 1.0F;
         this.l = true;
      }

      @Override
      public void q() {
         if (this.n.dQ() || !this.n.bn()) {
            this.n();
         }
      }
   }

   public static class b extends hmd {
      public static final int n = 40;
      private final gox o;
      private int p;

      public b(gox $$0) {
         super(awn.z, awo.i, hmu.t());
         this.o = $$0;
         this.i = true;
         this.j = 0;
         this.d = 1.0F;
         this.l = true;
      }

      @Override
      public void q() {
         if (!this.o.dQ() && this.p >= 0) {
            if (this.o.bn()) {
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
