public class gic {
   public static class a extends ghi {
      private final fsi n;

      protected a(fsi $$0, arq $$1) {
         super($$1, ars.i, ghz.t());
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

   public static class b extends ghi {
      public static final int n = 40;
      private final fsi o;
      private int p;

      public b(fsi $$0) {
         super(arr.z, ars.i, ghz.t());
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
