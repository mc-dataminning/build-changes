public class gjv extends gjs {
   private final fby a;

   gjv(gfk $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, fby $$7, int $$8) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      $$8 = ayp.a($$8, 0.875F + this.r.i() * 0.25F, 0.875F + this.r.i() * 0.25F, 0.875F + this.r.i() * 0.25F);
      this.v = (float)ayp.b($$8) / 255.0F;
      this.w = (float)ayp.c($$8) / 255.0F;
      this.x = (float)ayp.d($$8) / 255.0F;
      this.D = 0.26F;
      this.a = $$7;
   }

   @Override
   public giw b() {
      return giw.b;
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

   public static class a implements giv<lx> {
      private final gjn a;

      public a(gjn $$0) {
         this.a = $$0;
      }

      public gis a(lx $$0, gfk $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gjv $$8 = new gjv($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$0.b(), $$0.c());
         $$8.a(this.a);
         $$8.a($$1.A.a(40) + 10);
         return $$8;
      }
   }
}
