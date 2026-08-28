public interface yd {
   xo a();

   void a(arf var1, boolean var2, xk.a var3);

   static yd a(ye $$0) {
      return (yd)($$0.h() ? new yd.a($$0.d()) : new yd.b($$0));
   }

   public static record a(xo a) implements yd {
      @Override
      public void a(arf $$0, boolean $$1, xk.a $$2) {
         $$0.c.a(this.a, $$2);
      }
   }

   public static record b(ye a) implements yd {
      @Override
      public xo a() {
         return this.a.d();
      }

      @Override
      public void a(arf $$0, boolean $$1, xk.a $$2) {
         ye $$3 = this.a.a($$1);
         if (!$$3.j()) {
            $$0.c.a($$3, $$2);
         }
      }

      public ye b() {
         return this.a;
      }
   }
}
