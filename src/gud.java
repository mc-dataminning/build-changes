public class gud {
   public static class a extends gtj {
      private final geb n;

      protected a(geb $$0, avo $$1) {
         super($$1, avq.i, gua.t());
         this.n = $$0;
         this.i = false;
         this.j = 0;
         this.d = 1.0F;
         this.l = true;
      }

      @Override
      public void q() {
         if (this.n.dJ() || !this.n.bk()) {
            this.n();
         }
      }
   }

   public static class b extends gtj {
      public static final int n = 40;
      private final geb o;
      private int p;

      public b(geb $$0) {
         super(avp.z, avq.i, gua.t());
         this.o = $$0;
         this.i = true;
         this.j = 0;
         this.d = 1.0F;
         this.l = true;
      }

      @Override
      public void q() {
         if (!this.o.dJ() && this.p >= 0) {
            if (this.o.bk()) {
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
