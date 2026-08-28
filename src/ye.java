public interface ye {
   xp a();

   void a(arg var1, boolean var2, xl.a var3);

   static ye a(yf $$0) {
      return (ye)($$0.h() ? new ye.a($$0.d()) : new ye.b($$0));
   }

   public static record a(xp a) implements ye {
      @Override
      public void a(arg $$0, boolean $$1, xl.a $$2) {
         $$0.c.a(this.a, $$2);
      }
   }

   public static record b(yf a) implements ye {
      @Override
      public xp a() {
         return this.a.d();
      }

      @Override
      public void a(arg $$0, boolean $$1, xl.a $$2) {
         yf $$3 = this.a.a($$1);
         if (!$$3.j()) {
            $$0.c.a($$3, $$2);
         }
      }

      public yf b() {
         return this.a;
      }
   }
}
