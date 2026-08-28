public interface fwa {
   fwa a(int var1);

   fwa a(int var1, int var2);

   fwa a(int var1, int var2, int var3, int var4);

   fwa b(int var1);

   fwa c(int var1);

   fwa d(int var1);

   fwa e(int var1);

   fwa f(int var1);

   fwa g(int var1);

   fwa a(float var1, float var2);

   fwa a(float var1);

   fwa b(float var1);

   default fwa a() {
      return this.a(0.0F);
   }

   default fwa b() {
      return this.a(0.5F);
   }

   default fwa c() {
      return this.a(1.0F);
   }

   default fwa d() {
      return this.b(0.0F);
   }

   default fwa e() {
      return this.b(0.5F);
   }

   default fwa f() {
      return this.b(1.0F);
   }

   fwa g();

   fwa.a h();

   static fwa i() {
      return new fwa.a();
   }

   public static class a implements fwa {
      public int a;
      public int b;
      public int c;
      public int d;
      public float e;
      public float f;

      public a() {
      }

      public a(fwa.a $$0) {
         this.a = $$0.a;
         this.b = $$0.b;
         this.c = $$0.c;
         this.d = $$0.d;
         this.e = $$0.e;
         this.f = $$0.f;
      }

      public fwa.a h(int $$0) {
         return this.b($$0, $$0);
      }

      public fwa.a b(int $$0, int $$1) {
         return this.m($$0).n($$1);
      }

      public fwa.a b(int $$0, int $$1, int $$2, int $$3) {
         return this.i($$0).k($$2).j($$1).l($$3);
      }

      public fwa.a i(int $$0) {
         this.a = $$0;
         return this;
      }

      public fwa.a j(int $$0) {
         this.b = $$0;
         return this;
      }

      public fwa.a k(int $$0) {
         this.c = $$0;
         return this;
      }

      public fwa.a l(int $$0) {
         this.d = $$0;
         return this;
      }

      public fwa.a m(int $$0) {
         return this.i($$0).k($$0);
      }

      public fwa.a n(int $$0) {
         return this.j($$0).l($$0);
      }

      public fwa.a b(float $$0, float $$1) {
         this.e = $$0;
         this.f = $$1;
         return this;
      }

      public fwa.a c(float $$0) {
         this.e = $$0;
         return this;
      }

      public fwa.a d(float $$0) {
         this.f = $$0;
         return this;
      }

      public fwa.a j() {
         return new fwa.a(this);
      }

      @Override
      public fwa.a h() {
         return this;
      }
   }
}
