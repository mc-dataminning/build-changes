public class hbs {
   public static class a extends hay {
      private final ggs n;

      protected a(ggs $$0, awj $$1) {
         super($$1, awl.i, hbp.t());
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

   public static class b extends hay {
      public static final int n = 40;
      private final ggs o;
      private int p;

      public b(ggs $$0) {
         super(awk.z, awl.i, hbp.t());
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
