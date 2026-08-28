public interface fvh {
   fvh a(int var1);

   fvh a(int var1, int var2);

   fvh a(int var1, int var2, int var3, int var4);

   fvh b(int var1);

   fvh c(int var1);

   fvh d(int var1);

   fvh e(int var1);

   fvh f(int var1);

   fvh g(int var1);

   fvh a(float var1, float var2);

   fvh a(float var1);

   fvh b(float var1);

   default fvh a() {
      return this.a(0.0F);
   }

   default fvh b() {
      return this.a(0.5F);
   }

   default fvh c() {
      return this.a(1.0F);
   }

   default fvh d() {
      return this.b(0.0F);
   }

   default fvh e() {
      return this.b(0.5F);
   }

   default fvh f() {
      return this.b(1.0F);
   }

   fvh g();

   fvh.a h();

   static fvh i() {
      return new fvh.a();
   }

   public static class a implements fvh {
      public int a;
      public int b;
      public int c;
      public int d;
      public float e;
      public float f;

      public a() {
      }

      public a(fvh.a $$0) {
         this.a = $$0.a;
         this.b = $$0.b;
         this.c = $$0.c;
         this.d = $$0.d;
         this.e = $$0.e;
         this.f = $$0.f;
      }

      public fvh.a h(int $$0) {
         return this.b($$0, $$0);
      }

      public fvh.a b(int $$0, int $$1) {
         return this.m($$0).n($$1);
      }

      public fvh.a b(int $$0, int $$1, int $$2, int $$3) {
         return this.i($$0).k($$2).j($$1).l($$3);
      }

      public fvh.a i(int $$0) {
         this.a = $$0;
         return this;
      }

      public fvh.a j(int $$0) {
         this.b = $$0;
         return this;
      }

      public fvh.a k(int $$0) {
         this.c = $$0;
         return this;
      }

      public fvh.a l(int $$0) {
         this.d = $$0;
         return this;
      }

      public fvh.a m(int $$0) {
         return this.i($$0).k($$0);
      }

      public fvh.a n(int $$0) {
         return this.j($$0).l($$0);
      }

      public fvh.a b(float $$0, float $$1) {
         this.e = $$0;
         this.f = $$1;
         return this;
      }

      public fvh.a c(float $$0) {
         this.e = $$0;
         return this;
      }

      public fvh.a d(float $$0) {
         this.f = $$0;
         return this;
      }

      public fvh.a j() {
         return new fvh.a(this);
      }

      @Override
      public fvh.a h() {
         return this;
      }
   }
}
