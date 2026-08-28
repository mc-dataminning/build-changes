public interface fvt {
   fvt a(int var1);

   fvt a(int var1, int var2);

   fvt a(int var1, int var2, int var3, int var4);

   fvt b(int var1);

   fvt c(int var1);

   fvt d(int var1);

   fvt e(int var1);

   fvt f(int var1);

   fvt g(int var1);

   fvt a(float var1, float var2);

   fvt a(float var1);

   fvt b(float var1);

   default fvt a() {
      return this.a(0.0F);
   }

   default fvt b() {
      return this.a(0.5F);
   }

   default fvt c() {
      return this.a(1.0F);
   }

   default fvt d() {
      return this.b(0.0F);
   }

   default fvt e() {
      return this.b(0.5F);
   }

   default fvt f() {
      return this.b(1.0F);
   }

   fvt g();

   fvt.a h();

   static fvt i() {
      return new fvt.a();
   }

   public static class a implements fvt {
      public int a;
      public int b;
      public int c;
      public int d;
      public float e;
      public float f;

      public a() {
      }

      public a(fvt.a $$0) {
         this.a = $$0.a;
         this.b = $$0.b;
         this.c = $$0.c;
         this.d = $$0.d;
         this.e = $$0.e;
         this.f = $$0.f;
      }

      public fvt.a h(int $$0) {
         return this.b($$0, $$0);
      }

      public fvt.a b(int $$0, int $$1) {
         return this.m($$0).n($$1);
      }

      public fvt.a b(int $$0, int $$1, int $$2, int $$3) {
         return this.i($$0).k($$2).j($$1).l($$3);
      }

      public fvt.a i(int $$0) {
         this.a = $$0;
         return this;
      }

      public fvt.a j(int $$0) {
         this.b = $$0;
         return this;
      }

      public fvt.a k(int $$0) {
         this.c = $$0;
         return this;
      }

      public fvt.a l(int $$0) {
         this.d = $$0;
         return this;
      }

      public fvt.a m(int $$0) {
         return this.i($$0).k($$0);
      }

      public fvt.a n(int $$0) {
         return this.j($$0).l($$0);
      }

      public fvt.a b(float $$0, float $$1) {
         this.e = $$0;
         this.f = $$1;
         return this;
      }

      public fvt.a c(float $$0) {
         this.e = $$0;
         return this;
      }

      public fvt.a d(float $$0) {
         this.f = $$0;
         return this;
      }

      public fvt.a j() {
         return new fvt.a(this);
      }

      @Override
      public fvt.a h() {
         return this;
      }
   }
}
