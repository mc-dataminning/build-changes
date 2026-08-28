public class gam extends gca {
   private final double a;
   private final double b;
   private final double F;
   private final int G;
   private final int H;

   gam(fxt $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, int $$7, int $$8) {
      super($$0, $$1, $$2, $$3);
      this.j = $$4;
      this.k = $$5;
      this.l = $$6;
      this.a = $$1;
      this.b = $$2;
      this.F = $$3;
      this.d = $$1 + $$4;
      this.e = $$2 + $$5;
      this.f = $$3 + $$6;
      this.g = this.d;
      this.h = this.e;
      this.i = this.f;
      this.D = 0.1F * (this.r.i() * 0.5F + 0.2F);
      this.n = false;
      this.t = (int)(Math.random() * 5.0) + 25;
      this.G = $$7;
      this.H = $$8;
   }

   @Override
   public gbe b() {
      return gbe.b;
   }

   @Override
   public void a(double $$0, double $$1, double $$2) {
   }

   @Override
   public int a(float $$0) {
      return 240;
   }

   @Override
   public void a() {
      this.d = this.g;
      this.e = this.h;
      this.f = this.i;
      if (this.s++ >= this.t) {
         this.k();
      } else {
         float $$0 = (float)this.s / (float)this.t;
         float $$1 = 1.0F - $$0;
         this.g = this.a + this.j * (double)$$1;
         this.h = this.b + this.k * (double)$$1;
         this.i = this.F + this.l * (double)$$1;
         int $$2 = ayh.b.a($$0, this.G, this.H);
         this.a((float)ayh.b.b($$2) / 255.0F, (float)ayh.b.c($$2) / 255.0F, (float)ayh.b.d($$2) / 255.0F);
         this.e((float)ayh.b.a($$2) / 255.0F);
      }
   }

   public static class a implements gbd<lm> {
      private final gbv a;

      public a(gbv $$0) {
         this.a = $$0;
      }

      public gba a(lm $$0, fxt $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gam $$8 = new gam($$1, $$2, $$3, $$4, $$5, $$6, $$7, -12210434, -1);
         $$8.d(ayx.b($$1.E_(), 3.0F, 5.0F));
         $$8.a(this.a);
         return $$8;
      }
   }
}
