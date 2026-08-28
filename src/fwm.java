public interface fwm {
   fwm a(int var1);

   fwm a(int var1, int var2);

   fwm a(int var1, int var2, int var3, int var4);

   fwm b(int var1);

   fwm c(int var1);

   fwm d(int var1);

   fwm e(int var1);

   fwm f(int var1);

   fwm g(int var1);

   fwm a(float var1, float var2);

   fwm a(float var1);

   fwm b(float var1);

   default fwm a() {
      return this.a(0.0F);
   }

   default fwm b() {
      return this.a(0.5F);
   }

   default fwm c() {
      return this.a(1.0F);
   }

   default fwm d() {
      return this.b(0.0F);
   }

   default fwm e() {
      return this.b(0.5F);
   }

   default fwm f() {
      return this.b(1.0F);
   }

   fwm g();

   fwm.a h();

   static fwm i() {
      return new fwm.a();
   }

   public static class a implements fwm {
      public int a;
      public int b;
      public int c;
      public int d;
      public float e;
      public float f;

      public a() {
      }

      public a(fwm.a $$0) {
         this.a = $$0.a;
         this.b = $$0.b;
         this.c = $$0.c;
         this.d = $$0.d;
         this.e = $$0.e;
         this.f = $$0.f;
      }

      public fwm.a h(int $$0) {
         return this.b($$0, $$0);
      }

      public fwm.a b(int $$0, int $$1) {
         return this.m($$0).n($$1);
      }

      public fwm.a b(int $$0, int $$1, int $$2, int $$3) {
         return this.i($$0).k($$2).j($$1).l($$3);
      }

      public fwm.a i(int $$0) {
         this.a = $$0;
         return this;
      }

      public fwm.a j(int $$0) {
         this.b = $$0;
         return this;
      }

      public fwm.a k(int $$0) {
         this.c = $$0;
         return this;
      }

      public fwm.a l(int $$0) {
         this.d = $$0;
         return this;
      }

      public fwm.a m(int $$0) {
         return this.i($$0).k($$0);
      }

      public fwm.a n(int $$0) {
         return this.j($$0).l($$0);
      }

      public fwm.a b(float $$0, float $$1) {
         this.e = $$0;
         this.f = $$1;
         return this;
      }

      public fwm.a c(float $$0) {
         this.e = $$0;
         return this;
      }

      public fwm.a d(float $$0) {
         this.f = $$0;
         return this;
      }

      public fwm.a j() {
         return new fwm.a(this);
      }

      @Override
      public fwm.a h() {
         return this;
      }
   }
}
