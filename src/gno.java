public class gno extends gnl {
   private final fdw a;

   gno(gjd $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, fdw $$7, int $$8) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      $$8 = axu.a($$8, 0.875F + this.r.i() * 0.25F, 0.875F + this.r.i() * 0.25F, 0.875F + this.r.i() * 0.25F);
      this.v = (float)axu.b($$8) / 255.0F;
      this.w = (float)axu.c($$8) / 255.0F;
      this.x = (float)axu.d($$8) / 255.0F;
      this.D = 0.26F;
      this.a = $$7;
   }

   @Override
   public gmp b() {
      return gmp.b;
   }

   @Override
   public void a() {
      this.d = this.g;
      this.e = this.h;
      this.f = this.i;
      if (this.s++ >= this.t) {
         this.k();
      } else {
         int $$0 = this.t - this.s;
         double $$1 = 1.0 / (double)$$0;
         this.g = azk.d($$1, this.g, this.a.a());
         this.h = azk.d($$1, this.h, this.a.b());
         this.i = azk.d($$1, this.i, this.a.c());
      }
   }

   @Override
   public int a(float $$0) {
      return 15728880;
   }

   public static class a implements gmo<mc> {
      private final gng a;

      public a(gng $$0) {
         this.a = $$0;
      }

      public gml a(mc $$0, gjd $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gno $$8 = new gno($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$0.b(), $$0.c());
         $$8.a(this.a);
         $$8.a($$0.d());
         return $$8;
      }
   }
}
