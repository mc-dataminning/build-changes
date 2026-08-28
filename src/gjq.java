public class gjq extends gjn {
   private final fbr a;

   gjq(gff $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, fbr $$7, int $$8) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      $$8 = ayf.a($$8, 0.875F + this.r.i() * 0.25F, 0.875F + this.r.i() * 0.25F, 0.875F + this.r.i() * 0.25F);
      this.v = (float)ayf.b($$8) / 255.0F;
      this.w = (float)ayf.c($$8) / 255.0F;
      this.x = (float)ayf.d($$8) / 255.0F;
      this.D = 0.26F;
      this.a = $$7;
   }

   @Override
   public gir b() {
      return gir.b;
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
         this.g = azu.d($$1, this.g, this.a.a());
         this.h = azu.d($$1, this.h, this.a.b());
         this.i = azu.d($$1, this.i, this.a.c());
      }
   }

   @Override
   public int a(float $$0) {
      return 15728880;
   }

   public static class a implements giq<lx> {
      private final gji a;

      public a(gji $$0) {
         this.a = $$0;
      }

      public gin a(lx $$0, gff $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gjq $$8 = new gjq($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$0.b(), $$0.c());
         $$8.a(this.a);
         $$8.a($$0.d());
         return $$8;
      }
   }
}
