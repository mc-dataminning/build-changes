public class gfk {
   public static class a extends geq {
      private final fqb n;

      protected a(fqb $$0, aqu $$1) {
         super($$1, aqw.i, gfh.t());
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

   public static class b extends geq {
      public static final int n = 40;
      private final fqb o;
      private int p;

      public b(fqb $$0) {
         super(aqv.z, aqw.i, gfh.t());
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
