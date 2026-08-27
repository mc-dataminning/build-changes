public class gir {
   public static class a extends ghx {
      private final fsv n;

      protected a(fsv $$0, ars $$1) {
         super($$1, aru.i, gio.t());
         this.n = $$0;
         this.i = false;
         this.j = 0;
         this.d = 1.0F;
         this.l = true;
      }

      @Override
      public void q() {
         if (this.n.dG() || !this.n.be()) {
            this.n();
         }
      }
   }

   public static class b extends ghx {
      public static final int n = 40;
      private final fsv o;
      private int p;

      public b(fsv $$0) {
         super(art.z, aru.i, gio.t());
         this.o = $$0;
         this.i = true;
         this.j = 0;
         this.d = 1.0F;
         this.l = true;
      }

      @Override
      public void q() {
         if (!this.o.dG() && this.p >= 0) {
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
