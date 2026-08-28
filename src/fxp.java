public interface fxp {
   fxp a(int var1);

   fxp a(int var1, int var2);

   fxp a(int var1, int var2, int var3, int var4);

   fxp b(int var1);

   fxp c(int var1);

   fxp d(int var1);

   fxp e(int var1);

   fxp f(int var1);

   fxp g(int var1);

   fxp a(float var1, float var2);

   fxp a(float var1);

   fxp b(float var1);

   default fxp a() {
      return this.a(0.0F);
   }

   default fxp b() {
      return this.a(0.5F);
   }

   default fxp c() {
      return this.a(1.0F);
   }

   default fxp d() {
      return this.b(0.0F);
   }

   default fxp e() {
      return this.b(0.5F);
   }

   default fxp f() {
      return this.b(1.0F);
   }

   fxp g();

   fxp.a h();

   static fxp i() {
      return new fxp.a();
   }

   public static class a implements fxp {
      public int a;
      public int b;
      public int c;
      public int d;
      public float e;
      public float f;

      public a() {
      }

      public a(fxp.a $$0) {
         this.a = $$0.a;
         this.b = $$0.b;
         this.c = $$0.c;
         this.d = $$0.d;
         this.e = $$0.e;
         this.f = $$0.f;
      }

      public fxp.a h(int $$0) {
         return this.b($$0, $$0);
      }

      public fxp.a b(int $$0, int $$1) {
         return this.m($$0).n($$1);
      }

      public fxp.a b(int $$0, int $$1, int $$2, int $$3) {
         return this.i($$0).k($$2).j($$1).l($$3);
      }

      public fxp.a i(int $$0) {
         this.a = $$0;
         return this;
      }

      public fxp.a j(int $$0) {
         this.b = $$0;
         return this;
      }

      public fxp.a k(int $$0) {
         this.c = $$0;
         return this;
      }

      public fxp.a l(int $$0) {
         this.d = $$0;
         return this;
      }

      public fxp.a m(int $$0) {
         return this.i($$0).k($$0);
      }

      public fxp.a n(int $$0) {
         return this.j($$0).l($$0);
      }

      public fxp.a b(float $$0, float $$1) {
         this.e = $$0;
         this.f = $$1;
         return this;
      }

      public fxp.a c(float $$0) {
         this.e = $$0;
         return this;
      }

      public fxp.a d(float $$0) {
         this.f = $$0;
         return this;
      }

      public fxp.a j() {
         return new fxp.a(this);
      }

      @Override
      public fxp.a h() {
         return this;
      }
   }
}
