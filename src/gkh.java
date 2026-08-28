public class gkh extends gke {
   private final fay a;

   gkh(gfw $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, fay $$7, int $$8) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      $$8 = axj.a($$8, 0.875F + this.r.i() * 0.25F, 0.875F + this.r.i() * 0.25F, 0.875F + this.r.i() * 0.25F);
      this.v = (float)axj.b($$8) / 255.0F;
      this.w = (float)axj.c($$8) / 255.0F;
      this.x = (float)axj.d($$8) / 255.0F;
      this.D = 0.26F;
      this.a = $$7;
   }

   @Override
   public gji b() {
      return gji.b;
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
         this.g = ayy.d($$1, this.g, this.a.a());
         this.h = ayy.d($$1, this.h, this.a.b());
         this.i = ayy.d($$1, this.i, this.a.c());
      }
   }

   @Override
   public int a(float $$0) {
      return 15728880;
   }

   public static class a implements gjh<ly> {
      private final gjz a;

      public a(gjz $$0) {
         this.a = $$0;
      }

      public gje a(ly $$0, gfw $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gkh $$8 = new gkh($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$0.b(), $$0.c());
         $$8.a(this.a);
         $$8.a($$0.d());
         return $$8;
      }
   }
}
