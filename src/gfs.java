public class gfs extends ghf {
   private final double a;
   private final double b;
   private final double F;
   private final boolean G;
   private final ggf.a H;

   gfs(gcy $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, false, ggf.a.a);
   }

   gfs(gcy $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, boolean $$7, ggf.a $$8) {
      super($$0, $$1, $$2, $$3);
      this.G = $$7;
      this.H = $$8;
      this.e($$8.b());
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
      float $$9 = this.r.i() * 0.6F + 0.4F;
      this.v = 0.9F * $$9;
      this.w = 0.9F * $$9;
      this.x = $$9;
      this.n = false;
      this.t = (int)(Math.random() * 10.0) + 30;
   }

   @Override
   public ggj b() {
      return this.H.a() ? ggj.b : ggj.c;
   }

   @Override
   public void a(double $$0, double $$1, double $$2) {
      this.a(this.n().d($$0, $$1, $$2));
      this.l();
   }

   @Override
   public int a(float $$0) {
      if (this.G) {
         return 240;
      } else {
         int $$1 = super.a($$0);
         float $$2 = (float)this.s / (float)this.t;
         $$2 *= $$2;
         $$2 *= $$2;
         int $$3 = $$1 & 0xFF;
         int $$4 = $$1 >> 16 & 0xFF;
         $$4 += (int)($$2 * 15.0F * 16.0F);
         if ($$4 > 240) {
            $$4 = 240;
         }

         return $$3 | $$4 << 16;
      }
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
         $$0 = 1.0F - $$0;
         float $$1 = 1.0F - $$0;
         $$1 *= $$1;
         $$1 *= $$1;
         this.g = this.a + this.j * (double)$$0;
         this.h = this.b + this.k * (double)$$0 - (double)($$1 * 1.2F);
         this.i = this.F + this.l * (double)$$0;
      }
   }

   @Override
   public void a(feo $$0, fjg $$1, float $$2) {
      this.e(this.H.a(this.s, this.t, $$2));
      super.a($$0, $$1, $$2);
   }

   public static class a implements ggi<lw> {
      private final gha a;

      public a(gha $$0) {
         this.a = $$0;
      }

      public ggf a(lw $$0, gcy $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gfs $$8 = new gfs($$1, $$2, $$3, $$4, $$5, $$6, $$7);
         $$8.a(this.a);
         return $$8;
      }
   }

   public static class b implements ggi<lw> {
      private final gha a;

      public b(gha $$0) {
         this.a = $$0;
      }

      public ggf a(lw $$0, gcy $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gfs $$8 = new gfs($$1, $$2, $$3, $$4, $$5, $$6, $$7);
         $$8.a(this.a);
         return $$8;
      }
   }

   public static class c implements ggi<lw> {
      private final gha a;

      public c(gha $$0) {
         this.a = $$0;
      }

      public ggf a(lw $$0, gcy $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gfs $$8 = new gfs($$1, $$2, $$3, $$4, $$5, $$6, $$7, true, new ggf.a(0.0F, 0.6F, 0.25F, 1.0F));
         $$8.d(1.5F);
         $$8.a(this.a);
         return $$8;
      }
   }
}
