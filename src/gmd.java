public class gmd extends glt {
   gmd(ghz $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, int $$7, gmc $$8) {
      super($$0, $$1, $$2, $$3, $$8, 0.0F);
      this.B = 0.92F;
      this.D = 0.5F;
      this.e(1.0F);
      this.a((float)axu.b($$7), (float)axu.c($$7), (float)axu.d($$7));
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

         if (this.c.a_(jj.a(this.g, this.h, this.i)).l()) {
            this.k -= 0.0074F;
         }
      }
   }

   public static class a implements glk<lz> {
      private final gmc a;

      public a(gmc $$0) {
         this.a = $$0;
      }

      public glh a(lz $$0, ghz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gmd($$1, $$2, $$3, $$4, $$5, $$6, $$7, axu.a(255, 204, 31, 102), this.a);
      }
   }

   public static class b implements glk<lz> {
      private final gmc a;

      public b(gmc $$0) {
         this.a = $$0;
      }

      public glh a(lz $$0, ghz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gmd($$1, $$2, $$3, $$4, $$5, $$6, $$7, axu.a(255, 255, 255, 255), this.a);
      }
   }
}
