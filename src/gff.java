public class gff {
   public static class a extends gel {
      private final fpw n;

      protected a(fpw $$0, aqq $$1) {
         super($$1, aqs.i, gfc.t());
         this.n = $$0;
         this.i = false;
         this.j = 0;
         this.d = 1.0F;
         this.l = true;
      }

      @Override
      public void q() {
         if (this.n.dI() || !this.n.be()) {
            this.n();
         }
      }
   }

   public static class b extends gel {
      public static final int n = 40;
      private final fpw o;
      private int p;

      public b(fpw $$0) {
         super(aqr.z, aqs.i, gfc.t());
         this.o = $$0;
         this.i = true;
         this.j = 0;
         this.d = 1.0F;
         this.l = true;
      }

      @Override
      public void q() {
         if (!this.o.dI() && this.p >= 0) {
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
