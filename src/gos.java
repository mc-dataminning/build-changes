public class gos extends gqk {
   private static final float a = 0.0025F;
   private static final int b = 300;
   private static final int F = 300;
   private float G;
   private final float H;
   private final float I;
   private final float J;
   private boolean K;
   private boolean L;
   private double M;
   private double N;
   private double O;

   protected gos(gmb $$0, double $$1, double $$2, double $$3, gqf $$4, float $$5, float $$6, boolean $$7, boolean $$8, float $$9, float $$10) {
      super($$0, $$1, $$2, $$3);
      this.a($$4.a(this.r.a(12), 12));
      this.G = (float)Math.toRadians(this.r.h() ? -30.0 : 30.0);
      this.H = this.r.i();
      this.I = (float)Math.toRadians(this.r.h() ? -5.0 : 5.0);
      this.J = $$6;
      this.K = $$7;
      this.L = $$8;
      this.t = 300;
      this.u = $$5 * 1.2F * 0.0025F;
      float $$11 = $$9 * (this.r.h() ? 0.05F : 0.075F);
      this.D = $$11;
      this.b($$11, $$11);
      this.B = 1.0F;
      this.k = (double)(-$$10);
      this.M = Math.cos(Math.toRadians((double)(this.H * 60.0F))) * (double)this.J;
      this.N = Math.sin(Math.toRadians((double)(this.H * 60.0F))) * (double)this.J;
      this.O = Math.toRadians((double)(1000.0F + this.H * 3000.0F));
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
      if (this.t-- <= 0) {
         this.k();
      }

      if (!this.o) {
         float $$0 = (float)(300 - this.t);
         float $$1 = Math.min($$0 / 300.0F, 1.0F);
         double $$2 = 0.0;
         double $$3 = 0.0;
         if (this.L) {
            $$2 += this.M * Math.pow((double)$$1, 1.25);
            $$3 += this.N * Math.pow((double)$$1, 1.25);
         }

         if (this.K) {
            $$2 += (double)$$1 * Math.cos((double)$$1 * this.O) * (double)this.J;
            $$3 += (double)$$1 * Math.sin((double)$$1 * this.O) * (double)this.J;
         }

         this.j += $$2 * 0.0025F;
         this.l += $$3 * 0.0025F;
         this.k = this.k - (double)this.u;
         this.G = this.G + this.I / 20.0F;
         this.A = this.z;
         this.z = this.z + this.G / 20.0F;
         this.a(this.j, this.k, this.l);
         if (this.m || this.t < 299 && (this.j == 0.0 || this.l == 0.0)) {
            this.k();
         }

         if (!this.o) {
            this.j = this.j * (double)this.B;
            this.k = this.k * (double)this.B;
            this.l = this.l * (double)this.B;
         }
      }
   }

   public static class a implements gpn<mc> {
      private final gqf a;

      public a(gqf $$0) {
         this.a = $$0;
      }

      public gpk a(mc $$0, gmb $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gos($$1, $$2, $$3, $$4, this.a, 0.25F, 2.0F, false, true, 1.0F, 0.0F);
      }
   }

   public static class b implements gpn<mc> {
      private final gqf a;

      public b(gqf $$0) {
         this.a = $$0;
      }

      public gpk a(mc $$0, gmb $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gos($$1, $$2, $$3, $$4, this.a, 0.07F, 10.0F, true, false, 2.0F, 0.021F);
      }
   }

   public static class c implements gpn<lr> {
      private final gqf a;

      public c(gqf $$0) {
         this.a = $$0;
      }

      public gpk a(lr $$0, gmb $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gpk $$8 = new gos($$1, $$2, $$3, $$4, this.a, 0.07F, 10.0F, true, false, 2.0F, 0.021F);
         $$8.a($$0.b(), $$0.c(), $$0.d());
         return $$8;
      }
   }
}
