public class hcd {
   public static class a extends hbj {
      private final ghd n;

      protected a(ghd $$0, awk $$1) {
         super($$1, awm.i, hca.t());
         this.n = $$0;
         this.i = false;
         this.j = 0;
         this.d = 1.0F;
         this.l = true;
      }

      @Override
      public void q() {
         if (this.n.dS() || !this.n.bp()) {
            this.n();
         }
      }
   }

   public static class b extends hbj {
      public static final int n = 40;
      private final ghd o;
      private int p;

      public b(ghd $$0) {
         super(awl.z, awm.i, hca.t());
         this.o = $$0;
         this.i = true;
         this.j = 0;
         this.d = 1.0F;
         this.l = true;
      }

      @Override
      public void q() {
         if (!this.o.dS() && this.p >= 0) {
            if (this.o.bp()) {
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
