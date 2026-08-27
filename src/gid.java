public class gid {
   public static class a extends ghj {
      private final fsj n;

      protected a(fsj $$0, arr $$1) {
         super($$1, art.i, gia.t());
         this.n = $$0;
         this.i = false;
         this.j = 0;
         this.d = 1.0F;
         this.l = true;
      }

      @Override
      public void q() {
         if (this.n.dH() || !this.n.be()) {
            this.n();
         }
      }
   }

   public static class b extends ghj {
      public static final int n = 40;
      private final fsj o;
      private int p;

      public b(fsj $$0) {
         super(ars.z, art.i, gia.t());
         this.o = $$0;
         this.i = true;
         this.j = 0;
         this.d = 1.0F;
         this.l = true;
      }

      @Override
      public void q() {
         if (!this.o.dH() && this.p >= 0) {
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
