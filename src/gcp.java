public class gcp extends gcf {
   gcp(fyl $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, int $$7, gco $$8) {
      super($$0, $$1, $$2, $$3, $$8, 0.0F);
      this.B = 0.92F;
      this.D = 0.5F;
      this.e(1.0F);
      this.a((float)axq.b.b($$7), (float)axq.b.c($$7), (float)axq.b.d($$7));
      this.t = (int)((double)(this.D * 12.0F) / (Math.random() * 0.8F + 0.2F));
      this.b($$8);
      this.n = false;
      this.j = $$4;
      this.k = $$5;
      this.l = $$6;
   }

   @Override
   public void a() {
      super.a();
      if (!this.o) {
         this.b(this.a);
         if (this.s > this.t / 2) {
            this.e(1.0F - ((float)this.s - (float)(this.t / 2)) / (float)this.t);
         }

         if (this.c.a_(ja.a(this.g, this.h, this.i)).i()) {
            this.k -= 0.0074F;
         }
      }
   }

   public static class a implements gbw<ln> {
      private final gco a;

      public a(gco $$0) {
         this.a = $$0;
      }

      public gbt a(ln $$0, fyl $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gcp($$1, $$2, $$3, $$4, $$5, $$6, $$7, axq.b.a(255, 204, 31, 102), this.a);
      }
   }

   public static class b implements gbw<ln> {
      private final gco a;

      public b(gco $$0) {
         this.a = $$0;
      }

      public gbt a(ln $$0, fyl $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gcp($$1, $$2, $$3, $$4, $$5, $$6, $$7, axq.b.a(255, 255, 255, 255), this.a);
      }
   }
}
