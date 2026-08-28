public class gqn extends gqk {
   private final ffq a;

   gqn(gmb $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, ffq $$7, int $$8) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      $$8 = axy.a($$8, 0.875F + this.r.i() * 0.25F, 0.875F + this.r.i() * 0.25F, 0.875F + this.r.i() * 0.25F);
      this.v = (float)axy.b($$8) / 255.0F;
      this.w = (float)axy.c($$8) / 255.0F;
      this.x = (float)axy.d($$8) / 255.0F;
      this.D = 0.26F;
      this.a = $$7;
   }

   @Override
   public gpo b() {
      return gpo.b;
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
         this.g = azo.d($$1, this.g, this.a.a());
         this.h = azo.d($$1, this.h, this.a.b());
         this.i = azo.d($$1, this.i, this.a.c());
      }
   }

   @Override
   public int a(float $$0) {
      return 15728880;
   }

   public static class a implements gpn<md> {
      private final gqf a;

      public a(gqf $$0) {
         this.a = $$0;
      }

      public gpk a(md $$0, gmb $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gqn $$8 = new gqn($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$0.b(), $$0.c());
         $$8.a(this.a);
         $$8.a($$0.d());
         return $$8;
      }
   }
}
