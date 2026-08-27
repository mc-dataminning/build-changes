public class fyb {
   public static class a extends fxh {
      private final fiy n;

      protected a(fiy $$0, amg $$1) {
         super($$1, ami.i, fxy.t());
         this.n = $$0;
         this.i = false;
         this.j = 0;
         this.d = 1.0F;
         this.l = true;
      }

      @Override
      public void q() {
         if (this.n.dD() || !this.n.aZ()) {
            this.n();
         }
      }
   }

   public static class b extends fxh {
      public static final int n = 40;
      private final fiy o;
      private int p;

      public b(fiy $$0) {
         super(amh.z, ami.i, fxy.t());
         this.o = $$0;
         this.i = true;
         this.j = 0;
         this.d = 1.0F;
         this.l = true;
      }

      @Override
      public void q() {
         if (!this.o.dD() && this.p >= 0) {
            if (this.o.aZ()) {
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
