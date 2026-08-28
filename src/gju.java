public class gju extends gjr {
   private final fbx a;

   gju(gfj $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, fbx $$7, int $$8) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      $$8 = ayp.a($$8, 0.875F + this.r.i() * 0.25F, 0.875F + this.r.i() * 0.25F, 0.875F + this.r.i() * 0.25F);
      this.v = (float)ayp.b($$8) / 255.0F;
      this.w = (float)ayp.c($$8) / 255.0F;
      this.x = (float)ayp.d($$8) / 255.0F;
      this.D = 0.26F;
      this.a = $$7;
   }

   @Override
   public giv b() {
      return giv.b;
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
         this.g = bae.d($$1, this.g, this.a.a());
         this.h = bae.d($$1, this.h, this.a.b());
         this.i = bae.d($$1, this.i, this.a.c());
      }
   }

   @Override
   public int a(float $$0) {
      return 15728880;
   }

   public static class a implements giu<lx> {
      private final gjm a;

      public a(gjm $$0) {
         this.a = $$0;
      }

      public gir a(lx $$0, gfj $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gju $$8 = new gju($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$0.b(), $$0.c());
         $$8.a(this.a);
         $$8.a($$1.A.a(40) + 10);
         return $$8;
      }
   }
}
