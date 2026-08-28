public class gol extends goi {
   private final feq a;

   gol(gjz $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, feq $$7, int $$8) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      $$8 = axw.a($$8, 0.875F + this.r.i() * 0.25F, 0.875F + this.r.i() * 0.25F, 0.875F + this.r.i() * 0.25F);
      this.v = (float)axw.b($$8) / 255.0F;
      this.w = (float)axw.c($$8) / 255.0F;
      this.x = (float)axw.d($$8) / 255.0F;
      this.D = 0.26F;
      this.a = $$7;
   }

   @Override
   public gnm b() {
      return gnm.b;
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
         this.g = azm.d($$1, this.g, this.a.a());
         this.h = azm.d($$1, this.h, this.a.b());
         this.i = azm.d($$1, this.i, this.a.c());
      }
   }

   @Override
   public int a(float $$0) {
      return 15728880;
   }

   public static class a implements gnl<mc> {
      private final god a;

      public a(god $$0) {
         this.a = $$0;
      }

      public gni a(mc $$0, gjz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gol $$8 = new gol($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$0.b(), $$0.c());
         $$8.a(this.a);
         $$8.a($$0.d());
         return $$8;
      }
   }
}
