public interface fye {
   fye a(int var1);

   fye a(int var1, int var2);

   fye a(int var1, int var2, int var3, int var4);

   fye b(int var1);

   fye c(int var1);

   fye d(int var1);

   fye e(int var1);

   fye f(int var1);

   fye g(int var1);

   fye a(float var1, float var2);

   fye a(float var1);

   fye b(float var1);

   default fye a() {
      return this.a(0.0F);
   }

   default fye b() {
      return this.a(0.5F);
   }

   default fye c() {
      return this.a(1.0F);
   }

   default fye d() {
      return this.b(0.0F);
   }

   default fye e() {
      return this.b(0.5F);
   }

   default fye f() {
      return this.b(1.0F);
   }

   fye g();

   fye.a h();

   static fye i() {
      return new fye.a();
   }

   public static class a implements fye {
      public int a;
      public int b;
      public int c;
      public int d;
      public float e;
      public float f;

      public a() {
      }

      public a(fye.a $$0) {
         this.a = $$0.a;
         this.b = $$0.b;
         this.c = $$0.c;
         this.d = $$0.d;
         this.e = $$0.e;
         this.f = $$0.f;
      }

      public fye.a h(int $$0) {
         return this.b($$0, $$0);
      }

      public fye.a b(int $$0, int $$1) {
         return this.m($$0).n($$1);
      }

      public fye.a b(int $$0, int $$1, int $$2, int $$3) {
         return this.i($$0).k($$2).j($$1).l($$3);
      }

      public fye.a i(int $$0) {
         this.a = $$0;
         return this;
      }

      public fye.a j(int $$0) {
         this.b = $$0;
         return this;
      }

      public fye.a k(int $$0) {
         this.c = $$0;
         return this;
      }

      public fye.a l(int $$0) {
         this.d = $$0;
         return this;
      }

      public fye.a m(int $$0) {
         return this.i($$0).k($$0);
      }

      public fye.a n(int $$0) {
         return this.j($$0).l($$0);
      }

      public fye.a b(float $$0, float $$1) {
         this.e = $$0;
         this.f = $$1;
         return this;
      }

      public fye.a c(float $$0) {
         this.e = $$0;
         return this;
      }

      public fye.a d(float $$0) {
         this.f = $$0;
         return this;
      }

      public fye.a j() {
         return new fye.a(this);
      }

      @Override
      public fye.a h() {
         return this;
      }
   }
}
