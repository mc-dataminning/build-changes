public interface xj {
   wu a();

   void a(aqi var1, boolean var2, wq.a var3);

   static xj a(xk $$0) {
      return (xj)($$0.h() ? new xj.a($$0.d()) : new xj.b($$0));
   }

   public static record a(wu a) implements xj {
      @Override
      public void a(aqi $$0, boolean $$1, wq.a $$2) {
         $$0.d.a(this.a, $$2);
      }
   }

   public static record b(xk a) implements xj {
      @Override
      public wu a() {
         return this.a.d();
      }

      @Override
      public void a(aqi $$0, boolean $$1, wq.a $$2) {
         xk $$3 = this.a.a($$1);
         if (!$$3.j()) {
            $$0.d.a($$3, $$2);
         }
      }

      public xk b() {
         return this.a;
      }
   }
}
